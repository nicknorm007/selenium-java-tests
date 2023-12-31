package com.nicknorman.com;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {}
    String FooBar(String str)
    {
        List<String> used = new ArrayList<String>();
        String[] myList = str.split(",");
        int len = myList.length;
        StringBuilder builder = new StringBuilder();

        for(int i=0;i<len;i++)
        {
            String s = getFooBar(Integer.parseInt(myList[i]));
            String result = "";

            String copyLabel = used.contains(myList[i]) ? "-copy" : "";
            used.add(myList[i]);
            if(i==len-1){
                builder.append(s+copyLabel);
            }
            else
            {
                builder.append(s+copyLabel+",");
            }

        }
        return builder.toString();
    }
    String getFooBar(int number) {
        if (number % 15 == 0)
        {
            return "foobar";
        } else if (number % 5 == 0)
        {
            return "bar";
        }
        else if (number % 3 == 0)
        {
            return "foo";
        }
        return String.valueOf(number);
    }
}
