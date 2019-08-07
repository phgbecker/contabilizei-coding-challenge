package br.com.contabilizei.challenge.max_number;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxNumberTest {

    @Test
    public void givenNumbers_whenGet_thenIsEquals() {
        MaxNumber maxNumber = new MaxNumber();

        assertThat(
                maxNumber.get(Arrays.asList(1, 5, 1, 4, 9, 0, 4))
        ).isEqualTo(9);

        assertThat(
                maxNumber.get(Arrays.asList(1, 10, 0, 1, 2, 3, 9))
        ).isEqualTo(10);
    }
}