import Lesson3.*;

public class Lesson3Driver {

    public static void main(String[] args){

        Dog d1 = new Dog("Sparky","Dog Food");
        Cat c1 = new Cat("Tom", "Cat Food");

        Animal[] animals = {c1,d1};

        d1.bark();
        c1.meow();

        //Write a Parent class shape that has the shape name
        //Write Children classes to get shape areas (Triangle, Circle, Square)
        //Create a collection of shapes


    }


}
