import entity.People;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people will be registered? ");
        int quantity = sc.nextInt();
        People[] people = new People[quantity];

        for(int i = 0; i < quantity; i++){
            System.out.printf("Person %da data:\n", i + 1);
            System.out.print("Name: ");
            sc.nextLine();
            people[i] = new People(sc.nextLine());
            System.out.print("Age: ");
            people[i].setAge(sc.nextInt());
            System.out.print("Height: ");
            people[i].setHeight(sc.nextDouble());
        }
        double average = 0.0;
        double minorSixteen = 0;
        for(int i = 0; i < quantity; i++){
            if(people[i].getAge() < 16){
                minorSixteen += 1;
            }
            average += people[i].getHeight();
        }
        double percentage = (minorSixteen / quantity) * 100;
        average = average / quantity;
        System.out.printf("Average height: %.2f\n", average);
        System.out.printf("People under sixteen: %.2f%s\n", percentage, "%");
        for(int i = 0; i < quantity; i++){
            if(people[i].getAge() < 16){
                System.out.printf("%s\n", people[i].getName());
            }
        }
        sc.close();
    }
}