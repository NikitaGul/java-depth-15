package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void upperCaseTest(){
        String sentences = "String string STRING STriNg";
         List<String> test = Main.splitSentaces(sentences);
         assertEquals(4, test.size());
    }

    @Test
    void roundTest(){
        String sentences = "Similar{})()''";
        List<String> test = new ArrayList<>();
        test.add("similar");
        List<String> coolString = Main.splitSentaces(sentences);
        assertEquals(test, coolString);
    }

    @Test
    void upperCaseRoundTest(){
        String sentences = "sentences {} Sentences (SENTENCES) [SENtenCes]";
        List<String> test = new ArrayList<>();
        test.add("sentences");
        test.add("sentences");
        test.add("sentences");
        test.add("sentences");

        List<String> coolSentences = Main.splitSentaces(sentences);

        assertEquals(test, coolSentences);
    }

    @Test
    void aLotOfSpaces(){
        String sentences = "char  of         array";
        List<String> test = new ArrayList<>();
        test.add("char");
        test.add("of");
        test.add("array");
        List<String> coolSentences = Main.splitSentaces(sentences);
        assertEquals(test, coolSentences);
    }

    @Test
    void wordsRepeatThreeSimilarOneOfWord(){
        String sentences = "Three of three three";

        List<String> test = new ArrayList<>();

        test.add("three");

        List<String> coolSentences = Main.splitSentaces(sentences);

        List<String> niceArray = Main.finReple(coolSentences);

        assertEquals(test, niceArray);
    }

    @Test
    void wordsRepeatTwoDifferentWords(){
        String sentences = "Similar Two similar Two words";

        List<String> test = new ArrayList<>();

        test.add("similar");
        test.add("two");

        List<String> coolSentences = Main.splitSentaces(sentences);
        List<String> niceArray = Main.finReple(coolSentences);
        assertEquals(test, niceArray);
    }

    @Test
    void differentThreeDificultWords(){
        String sentences = "Three words diference";

        List<String> test = new ArrayList<>();

        List<String> coolSentences = Main.splitSentaces(sentences);
        List<String> niceArray = Main.finReple(coolSentences);

        assertTrue(niceArray.isEmpty());
    }

}