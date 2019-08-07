package br.com.contabilizei.challenge.max_absolute_difference;

import br.com.contabilizei.challenge.max_absolute_difference.difference.GreatestDifference;
import br.com.contabilizei.challenge.max_absolute_difference.difference.SmallestDifference;

public class MaxAbsoluteDifference {

    public int getMin(int[] numbers) {
        return new SmallestDifference().get(numbers);
    }

    public int getMax(int[] numbers) {
        return new GreatestDifference().get(numbers);
    }
}
