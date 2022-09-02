package com.arkenidar;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    private Map<Character, Integer> occurrences;

    Anagram(String text) {
        occurrences = new HashMap<Character, Integer>();
        for (Character ch : text.toCharArray()) {
            int count = occurrences.get(ch) == null ? 0 : occurrences.get(ch);
            occurrences.put(ch, ++count);
        }

    }

    public boolean equals(Anagram other) {
        return occurrences.equals(other.getOccurrences());
    }

    public Map<Character, Integer> getOccurrences() {
        return occurrences;
    }
}
