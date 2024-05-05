package com.company;

public class TitleCaseConverter {


        public static String convertToTitleCase(String s) {
            if (s == null || s.isEmpty()) {
                return s;
            }

            StringBuilder result = new StringBuilder();
            String[] words = s.split("\\s+");

            for (String word : words) {
                if (word.isEmpty()) {
                    continue;
                }

                char firstChar = word.charAt(0);
                if (Character.isUpperCase(firstChar)) {
                    // Word is already an acronym, keep it as it is
                    result.append(word).append(" ");
                } else {
                    // Convert the word to title case
                    result.append(Character.toUpperCase(firstChar))
                            .append(word.substring(1).toLowerCase())
                            .append(" ");
                }
            }

            // Remove trailing space and return the result
            return result.toString().trim();
        }

        public static void main(String[] args) {
            String inputString = "saud is very bad boy";
            String outputString = convertToTitleCase(inputString);
            System.out.println(outputString);
        }
    }


