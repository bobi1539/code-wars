package com.zero.kyu7;

public class BuilderDS {
    public static void main(String[] args) {
        People person = People.builder().name("ucup")
                        .lastName("surucup").age(15).city("bandung").job("pgm").build();
        System.out.println(person.name);
        System.out.println(person.greet());

    }
}
