package com.arkenidar;

public class Main {
    public static void main(String[] args) {
        String pairs[][] = new String[][]{
                {"aba", "baa"},
                {"ab", "aa"},
                {"aabbb", "babab"}
        };
        for (String pair[] : pairs)
            System.out.printf("isAnagram(%s,%s): %b\n", pair[0], pair[1], isAnagram(pair[0], pair[1]));
    }

    public static boolean isAnagram(String str1, String str2) {
        return new Anagram(str1).equals(new Anagram(str2));
    }
}