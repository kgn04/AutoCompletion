package org.example;

import java.util.*;

public class WordsRepository {
    private final TreeSet<String> words;

    public WordsRepository() {
        words = new TreeSet<>();
    }

    public void addWord(String word) {
        words.add(word);
    }

    public Set<String> getAutoCompletion(String query) {
        return words.subSet(query, query + Character.MAX_VALUE);
    }
}
