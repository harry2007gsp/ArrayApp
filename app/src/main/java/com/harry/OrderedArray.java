package com.harry;

import android.util.Log;

public class OrderedArray {
    private long[] oArr;
    private int nElems;

    public OrderedArray(int max) {
        oArr = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    // binary search
    public boolean find(long searchKey) {
//        boolean found = false;
        int loweBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (loweBound + upperBound) / 2;
//            Log.d("test", String.valueOf(curIn));
            if (oArr[curIn] == searchKey) {
//                found = true;
                return true;
            } else {
                if (oArr[curIn] < searchKey) {
                    loweBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
//        if (found) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public void insert(long value) {
//        int t=0;
        int i;
        for (i = 0; i < nElems; i++) {
            if (oArr[i] > value) {
                break;
            }
        }
        for (int k = nElems; k > i; k--) {
            oArr[k] = oArr[k - 1];
        }
        oArr[i] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int t = 0;
        boolean found = false;
        for (int i = 0; i < nElems; i++) {
            if (oArr[i] == value) {
                t = i;
                found = true;
                break;
            }
        }
        for (int k = t; k < nElems; k++) {
            oArr[k] = oArr[k + 1];
            nElems--;
        }
        if (found) {
            return true;
        } else {
            return false;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            Log.d("test", String.valueOf(oArr[i]));
        }
    }
}
