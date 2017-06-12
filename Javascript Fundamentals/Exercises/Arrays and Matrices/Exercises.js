function printArrayWithGivenDelimiter(array) {
    let delimiter = array[array.length - 1];
    let output = '';

    output += array[0];
    for (let i = 1; i < array.length - 1; i++) {
        output += `${delimiter}` + array[i];
    }

    console.log(output);
}

function printEveryNthElementFromArray(array) {
    let n = Number(array.pop());

    for (let i = 0; i < array.length; i += n) {
        console.log(array[i]);
    }
}

function addOrRemoveElements(array) {
    let numbersArray = [];
    let number = 1;

    for (let command of array) {
        if (command === 'add') {
            numbersArray.push(number);
        } else if (command === 'remove') {
            numbersArray.pop();
        }

        number++;
    }

    if (numbersArray.length !== 0) {
        for (let numberInArray of numbersArray) {
            console.log(numberInArray);
        }
    } else {
        console.log('Empty');
    }
}

function rotateArray(array) {
    let cycles = Number(array.pop());

    for (let i = 0; i < cycles % array.length; i++) {
        array.unshift(array.pop());
    }

    console.log(array.join(' '));
}

function extractNonIncreasingSubsequenceFromArray(array) {
    let biggestNumber = array[0];
    let sequence = [biggestNumber];

    for (let i = 1; i < array.length; i++) {
        if (array[i] >= biggestNumber) {
            biggestNumber = array[i];
            sequence.push(array[i]);
        }
    }

    for (let number of sequence) {
        console.log(number);
    }
}

function sortArray(array) {
    console.log(array
        .sort((a, b) => {
            if (a.length > b.length) {
                return 1;
            } else if (a.length < b.length) {
                return -1;
            } else {
                return a.toLowerCase().localeCompare(b.toLowerCase());
            }
        })
        .join('\n'));
}

function magicMatrices(matrix) {
    let sum = matrix[0].reduce((a, b) => a + b);

    for (let i = 1; i < matrix.length; i++) {
        if (sum !== matrix[i].reduce((a, b) => a + b)) {
            return false;
        }
    }

    for (let i = 0; i < matrix[0].length; i++) {
        let currentColumnSum = 0;

        for (let j = 0; j < matrix.length; j++) {
            currentColumnSum += matrix[j][i];
        }

        if (currentColumnSum !== sum) {
            return false;
        }
    }

    return true;
}