function triangleOfStars(n) {
    for (let i = 1; i <= n; i++) {
        console.log('*'.repeat(i));
    }

    for (let i = n - 1; i > 0; i--) {
        console.log('*'.repeat(i));
    }
}

function squareOfStars(n = 5) {
    for (let i = 1; i <= n; i++) {
        console.log('* '.repeat(n));
    }
}

function palyndrome(word) {
    let wordReversed = '';
    for (let i = word.length - 1; i >= 0; i--) {
        wordReversed += word[i];
    }

    console.log(word === wordReversed);
}

function dayOfWeek(day) {
    switch (day) {
        case 'Monday':
            console.log(1);
            break;
        case 'Tuesday':
            console.log(2);
            break;
        case 'Wednesday':
            console.log(3);
            break;
        case 'Thursday':
            console.log(4);
            break;
        case 'Friday':
            console.log(5);
            break;
        case 'Saturday':
            console.log(6);
            break;
        case 'Sunday':
            console.log(7);
            break;
        default:
            console.log('error');
            break;
    }
}

function functionalCalculator(a, b, operator) {

    function add(a, b) {
        return a + b;
    }

    function subtract(a, b) {
        return a - b;
    }

    function multiply(a, b) {
        return a * b;
    }

    function divide(a, b) {
        return a / b
    }

    switch (operator) {
        case '+': return add(a, b);
        case '-': return subtract(a, b);
        case '*': return multiply(a, b);
        case '/': return divide(a, b);
    }
}

function agregateElements(array) {
    let sum = 0;
    let inverseSum = 0;
    let concatOut = '';

    array.forEach(a => {
        sum += a;
        inverseSum += 1 / a;
        concatOut += a;
    });

    console.log(sum);
    console.log(inverseSum);
    console.log(concatOut);
}

function wordsUpperCase(sentence) {
    let pattern = /\w+/g;
    let output = '';

    let match = pattern.exec(sentence);
    while (match) {
        output += (match[0].toUpperCase() + ', ');
        match = pattern.exec(sentence);
    }

    console.log(output.substring(0, output.length - 2));
}