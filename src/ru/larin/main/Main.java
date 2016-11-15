package ru.larin.main;

import ru.larin.list.List;

/**
 * Created by mrden on 09.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new List<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
        System.out.println("*********");
        list.reserve();
        list.print();
    }
}
