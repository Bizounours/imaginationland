import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: jeremy
 * Date: 11/04/13
 * Time: 21:23
 * To change this template use File | Settings | File Templates.
 */
public class Feuille1 {

    public static void scan  (String[] args)
    {
        String fonction = new String();
        char reponse = ' ' ;

       Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("veuillez choisir une fonction:");
            fonction = sc.nextLine();
            System.out.println("Vous avez choisie la fonction" +fonction);

            do
            {
                System.out.println("voulez vous rechoisir une fonction ? (O/N)");
                reponse = sc.nextLine().charAt(0);
            }
            while (reponse != 'O' && reponse != 'N');

        }

        while (reponse == 'O');

        System.out.println("test");

    }
}
