package br.com.contabilizei.challenge.array_permutation;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayPermutationTest {
    private ArrayPermutation arrayPermutation;

    @Before
    public void setUp() {
        arrayPermutation = new ArrayPermutation();
    }

    @Test
    public void givenArrays_whenIsEquals_thenIsTrue() {
        Integer[] firstArray = {1, 2, 5, 3, 7, 0, 7, 3, 5, 2, 1};
        Integer[] secondArray = {7, 3, 1, 2, 5, 0, 5, 2, 1, 3, 7};

        assertThat(
                arrayPermutation.isEquals(firstArray, secondArray)
        ).isEqualTo(true);
    }

    @Test
    public void givenArrays_whenIsEquals_thenIsFalse() {
        Integer[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        Integer[] secondArray = {6, 5, 4, 3, 2, 0, 11, 10, 9, 8, 7};

        assertThat(
                arrayPermutation.isEquals(firstArray, secondArray)
        ).isEqualTo(false);
    }

    @Test
    public void givenArrays_whenCanPermute_thenYes() {
        Integer[] firstArray = {1, 2, 5, 3, 7, 0, 7, 3, 5, 2, 1};
        Integer[] secondArray = {7, 3, 1, 2, 5, 0, 5, 2, 1, 3, 7};

        assertThat(
                arrayPermutation.canPermute(firstArray, secondArray)
        ).isEqualTo("YES");
    }

    @Test
    public void givenArrays_whenCanPermute_thenNo() {
        Integer[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        Integer[] secondArray = {6, 5, 4, 3, 2, 0, 11, 10, 9, 8, 7};

        assertThat(
                arrayPermutation.canPermute(firstArray, secondArray)
        ).isEqualTo("NO");
    }
}