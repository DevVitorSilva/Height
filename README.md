# Height

Fazer um programa para ler nome, idade e altura de N pessoas. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.

```java
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
        double average = 0.0;
        double minorSixteen = 0;
        for(int i = 0; i < quantity; i++){
            if(ages[i] < 16){
                minorSixteen += 1;
            }
            average += heights[i];
        }
        double percentage = (minorSixteen / quantity) * 100;
        average = average / heights.length;
        System.out.printf("Average height: %.2f\n", average);
        System.out.printf("People under sixteen: %.2f%s\n", percentage, "%");
        for(int i = 0; i < quantity; i++){
            if(ages[i] < 16){
                System.out.printf("%s\n", names[i]);
            }
        }
        sc.close();
    }
}
```