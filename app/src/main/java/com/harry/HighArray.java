//package com.harry;
//
//import android.util.Log;
//
///**
// * Created by hsingh on 8/19/15.
// */
//public class HighArray {
//    private long[] arr;
//    private int nElems;
//
//    public HighArray(int max) {
//        arr = new long[max];
//        nElems = 0;
//    }
//
//    public boolean find(long searchKey) {
//        boolean found = false;
//        for (int i = 0; i < nElems; i++) {
//            if (arr[i] == searchKey) {
//                found = true;
//                break;
//            }
//        }
//        if (found) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void insert(long value) {
//        arr[nElems]=value;
//        nElems++;
//    }
//
//    public boolean delete(long value) {
//        int t=0;
//        boolean found = false;
//        for (int i = 0; i < nElems; i++) {
//            if (arr[i] == value) {
//                t = i;
//                found = true;
//                break;
//            }
//        }
//        for (int k = t; k < nElems; k++) {
//            arr[k] = arr[k + 1];
//            nElems--;
//        }
//        if (found) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public void display() {
//        for (int i = 0; i < nElems; i++) {
//            Log.d("test", String.valueOf(arr[i]));
//        }
//    }
//}
