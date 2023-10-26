package Lesson3;

public class Cat extends Animal{
    private String food;

    public Cat(){
        super();
        this.food = "";
    }

    public Cat(String name){
        super(name);
        this.food = "";
    }
    public Cat(String name, String food){
        super(name);
        this.food = food;
    }

    public void eat(){
        System.out.println(this.getName()+" eats "+this.food);
    }

    public void meow(){
        System.out.println("meow");
    }
}
