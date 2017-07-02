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
        String str = "";
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

        for(int index=0; index<10; index++) {
            for(int i=0;  i<s.length();  i++) {

                switch (s.substring(i, i + 1)) {

                    case "A":
                        View.createOutput(index, Words.A(index));
                        break;

                    case "B":
                        View.createOutput(index, Words.B(index));
                        break;

                    case "C":
                        View.createOutput(index, Words.C(index));
                        break;

                    case "D":
                        View.createOutput(index, Words.D(index));
                        break;

                    case "E":
                        View.createOutput(index, Words.E(index));
                        break;

                    case "F":
                        View.createOutput(index, Words.F(index));
                        break;

                    case "G":
                        View.createOutput(index, Words.G(index));
                        break;

                    case "H":
                        View.createOutput(index, Words.H(index));
                        break;

                    case "I":
                        View.createOutput(index, Words.I(index));
                        break;

                    case "J":
                        View.createOutput(index, Words.J(index));
                        break;

                    case "K":
                        View.createOutput(index, Words.K(index));
                        break;

                    case "L":
                        View.createOutput(index, Words.L(index));
                        break;

                    case "M":
                        View.createOutput(index, Words.M(index));
                        break;

                    case "N":
                        View.createOutput(index, Words.N(index));
                        break;

                    case "O":
                        View.createOutput(index, Words.O(index));
                        break;

                    case "P":
                        View.createOutput(index, Words.P(index));
                        break;

                    case "Q":
                        View.createOutput(index, Words.Q(index));
                        break;

                    case "R":
                        View.createOutput(index, Words.R(index));
                        break;

                    case "S":
                        View.createOutput(index, Words.S(index));
                        break;

                    case "T":
                        View.createOutput(index, Words.T(index));
                        break;

                    case "U":
                        View.createOutput(index, Words.U(index));
                        break;

                    case "V":
                        View.createOutput(index, Words.V(index));
                        break;

                    case "W":
                        View.createOutput(index, Words.W(index));
                        break;

                    case "X":
                        View.createOutput(index, Words.X(index));
                        break;

                    case "Y":
                        View.createOutput(index, Words.Y(index));
                        break;

                    case "Z":
                        View.createOutput(index, Words.Z(index));
                        break;

                    case " ":
                        View.createOutput(index, Words.SPACE(index));
                        break;

                    case "!":
                        View.createOutput(index, Words.EXCLAMATION(index));
                        break;

                };
            }
        }
    }
}
