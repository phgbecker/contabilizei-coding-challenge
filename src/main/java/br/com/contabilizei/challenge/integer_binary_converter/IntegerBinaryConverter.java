package br.com.contabilizei.challenge.integer_binary_converter;

public class IntegerBinaryConverter {

    public String toBinaryString(int integer) {
        return Integer.toBinaryString(integer);
    }

    public int countOnes(String binaryString) {
        int numberOfOnes = 0;

        for (char integer : binaryString.toCharArray()) {
            if (integer == '1')
                numberOfOnes++;
        }

        return numberOfOnes;
    }
}
