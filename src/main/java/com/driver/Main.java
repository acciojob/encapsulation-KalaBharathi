package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw=new RWOnly();
        String name = null;
        rw.setName(name);
        rw.getName();
    }
  
}