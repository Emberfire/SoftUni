function townsToJSON(array) {
    array.shift();
    let objects = [];

    for (let row of array) {
        let rowArray = row.split('|').filter(a => a.length > 0).map(a => a.trim());
        let town = {Town: rowArray[0], Latitude: Number(rowArray[1]), Longitude: Number(rowArray[2])};
        objects.push(town);
    }

    console.log(JSON.stringify(objects));
}

function scoreToHTML(string) {
    let array = JSON.parse(string);
    console.log('<table>');
    console.log('\t<tr><th>name</th><th>score</th></tr>');

    for (let object of array) {
        let name = object['name']
            .replace(/&/g, "&amp;")
            .replace(/</g, "&lt;")
            .replace(/>/g, "&gt;")
            .replace(/"/g, "&quot;")
            .replace(/'/g, "&#39;");

        let score = object['score'];
        console.log(`\t<tr><td>${name}</td><td>${score}</td></tr>`);
    }

    console.log('</table>');
}

function JSONtoHTMLTable(arrayAsJSON) {
    let array = JSON.parse(arrayAsJSON);
    let output = '<table>\n\t<tr>';

    for (let object of array) {
        for (let key in object) {
            if (typeof object[key] !== 'number') {
                object[key] = object[key].replace('&', "&amp;")
                    .replace('<', "&lt;")
                    .replace('>', "&gt;")
                    .replace('"', "&quot;")
                    .replace("'", "&#39;");
            }
        }
    }

    for (let key in array[0]) {
        output += `<th>${key}</th>`
    }

    output += '</tr>\n';

    for (let i = 0; i < array.length; i++) {
        output += '\t<tr>';
        for (let key in array[i]) {
            output += `<td>${array[i][key]}</td>`
        }

        output += '</tr>\n';
    }

    output += '</table>';
    console.log(output);
}

function sumByTown(array) {
    let object = {};

    for (let i = 0; i < array.length; i += 2) {
        let townName = array[i];
        let townIncome = array[i + 1];

        if (townName in object) {
            object[townName] += Number(townIncome);
        } else {
            object[townName] = Number(townIncome);
        }
    }

    return JSON.stringify(object);
}

function countWordsInAText(sentence) {
    let words = sentence[0].split(/\W+/g).filter(a => a.length > 0);
    let wordsCount = {};

    for (let word of words) {
        if (word in wordsCount) {
            wordsCount[word]++;
        } else {
            wordsCount[word] = 1;
        }
    }

    return JSON.stringify(wordsCount);
}

function countWordsWithMaps(sentence) {
    let words = sentence.split(/\W+/g).filter(a => a.length > 0).map(a => a.toLowerCase());
    let wordsCount = new Map();
    let output = '';

    for (let word of words) {
        if (wordsCount.has(word)) {
            wordsCount.set(word, wordsCount.get(word) + 1);
        } else {
            wordsCount.set(word, 1);
        }
    }

    let wordsCountSorted = [...wordsCount].sort();

    for (let pair of wordsCountSorted) {
        output += `'${pair[0]}' -> ${pair[1]} times\n`;
    }

    return output;
}

function populationsInTowns(array) {
    let towns = new Map();
    let output = '';

    for (let townPopulationPair of array) {
        let tokens = townPopulationPair.split(' <-> ').filter(a => a.length > 0);
        let townName = tokens[0];
        let population = Number(tokens[1]);

        if (!towns.has(townName)) {
            towns.set(townName, population);
        } else {
            towns.set(townName, towns.get(townName) + population);
        }
    }

    for (let pair of towns) {
        output += `${pair[0]} : ${pair[1]}\n`
    }

    return output;
}

function cityMarkets(array) {
    let markets = new Map();
    let output = '';

    for (let line of array) {
        let tokens = line.split(/ -> | : /g).filter(a => a.length > 0);
        let cityName = tokens[0];
        let productName = tokens[1];
        let productPrice = Number(tokens[2]) * Number(tokens[3]);


        if (!markets.has(cityName)) {
            markets.set(cityName, new Map());
        }

        if (!markets.get(cityName).has(productName)) {
            markets.get(cityName).set(productName, 0);
        }

        markets.get(cityName).set(productName, markets.get(cityName).get(productName) + productPrice);
    }

    for (let pair of markets) {
        output += `Town - ${pair[0]}\n`;
        for (let productPair of pair[1]) {
            output += `$$$${productPair[0]} : ${productPair[1]}\n`
        }
    }

    return output;
}

function lowestPricesInCities(array) {
    let townPrices = new Map();
    let output = '';

    for (let line of array) {
        let tokens = line.split(' | ').filter(a => a.length > 0);
        let townName = tokens[0];
        let productName = tokens[1];
        let productPrice = Number(tokens[2]);

        if (!townPrices.has(productName)) {
            townPrices.set(productName, {town: townName, price: productPrice});
        } else {
            let productObject = townPrices.get(productName);

            if (productObject.town === townName) {
                productObject.price = productPrice;
            } else if (productPrice < productObject.price) {
                productObject.town = townName;
                productObject.price = productPrice;
            }
        }
    }

    for (let pair of townPrices) {
        output += `${pair[0]} -> ${pair[1].price} (${pair[1].town})\n`
    }

    return output;
}

function extractUniqueWords(array) {
    let uniqueWords = new Set();
    for (let sentence of array) {
        let words = sentence.split(/\W+/g).filter(a => a.length > 0).map(a => a.toLowerCase());

        for (let word of words) {
            if (!uniqueWords.has(word)) {
                uniqueWords.add(word);
            }
        }
    }

    return Array.from(uniqueWords).join(', ');
}

/*console.log(extractUniqueWords(['Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque quis hendrerit dui.',
 'Quisque fringilla est urna, vitae efficitur urna vestibulum fringilla.',
 'Vestibulum dolor diam, dignissim quis varius non, fermentum non felis.',
 'Vestibulum ultrices ex massa, sit amet faucibus nunc aliquam ut.',
 'Morbi in ipsum varius, pharetra diam vel, mattis arcu.',
 'Integer ac turpis commodo, varius nulla sed, elementum lectus.',
 'Vivamus turpis dui, malesuada ac turpis dapibus, congue egestas metus.'])); */
//console.log(lowestPricesInCities(['Sample Town | Sample Product | 1000', 'Sample Town | Orange | 2', 'Sample Town | Peach | 1', 'Sofia | Orange | 3', 'Sofia | Peach | 2', 'New York | Sample Product | 1000.1', 'New York | Burger | 10']));
//console.log(cityMarkets(['Sofia -> Laptops HP -> 200 : 2000', 'Sofia -> Raspberry -> 200000 : 1500', 'Sofia -> Audi Q7 -> 200 : 100000', 'Montana -> Portokals -> 200000 : 1', 'Montana -> Qgodas -> 20000 : 0.2', 'Montana -> Chereshas -> 1000 : 0.3']));
//console.log(populationsInTowns(['Istanbul <-> 100000', 'Honk Kong <-> 2100004', 'Jerusalem <-> 2352344', 'Mexico City <-> 23401925', 'Istanbul <-> 1000']));
//console.log(countWordsWithMaps('Far too slow, you\'re far too slow.'));
//console.log(countWordsInAText('Far too slow, you\'re far too slow.'));
//console.log(sumByTown(['Sofia', 20, 'Varna', 3, 'Sofia', 5, 'Varna', 4]));