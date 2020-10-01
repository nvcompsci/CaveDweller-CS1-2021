
package cavedwellerkrishna;

import java.util.Scanner;

/**
 *
 * @author Krishna Saraiya
 */
public class CaveDwellerKrishna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cave cave = new Cave();
        System.out.println(cave.toString());
        Scanner kboard = new Scanner(System.in);
    String input = "";   
    while (!input.equals("close")) {
        input = kboard.nextLine();
        cave.handleInput(input);
       
    }
        //cave.caveman.speak();
    }
    
}
