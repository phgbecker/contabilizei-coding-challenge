package br.com.contabilizei.challenge.max_absolute_difference.difference;

public class GreatestDifference implements Difference {

    public Integer get(int[] numbers) {
        Integer greatest = null;

        for (int number : numbers) {
            if (greatest == null || number > greatest)
                greatest = number;
        }

        return greatest;
    }
}
