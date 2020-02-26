package com.company;

/*

1017 Safely Remove from List
Create a list of integers.
Enter 20 integers from the keyboard.
Create a method to safely extract numbers from a list:
int safeGetElement (ArrayList <Integer> list, int index, int defaultValue)
The method should return a list item (list) at its index (index).
If an exception occurs during the process of receiving the element, it must be caught and the method should return defaultValue.

Requirements:
1. The program should read 20 numbers from the keyboard.
2. The program should display data on the screen.
3. The safeGetElement method should return the list item by index if no exceptions have occurred inside the method.
4. The safeGetElement method should return defaultValue if there are no exceptions inside the method. The exception is to catch.
5. The safeGetElement method must not throw exceptions.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;
    public Main() {
        this.map = new HashMap<Integer, String>();
        //map.put(index, name);
    }
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            main.map.put(index, name);
        }
        for (Map.Entry<Integer, String> pair : main.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("id=" + index + " Name=" + name);
        }
    }
}


















