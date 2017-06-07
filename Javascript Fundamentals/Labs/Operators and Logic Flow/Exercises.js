function multiplyNumbers(a, b) {
    console.log(a * b);
}

function boxesAndBottles(bottles, capacityOfBox) {
    console.log(Math.ceil(bottles / capacityOfBox));
}

function isLeapYear(year) {
    console.log((year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0) ? "yes" : "no");
}

function circleArea(radius) {
    console.log(Math.PI * radius ** 2);
    console.log(Math.round((Math.PI * radius ** 2) * 100) / 100);
}

function triangleArea(a, b, c) {
    let perimeter = (a + b + c) / 2;
    console.log(Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c)));
}

function cone(radius, height) {
    let pi = Math.PI;
    let lateral = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));

    let volume = (pi * Math.pow(radius, 2) * height) / 3;
    let area = pi * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));

    console.log(`volume = ${volume}\narea = ${area}`);
}

function oddEven(num) {
    let n = Math.abs(num);
    if (n % 2 === 0) {
        console.log(`even`);
    } else if (n % 2 === 1) {
        console.log(`odd`);
    } else {
        console.log(`invalid`);
    }
}

function fruitOrVegetable(food) {
    let fruits = ["banana", "apple", "kiwi", "cherry", "lemon", "grapes", "peach"];
    let vegetables = ["tomato", "cucumber", "pepper", "onion", "garlic", "parsley"];
    let type = "unknown";

    for (let fruit of fruits) {
        if (fruit === food) {
            type = "fruit";
            break;
        }
    }

    for (let vegetable of vegetables) {
        if (vegetable === food) {
            type = "vegetable";
            break;
        }
    }

    console.log(type);
}

function colorfulNumbers(n) {
    let currentColor;

    console.log("<ul>");

    for (let i = 1; i <= n; i++) {
        if (i % 2 === 0) {
            currentColor = "blue";
        } else {
            currentColor = "green";
        }

        console.log(`\t<li><span style 'color:${currentColor}'>${i}</span></li>`);
    }

    console.log("</ul>");
}

function chessBoard(n) {
    let currentColor = "black";
    let lastRowColor;

    console.log(`<div class="chessboard">`);

    for (let i = 1; i <= n; i++) {
        console.log(`\t<div>`);

        for (let y = 1; y <= n; y++) {
            if (y === 1) {
                lastRowColor = currentColor;
            }

            console.log(`\t\t<span class="${currentColor}"></span>`);

            if (currentColor === "black") {
                currentColor = "white";
            } else {
                currentColor = "black";
            }
        }

        console.log(`\t</div>`);

        if (lastRowColor === "black") {
            currentColor = "white";
        } else {
            currentColor = "black";
        }
    }

    console.log(`</div>`);
}

function binaryLogarithm(arrayOfNumbers) {
    for (let num of arrayOfNumbers) {
        console.log(Math.log2(num));
    }
}

function primeNumberChecker(number) {
    if (number <= 1) {
        return false;
    }

    for (let numberToCheck = 2; numberToCheck < number; numberToCheck++) {
        if (number % numberToCheck === 0) {
            return false;
        }
    }

    return true;
}