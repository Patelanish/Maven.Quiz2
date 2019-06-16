package com.zipcodewilmington.assessment2.part2;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        List list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));

        Integer[] anything = new Integer[list.size()];
        for (int i = 0; i < list.size(); i++){
            anything[i] = Integer.parseInt(list.get(i).toString());
        }

        return anything;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer [] anything = new Integer[array.length];
        for (int i = 0; i < array.length; i++){
            if (i + index < array.length)
                anything[i] = array[i+index];
            else
                anything[i] = array[i + index - array.length];
        }
        return anything;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer count = 0;
        for (Integer i: array1){
            if(i == valueToEvaluate){
                count++;
            }
        }
        for (Integer i : array2){
            if(i == valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {

        int mostCommon = array[0];
        int count = 1;
        int temp;
        int countTemp;

        for (int i=0; i <array.length - 1; i++){
            temp = array[i];
            countTemp = 0;
            for(int j = 1; j < array.length; j++){
                if(temp == array[j]){
                    countTemp++;
                }
                if (countTemp > count){
                    mostCommon = temp;
                    count = countTemp;
                }
            }
        }
        return mostCommon;
    }
}
