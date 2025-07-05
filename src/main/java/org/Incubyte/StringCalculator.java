package org.Incubyte;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
            return 0; // if string is empty return 0
        }
        ArrayList<String> delimiters = new ArrayList<>(Arrays.asList(",", "\n"));

        if(number.startsWith("//"))
        {
            // separate //___\n part
            int endPartDelimiter = number.indexOf('\n');
            String customDelimiter = number.substring(2, endPartDelimiter);

            // create pattern that takes anything between []
            Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(customDelimiter);
            boolean matchFound = false;

            while(matcher.find())
            {
                // if found extract the delimiter without brackets
                delimiters.add(Pattern.quote(matcher.group(1)));
                matchFound=true;
            }

            if(!matchFound)
            {
                // no match found means its normal single char delimiter
                delimiters.add(customDelimiter);
            }

            //remove the starting delimiter part (//__\n)
            number = number.substring(endPartDelimiter+1);
        }

        // build a single regex [ "," | "\n" | "\Q***\E" |  ...]
        String regex = String.join("|", delimiters);

        // create a list of numbers that splits and convert numbers to integers
        List<Integer> numberList;
        numberList = Arrays.stream(number.split(regex))
                     .filter(s -> !s.isEmpty())
                     .map(Integer::parseInt)
                     .collect(Collectors.toList());

        List<Integer> negativeNumbers = new ArrayList<>(); // list of negative numbers to show in error

        // iterate over all numbers in list
        for(Integer i : numberList)
        {
            if(i<0)
            {
                negativeNumbers.add(i); // if number is negative add it to negative list
            }
            else if(i<1001)
            {
                sum += i; // add number into sum
            }
        }

        if(!negativeNumbers.isEmpty())
        {
            // if negative number list in not empty then throw error and show numbers
            throw new IllegalArgumentException("Negative numbers not allowed"+negativeNumbers);
        }
        return sum;
    }
}
