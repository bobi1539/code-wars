package com.zero.kyu7;

public class People{
    private int age;
    public String name;
    public String lastName;
    public String city;
    public String job;
    public static People people;

    String greet="hello";

    public String greet(){
        return greet+" my name is "+name;
    }

    public People name(String name){
        this.name = name;
        return people;
    }
    public People lastName(String lastName){
        this.lastName = lastName;
        return people;
    }
    public People city(String city){
        this.city = city;
        return people;
    }
    public People job(String job){
        this.job = job;
        return people;
    }
    public People age(int age){
        this.age = age;
        return people;
    }

    public People build(){
        return people;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getJob() {
        return job;
    }

    public String getGreet() {
        return greet;
    }

    public static People builder(){
        if(people == null){
            people = new People();
        }
        return people;
    }
}
