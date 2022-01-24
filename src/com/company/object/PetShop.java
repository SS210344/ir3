package com.company.object;
import java.util.Scanner;
import java.util.ArrayList;
import com.company.object.Cat;

public class PetShop {
    public ArrayList<Cat> CatList =  new ArrayList<>();


    public void MainMenu(){

    }
    public ArrayList<Cat> AddNewCat(ArrayList<Cat> List){
        Scanner input = new Scanner(System.in);
        String Name = input.next();
        int Mood = input.nextInt();
        int Hunger = input.nextInt();
        int Energy = input.nextInt();
        boolean Friendly = input.hasNext();
        Cat newCat = new Cat(Name,Mood,Hunger,Energy,Friendly);
        if (Mood > 10){
            System.out.println("mood is to large cat will not be added");
        }
        else {
            List.add(newCat);
        }


        return List;
    }
    public void PrintCatList(ArrayList<Cat> CatList){
        for (int i = 0; i < CatList.size(); i++) {
            System.out.println(CatList.get(i));
        }
    }
}
