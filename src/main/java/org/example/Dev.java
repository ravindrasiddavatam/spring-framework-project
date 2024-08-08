package org.example;


import org.springframework.stereotype.Component;


public class Dev {



    private int age;

    private Laptop laptop;

    public Dev() {
        System.out.println("Dev constructor");
    }

    public Dev(Laptop laptop){
        this.laptop = laptop;
        System.out.println("Dev 1 constructor");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build() {
        System.out.println("Working on awesome project!!");
        laptop.compile();
    }
}


