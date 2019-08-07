package br.com.contabilizei.challenge.max_absolute_difference.difference;

public class SmallestDifference implements Difference {

    public Integer get(int[] numbers) {
        Integer smallest = null;

        for (int number : numbers) {
            if (smallest == null || number < smallest)
                smallest = number;
        }

        return smallest;
    }
}
