package com.epam.zhmyd;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws InterruptedException {
        while (true){
            List<List> list = new LinkedList<List>();
            for (int t = 0; t < 1000; t++) {
                for (int i = 0; i < 1000; i++) {
                    new ArrayList<Integer>(1000);
                }
                Thread.sleep(1);
                list.add(new ArrayList<Integer>(1000));

            }
        }
    }
}
