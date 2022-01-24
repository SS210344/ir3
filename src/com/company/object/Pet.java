package com.company.object;

public class Pet {
    protected String name;
    protected int Mood;
    protected int Hunger;
    protected int Energy;

    public Pet(String name, int mood, int hunger, int energy) {
        this.name = name;
        Mood = mood;
        Hunger = hunger;
        Energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMood() {
        return Mood;
    }

    public void setMood(int mood) {
        Mood = mood;
    }

    public int getHunger() {
        return Hunger;
    }

    public void setHunger(int hunger) {
        Hunger = hunger;
    }

    public int getEnergy() {
        return Energy;
    }

    public void setEnergy(int energy) {
        Energy = energy;
    }
}
