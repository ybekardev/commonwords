package com.newrelic.commonwords.controller;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

public class CommonWordsController {

    static Logger logger = Logger.getLogger(CommonWordsController.class.getName());

    public static void readTheWordsFromTheFile(File filePath) throws IOException {
        if (!filePath.getPath().isEmpty()) {
            filePath = new File(filePath.getPath());
        } else if (filePath.getPath().isEmpty()) {
            filePath = new File(System.getProperty("filePath"));
        } else {
            logger.severe("Check the filePath input, please! FOUND: " + filePath);
        }
        File file = new File(String.valueOf(filePath));
        Scanner scanner = new Scanner(file);
        List<String> allWordsFromFile = new ArrayList<>();
        List<String> threeWords = new ArrayList<>();
        ArrayList<String> allThreeWordsList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String readFromLine = scanner.nextLine();
            String[] listOfThreeWords = readFromLine.toLowerCase().split(" ");
            for (String eachWord : listOfThreeWords) {
                allWordsFromFile.add(eachWord.replaceAll("[^a-zA-Z]", "").toLowerCase());
            }
        }
        String wanted;
        for (int init = 0; init < allWordsFromFile.size(); init++) {
            for (; init < allWordsFromFile.size()-2; init++) {
                threeWords.add(0, allWordsFromFile.get(init));
                threeWords.add(1, allWordsFromFile.get(init + 1));
                threeWords.add(2, allWordsFromFile.get(init + 2));
                wanted = threeWords.get(0) + threeWords.get(1) + threeWords.get(2);
                allThreeWordsList.add(wanted);
            }
        }
        Map<String, Integer> map = new HashMap<>();
        for (String eachThreeWords : allThreeWordsList) {
            if (map.containsKey(eachThreeWords)) {
                map.put(eachThreeWords, map.get(eachThreeWords) + 1);
            } else {
                map.put(eachThreeWords, 1);
            }
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if(e.getValue() >= 50) {
                System.out.println(e.getKey() + " --- " + e.getValue());
            }
        }
    }
}
