package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WordsRepository wordsRepository = new WordsRepository();
        List<String> words = Arrays.asList("car", "carpet", "java", "javascript", "internet");
        List<String> queries = Arrays.asList("c", "car", "carp", "jav", "intern", "foo");

        for (String word : words)
            wordsRepository.addWord(word);

        System.out.println("QUERY: AUTO-COMPLETION");

        for (String query : queries)
            System.out.println(query + ": " + wordsRepository.getAutoCompletion(query));
    }
}