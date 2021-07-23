package com.phil;

public class LambdaExpressionExample {
    public interface Drawable {
        //public void draw();
        public void height();
    }
    public static void main(String[] args) {
        int width=10;

        //without lambda, Drawable implementation using anonymous class
        Drawable dr=new Drawable(){
            public void height(){System.out.println("Drawing "+width);}
        };
        dr.height();
        Drawable d=()->{
            System.out.println("Drawing "+50);
        };
        d.height();
        /*Drawable dr = new com.phil.Drawable();
        dr.draw();*/
    }
}