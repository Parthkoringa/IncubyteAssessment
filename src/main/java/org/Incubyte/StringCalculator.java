package org.Incubyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        numberList = Arrays.stream(number.split(","))
                     .map(Integer::parseInt)
                     .collect(Collectors.toList());

        for(Integer i : numberList)
        {
            sum += i;
        }
        return sum;
    }
}
