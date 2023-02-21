package com.zero.other;

public class AppUser {
    public static void main(String[] args) {
        Integer enabled = null;
        User user = new User();

        try{
            user.test();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
