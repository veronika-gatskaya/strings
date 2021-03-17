package com.company.service;

public interface StringService {
    void outputStringDetails(String str);

    void addString(String str, String secondStr);

    String[] splitString(String str);

    String[] removeRepeatedWords(String[] str);

    String[] replaceEndOfWord(String[] str);

    String[] replaceFirstWordToLast(String[] str);

    void collectStringFromArray(String[] str);
}
