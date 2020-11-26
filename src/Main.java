import java.util.*;

/**
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 Посчитать сколько раз встречается каждое слово.
 */

public class Main {
    public static void main(String[] args) {
        doExercise1();
        doExercise2();
    }

    static void doExercise2() {
        PhoneBook phonebook = new PhoneBook();
        phonebook.add("Ivanov", "45677");
        phonebook.add("Ivanov", "456887");
        phonebook.add("Ivanov", "456887");
        phonebook.add("Ivanov", "+456887");
        phonebook.add("Petrov", "789456");
        phonebook.add("Petrov", "78952545");
        phonebook.add("Sidorov", "+7(926) 666 666 666");
        System.out.println(phonebook.get("Ivanov"));
        System.out.println(phonebook.get("Petrov"));
        System.out.println(phonebook.get("Sidorov"));
        System.out.println(phonebook.get("Antonov"));
    }

    static void doExercise1() {
        List<String> words = new ArrayList<>();
        words.add("Аарон");
        words.add("Аваз");
        words.add("Аваз");
        words.add("Августин");
        words.add("Авраам");
        words.add("Агап");
        words.add("Азамат");
        words.add("Агат");
        words.add("Аваз");
        words.add("Адам");
        words.add("Авраам");
        words.add("Аарон");
        words.add("Азамат");
        words.add("Азат");
        words.add("Азиз");

        System.out.println(findUniqueWords(words));
        System.out.println(countWordsFrequency(words));
    }

    static Set<String> findUniqueWords(List<String> words) {
        return new HashSet<>(words);
    }

    static Map<String, Integer> countWordsFrequency(List<String> words) {
        Map<String, Integer> wordsFrequency = new HashMap<>();

        for (String word: words) {
            wordsFrequency.put(word, 0);
        }

        for (String word: words) {
            wordsFrequency.put(word, wordsFrequency.get(word) + 1);
        }

        return wordsFrequency;
    }
}
