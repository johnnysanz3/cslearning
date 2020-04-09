package com.johnnysanz.javatutorial.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Exercises {

    public static void main(String[] args){

        //test List with generic method
        List<Integer> testListOfIntegers = Arrays.asList(1,2,3,4,5,6,7,8,10,12,14,0,0);
        Exercises testEx = new Exercises();
        //passes in predicate lambda to check for odds
        System.out.println("Int is " + testEx.countOdds(testListOfIntegers, p -> {return p % 2 != 0;}));

    }

    private <T> int countOdds(Collection<T> inCollection, Predicate<T> p){

        //return size of collection as test
        //return inCollection.size();

        int count = 0;
        for (T element : inCollection){
            if (p.test(element)){
                ++count;
            }
        }
        return count;




    }

}
