package com.nandini.app;

public class App {
    public static void main(String args[]){
        OptionsApp optionsApp=new OptionsApp();

        optionsApp.getHospital("h1").ifPresent(hospital-> System.out.println(hospital.getName()));
    }
}
