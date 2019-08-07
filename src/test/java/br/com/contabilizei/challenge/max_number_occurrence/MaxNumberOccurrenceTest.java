package br.com.contabilizei.challenge.max_number_occurrence;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxNumberOccurrenceTest {
    MaxNumberOccurrence occurrence;

    @Before
    public void setUp() {
        occurrence = new MaxNumberOccurrence();
    }

    @Test
    public void givenStringOfNumbers_whenGetOccurrences_thenIsEquals() {
        Map<Integer, Integer> expectedOccurrences = new HashMap<>();
        expectedOccurrences.put(0, 1);
        expectedOccurrences.put(1, 2);
        expectedOccurrences.put(4, 2);
        expectedOccurrences.put(5, 1);
        expectedOccurrences.put(9, 1);

        assertThat(
                occurrence.getOccurrences("1 5 1 4 9 0 4")
        ).isEqualTo(expectedOccurrences);
    }

    @Test
    public void givenOccurrences_whenGetGreatest_thenIsEquals() {
        assertThat(
                occurrence.getGreatest(occurrence.getOccurrences("1 5 1 4 9 0 4"))
        ).isEqualTo(4);

        assertThat(
                occurrence.getGreatest(occurrence.getOccurrences("1 10 0 5 2 3 9"))
        ).isEqualTo(10);
    }
}