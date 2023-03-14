package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        List<Integer> p1 = new ArrayList <Integer>();
        List<Integer> p2 = new ArrayList <Integer>();
        List<Integer> children_1 = new ArrayList <Integer>();
        List<Integer> children_2 = new ArrayList <Integer>();
        p1.add(0);
        p1.add(1);
        p1.add(2);
        p1.add(3);
        p1.add(4);
        p1.add(5);
        p1.add(6);
        p1.add(7);
        p1.add(8);
        p2.add(8);
        p2.add(7);
        p2.add(6);
        p2.add(1);
        p2.add(2);
        p2.add(3);
        p2.add(4);
        p2.add(5);
        p2.add(0);
        for (int ind_j = 0; ind_j < p1.size(); ind_j++)
        {
            children_1.add(p2.get(ind_j));
            children_2.add(p1.get(ind_j));
        }
        int i = 3;
        //List <Integer> children_2 = p2.Solution;
        //i = 25;
        int max_len = p1.size() - i - 1;
        //System.out.println(p1.Solution.size());
        //System.out.println(p1.Solution);
        Random random = new Random();
        int a = random.nextInt((max_len) + 1);
        int b = a + i;
        System.out.println(i);
        System.out.println(b);
        System.out.println(p1);
        System.out.println(p2);
        //System.out.println(a);
        //System.out.println(b);
        for (int ind = a; ind <= b; ind++)
        {
            children_1.set(ind, p1.get(ind));
            children_2.set(ind, p2.get(ind));
            //children_2.get(ind) = p2.Solution.get(ind);
            for (int ind_j = 0; ind_j < p1.size(); ind_j++)
            {
                if (children_1.get(ind).equals(children_1.get(ind_j)))
                {
                    children_1.set(ind_j, p2.get(ind_j));
                    //System.out.println(children_1);
                }
                if (p2.get(ind).equals(p2.get(ind_j)))
                {
                    children_2.set(ind_j, p2.get(ind));
                }
            }
        }

        System.out.println(children_1);
    }
}