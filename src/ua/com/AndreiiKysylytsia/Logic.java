package ua.com.AndreiiKysylytsia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SERAFIM on 01.07.2017.
 */
public class Logic {

    public static String readForKeyboard (){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "null";
        try {
            str = br.readLine();
        } catch (IOException e) {
            System.out.println("What-what? Please input your word again.");
            readForKeyboard ();
        }
        return str;
    }

    public static void parsingText(String s){
        s=s.toUpperCase();
        for(int i=0; i<s.length(); i++) {
            switch(s.substring(i, i+1)){

                case "A":
                    Words.A();
                    break;

                case "B":
                    Words.B();
                    break;

                case "C":
                    Words.C();
                    break;

                case "J":
                    Words.J();
                    break;

                case "V":
                    Words.V();
                    break;
            };




        }
    }
}
