package com.example.cousre.topic02;

public class Task37_45_ExonNames {

    public static void main(String[] args) {
        System.out.println(new Task37_45_ExonNames().makeFullName("Nazar", "Bratyshchenko"));
    }

    //    TASK37
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    //   TASK 38
    public String makeFullName(String firstName, String lastName) {
        firstName = firstName.toLowerCase();
        lastName = lastName.toUpperCase();
        return firstName + " " + lastName;
    }

    //    TASK39
    public boolean isNameLucky(String name) {
        if (name.contains("a") || name.contains("A")) {
            return true;
        } else if (name.contains("o") || name.contains("O")) {
            return true;
        } else {
            return false;
        }
    }

    //    TASK 40
    public String getNameCode(String name) {
        String firstLetter = String.valueOf(name.charAt(0)).toUpperCase();
        String lastLetter = String.valueOf(name.charAt(name.length() - 1)).toUpperCase();
        String fullName = firstLetter + lastLetter;
        if (name.length() == 1) {
            return firstLetter;
        } else {
            return fullName;
        }
    }

    //    TASK 41
    public static boolean isMoneyName(String name) {
        return (name.charAt(0) >= '0' && name.charAt(0) <= '9') && (name.charAt(name.length() - 1) >= '0' && name.charAt(name.length() - 1) <= '9');
    }

    //    TASK42
    public boolean isInvisibleName(String name) {
        return name.strip().isEmpty();
    }

    //    TASK43
    public String makeNamePositive(String name) {
        return name
                .replace("no", "yes")
                .replace("No", "yes")
                .replace("nO", "yes")
                .replace("NO", "yes");
    }

    //    TASK44
    public String makeNameClean(String name) {
        name = name.trim();
        return "CLEAN" + name + "CLEAN";
    }

    //    TASK45
    public String makeHalfOfName(String name) {
        int length = name.length();
        int halfLength = length / 2;
        if (length % 2 == 0) {
            return name.substring(0, halfLength);
        } else {
            return name.substring(0, halfLength);
        }
    }
}