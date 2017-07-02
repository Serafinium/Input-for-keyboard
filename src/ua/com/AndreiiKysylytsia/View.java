package ua.com.AndreiiKysylytsia;

/**
 * Created by SERAFIM on 02.07.2017.
 */
public class View {

    static String res[] = new String [10];

    static {
        for (int i = 0; i < 10; i++) {
            res[i] = "";
        }
    }

    public static void createOutput(int index, String str){
       res[index] += str;
    }

    public static void display() {


        for(int i=0; i<res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
