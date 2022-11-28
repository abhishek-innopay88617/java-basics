package oopsprograms;
import java.util.*;

 class InheritanceAnimal {
    public void eating() {
        System.out.println("food habits are diffrent for diferent animlas");

    }
    public static class Tiger extends InheritanceAnimal {
           public  void eat() {
               System.out.println("tiger eats flesh only");
           }
           public void run(){
               System.out.print("tigers run at 120kmph");
           }

       }


           public static void main(String[] args) {
               Tiger t=new Tiger();
               t.eating();
               t.eat();

              }
       }
