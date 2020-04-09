package com.johnnysanz.javatutorial.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Exercises {

    public static void main(String[] args){

        //test List with generic method
        List<Integer> testList = Arrays.asList(1,2,3);
        Exercises testEx = new Exercises();
        //passes in predicate lambda to check for odds
        System.out.println("Result using defined method is " + testEx.countIfMatches(testList, p -> {return p % 2 != 0;}));

        // can i rewrite this using streams
        long count = testList.stream()
                .filter(p -> {return p % 2 != 0;})
                .count();

        System.out.println("Result using streams is " + count);

    }

    private <T> int countIfMatches(Collection<T> inCollection, Predicate<T> p){

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
