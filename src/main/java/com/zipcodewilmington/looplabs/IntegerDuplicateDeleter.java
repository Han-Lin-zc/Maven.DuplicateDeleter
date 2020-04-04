package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    Integer[] arr = Arrays.copyOf(array, array.length);


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] tempArr = new Integer[array.length];
        int newArrLength = 0;
        for (Integer i : arr) {
            if (countOccurrences(i) < maxNumberOfDuplications) {
                tempArr[newArrLength] = i;
                newArrLength++;
            }
        }
        Integer[] result = new Integer[newArrLength];
        for (int i = 0; i < newArrLength; i++) {
            result[i] = tempArr[i];
        }
        return result;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] tempArr = new Integer[array.length];
        int newArrLength = 0;
        for (Integer i : arr) {
            if (countOccurrences(i) != exactNumberOfDuplications) {
                tempArr[newArrLength] = i;
                newArrLength++;
            }
        }
        Integer[] result = new Integer[newArrLength];
        for (int i = 0; i < newArrLength; i++) {
            result[i] = tempArr[i];
        }
        return result;
    }

    public Integer countOccurrences(Integer value) {
        Integer counter = 0;
        for (Integer i : arr) {
            if (i.equals(value)) {
                counter++;
            }
        }
        return counter;
    }
}
