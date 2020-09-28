/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavedweller;

import java.util.Scanner;

/**
 *
 * @author jword
 */
public class CaveDweller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cave cave = new Cave();
        cave.caveman.speak();
        System.out.println(cave.toString());
        System.out.println(cave.caveman.toString());
        
        Scanner kboard = new Scanner(System.in);
        String input = kboard.nextLine();
        if (input.equalsIgnoreCase("up")) {
            cave.caveman.moveUp();
        }
    }
    
}
