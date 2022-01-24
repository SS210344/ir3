package com.company.object;

import java.util.Random;
public class Cat extends Pet {
    public boolean Friendly;

    public Cat(String name, int mood, int hunger, int energy, boolean friendly) {
        super(name, mood, hunger, energy);
        Friendly = friendly;
    }

    public boolean isFriendly() {
        return Friendly;
    }

    public void setFriendly(boolean friendly) {
        Friendly = friendly;
    }

    public void Sleep(){
        Random Random = new Random();
        setEnergy(getEnergy()+Random.nextInt(5)+5);
        setHunger(getHunger()+Random.nextInt(10)+1);
        setFriendly(false);
    }
    public void Feed(){
        Random Random = new Random();
        setEnergy(getEnergy()+Random.nextInt(5)+5);
        setMood(getMood()+Random.nextInt(10)+1);
        setHunger(getHunger()- (Random.nextInt(10)+1));
        setFriendly(true);

    }
    public void Play(){
        Random Random = new Random();
        setEnergy(getEnergy()-(Random.nextInt(4)+3));
        if(getHunger()< 5){
            setMood(getMood()+Random.nextInt(5)+5);
        }
        if(getHunger()>= 5){
            setMood(getMood()-(Random.nextInt(5)+5));
            setFriendly(false);
        }

    }


}
