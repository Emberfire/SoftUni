function printLetters(sentence) {
    for (let letter in sentence) {
        console.log(`str[${letter}] -> ${sentence[letter]}`);
    }
}

function concatenateAndReverse(array) {
    let string = array.join('');
    let output = '';

    for (let i = 0; i < string.length; i++) {
        output += string[string.length - i - 1];
    }

    console.log(output);
}

function countOccurrences(keyWord, sentence) {
    let occurrences = 0;
    let index = sentence.indexOf(keyWord);

    while (index > -1) {
        occurrences++;
        index = sentence.indexOf(keyWord, index + 1);
    }

    console.log(occurrences);
}

function extractText(sentence) {
    let output = [];

    let index = sentence.indexOf('(');
    while (index > -1) {
        let endIndex = sentence.indexOf(')', index);

        if (endIndex === -1) {
            break;
        }

        output.push(sentence.substring(index + 1, endIndex));
        index = sentence.indexOf('(', endIndex + 1);
    }

    console.log(output.join(', '));
}

function aggregateTable(array) {
    let towns = [];
    let sum = 0;
    for (let i = 0; i < array.length; i++) {
        let townIncome = array[i].split('|').filter(a => a.length > 0);
        let town = townIncome[0].trim();
        let income = Number(townIncome[1].trim());
        towns.push(town);
        sum += Number(income);
    }

    console.log(towns.join(', '));
    console.log(sum);
}

function restaurantBill(array) {
    let purchases = [];
    let totalPrice = 0;

    for (let i = 0; i < array.length; i++) {
        if (i % 2 === 0) {
            purchases.push(array[i]);
        } else {
            totalPrice += Number(array[i]);
        }
    }

    console.log(`You purchased ${purchases.join(', ')} for a total sum of ${totalPrice}`);
}

function usernames(array) {
    let usernames = [];

    for (let email of array) {
        let name = email.substring(0, email.indexOf('@')) + '.';
        let tokens = email.split('@')[1].split('.');

        for (let i = 0; i < tokens.length; i++) {
            name += tokens[i][0];
        }

        usernames.push(name);
    }

    console.log(usernames.join(', '));
}

function censorship(text, keywords) {
    let index = 0;
    for (let keyword of keywords) {
        index = text.indexOf(keyword);

        while (index > -1) {
            text = text.replace(text.substr(index, keyword.length), '-'.repeat(keyword.length));
            index = text.indexOf(keyword);
        }
    }

    console.log(text);
}

function escaping(array) {
    console.log('<ul>');

    for (let line of array) {
        line = line
            .replace(/&/g, '&amp;')
            .replace(/</g, '&lt;')
            .replace(/>/g, '&gt;')
            .replace(/"/g, '&quot;');

        console.log(`\t<li>${line}</li>`);
    }

    console.log('</ul>');
}

function matchAllWords(text) {
    console.log(text = text.split(/\W+/g).filter(a => a.length > 0).join('|'));
}

function emailValidation(email) {
    let regex = /^[a-zA-Z0-9]+@[a-zA-Z]+\.[a-zA-Z]+$/g;
    console.log(regex.exec(email) ? 'Valid' : 'Invalid');
}

function expressionSplit(expression) {
    console.log(expression.split(/[\s.,;()]+/g).filter(a => a.length > 0).join('\n'));
}

function matchTheDates(text) {
    let pattern = /\b([0-9]{1,2})-([A-Z][a-z]{2})-([0-9]{4})\b/gm;

    for (let obj of text) {
        let match = pattern.exec(obj);

        while (match) {
            console.log(`${match[0]} (Day: ${match[1]}, Month: ${match[2]}, Year: ${match[3]})`);
            match = pattern.exec(obj);
        }
    }
}

function employeeData(array) {
    let pattern = /^([A-Z][A-Za-z]*) - ([1-9][0-9]*) - ([A-Za-z0-9\-]+(?:\s[A-Za-z0-9\-]+)*)$/gm;

    for (let string of array) {
        let match = pattern.exec(string);

        while (match) {
            console.log(`Name: ${match[1]}`);
            console.log(`Position: ${match[3]}`);
            console.log(`Salary: ${match[2]}`);

            match = pattern.exec(string);
        }
    }
}

function formFiller(username, email, phoneNumber, arr) {
    let output = [];

    for (let line of arr) {
        line = line
            .replace(/<![A-Za-z]+!>/g, username)
            .replace(/<@[A-Za-z]+@>/g, email)
            .replace(/<\+[A-Za-z]+\+>/g, phoneNumber);

        output.push(line);
    }

    console.log(output.join("\n"));
}

function matchMultiplication(string) {
    let pattern = /(-*\d+)\s*\*\s*(-*\d+(?:\.\d+)*)/g;

    string = string.replace(pattern, (match, num1, num2) => Number(num1) * Number(num2));
    return string;
}