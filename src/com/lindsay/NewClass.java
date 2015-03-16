package com.lindsay;

/**
 * Created by lovelylindsay on 15/3/16.
 */
public class NewClass {
    public static void main(String[] args) {
       Bus b = new Bus();
       System.out.println(b);
        b.seats();

       b.print();

       Bus b1 = new Bus();
        b1.seat = 30;
       Bus b2 = new Bus();
        b2.seat = 30;

       if (b1.equals(b2)){
           System.out.println("相同");
       }else {
           System.out.println("不相同");
       }

    }
}
