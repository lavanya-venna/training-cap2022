package CollectionsDemoTraining;

//Create an ArrayList which will be able to store only numbers like int,float,double,etc.. but not any other data type

import java.util.ArrayList;

public class ArrayList3 {

    static ArrayList<Number> a1 = new ArrayList<>();

    public static void main(String[] args) {

        //add numerical values
        a1.add(18);
        a1.add(1.2);

        for(Number a:a1)
            System.out.println(a);
    }
}
