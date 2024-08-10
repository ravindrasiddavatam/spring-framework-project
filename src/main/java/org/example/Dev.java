package org.example;


import org.springframework.stereotype.Component;


public class Dev {

    private Computer com;

    public Dev() {
        System.out.println("Dev constructor");
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build() {
        System.out.println("Working on awesome project!!");
        com.compile();
    }
}


