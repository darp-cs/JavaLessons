package Lesson3;

public class Animal {

    private String name;
    public Animal(){
        this.name = "";
    }

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " eats food");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
