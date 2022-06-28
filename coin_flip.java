package com.company;
import java.util.Random;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Coin flip simulations");
        Random rand = new Random();
        int count = 20;
        List<Integer> list = new ArrayList<Integer>();
        while (count > 0)
        {
            int flip1 = rand.nextInt(100);
            if (flip1 % 2 == 0)
            {
                list.add(1);
            }
            else
            {
                list.add(2);
            }
            count -= 1;
        }
        System.out.println(list);
        int head_count = 0, tail_count = 0, head_rows = 0, tail_rows = 0;
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) == 1)
            {
                head_count += 1;
            }
            else
            {
                head_count = 0;
            }
            if (head_count == 3)
            {
                head_rows += 1;
                head_count = 0;
            }
        }
        System.out.println("Heads outcome are " + head_rows + " Tails outcome is " + tail_rows);

    }
}
