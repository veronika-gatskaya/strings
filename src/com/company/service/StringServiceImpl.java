package com.company.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class StringServiceImpl implements StringService {

    public void outputStringDetails(String str) {
        System.out.println("Str length: \n" + str.length());
        String lastFourChars = str.substring(str.length() - 4);
        String firstFourChars = str.substring(0, 4);
        System.out.println("First 4 chars | Last 4 chars: \n" + firstFourChars + " | " + lastFourChars);
        if (str.charAt(str.length() - 1) == '.') {
            System.out.println("String ends with .");
        } else {
            System.out.println("String DOES NOT end with .");
        }
    }

    public void addString(String str, String secondStr) {
        System.out.println(str.concat(secondStr));
    }

    public String[] splitString(String str) {
        String[] splittedStr = str.split(" ");
        //System.out.println("Splitted string: ");
        for (String n : splittedStr) {
            System.out.println(n);
        }
        return splittedStr;
    }

    public String[] removeRepeatedWords(String[] str) {
        List<String> temp = new ArrayList<String>();
        temp = Arrays.asList(str.clone());
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(temp);
        ArrayList<String> listWithoutDuplicates = new ArrayList<>(hashSet);
        Object[] objects = listWithoutDuplicates.toArray();
        String[] stringArray = Arrays.copyOf(objects, objects.length, String[].class);
        System.out.println("Array with unique elements: ");
        for (String s : stringArray) {
            System.out.println(s);
        }
        return stringArray;
    }

    public String[] replaceEndOfWord(String[] str) {
        if (str[0].endsWith("ed")) {
            str[0] = str[0].replace("ed", "ing");
        }
        System.out.println("String with replaced end of first word (ed -> ing): \n");
        for (String n : str) {
            System.out.println(n);
        }
        return str;
    }

    public String[] replaceFirstWordToLast(String[] str) {
        String temp = str[0];
        str[0] = str[0].replace(str[0], str[str.length - 1]);
        str[str.length - 1] = str[str.length - 1].replace(str[str.length - 1], temp);
        System.out.println("Array with first word replaced to last");
        for (String s : str) {
            System.out.println(s);
        }
        return str;
    }

    public void collectStringFromArray(String[] str) {
        String result = "";
        for (String s : str) {
            result = String.join(" ", result, s);
        }
        System.out.println(result);
    }
}
