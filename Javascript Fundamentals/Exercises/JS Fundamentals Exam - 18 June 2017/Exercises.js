function pyramid(base, increment) {      //MAY BE ARRAY, WILL CHECK IN JUDGE
    let stoneUsed = 0;
    let marbleUsed = 0;
    let lapisUsed = 0;
    let goldUsed = 0;
    let pyramidHeight = 1;
    let currentBase = base;
    let pyramidSteps = 1;

    while (currentBase >= 1) {        //MAY NOT BE NEEDED
        for (let row = 1; row <= currentBase; row++) {
            if (currentBase <= 2) {
                goldUsed += currentBase * currentBase * increment;
                break;
            } else if (pyramidSteps % 5 === 0) {
                if (row === 1 || row === currentBase) {
                    lapisUsed += currentBase * increment;
                } else {
                    lapisUsed += 2 * increment;
                    stoneUsed += (currentBase - 2) * increment;
                }
            } else {
                if (row === 1 || row === currentBase) {
                    marbleUsed += currentBase * increment;
                } else {
                    marbleUsed += 2 * increment;
                    stoneUsed += (currentBase - 2) * increment;
                }
            }
        }

        currentBase -= 2;
        pyramidHeight+= increment;
        pyramidSteps++;
    }

    console.log(`Stone required: ${Math.ceil(stoneUsed)}`);
    console.log(`Marble required: ${Math.ceil(marbleUsed)}`);
    console.log(`Lapis Lazuli required: ${Math.ceil(lapisUsed)}`);
    console.log(`Gold required: ${Math.ceil(goldUsed)}`);
    console.log(`Final pyramid height: ${Math.floor(pyramidHeight - 1)}`);
}

function jansNotation(array) {
    let arrayOfNumbers = [];
    for (let operation of array) {
        if (typeof  operation === 'number') {
            arrayOfNumbers.push(Number(operation));
        } else {
            if (arrayOfNumbers.length < 2) {
                console.log('Error: not enough operands!');
                return;
            } else {
                if (operation === '+') {
                    let currentElements = [];
                    currentElements.push(arrayOfNumbers.pop());
                    currentElements.push(arrayOfNumbers.pop());
                    currentElements = currentElements.reverse();
                    arrayOfNumbers.push(currentElements[0] + currentElements[1]);
                } else if (operation === '-') {
                    let currentElements = [];
                    currentElements.push(arrayOfNumbers.pop());
                    currentElements.push(arrayOfNumbers.pop());
                    currentElements = currentElements.reverse();
                    arrayOfNumbers.push(currentElements[0] - currentElements[1]);
                } else if (operation === '*') {
                    let currentElements = [];
                    currentElements.push(arrayOfNumbers.pop());
                    currentElements.push(arrayOfNumbers.pop());
                    currentElements = currentElements.reverse();
                    arrayOfNumbers.push(currentElements[0] * currentElements[1]);
                } else if (operation === '/') {
                    let currentElements = [];
                    currentElements.push(arrayOfNumbers.pop());
                    currentElements.push(arrayOfNumbers.pop());
                    currentElements = currentElements.reverse();
                    arrayOfNumbers.push(currentElements[0] / currentElements[1]);
                }
            }
        }
    }

    if (arrayOfNumbers.length > 1) {
        console.log('Error: too many operands!');
    } else {
        console.log(arrayOfNumbers[0]);
    }
}

function xmlMessenger(message) {
    let errorMessage = '';
    let pattern = /^<message (?:(to)="([A-Za-z]+)"|(from)="([A-Za-z]+)").+?(?:(to)="([A-Za-z]+)"|(from)="([A-Za-z]+)").+?>(.+)<\/message>$/gm;
    let match = pattern.exec(message);
    let people = new Map();
    let output = '';
    let textMessage = '';
    let messageSplit = textMessage;

    if (match) {
        people.set(match[9], new Map());
        textMessage = match[9];
        if (match[3] === 'from') {
            people.get(match[9]).set('from', match[4]);
            people.get(match[9]).set('to', match[6]);
        } else if (match[3] === 'to') {
            people.get(match[9]).set('from', match[6]);
            people.get(match[9]).set('to', match[4]);
        }
    } else {
        errorMessage = 'Missing Attributes';
    }

    if (errorMessage !== '') {
        console.log(errorMessage);
    } else {
        output += '<article>\n';
        output += `\t<div> From: <span class="sender">${people.get(textMessage).get('from')}</span></div>\n`;
        output += `\t<div> To: <span class="recipient">${people.get(textMessage).get('to')}</span></div>\n`;
        output += '\t<div>\n';

        messageSplit = textMessage.split('\n').filter(a => a.length > 0);
        messageSplit = textMessage;
        output += `\t\t<p>${textMessage}</p>\n`;

        output += '\t</div>\n';
        output += '</article>';
    }
    console.log(output);
}

function galacticElection(array) {
    let galactic = new Map();
    for (let object of array) {
        if (!galactic.has(object['system'])) {
            galactic.set(object['system'], new Map());
        }
        if (!galactic.get(object['system']).has(object['candidate'])) {
            galactic.get(object['system']).set(object['candidate'], object['votes']);
        }
    }

    for (let pair of galactic) {
        let maxVotes = 0;
        let maxVotesPerson = '';
        let sumOfVotes = [...pair[1]].reduce((a, b) => a[1] + b[1]);
        for (let pair2 of pair[1]) {
            if (pair2[1] > maxVotes) {
                maxVotes = pair2[1];
                maxVotesPerson = pair2[0];
            }
        }

        galactic.get(pair[0]).set(maxVotesPerson, sumOfVotes);
    }

    let a = 0;
}


galacticElection([ { system: 'Theta', candidate: 'Flying Shrimp', votes: 10 },
    { system: 'Sigma', candidate: 'Space Cow',     votes: 200 },
    { system: 'Sigma', candidate: 'Flying Shrimp', votes: 120 },
    { system: 'Tau',   candidate: 'Space Cow',     votes: 15 },
    { system: 'Sigma', candidate: 'Space Cow',     votes: 60 },
    { system: 'Tau',   candidate: 'Flying Shrimp', votes: 150 } ]
);



//pyramid(23, 0.5);