package Generics;

import java.util.*;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\"" + key + "\"=" + value;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Pair<String, Integer>> months = new ArrayList<>();
        months.add(new Pair<>("Январь", 31));
        months.add(new Pair<>("Февраль", 28));
        months.add(new Pair<>("Март", 31));
        months.add(new Pair<>("Апрель", 30));
        months.add(new Pair<>("Май", 31));
        months.add(new Pair<>("Июнь", 30));
        months.add(new Pair<>("Июль", 31));
        months.add(new Pair<>("Август", 31));
        months.add(new Pair<>("Сентябрь", 30));
        months.add(new Pair<>("Октябрь", 31));
        months.add(new Pair<>("Ноябрь", 30));
        months.add(new Pair<>("Декабрь", 31));

        System.out.println("Список месяцев:");
        System.out.println(months);

        List<Pair<Integer, String>> countryCodes = new ArrayList<>();
        countryCodes.add(new Pair<>(7, "Россия"));
        countryCodes.add(new Pair<>(1, "США"));
        countryCodes.add(new Pair<>(86, "Китай"));
        countryCodes.add(new Pair<>(44, "Великобритания"));
        countryCodes.add(new Pair<>(91, "Индия"));

        System.out.println("\nТелефонные коды стран:");
        System.out.println(countryCodes);
    }
}