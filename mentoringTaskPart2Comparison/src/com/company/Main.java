package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class Main {


    static final int COUNT = 10000;

    public static void listPerformanceRun(List list) {

        // add
        long now = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            list.add(Integer.toString(i));
        }
        System.out.println("Time for adding " + COUNT + " elements:" + (System.currentTimeMillis() - now) + " ms");

        // get
        now = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            list.get(i);
        }
        System.out.println("Time for getting " + COUNT + " elements:" + (System.currentTimeMillis() - now) + " ms");

        // remove
        now = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            list.remove(Integer.toString(i));
        }
        System.out.println("Time for removing " + COUNT + " elements:" + (System.currentTimeMillis() - now) + " ms");

    }

    public static void setPerformanceRun(Set set) {

        // add
        long now = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            set.add(Integer.toString(i));
        }
        System.out.println("Time for adding " + COUNT + " elements:" + (System.currentTimeMillis() - now) + " ms");

        // contains
        now = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            set.contains(Integer.toString(i));
        }
        System.out.println("Time for containing " + COUNT + " elements:" + (System.currentTimeMillis() - now) + " ms");

        // remove
        now = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            set.remove(Integer.toString(i));
        }
        System.out.println("Time for removing " + COUNT + " elements:" + (System.currentTimeMillis() - now) + " ms");

    }

    public static void mapPerformanceRun(Map map) {

        // add
        long now = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            map.put(i, i);
        }
        System.out.println("Time for adding " + COUNT + " elements:" + (System.currentTimeMillis() - now) + " ms");

        // get
        now = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            map.get(i);
        }
        System.out.println("Time for getting " + COUNT + " elements:" + (System.currentTimeMillis() - now) + " ms");

        // remove
        now = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            map.remove(i);
        }
        System.out.println("Time for removing " + COUNT + " elements:" + (System.currentTimeMillis() - now) + " ms");

    }
        public static void main(String[] args) {
            System.out.println("*** ArrayList Performance ***");
            listPerformanceRun(new ArrayList());

            System.out.println("\n*** LinkedList Performance ***");
            listPerformanceRun(new LinkedList());

            System.out.println();
            System.out.println("*** HashSet Performance ***");
            setPerformanceRun(new HashSet<>());

            System.out.println("\n*** TreeSet Performance ***");
            setPerformanceRun(new TreeSet<>());

            System.out.println();
            System.out.println("*** HashMap Performance ***");
            mapPerformanceRun(new HashMap<>());

            System.out.println("\n*** TreeMap Performance ***");
            mapPerformanceRun(new TreeMap<>());

        }


    }

