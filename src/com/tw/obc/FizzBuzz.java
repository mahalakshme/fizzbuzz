package com.tw.obc;

/**
 * Created by mahalaks on 10/01/15.
 */
public class FizzBuzz {

    boolean IsDivisibleBy5(int no)
    {
        return (no % 5) == 0;
    }

    boolean IsDivisibleBy3(int no)
    {
        return (no % 3) == 0;
    }

    void StartGame()
    {
        for(int no = 1 ; no <= 100; no++)
        {
            boolean divisible = false;

            if(IsDivisibleBy3(no))
            {
                System.out.print("Fizz");
                divisible = true;
            }

            if(IsDivisibleBy5(no))
            {
                System.out.print("Buzz");
                divisible = true;
            }

            if(!divisible)
            {
                System.out.print(no);
            }

            System.out.println();
        }
    }
}
