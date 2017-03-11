/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfitdecreasing;

import java.util.Scanner;
import edu.princeton.cs.algs4.RedBlackBST;
import java.util.Iterator;

/**
 *
 * @author andrewjoseph
 */
public class BestFitDecreasing {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    RedBlackBST<Integer, Disk> d = new RedBlackBST<Integer, Disk>();    //red black search tree

    int totalFileSize = 0;
    Disk temp = new Disk();
    d.put(temp.getSpaceRemaining(), temp);

    while(sc.hasNextInt()) {
        int input = sc.nextInt();


        Integer key = d.ceiling(input);
        if (key == null) {
            temp = new Disk();
            temp.add(input);
            totalFileSize += input;
            d.put(temp.getSpaceRemaining(), temp);
        } else {
            temp = d.get(key);
            d.delete(key);
            temp.add(input);
            totalFileSize += input;
            d.put(temp.getSpaceRemaining(), temp);
        }
    }
    System.out.println("\n-----------------------");

    double tfs = (double) totalFileSize / 1000000;

    System.out.println("file sizes sum = " + tfs + " GB");
    System.out.println("total disks    = " + d.size());

    System.out.println("\n-----------------------\n");

      Iterator keys = d.keys().iterator();
      while (keys.hasNext()) {
        int k = (int) keys.next();
        d.get(k).printStatement();
      }

      System.out.println("\n-----------------------");

      System.out.println("file sizes sum = " + tfs + " GB");
      System.out.println("total disks    = " + d.size());

      System.out.println("\n-----------------------\n");
    }
}