package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtLast("MENSAH I");
        dll.insertAtLast("SEKYERE THEOPHILUS");
        dll.insertAtLast("QWAME");
        dll.insertAtLast("SEKYERE MENSAH THEOPHILUS");
        dll.display();
        System.out.println("==============================");
        // dll.deleteAt(2);
        dll.display();

    }
}
