package br.com.contabilizei.challenge.max_absolute_difference;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxAbsoluteDifferenceTest {
    private MaxAbsoluteDifference difference;
    private final int[] numbers = {1, 2, 3, 4};

    @Before
    public void setUp() {
        difference = new MaxAbsoluteDifference();
    }

    @Test
    public void givenNumbers_whenGetSmallest_thenIsEquals() {
        assertThat(
                difference.getMin(numbers)
        ).isEqualTo(1);
    }

    @Test
    public void givenNumbers_whenGetGreatest_thenIsEquals() {
        assertThat(
                difference.getMax(numbers)
        ).isEqualTo(4);
    }
}