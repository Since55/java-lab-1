package com.ludchak.lab1;

import com.ludchak.lab1.models.Animal;
import com.ludchak.lab1.models.Eagle;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal.Builder().addAge(5).addWeight(0.1).addName("Hummingbird").Build();
        Animal animal2 = new Animal.Builder().addAge(2).addWeight(3).addName("Golden Eagle").Build();
        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));

        Eagle steppeEagle = new Eagle.Builder().addAge(3).addName("Dwarf").addWeight(5).addColor("red").Build();
        Eagle steppeEagle2 = new Eagle.Builder().addAge(3).addName("Dwarf").addWeight(5).addColor("red").Build();
        System.out.println(steppeEagle2 == steppeEagle);
        System.out.println(steppeEagle2.equals(steppeEagle));
    }
}
