package com.twiliaerp.utilities;

import org.junit.experimental.theories.Theories;

public class BrowserUtilities {

    public static void sleep(int seconds){

        try{
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }



}
