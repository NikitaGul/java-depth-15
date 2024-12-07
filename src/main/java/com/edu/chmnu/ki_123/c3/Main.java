package com.edu.chmnu.ki_123.c3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> splitSentaces(String strForSpit){
        strForSpit = strForSpit.replaceAll("[.,:;\\-()\\[\\]{}\"']", "");
        String[] joins = strForSpit.split("\\s+");
        List<String> text = new ArrayList<>();
        for(String join: joins){
            text.add(join.toLowerCase());
        }
        return text;
    }

    public static List<String> finReple(List<String> cent){
        List <String> repl = new ArrayList<>();
        List <String> repla = new ArrayList<>();
        for(String cen: cent){
                if(repl.contains(cen)){
                    if(repla.contains(cen)){
                        continue;
                    }
                    else {
                        repla.add(cen);
                    }
                }
                else {
                    repl.add(cen);
                }
        }
        return repla;
    }

    public static void joinTerms(List<String> text, List<String> place, String centabces){
        System.out.println(centabces);
        System.out.println(text);
        System.out.println(place);
    }

    public static void main(String[] args) {

        String centance = "This centance, for - the Centance.";
        List<String> text = splitSentaces(centance);
        List<String> place = finReple(text);
        joinTerms(text, place, centance);
    }
}