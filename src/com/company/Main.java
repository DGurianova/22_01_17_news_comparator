package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        News newsOne = new News("Hello world", 3);
        News newsTwo = new News("abc", 2);
        News newsThree = new News("xyz", 6);

        List<String> string = Arrays.asList("Hello world", "abc", "xyz");
        Collections.sort(string);
        System.out.println(string);
    }
}
