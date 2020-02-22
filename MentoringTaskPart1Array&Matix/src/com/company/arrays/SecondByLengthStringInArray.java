package com.company.arrays;

/**
 * Created by sonasargsyan on 2/20/20.
 */
public class SecondByLengthStringInArray {

    public String[] list;

    public SecondByLengthStringInArray(String[] list){
        this.list =list;
    }

    public int getMaxElementIndex(String[] cucak) {
        String temp = "";
        int index = 0;
        for (int i = 0; i < cucak.length; i++) {
            if (cucak[i].length() > temp.length()) {
                temp = cucak[i];
                index = i;
            }
        }
        return index;
    }

    public String[] removeTheElement(String[] arr, int index) {
        int k = 0;
        String[] anotherArray = new String[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {

            if (i != index) {
                anotherArray[k] = arr[i];
                k++;
            }

        }

        return anotherArray;
    }

}
