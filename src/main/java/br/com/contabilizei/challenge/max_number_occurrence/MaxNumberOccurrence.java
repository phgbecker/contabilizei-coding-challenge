package br.com.contabilizei.challenge.max_number_occurrence;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MaxNumberOccurrence {

    public SortedMap<Integer, Integer> getOccurrences(String stringOfNumbers) {
        TreeMap<Integer, Integer> occurrences = new TreeMap<>();

        for (String unparsedNumber : stringOfNumbers.split(" ")) {
            Integer parsedNumber = Integer.valueOf(unparsedNumber);

            if (occurrences.containsKey(parsedNumber)) {
                occurrences.put(parsedNumber, occurrences.get(parsedNumber) + 1);
            } else {
                occurrences.put(parsedNumber, 1);
            }
        }

        return occurrences;
    }

    public Integer getGreatest(SortedMap<Integer, Integer> occurrencesMap) {
        Integer maxKey = null;
        Integer maxValue = null;

        for (Map.Entry<Integer, Integer> entry : occurrencesMap.entrySet()) {
            if (maxValue == null || entry.getValue() >= maxValue) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        return maxKey;
    }
}
