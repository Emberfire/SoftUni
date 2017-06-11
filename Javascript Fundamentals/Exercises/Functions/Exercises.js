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

function validityChecker() {

}