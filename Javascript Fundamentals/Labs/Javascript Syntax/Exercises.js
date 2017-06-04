function sumThreeNumbers(a, b, c) {
    console.log(a + b + c);
}

function calculateAndSumVAT(arr) {
    let sum = 0;
    for (let num of arr) {
        sum += num;
    }

    console.log("sum = " + sum);
    console.log("VAT = " + sum * 0.2);
    console.log("total = " + (sum + sum * 0.2))
}

function letterOccurrencesInString(word, letter) {
    let occurrences = 0;

    for (let i = 0; i < word.length; i++) {
        if (word[i] === letter) {
            occurrences++;
        }
    }

    console.log(occurrences);
}

function filterByAge(minimumAge, name1, age1, name2, age2) {
    let person1 = {name: name1, age: age1};
    let person2 = {name: name2, age: age2};

    if (person1.age >= minimumAge) {
        console.log(person1);
    }

    if (person2.age >= minimumAge) {
        console.log(person2);
    }
}

function stringOfNumbers(n) {
    let output = "";

    for (let i = 1; i <= n; i++) {
        output += i;
    }

    console.log(output);
}

function figureArea(width1, height1, width2, height2) {
    let intersectionWidth = Math.min(width1, width2);
    let intersectionHeight = Math.min(height1, height2);

    let figure1Area = width1 * height1;
    let figure2Area = width2 * height2;

    let intersectionArea = intersectionWidth * intersectionHeight;

    let totalArea = (figure1Area + figure2Area) - intersectionArea;

    console.log(totalArea);
}

function nextDay(year, month, day) {
    let date = new Date(year, month - 1, day);
    date.setDate(date.getDate() + 1);

    console.log(`${date.getFullYear()}-${date.getMonth() + 1}-${date.getDate()}`);
}

function distanceBetweenPoints(x1, y1, x2, y2) {
    console.log(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
}