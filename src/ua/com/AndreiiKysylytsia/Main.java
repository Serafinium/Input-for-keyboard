package ua.com.AndreiiKysylytsia;

/**
 * Created by SERAFIM on 01.07.2017.
 */
public class Main {
    public static void main(String[] args){
        init();


    }

    static void init(){

        System.out.println("Please input your word: ");
        String str = Logic.readForKeyboard();
       // System.out.println(str);
        Logic.parsingText(str);

        View.display();
    }

}
