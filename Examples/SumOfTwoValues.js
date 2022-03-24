//Given an array of integers and a value, determine if there are any two integers in the array whose sum is equal to the given value. 
//Return true if the sum exists and return false if it does not.


// Basically create an empty Map and check every element on given array, if input - array[element] is a member
// of given array return true else add element to the Map and keep iterating.

//Time and memory complexity O(n)

// USING SET :
let findSumOfTwo = function (Arr, val) {
    let foundValues = new Set();
    for (let a in Arr) {
        if (foundValues.has(val - Arr[a])) {
            return true;
        }

        foundValues.add(Arr[a]);
        console.log(foundValues);
    }

    console.log(foundValues);

    return false;
};


// TEST
let arr = [5, 7, 1, 2, 8, 4, 3];
findSumOfTwo(arr,8) ;

// USING JS ARRAY

let SumOfTwoExist = function (Arr, value) {
    let tempArr = [];

    for(element in Arr){
        if(tempArr.includes(value - Arr[element])) {
            return true ;
        }
        tempArr.push(Arr[element]) ;
    }

    console.log(tempArr);

    return false;
}


// TEST
let v = [5, 7, 1, 2, 8, 4, 3];
console.log(SumOfTwoExist(v, 8));