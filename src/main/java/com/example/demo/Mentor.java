package com.example.demo;

//import org.springframework.stereotype.Component;

//@Component    //?Why I am not able to use @Component to make a bean of this object.
public class Mentor {
    private int a;
    private int b;
    public Mentor(int a,int b) {
        this.a=a;
        this.b=b;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
