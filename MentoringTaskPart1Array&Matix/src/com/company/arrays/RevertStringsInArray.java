package com.company.arrays;

/**
 * Created by sonasargsyan on 2/20/20.
 */
public class RevertStringsInArray {

    public String[] list;

    public RevertStringsInArray(String[] list){
        this.list=list;
    }

    public String[] reverseArray(String[] arr) {
        String temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}
