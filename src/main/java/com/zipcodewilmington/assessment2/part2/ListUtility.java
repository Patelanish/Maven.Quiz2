package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    List<Integer> list = new ArrayList<>();

    public Integer add(int i) {

       list.add(i);

        for (Integer number : list) {

            return number;


        }
        return null;

    }

    public Integer size() {

        Integer i = 0;
        for (Integer a : list){
            i++;
        }
        return i;
    }

    public List<Integer> getUnique() {

        List<Integer> arrList = new ArrayList<>();
        for (Integer i : list) {
            if (!arrList.contains(i)) {
                arrList.add(i);
            }
        }
        return arrList;
    }

    public String join() {

        String concat = list.toString();
        return concat.substring(1, concat.length() - 1);

    }

    public Integer mostCommon() {

        return null;
    }

    public Boolean contains(Integer valueToAdd) {


        return list.contains(valueToAdd);
    }
}
