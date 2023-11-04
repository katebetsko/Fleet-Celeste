package com.fleet.utilities;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUserGenerator {
    public static String getUserName(String userType){
        String username = "";
        int minimum,maximum;
        int random = ThreadLocalRandom.current().nextInt(1,3);

        switch (userType){
            case "driver":
                if(random==1){
                    minimum = 1;
                    maximum = 50;
                }else{
                    minimum = 150;
                    maximum = 200;
                }
                username = "user"+ThreadLocalRandom.current().nextInt(minimum,maximum+1);
                break;


            case "storemanager":
//                if(random==1){
                    minimum = 51;
                    maximum = 100;
//                }
                //The following range does not work on the transmuda website.
                // If it is fixed you can uncomment them
//                else{
//                    minimum = 201;
//                    maximum = 250;
//                }
                username = "storemanager"+ThreadLocalRandom.current().nextInt(minimum,maximum+1);

                break;


            case "salesmanager":
                if(random==1){
                    minimum = 101;
                    maximum = 150;
                }else{
                    minimum = 201;
                    maximum = 250;
                }
                username = "salesmanager"+ThreadLocalRandom.current().nextInt(minimum,maximum+1);
                break;


        }
        return username;


    }
    public static String getPassword(){return "UserUser123";}

}
