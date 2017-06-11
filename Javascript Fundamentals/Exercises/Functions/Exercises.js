function solve(input) {
    function insideVolume(x, y, z) {
        let x1 = 10, x2 = 50;
        let y1 = 20, y2 = 80;
        let z1 = 15, z2 = 50;

        if (x >= x1 && x <= x2 && y >= y1 && y <= y2 && z >= z1 && z <= z2) {
            return 'inside';
        }

        return 'outside';
    }

    for (let i = 0; i < input.length; i += 3) {
        let x = input[i];
        let y = input[i + 1];
        let z = input[i + 2];

        console.log(insideVolume(x, y, z));
    }
}

function roadRadar(input) {
    let speed = input[0];
    let zone = input[1];

    function getLimit(zone) {
        switch (zone) {
            case 'motorway':
                return 130;
            case 'interstate':
                return 90;
            case 'city':
                return 50;
            case 'residential':
                return 20;
        }
    }

    function getInfraction(speed, limit) {
        if (speed > limit) {
            if (speed - limit <= 20) return 'speeding';
            else if (speed - limit <= 40) return 'excessive speeding';
            else if (speed - limit > 40) return 'reckless driving';
        } else return '';
    }

    console.log(getInfraction(input[0], getLimit(input[1])));
}

function templateFormat(array) {
    function fetchQuestionsAnswers(arr) {
        let questionsAnswers = [];

        for (let i = 0; i < arr.length; i += 2) {
            questionsAnswers.push(arr[i]);
            questionsAnswers.push(arr[i + 1]);
        }

        return questionsAnswers;
    }

    function writeDocument(questionsAnswers) {
        console.log('<?xml version="1.0" encoding="UTF-8"?>');
        console.log('<quiz>');
        let questionsAnswersArray = questionsAnswers;

        for (let i = 0; i < questionsAnswersArray.length; i++) {
            if (i % 2 === 0) {
                console.log('\t<question>');
                console.log(`\t\t${questionsAnswersArray[i]}`);
                console.log('\t</question>');
            } else if (i % 2 !== 0) {
                console.log('\t<answer>');
                console.log(`\t\t${questionsAnswersArray[i]}`);
                console.log('\t</answer>');
            }
        }

        console.log('</quiz>');
    }

    writeDocument(fetchQuestionsAnswers(array));
}

function cookingByNumbers(array) {
    let number = array[0];

    for (let i = 1; i <= array.length; i++) {
        switch (array[i]) {
            case 'chop':
                number /= 2;
                console.log(number);
                break;
            case 'dice':
                number = Math.sqrt(number);
                console.log(number);
                break;
            case 'spice':
                number++;
                console.log(number);
                break;
            case 'bake':
                number *= 3;
                console.log(number);
                break;
            case 'fillet':
                number -= (number * 0.2);
                console.log(number);
                break;
        }
    }
}

function modifyAge(n) {
    function getAverage(number) {

        let sum = 0;
        for (let obj of number) {
            sum += Number(obj);
        }

        return sum / number.length;
    }

    let output = '' + n;
    while (getAverage(output) <= 5) {
        output += 9;
    }


    console.log(output);

}

function validityChecker(array) {
    let x1 = array[0];
    let y1 = array[1];
    let x2 = array[2];
    let y2 = array[3];

    console.log(`{${x1}, ${y1}} to {0, 0} is ${isInValidRange(x1, y1, 0, 0)}`);
    console.log(`{${x2}, ${y2}} to {0, 0} is ${isInValidRange(x2, y2, 0, 0)}`);
    console.log(`{${x1}, ${y1}} to {${x2}, ${y2}} is ${isInValidRange(x1, y1, x2, y2)}`);

    function isInValidRange(x1, y1, x2, y2) {
        let distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance % 1 === 0 ? 'valid' : 'invalid';
    }
}

function treasureLocator(array) {
    for (let i = 0; i < array.length; i += 2) {
        if (array[i] >= 1 && array[i] <= 3 && array[i + 1] >= 1 && array[i + 1] <= 3) {
            console.log('Tuvalu');
        } else if (array[i] >= 8 && array[i] <= 9 && array[i + 1] >= 0 && array[i + 1] <= 1) {
            console.log('Tokelau');
        } else if (array[i] >= 5 && array[i] <= 7 && array[i + 1] >= 3 && array[i + 1] <= 6) {
            console.log('Samoa');
        } else if (array[i] >= 0 && array[i] <= 2 && array[i + 1] >= 6 && array[i + 1] <= 8) {
            console.log('Tonga');
        } else if (array[i] >= 4 && array[i] <= 9 && array[i + 1] >= 7 && array[i + 1] <= 8) {
            console.log('Cook');
        } else {
            console.log('On the bottom of the ocean')
        }
    }
}