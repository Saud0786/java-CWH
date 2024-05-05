package com.company;
import java.util.Scanner;
public class ch_6_array {
    public static void main(String[] args) {
        // Question -1
//        float[]a={5.3f,5.4f,6.7f,8.6f};
//        float sum=0;
//        for (float t:a) {
//            sum=sum+t;
//        }
//        System.out.println(sum);

        //Question -2
//        int[]marks={3,4,5,6,7};
//        int num=4;
//        boolean isInArray=false;
//        for (int element:marks){
//            if(num==element){
//                isInArray=true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("The value is peasant in the array");
//        }
//        else{
//            System.out.println("The value is not peasant in the array");
//        }

        //Question - 3
//        double[]marks={34.4,54.5,65.6,87.6};
//        double sum=0;
//        for (double element:marks) {
//            sum=sum+element;
//        }
//        System.out.println("The average value of marks is "+sum/ marks.length);

        //Question -4

//        int[][]mat1={{1,2,3},{4,5,6}};
//        int[][]mat2={{2,3,4},{4,6,7}};
//        int[][]result={{0,0,0},{0,0,0}};
//        for (int i=0;i< mat1.length;i++){
//            for(int j=0;j< mat1[i].length;j++){
//                System.out.printf("Setting value for i=%d and j=%d \n",i,j);
//                result[i][j]=mat1[i][j]+mat2[i][j];
//            }
//        }
//        for (int i=0;i< mat1.length;i++){
//            for(int j=0;j< mat1[i].length;j++){
//                System.out.printf(result[i][j]+" ");
//                result[i][j]=mat1[i][j]+mat2[i][j];
//            }
//            System.out.println(" ");
//        }

        //Question -5
//        int[]arr={1,2,3,4,5};
//        int l=arr.length;
//        int n=Math.floorDiv(l,2);
//        int tem;
//        for (int i=0;i<n;i++){
//            tem=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=tem;
//        }
//        for (int element:arr){
//            System.out.println(element+" ");
//        }

        // Question -6
//        int[]arr={1,2,3,4,8};
//        int max=0;
//        for (int e:arr) {
//            if(e>max){
//                max=e;
//            }
//        }
//        System.out.println("The max value of Array "+max);

        // Question -7
        boolean isSorted =true;
        int[]arr={1,5,2,3,4};
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }


    }
}
