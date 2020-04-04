package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    String[] test = Arrays.copyOf(array, array.length);

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] tempArr = new String[array.length];
        int newArrLength = 0;
        for (String s : array) {
            int occurrences = countOccurrences(s);
            if (occurrences < maxNumberOfDuplications) {
                tempArr[newArrLength] = s;
                newArrLength++;
            }
        }
        String[] result = new String[newArrLength];
        for (int i = 0; i < newArrLength; i++) {
            result[i] = tempArr[i];
        }
        return result;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] tempArr = new String[array.length];
        int newArrLength = 0;
        for (String s : test) {
            int occurrences = countOccurrences(s);
            if (occurrences != exactNumberOfDuplications) {
                tempArr[newArrLength] = s;
                newArrLength++;
            }
        }
        String[] result = new String[newArrLength];
        for (int i = 0; i < newArrLength; i++) {
            result[i] = tempArr[i];
        }
        return result;
    }

    public Integer countOccurrences(String value) {
        Integer counter = 0;
        for (String s : test) {
            if (s.equals(value)) {
                counter++;
            }
        }
        return counter;
    }
}
