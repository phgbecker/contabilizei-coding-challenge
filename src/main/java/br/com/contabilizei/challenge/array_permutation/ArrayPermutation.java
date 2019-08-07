package br.com.contabilizei.challenge.array_permutation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayPermutation {

    public boolean isEquals(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> first = Arrays.asList(firstArray);
        Collections.sort(first);

        List<Integer> second = Arrays.asList(secondArray);
        Collections.sort(second);

        return first.equals(second);
    }

    public String canPermute(Integer[] firstArray, Integer[] secondArray) {
        return isEquals(firstArray, secondArray) ? "YES" : "NO";
    }
}
