package com.zero.kyu7;

public class People{
    private int age;
    private String name;
    private String lastName;
    private String city;
    private String job;
    public static People people;

    private String GREET="hello";

    public String greet(){
        return GREET+" my name is "+name;
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
        return GREET;
    }

    public static People builder(){
        if(people == null){
            people = new People();
        }
        return people;
    }
}
