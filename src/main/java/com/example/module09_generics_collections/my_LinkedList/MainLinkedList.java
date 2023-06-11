package com.example.module09_generics_collections.my_LinkedList;


public class MainLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 15; i++) {
            myLinkedList.add("A" + i);
        }

        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        System.out.println();
        System.out.println("Size: " + myLinkedList.size());
        System.out.println(myLinkedList.remove(6));
        System.out.println("Size after removing element: " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println("Size after clear: " + myLinkedList.size());
    }
}