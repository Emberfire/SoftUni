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

