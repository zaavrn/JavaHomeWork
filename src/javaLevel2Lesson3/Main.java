package javaLevel2Lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    private static final String TEXT = "На дворе дрова за двором дрова дрова вширь двора не вместит двор дров надо дрова выдворить на дровяной двор";

    public static String [] arrayText (String text) {
        return text.toLowerCase().split(" ");
    }

    private static HashSet <String> texCollection (String []arr){
        return new HashSet<>(Arrays.asList(arr));
    }

    private static HashMap<String, Integer> wordsCounter( String[]arr) {
    HashMap<String, Integer> wordCount = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        String word = arr[i];
        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    return wordCount;
    }

    public static void main(String[] args) {
       // System.out.println(Arrays.deepToString(arrayText(TEXT)));
        System.out.println(texCollection(arrayText(TEXT)));
        System.out.println(wordsCounter(arrayText(TEXT)));

        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "7(919)235-69-70", "it@mail.ru");
        phonebook.add("Петров", "7(919)235-69-71", "buh@mail.ru");
        phonebook.add("Сидоров", "7(919)235-69-72", "info@mail.ru");

        System.out.println("e-mail Иванов: " + phonebook.getMails("Иванов"));
        System.out.println("e-mail Петров: " + phonebook.getMails("Петров"));
        System.out.println("phone Сидоров: " + phonebook.getPhones("Сидоров"));
        System.out.println("phone Петров: " + phonebook.getPhones("Петров"));
    }
}
