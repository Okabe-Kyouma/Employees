package com.Sharad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Employees> arr = new ArrayList<>();

        for(int a =0;a<10;a++){
            arr.add(new Employees(input.next(),input.nextDouble()));

        }

        System.out.println(arr.toString());



    }
}