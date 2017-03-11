/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfitdecreasing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author andrewjoseph
 */
public class WorstFit {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      ArrayList<Disk> d = new ArrayList<Disk>();    //priority queue

      int totalFileSize = 0;

      d.add(new Disk());

      while(sc.hasNextInt()) {

        int input = sc.nextInt();

        if (d.get(0).getSpaceRemaining() >= input) {
          d.get(0).add(input);
          totalFileSize += input;
        } else {
          Disk temp = new Disk();
          temp.add(input);
          totalFileSize+= input;
          d.add(temp);
        }
        Collections.sort(d);
      }
      System.out.println("\n-----------------------");

      double tfs = (double) totalFileSize / 1000000;

      System.out.println("file sizes sum = " + tfs + " GB");
      System.out.println("total disks    = " + d.size());

      System.out.println("\n-----------------------\n");

      for(int i = 0; i < d.size(); i++) {
        d.get(i).printStatement();
      }

      System.out.println("\n-----------------------");

      System.out.println("file sizes sum = " + tfs + " GB");
      System.out.println("total disks    = " + d.size());

      System.out.println("\n-----------------------\n");
    }
}