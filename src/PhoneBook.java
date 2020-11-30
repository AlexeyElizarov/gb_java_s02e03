import java.util.*;

/**
 * 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
 *  В этот телефонный справочник с помощью метода add() можно добавлять записи.
 *  С помощью метода get() искать номер телефона по фамилии.
 *  Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 */


public class PhoneBook {

    private final Map<String, Set<String>> directory = new HashMap<>();

    public void add(String name, String phone) {

        if  (!directory.containsKey(name)) {
            directory.put(name, new HashSet<>());
        }

        Set<String> phones = directory.get(name);
        phones.add(phone);
        directory.put(name, phones);
    }

    public Set<String> get(String name) {
        return directory.getOrDefault(name, Collections.emptySet());
    }
}
