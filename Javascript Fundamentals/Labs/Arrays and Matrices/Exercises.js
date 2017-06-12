function sumFirstLast(array) {
    let first = Number(array[0]);
    let last = Number(array[array.length - 1]);

    console.log(first + last);
}

function evenPositionElements(array) {
    let output = '';
    for (let i = 0; i < array.length; i++) {
        if (i % 2 === 0) {
            output += array[i] + ' ';
        }
    }

    console.log(output);
}

function negativePositiveNumbers(array) {
    let newArray = [];

    for (let element of array) {
        if  (element < 0) {
            newArray.unshift(element);
        } else {
            newArray.push(element);
        }
    }

    return newArray;
}

function firstAndLastKNumbers(array) {
    let k = array[0];

    console.log(array.slice(1, k + 1).join(' '));
    console.log(array.slice(array.length - k, array.length).join(' '));
}

function lastKNumbersSequence(n, k) {
    let output = [1];

    for (let i = 0; i < n - 1; i++) {
        let sum = 0;
        output.slice(-k).forEach(a => sum += a);
        output.push(sum);
    }

    console.log(output);
}

function processOddNumbers(array) {
    let oddNumbers = array
        .filter((a, i) => i % 2 !== 0)
        .map(a => a * 2)
        .reverse()
        .join(' ');

    console.log(oddNumbers);
}

function smallestTwoNumbers(array) {
    console.log(array.sort((a, b) => a - b).slice(0, 2).join(' '));
}

function biggestElement(matrix) {
    let biggestNumber = Number.MIN_SAFE_INTEGER;

    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] > biggestNumber) {
                biggestNumber = matrix[i][j];
            }
        }
    }

    console.log(biggestNumber);
}

function diagonalSums(matrix) {
    let mainDiagonalSum = 0;
    let secondaryDiagonalSum = 0;

    for (let i = 0; i < matrix.length; i++) {
        mainDiagonalSum += matrix[i][i];
        secondaryDiagonalSum += matrix[i][matrix[i].length - 1 - i]
    }

    console.log(`${mainDiagonalSum} ${secondaryDiagonalSum}`);
}

function equalNeighbors(matrix) {
    let occurrences = 0;

    for (let row = 0; row < matrix.length; row++) {
        for (let col = 0; col < matrix[row].length; col++) {
            if (row === matrix.length - 1) {
                if (matrix[row][col] === matrix[row][col + 1]) {
                    occurrences++;
                }
            } else {
                if (matrix[row][col] === matrix[row + 1][col]) {
                    occurrences++;
                }

                if (matrix[row][col] === matrix[row][col + 1]) {
                    occurrences++;
                }
            }
        }
    }

    console.log(occurrences);
}

equalNeighbors([['2', '2', '5', ' ', '4'], ['4', '0', '5', ' ', '4'], ['2', '5', '5', '4', '2']]);