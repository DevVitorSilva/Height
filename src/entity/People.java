package entity;

public class People {
    private String name;
    private double height;
    private int age;

    public People(String name, double height, int age){
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

}
