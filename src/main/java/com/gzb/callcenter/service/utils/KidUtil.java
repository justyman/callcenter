package com.gzb.callcenter.service.utils;

public class KidUtil {

    public static final int AUDIT_AGE = 18;
    public static final int KID_AGE = 3;

    /*public boolean isKid(int age){

        if (age >= AUDIT_AGE) {
            return false;
        }else if (age < KID_AGE){
            return false;
        }else{
            return true;
        }
    }*/

    public int getGender(String name){
        if ("mimy".equals(name)){
            return 1;
        }else if ("man".equals(name)){
            return 2;
        }else if ("yaoyao".equals(name)){
            return 3;
        }else{
            return 4;
        }
    }

    public int getHusband(String wife){
        if ("Sussi".equals(wife)){
            return 1;
        }else {
            return 2;
        }
    }


}
