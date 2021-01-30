package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Testing {

    public void test(){

        List<String>    list = new LinkedList<>();
        list.add("London");
        list.add("Paris");
        list.add("Moskow");
        list.add("Ivanovo");
        String str = list.stream().collect(Collectors.joining(","));
        System.out.print(str);
    }
}
