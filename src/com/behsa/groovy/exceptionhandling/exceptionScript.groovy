package com.behsa.groovy.exceptionhandling

import com.sun.media.sound.InvalidDataException

//Risky Methods
int getYear(String date) throws InputMismatchException, InvalidDataException {
    if (!date)
        throw new InputMismatchException("Data is Empty")
    if (date.matches("\\d\\d\\d\\d/\\d\\d/\\d\\d")) {
        String year = date.substring(0, 4)
        int result = Integer.parseInt(year)
        return result
    } else {
        throw new InvalidDataException("invalid format")
    }
}

// this is handler
try {
    def date = "10 Nov 2021"
    int year = getYear(date)
    println year
    assert year == 1400
}catch(InputMismatchException e){
    println e.getMessage()
}catch(InvalidDataException e1){

}finally{
    println 'program terminated normally'
}

int calcData(int input){

    try{
        switch (input){
            case 1:
                // open a resource
                //
                //
                return 1
            case 2:
                throw new InvalidNumberDataException()
            case 3:
                return getYear("1400") * input
            default:
                return 0
        }
        //if(somethig is true)
            //return 100
        //here also we can write some code
        return 100


    }catch(InvalidNumberDataException e){
        return 4
    }
    finally {
        //close that resource
        println "this program terminated normally"
        return 0

    }
}

println calcData(2)