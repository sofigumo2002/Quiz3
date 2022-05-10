/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import domain.CircularDoublyLinkedList;
import domain.CircularLinkedList;
import domain.DoublyLinkedList;
import domain.SinglyLinkedList;
import domain.Student;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
//import main.DoubleLinkedList;

/**
 *
 * @author Profesor Lic. Gilberth Chaves Avila
 */
public class Utility {

    private static SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    private static DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    private static CircularLinkedList circularLinkedList = new CircularLinkedList();
    private static CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();

    public static SinglyLinkedList getSinglyLinkedList() {
        return singlyLinkedList;
    }

    public static void setSinglyLinkedList(SinglyLinkedList singlyLinkedList) {
        Utility.singlyLinkedList = singlyLinkedList;
    }

    public static DoublyLinkedList getDoublyLinkedList() {
        return doublyLinkedList;
    }

    public static void setDoublyLinkedList(DoublyLinkedList doublyLinkedList) {
        Utility.doublyLinkedList = doublyLinkedList;
    }

    public static CircularLinkedList getCircularLinkedList() {
        return circularLinkedList;
    }

    public static void setCircularLinkedList(CircularLinkedList circularLinkedList) {
        Utility.circularLinkedList = circularLinkedList;
    }

    public static CircularDoublyLinkedList getCircularDoublyLinkedList() {
        return circularDoublyLinkedList;
    }

    public static void setCircularDoublyLinkedList(CircularDoublyLinkedList circularDoublyLinkedList) {
        Utility.circularDoublyLinkedList = circularDoublyLinkedList;
    }

    public static int random() {
        return 1 + (int) Math.floor(Math.random() * 99);
    }

    public static int random(int bound) {
        //return 1+random.nextInt(bound);
        return 1 + (int) Math.floor(Math.random() * bound);
    }

    public static int random(int lowBound, int highBound) {
        return lowBound + (int) Math.floor(Math.random() * highBound);
    }

    public static String format(double value) {
        return new DecimalFormat("###,###,###,###.##")
                .format(value);
    }

    public static String $format(double value) {
        return new DecimalFormat("$###,###,###,###.##")
                .format(value);
    }

    public static String perFormat(double value) {
        //#,##0.00 '%'
        return new DecimalFormat("#,##0.00'%'")
                .format(value);
    }

    public static String dateFormat(Date birthday) {
        return new SimpleDateFormat("dd-MM-yyyy")
                .format(birthday);
    }

    public static void fill(int a[]) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(99) + 1;
        }
    }

    public static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }//if
            }//for j
        }//for i
    }

    public static String show(int[] a) {
        String result = "";
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (counter++ >= 50) {
                result += "\n";
                counter = 0;
            }
            result += a[i] + " ";
        }
        return result;
    }

    private static String instanceOf(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return "Integer";
        }
        if (a instanceof String && b instanceof String) {
            return "String";
        }
        if (a instanceof Character && b instanceof Character) {
            return "Character";
        }
        return "unknown";
    }

    public static boolean equals(Object a, Object b) {
        switch (instanceOf(a, b)) {
            case "Integer":
                Integer a1 = (Integer) a;
                Integer b1 = (Integer) b;
                //return x==y;
                return a1.equals(b1);
            case "String":
                String a2 = (String) a;
                String b2 = (String) b;
                return a2.equalsIgnoreCase(a2);
            case "Character":
                Character a3 = (Character) a;
                Character b3 = (Character) b;
                return a3.compareTo(a3) == 0;

        }
        return false;
    }

    //less than (menorQ)
    public static boolean lessT(Object a, Object b) {
        switch (instanceOf(a, b)) {
            case "Integer":
                Integer a1 = (Integer) a;
                Integer b1 = (Integer) b;
                return a1 < b1;
            case "String":
                String a2 = (String) a;
                String b2 = (String) b;
                return a2.compareToIgnoreCase(b2) < 0;
            case "Character":
                Character a3 = (Character) a;
                Character b3 = (Character) b;
                return a3.compareTo(a3) < 0;
        }
        return false;
    }

    //greater than (mayorQ)
    public static boolean greaterT(Object a, Object b) {
        switch (instanceOf(a, b)) {
            case "Integer":
                Integer a1 = (Integer) a;
                Integer b1 = (Integer) b;
                return a1 > b1;
            case "String":
                String a2 = (String) a;
                String b2 = (String) b;
                return a2.compareToIgnoreCase(b2) > 0;
            case "Character":
                Character a3 = (Character) a;
                Character b3 = (Character) b;
                return a3.compareTo(a3) > 0;
        }
        return false;
    }

}
