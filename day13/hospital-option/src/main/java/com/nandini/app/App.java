package com.nandini.app;

public class App {
    public static void main(String args[]){
        OptionsApp optionsApp=new OptionsApp();

        optionsApp.getHospital("h3").ifPresent(hospital-> System.out.println(hospital.getName()));

        StreamApp streamApp=new StreamApp();
        System.out.println("docter Array");
        streamApp.getDocterArray().forEach(docter -> System.out.println(docter.toString()));
        System.out.println("docter List");
        streamApp.getDocterList().forEach(docter -> System.out.println(docter.toString()));
        System.out.println("docter Data");
        streamApp.getDocterData().forEach(docter -> System.out.println(docter.toString()));
        System.out.println("docter builder");
        streamApp.getDocterStreamBulider().forEach(docter -> System.out.println(docter.toString()));
        streamApp.getDocterList().forEach(e -> e.salaryIncrement(10.0));
        streamApp.getDocterStreamBulider().forEach(docter -> System.out.println(docter.toString()));

    }

    }

