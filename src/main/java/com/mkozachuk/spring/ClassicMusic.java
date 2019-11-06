package com.mkozachuk.spring;

public class ClassicMusic implements Music {

    private ClassicMusic(){

    }

    public static ClassicMusic factoryMethod(){
        return new ClassicMusic();
    }


    public void initMethod(){
        System.out.println("Do my initialization");
    }

    public void destroyMethod(){
        System.out.println("Do my destruction");
    }

    @Override
    public String getSong() {
        return "Symphony No.5";
    }
}
