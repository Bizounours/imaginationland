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
       Scanner sc = new Scanner(System.in);
        System.out.println("veuillez choisir un mot:");
        String str = sc.nextLine();
        System.out.println("vous avez saisie: " +str);
    }
}
