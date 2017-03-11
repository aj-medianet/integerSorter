/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfitdecreasing;


import java.util.ArrayList;

/**
 *
 * @author andrewjoseph
 */
public class Disk implements Comparable<Disk> {

    private int TOTALDISKSPACE = 1000000;
    private int diskSpaceUsed = 0;
    private ArrayList<Integer> dicks = new ArrayList<Integer>();

    public Disk() {

    }

    public int getSpaceRemaining() {
        return TOTALDISKSPACE - diskSpaceUsed;
    }

    public boolean add(int input) {
      if (getSpaceRemaining() > input) {
        dicks.add(input);
        diskSpaceUsed += input;
        return true;
      } else {
        return false;
      }
    }

    public void printStatement() {

        System.out.println("total files:" + dicks.size());

        for (int i = 0; i < dicks.size(); i++) {
          System.out.println("file " + i + ": " + dicks.get(i));
        }
        System.out.println("disk space used: " + diskSpaceUsed);
        System.out.println("space remaining: " + getSpaceRemaining());
        System.out.println("\n-----------------------");
    }

    @Override
    public int compareTo(Disk o) {
      //if space remaining in disk 1 is greater than disk 2
      if(o.getSpaceRemaining() > this.getSpaceRemaining()) {
        return 1;
      } else {
        return -1;
      }
    }
}
