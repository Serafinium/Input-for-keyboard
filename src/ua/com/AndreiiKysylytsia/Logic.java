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

                case "D":
                    Words.D();
                    break;

                case "E":
                    Words.E();
                    break;

                case "F":
                    Words.F();
                    break;

                case "G":
                    Words.G();
                    break;

                case "I":
                    Words.I();
                    break;

                case "J":
                    Words.J();
                    break;

                case "K":
                    Words.K();
                    break;

                case "L":
                    Words.L();
                    break;

                case "M":
                    Words.M();
                    break;

                case "N":
                    Words.N();
                    break;

                case "O":
                    Words.O();
                    break;

                case "P":
                    Words.P();
                    break;

                case "Q":
                    Words.Q();
                    break;

                case "R":
                    Words.R();
                    break;

                case "S":
                    Words.S();
                    break;

                case "T":
                    Words.T();
                    break;

                case "U":
                    Words.U();
                    break;

                case "V":
                    Words.V();
                    break;

                case "W":
                    Words.W();
                    break;

                case "X":
                    Words.X();
                    break;

                case "Y":
                    Words.Y();
                    break;

                case "Z":
                    Words.Z();
                    break;

            };
        }
    }
}
