package com.company;

public class BubbleSort {
    public static void sort(int[] list){
        boolean needNextPass = true;
        for(int i = 1; i < list.length && needNextPass; i++){
            needNextPass = false;
            for(int j = 0; j < list.length - i;j++){
                if(list[j] > list[j + 1]){
                    needNextPass = true;

                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}
