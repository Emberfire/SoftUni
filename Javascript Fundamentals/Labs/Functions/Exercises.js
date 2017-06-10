function triangleOfStars(n) {
    for (let i = 1; i <= n; i++) {
        console.log('*'.repeat(i));
    }

    for (let i = n - 1; i > 0; i--) {
        console.log('*'.repeat(i));
    }
}

function squareOfStars(n) {
    for (let i = 1; i <= n; i++) {
        console.log('*'.repeat(n));
    }
}

function palyndrome(word) {
    let wordReversed = '';
    for (let i = word.length - 1; i >= 0; i--) {
        wordReversed += word[i];
    }

    console.log(wordReversed)
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

}