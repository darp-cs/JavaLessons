package Lesson3;

public class Dog extends Animal{

    private String food;

    public Dog(){
        super();
        this.food = "";
    }

    public Dog(String name){
        super(name);
        this.food = "";
    }
    public Dog(String name, String food){
        super(name);
        this.food = food;
    }

    public void eat(){
        System.out.println(this.getName()+" eats "+this.food);
    }

    public void bark(){
        System.out.println("bark");
    }

}
