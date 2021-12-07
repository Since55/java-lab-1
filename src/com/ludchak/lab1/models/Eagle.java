package com.ludchak.lab1.models;

public class Eagle extends Bird {

    private int wingSpan;

    /**
     * Overridden function of obtaining the hash code
     *
     * @return returns the numeric value of the hash code
     */
    @Override
    public int hashCode() {
        final int prime = 41;
        int result = super.hashCode();
        result = prime * result + this.wingSpan;
        return result;
    }

    /**
     * Overridden function of comparison an instance of
     * the class "Eagle" and an instance of the class "Object"
     *
     * @return returns the boolean value of the comparison
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.hashCode() != obj.hashCode()) return false;
        if (this.getClass() != obj.getClass()) return false;
        Eagle temp = (Eagle) obj;
        if (this.name != temp.name || this.weight != temp.weight || this.age != temp.age || this.color != temp.color || this.wingSpan != temp.wingSpan)
            return false;
        return true;
    }

    /**
     * Overriden function of obtaining a string representation of
     * an instance of a class "Eagle"
     *
     * @return returns the string representation
     */
    @Override
    public String toString() {
        return super.toString() + " NumOfEatenEmployees: " + wingSpan;
    }

    /**
     * Class "Builder" with fields: newEagle, Count
     *
     * @author User
     * @version 1.0
     */
    public static class Builder {
        private Eagle newEagle;
        private static int Count = 0;

        /**
         * Constructor - creating a new object
         *
         * @see Builder#Builder()
         */
        public Builder() {
            newEagle = new Eagle();
        }

        /**
         * Function name designation
         *
         * @param name - name of an Eagle
         * @return returns current object
         */
        public Builder addName(String name) {
            newEagle.name = name;
            return this;
        }

        /**
         * Function weight designation
         *
         * @param weight - weight of an Eagle
         * @return returns current object
         */
        public Builder addWeight(double weight) {
            newEagle.weight = weight;
            return this;
        }

        /**
         * Function age designation
         *
         * @param age - age of an Eagle
         * @return returns current object
         */
        public Builder addAge(int age) {
            newEagle.age = age;
            return this;
        }

        /**
         * Function color designation
         *
         * @param color - wool color of an Eagle
         * @return returns current object
         */
        public Builder addColor(String color) {
            newEagle.color = color;
            return this;
        }

        /**
         * Function wingSpan designation
         *
         * @param wingSpan - wing span length
         * @return returns new object of class "Eagle"
         */
        public Builder changeWingSpan(int wingSpan) {
            newEagle.wingSpan = wingSpan;
            return this;
        }

        /**
         * Function of creating an object of class "Eagle"
         *
         * @return returns new object of class "Eagle"
         */
        public Eagle Build() {
            newEagle.id = ++Count;
            return newEagle;
        }
    }
}
