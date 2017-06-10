function helloJavaScript(name) {
    console.log(`Hello, ${name}, I am JavaScript!`)
}

function areaAndPerimeter(a, b) {
    console.log(a * b);
    console.log((2 * a) + (2 * b));
}

function distanceOverTime(array) {         //distance = speed * time
    let aSpeedMps = (Number(array[0]) * 1000) / 3600;
    let bSpeedMps = (Number(array[1]) * 1000) / 3600;
    let time = Number(array[2]);

    console.log(Math.abs((aSpeedMps * time) - (bSpeedMps * time)));
}

function distanceIn3D(array) {
    let x1 = array[0];
    let y1 = array[1];
    let z1 = array[2];
    let x2 = array[3];
    let y2 = array[4];
    let z2 = array[5];

    let x3 = Math.abs(x1 - x2);
    let y3 = Math.abs(y1 - y2);
    let z3 = Math.abs(z1 - z2);

    console.log(Math.sqrt((x3 ** 2) + (y3 ** 2) + (z3 ** 2)))
}

function gradsToDegrees(grad) {             //degrees = (radians * 180) / Pi
    let degrees = (0.9 * grad) % 360;

    if (degrees < 0) {
        degrees += 360;
    }

    console.log(degrees)
}

function compoundInterest(array) {          //compound interest = P(1 + (i / c)) ^ c * o
    let principal = array[0];
    let interest = array[1];
    let compoundFrequency = 12 / array[2];
    let overallLength = array[3];

    let compoundInterest = principal * Math.pow((1 + ((interest / 100) / compoundFrequency)), compoundFrequency * overallLength);

    console.log(Math.round(compoundInterest * 100) / 100);
}

function rounding(array) {
    let number = array[0];
    let precision = array[1];

    if (precision > 15) {
        precision = 15;
    }

    console.log(Number(number.toFixed(precision)));
}

function imperialUnits(inches) {
    let feet = Math.floor(inches / 12);
    let leftOverFeet = ((inches / 12 - feet) * 12).toFixed(0);

    console.log(`${feet}'-${leftOverFeet}"`);
}

function nowPlaying(array) {
    let name = array[0];
    let artist = array[1];
    let length = array[2];

    console.log(`Now Playing: ${artist} - ${name} [${length}]`);
}

function composeTag(array) {
    console.log(`<img src="${array[0]}" alt="${array[1]}">`);
}

function binaryToDecimal(number) {
    console.log(parseInt(number, 2));
}

function assignProperties(array) {
    let prop1 = array[0];
    let val1 = array[1];
    let prop2 = array[2];
    let val2 = array[3];
    let prop3 = array[4];
    let val3 = array[5];

    console.log({[prop1]: val1, [prop2]: val2, [prop3]: val3});
}

function lastMonth(array) {
    let month = array[1];
    let year = array[2];

    if (month === 1) {
        month = 12;
        year -= 1;
    } else if (month === 12) {
        month = 1;
        year += 1;
    } else {
        month--;
    }

    let date = new Date(year, month, 0);
    console.log(date.getDate());
}

function biggestOf3Numbers(array) {
    let num1 = array[0];
    let num2 = array[1];
    let num3 = array[2];

    console.log(Math.max(num1, num2, num3));
}

function pointInRectangle(array) {
    let x = array[0];
    let y = array[1];
    let xMin = array[2];
    let xMax = array[3];
    let yMin = array[4];
    let yMax = array[5];

    if (x >= xMin && x <= xMax && y >= yMin && y <= yMax) {
        console.log("inside");
    } else {
        console.log("outside");
    }
}

function oddNumbers1ToN(n) {
    for (let i = 1; i <= n; i += 2) {
        console.log(i);
    }
}

function triangleOfDollars(n) {
    let counter = 1;
    let output = '';
    for (let i = 0; i < n; i++) {
        output += '$'.repeat(counter);

        output += '\n';
        counter++;
    }

    console.log(output);
}

function moviePrices(arr) {
    let movieTitle = arr[0].toLowerCase();
    let dayOfWeek = arr[1].toLowerCase();

    switch (movieTitle) {
        case "the godfather":
            switch (dayOfWeek) {
                case "monday":
                    return 12;
                case "tuesday":
                    return 10;
                case "wednesday":
                    return 15;
                case "thursday":
                    return 12.50;
                case "friday":
                    return 15;
                case "saturday":
                    return 25;
                case "sunday":
                    return 30;
                default :
                    return "error"
            }
        case "schindler's list":
            switch (dayOfWeek) {
                case "monday":
                    return 8.50;
                case "tuesday":
                    return 8.50;
                case "wednesday":
                    return 8.50;
                case "thursday":
                    return 8.50;
                case "friday":
                    return 8.50;
                case "saturday":
                    return 15;
                case "sunday":
                    return 15;
                default :
                    return "error"
            }
        case "casablanca":
            switch (dayOfWeek) {
                case "monday":
                    return 8;
                case "tuesday":
                    return 8;
                case "wednesday":
                    return 8;
                case "thursday":
                    return 8;
                case "friday":
                    return 8;
                case "saturday":
                    return 10;
                case "sunday":
                    return 10;
                default :
                    return "error"
            }
        case "the wizard of oz":
            switch (dayOfWeek) {
                case "monday":
                    return 10;
                case "tuesday":
                    return 10;
                case "wednesday":
                    return 10;
                case "thursday":
                    return 10;
                case "friday":
                    return 10;
                case "saturday":
                    return 15;
                case "sunday":
                    return 15;
                default :
                    return "error"
            }
        default:
            return "error";
    }
}

function quadraticEquation(a, b, c) {

    let discriminant = Math.pow(b, 2) - (4 * a * c);

    if (discriminant < 0) {
        console.log('No');
    } else if (discriminant === 0) {
        console.log((b * -1) / (2 * a));
    } else {
        console.log(Math.min(((b * -1) - Math.sqrt(discriminant)) / (2 * a), (-b + Math.sqrt(discriminant)) / (2 * a)));
        console.log(Math.max(((b * -1) - Math.sqrt(discriminant)) / (2 * a), (-b + Math.sqrt(discriminant)) / (2 * a)));
    }
}

function multiplicationTable(n) {
    let output = '<table border-"1">\n';

    output += '\t<tr><th>x</th>';

    for (let j = 1; j <= n; j++) {
        output += `<th>${j}</th>`;
    }

    output += '</tr>\n';

    for (let i = 1; i <= n; i++) {
        output += `\t<tr><th>${i}</th>`;

        for (let j = 1; j <= n; j++) {
            output += `<td>${i * j}</td>`;
        }

        output += '</tr>\n';
    }

    output += '</table>';
    console.log(output);
}

function figureOf4Squares(n) {
    let output = '';
    if (n % 2 === 0) {
        for (let i = 0; i < n - 1; i++) {
            if (i === 0 || i === (n / 2) - 1 || i === n - 2) {
                output += '+' + '-'.repeat(n - 2) + '+' + '-'.repeat(n - 2) + '+';
            } else {
                output += '|' + ' '.repeat(n - 2) + '|' + ' '.repeat(n - 2) + '|';
            }

            output += '\n';
        }
    } else if (n % 2 !== 0) {
        for (let i = 0; i < n; i++) {
            if (i === 0 || i === Math.floor(n / 2) || i === n - 1) {
                output += '+' + '-'.repeat(n - 2) + '+' + '-'.repeat(n - 2) + '+';
            } else {
                output += '|' + ' '.repeat(n - 2) + '|' + ' '.repeat(n - 2) + '|';
            }

            output += '\n';
        }
    }

    console.log(output);
}