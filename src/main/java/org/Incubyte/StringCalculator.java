package org.Incubyte;

import java.util.*;
import java.util.stream.Collectors;

public class StringCalculator
{
    public static void main( String[] args )
    {

    }

    static int add(String number)
    {
        int sum = 0;
        if (number.isEmpty())
        {
            return 0;
        }
        List<Integer> numberList;
        ArrayList<String> delimiters = new ArrayList<>(Arrays.asList(",", "\n"));

        if(number.startsWith("//"))
        {
            int endPartDelimiter = number.indexOf('\n');
            String customDelimiter = number.substring(2, endPartDelimiter);
            delimiters.add(customDelimiter);
            number = number.substring(endPartDelimiter+1);
        }

        numberList = Arrays.stream(number.split(delimiters.toString()))
                     .map(Integer::parseInt)
                     .collect(Collectors.toList());

        List<Integer> negativeNumbers = new ArrayList<>();

        for(Integer i : numberList)
        {
            if(i<0)
            {
                negativeNumbers.add(i);
            }
            else if(i<1001)
            {
                sum += i;
            }
        }

        if(!negativeNumbers.isEmpty())
        {
            throw new IllegalArgumentException("Negative numbers not allowed"+negativeNumbers);
        }
        return sum;
    }
}
