package br.com.contabilizei.challenge.max_number;

import java.util.List;

public class MaxNumber {

    public Integer get(List<Integer> numbers) {
        Integer max = null;

        for (Integer number : numbers) {
            if (max == null || number > max)
                max = number;
        }

        return max;
    }
}
