package javaAdvanced.hw2.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleValues {
    static char[] doubleCharacters(String value) {
        char[] stringToCharacters = value.toCharArray();
        char[] newStringToCharacters = Arrays.copyOf(stringToCharacters, stringToCharacters.length * 2);
        for (int i = 0; i < stringToCharacters.length; i++) {
            newStringToCharacters[i * 2] = stringToCharacters[i];
            newStringToCharacters[i * 2 + 1] = stringToCharacters[i];
        }
        return newStringToCharacters;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Japan");
        stringList.add("Germany");
        stringList.add("France");
        stringList.add("Spain");
        stringList.add("Italy");
        for (int i = 0; i < 5; i++) {
            System.out.println(doubleCharacters(stringList.get(i)));
        }
    }
}

