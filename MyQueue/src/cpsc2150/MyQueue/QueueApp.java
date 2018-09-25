//Clare DuVal and Jonathan Ayala
//CPSC 2151 Sec 002
//Lab 4

package cpsc2150.MyQueue;

import java.util.*;

public class QueueApp {

    public static void main(String args []) {

        IntegerQueueI q;

        Scanner input = new Scanner(System.in);
        /*
        You will add in code here to ask the user whether they want an array implementation or a list implementation.
        Then use their answer to initialize q appropriately
        */
        System.out.println("Would you like to use an array implementation or a list implementation? (array/list)");
        String imp = input.nextLine();

        /*while ((imp != "array" ) || (imp != "list"))
        {
            System.out.println("Invalid input. Would you like to use an array implementation or a list implementation? (array/list)");
            imp = input.nextLine();

        }*/

        if (imp == "array")
        {
            q = new ArrayQueueImp();
        }
        else
        {
            q = new ListQueueImp();
        }


        Integer x = 42;
        q.add(x);
        x = 17;
        q.add(x);
        x = 37;
        q.add(x);
        x = 36;
        q.add(x);
        x = 12;
        q.add(x);
        //Add the code to print the queue. After the code is finished, the queue should contain all its values in order
        for (int i = 0; i < q.size(); i++)
        {
            System.out.println(q.pop());
        }
    }
}

