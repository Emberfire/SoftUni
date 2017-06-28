function spiceMustFlow(arr) {
    let spiceYield = Number(arr[0]);
    let spice = 0;
    let daysWorked = 0;

    while (spiceYield >= 100) {
        daysWorked++;
        spice += spiceYield;
        spice -= 26;
        spiceYield -= 10;
    }

    if (spice >= 26) {
        spice -= 26;
    }

    console.log(daysWorked);
    console.log(spice);
}

function buildAWall(array) {
    array = array.map(a => Number(a));
    let allCompleted = false;
    let usageByDay = [];

    while (!allCompleted) {
        allCompleted = true;
        let concreteUsed = 0;

        for (let i = 0; i < array.length; i++) {
            let currentHeight = array[i];
            if (currentHeight < 30) {
                array[i]++;
                concreteUsed += 195;
                allCompleted = false;
            }
        }

        if (concreteUsed > 0) {
            usageByDay.push(concreteUsed);
        }
    }

    console.log(usageByDay.join(', '));
    console.log(`${usageByDay.reduce((a, b) => a + b) * 1900} pesos`);
}

function formatHelper(array) {
    let sentence = array[0];
    let pattern1 = /([.,!?:;])(\s*)/g;
    let pattern2 = /(\s+)([.,!?:;])/g;
    let pattern3 = /((?:[.\s])+!)/g;
    let pattern4 = /\s*\.\s*(\d+)/g;
    let pattern5 = /"\s*(.+?)\s*"/g;

    sentence = sentence
        .replace(pattern1, "$1 ")
        .replace(pattern2, "$2")
        .replace(pattern3, "$1".replace(/s+/g, ''))
        .replace(pattern4, ".$1")
        .replace(pattern5, '"$1"');
    console.log(sentence);
}

function airport(array) {
    let cities = new Map();
    let planesAtAirport = new Map();

    for (let command of array) {
        let tokens = command.split(' ');

        let planeID = tokens[0];
        let city = tokens[1];
        let passengers = Number(tokens[2]);
        let action = tokens[3];

        if (action === 'depart' && planesAtAirport.has(planeID)) {
            if (!cities.has(city)) {
                cities.set(city, {'arrivals': 0, 'departures': passengers, 'planes': new Set().add(planeID)});
            } else {
                cities.get(city).planes.add(planeID);
                cities.get(city).departures += passengers;
            }

            planesAtAirport.delete(planeID);
        } else if (action === 'land' && !planesAtAirport.has(planeID)) {
            if (!cities.has(city)) {
                cities.set(city, {'arrivals': passengers, 'departures': 0, planes: new Set().add(planeID)});
            } else {
                cities.get(city).planes.add(planeID);
                cities.get(city).arrivals += passengers;
            }

            planesAtAirport.set(planeID, planeID);
        }
    }

    let planesAtAirportSorted = [...planesAtAirport.entries()].sort((a, b) => {
        if (a[0].toLowerCase() > b[0].toLowerCase()) {
            return 1;
        }
        else if (a[0].toLowerCase() < b[0].toLowerCase()) {
            return -1
        }
        return 0
    });

    let citiesSorted = [...cities.entries()].sort((a, b) => {
        let result = b[1].arrivals - a[1].arrivals;
        if (result === 0) {
            if (a[0].toLowerCase() > b[0].toLowerCase()) {
                result = 1;
            } else if (a[0].toLowerCase() < b[0].toLowerCase()) {
                result = -1
            } else {
                result = 0;
            }
        }

        return result;
    });

    let output = 'Planes left:\n';
    for (let planePair of planesAtAirportSorted) {
        output += `- ${planePair[0]}\n`;
    }

    for (let cityPair of citiesSorted) {
        output += `${cityPair[0]}\nArrivals: ${cityPair[1].arrivals}\nDepartures: ${cityPair[1].departures}\nPlanes: \n`;
        let planesSorted = [...cityPair[1].planes.entries()].sort((a, b) => {
            if (a[1].toLowerCase() > b[1].toLowerCase()) {
                return 1;
            } else if (a[1].toLowerCase() < b[1].toLowerCase()) {
                return -1;
            } else {
                return 0;
            }
        });

        for (let planePair of planesSorted) {
            output += `-- ${planePair[1]}\n`;
        }
    }

    return output;
}