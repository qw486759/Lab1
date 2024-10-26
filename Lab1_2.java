package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab1_2 {
        public static void main(String[] args) {
            
            // Initialize an ArrayList with 5 names
            ArrayList<String> names = new ArrayList<>(Arrays.asList("Megan", "Hattie", "Cindy", "Allison", "Kevin"));
            
            //Display original list
            System.out.print("Name = { ");
            printList(names);
            System.out.println(" }");

            // Create a new list
            ArrayList<String> switchedName = new ArrayList<>();
            for (String name : names) {
                switchedName.add(switchAndCap(name));
            }

            //Display new list
            System.out.print("Name (switched) = { ");
            printList(switchedName);
            System.out.println(" }");
        }

        private static String switchAndCap(String name) {
            if (name.length() <= 1) return name;

            char firstLetter = name.charAt(0);
            char lastLetter = name.charAt(name.length() - 1);
            String middleWords = name.substring(1, name.length() - 1);
            return Character.toUpperCase(lastLetter) + middleWords.toLowerCase() + Character.toLowerCase(firstLetter);
        }

        private static void printList(ArrayList<String> list) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if ( i < list.size() -1) {
                        System.out.print(", ");
                }
            }
        } 
}
