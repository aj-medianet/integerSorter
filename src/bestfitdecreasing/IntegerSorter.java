/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfitdecreasing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author andrewjoseph
 */
 public class IntegerSorter {



    public static void main(String[] args) throws FileNotFoundException {
         // if supplied, this code uses args[0] as standard input

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> fyle = new ArrayList<Integer>();

        while(sc.hasNextInt()) {
          int input = sc.nextInt();

          fyle.add(input);

          }

        Collections.sort(fyle, Collections.reverseOrder());
        //System.out.println(fyle);

        System.out.println("\n\n");

        for(int i = 0; i < fyle.size(); i++) {
          System.out.println(fyle.get(i));
        }

        System.out.println("\n\n");
    }
}
