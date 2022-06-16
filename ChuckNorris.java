package com.examples;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ChuckNorris {
    public static void main(String[] args) {

        try{
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            InputStream is = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(is)
            );

            String line = null;
            String joke = null;
            while ((line = bufferedReader.readLine())!=null) {
                //System.out.println(line); JSON
                joke = line.substring((line.indexOf("value")+8),(line.length()-2));
                System.out.println(joke);
            }


        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
