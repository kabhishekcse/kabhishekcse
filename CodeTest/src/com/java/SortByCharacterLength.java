package com.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByCharacterLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "a", "ab", "abcd", "abcde");

        // Sort the strings by length
        strings.sort(Comparator.comparingInt(String::length));

        // Print the sorted list
        System.out.println(strings);
    }
}