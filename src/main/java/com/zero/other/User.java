package com.zero.other;

public class User {
    private int enabled;

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public void test() throws Exception{
        int size = 0;
        try {
            if (size == 0) {
                throw new Exception("cannot be 0");
            }
        }catch (Exception e){

        }
    }
}
