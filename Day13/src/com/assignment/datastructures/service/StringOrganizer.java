package com.assignment.datastructures.service;

import java.util.*;

public class StringOrganizer {

    private final List<String> stringList = new ArrayList<>();

    public void addString(String input) {
        if (input.length() < 2) {
            System.out.println("String too short.");
            return;
        }

        char secondChar = input.charAt(1);
        boolean inserted = false;

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() > 1 && stringList.get(i).charAt(1) == secondChar) {
                int j = i;
                while (j + 1 < stringList.size() &&
                       stringList.get(j + 1).length() > 1 &&
                       stringList.get(j + 1).charAt(1) == secondChar) {
                    j++;
                }
                stringList.add(j + 1, input);
                inserted = true;
                break;
            }
        }

        if (!inserted) {
            stringList.add(input);
        }

        if (stringList.size() > 20) {
            stringList.remove(20); // maintain size limit
        }
    }

    public void printStrings() {
        System.out.println("\nOrganized Strings:");
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
