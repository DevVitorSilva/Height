import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people will be registered? ");
        int quantity = sc.nextInt();
        String[] names = new String[quantity];
        int[] ages = new int[quantity];
        double[] heights = new double[quantity];
        for(int i = 0; i < quantity; i++){
            System.out.printf("Person %da data:\n", i + 1);
            System.out.print("Name: ");
            sc.nextLine();
            names[i] = sc.nextLine();
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            System.out.print("Height: ");
            heights[i] = sc.nextDouble();
        }
        sc.close();
    }
}