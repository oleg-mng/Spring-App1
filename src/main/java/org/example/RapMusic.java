package org.example;

public class RapMusic implements Music{
    private RapMusic(){}
    public static RapMusic getRapMusic(){
        return new RapMusic();
    }
    public void doMyInit(){
        System.out.println("do my initialization");
    }
    public void doMyDestroy(){
        System.out.println("do my destruction");
    }
    @Override
    public String getSong() {
        return "California dreaming";
    }
}
