package br.com.contabilizei.challenge.integer_binary_converter;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegerBinaryConverterTest {
    private IntegerBinaryConverter converter;

    @Before
    public void setUp() {
        converter = new IntegerBinaryConverter();
    }

    @Test
    public void givenInteger_whenToBinary_thenIsEquals() {
        assertThat(
                converter.toBinaryString(10)
        ).isEqualTo("1010");
    }

    @Test
    public void givenBinaryString_whenCount_thenIsEquals() {
        String binaryString = converter.toBinaryString(10);

        assertThat(
                converter.countOnes(binaryString)
        ).isEqualTo(2);
    }
}
