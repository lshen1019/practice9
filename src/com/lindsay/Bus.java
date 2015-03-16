package com.lindsay;



/**
 * Created by lovelylindsay on 15/3/16.
 */
public class Bus extends Vehicle {
    int seat = 20;
    public void seats(){
        System.out.println("公交车有座位");
    }

    public Bus(){

        System.out.println("子类的构造方法");


    }

    public void print(){
        super.seats();
        seats();
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        return true;

    }
}
