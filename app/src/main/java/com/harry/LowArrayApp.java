//package com.harry;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//
//
//public class LowArrayApp extends Activity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//
//    public void click(View view) {
//        LowArray arr;
//        arr = new LowArray(100);
//        int nElems = 0;
//        int t=0;
//        arr.setElem(0, 77);
//        arr.setElem(1, 99);
//        arr.setElem(2, 44);
//        arr.setElem(3, 55);
//        arr.setElem(4, 22);
//        arr.setElem(5, 88);
//        arr.setElem(6, 11);
//        arr.setElem(7, 00);
//        arr.setElem(8, 66);
//        arr.setElem(9, 33);
//        nElems = 10;
//
//        //reading
//        for (int j = 0; j < nElems; j++){
//            Log.d("test", arr.getElem(j) + " ");
//        }
//        System.out.println();
//
//        //searching
//        int searchKey = 66;
//        boolean found = false;
//        for (int j = 0; j < nElems; j++) // for each element,
//            if (arr.getElem(j) == searchKey){
//                found = true;
//                break;
//            }
//                if (found)
//                    Log.d("test", "Found " + searchKey);
//                else
//                    Log.d("test", "Can’t find " + searchKey);
//
//
//        //deleting
//        for (int j = 0; j < nElems; j++) // look for it
//            if (arr.getElem(j) == 66) {
//                t = j;
//                break;
//            }
//        for (int k = t; k < nElems; k++){
//            arr.setElem(k, arr.getElem(k + 1));
//        }
//        nElems--; // decrement size
//
//        for (int j = 0; j < nElems; j++) // display items
//            Log.d("test", arr.getElem(j) + " ");
//
//    }
//}
