package org.Incubyte;

import java.util.*;
import java.util.stream.Collectors;

public class StringCalculator
{
    public static void main( String[] args )
    {
        String emptyString = "";
        String singleNumber = "1";
        System.out.println(add(emptyString));
    }

    static int add(String number)
    {
        int sum = 0;
        if (number.isEmpty())
        {
            return 0;
        }
        List<Integer> numberList = new ArrayList<Integer>();
        ArrayList<String> delimiters = new ArrayList<String>(Arrays.asList(",", ";", "\n"));
        numberList = Arrays.stream(number.split(delimiters.toString()))
                     .map(Integer::parseInt)
                     .collect(Collectors.toList());

        for(Integer i : numberList)
        {
            sum += i;
        }
        return sum;
    }
}
