package com.company;
import java.util.ArrayList;

import com.company.object.Cat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        System.out.println("enter integer (0-99)");
        Scanner input = new Scanner(System.in);
        int Value = input.nextInt();
        System.out.println("calculate additive or multiplicative persistence(a or m)");
        String Operation = input.next();
        int Count = 0;
        while (Value > 9){
            if (Operation.equals("a")) {
                Value = (Value / 10) + (Value % 10);
            }
            else {
                Value = (Value / 10) * (Value % 10);
            }
            Count=Count+1;
        }
        System.out.println("the persistence is:");
        System.out.println(Count);
        */
        ArrayList<Cat> CatList =  new ArrayList<>();
        //sleep();
        //Feed();
        Play();
        printCatList(CatList);



    }



}
