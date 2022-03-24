// Find the missing number of given array 
// exp : [19, 14, 2, 17, 4, 12, 20, 7, 16, 9, 13, 8, 11, 18, 3, 6, 10, 1, 15]
// array of positive numbers from 1 to n ( not sorted ) all numbers are present except one, find missing one

function FindMissingOne(inputArr){
    const initialValue = 0 ;

    const sumOfElements = inputArr.reduce((prevValue,currentValue)=>{
        return prevValue + currentValue ;
    }, initialValue ) ;

    const expectedLen = inputArr.length + 1 ;

    const expectedSum = ( expectedLen * (expectedLen + 1)) / 2 ;

    const missingOne = expectedSum - sumOfElements ;

    return missingOne ;
}

// TEST

let Arr = [19, 14, 2, 17, 4, 12, 20, 7, 16, 9, 13, 8, 11, 18, 3, 6, 10, 1, 15] ;

const missingOne = FindMissingOne(Arr) ;

console.log(missingOne) ;
