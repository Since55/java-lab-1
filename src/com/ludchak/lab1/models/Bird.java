package com.ludchak.lab1.models;


/**
 * @author Ludchak
 * @version 1.0
 */
public class Bird extends Animal {

    /**
     * Feather color
     */
    protected String color;

    /**
     * Overridden function of obtaining the hash code
     *
     * @return returns the numeric value of the hash code
     */
    @Override
    public int hashCode() {
        final int prime = 33;
        int hash = super.hashCode();
        hash = prime * hash + color.length();
        return hash;

    }

    /**
     * Overridden function of comparison an instance of
     * the class "bird" and an instance of the class "Object"
     *
     * @return returns the boolean value of the comparison
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.hashCode() != obj.hashCode())
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Bird temp = (Bird) obj;
        if (this.name != temp.name || this.weight != temp.weight || this.age != temp.age || this.color != color)
            return false;
        return true;
    }

    /**
     * Overriden function of obtaining a string representation of
     * an instance of a class "bird"
     *
     * @return returns the string representation
     */
    @Override
    public String toString() {
        return super.toString() + " Color: " + color;
    }

    /**
     * Class "Builder" with fields: newbird, Count
     *
     * @author User
     * @version 1.0
     */
    public static class Builder {

        /**
         * bird field
         */
        private Bird newBird;
        /**
         * Count of birds field
         */
        private static int Count = 0;

        /**
         * Constructor - creating a new object
         *
         * @see Builder#Builder()
         */
        public Builder() {
            newBird = new Bird();
        }

        /**
         * Function name designition
         *
         * @param name - name of a bird
         * @return returns current object
         */
        public Builder addName(String name) {
            newBird.name = name;
            return this;
        }

        /**
         * Function weight designition
         *
         * @param weight - weight of a bird
         * @return returns current object
         */
        public Builder addWeight(double weight) {
            newBird.weight = weight;
            return this;
        }

        /**
         * Function age designition
         *
         * @param age - age of a bird
         * @return returns current object
         */
        public Builder addAge(int age) {
            newBird.age = age;
            return this;
        }

        /**
         * Function color designition
         *
         * @param color - wool color of a bird
         * @return returns current object
         */
        public Builder addColor(String color) {
            newBird.color = color;
            return this;
        }

        /**
         * Function of creating an object of class "bird"
         *
         * @return returns new object of class "bird"
         */
        public Bird Build() {
            newBird.id = ++Count;
            return newBird;
        }
    }

}