package VerhovnaRada;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Deputat deputat = new Deputat(78.5, 178.4, "Liashko", "Oleh", 45, true);
//        System.out.println(deputat);


        Scanner scanner = new Scanner(System.in);
        Deputat deputat1 = new Deputat();
        System.out.print("Input weight: ");
        deputat1.setWeight(scanner.nextDouble());
        System.out.print("\nInput height: ");
        deputat1.setHeight(scanner.nextDouble());
        System.out.print("\nInput surename: ");
        deputat1.setSurename(scanner.next());
        System.out.print("\nInput name: ");
        deputat1.setName(scanner.next());
        System.out.print("\nInput age: ");
        deputat1.setAge(scanner.nextInt());
        System.out.print("\nInput is he briber: ");
        deputat1.setBribe(scanner.nextBoolean());
        deputat1.takeBribe();
        System.out.println(deputat1);
    }
}
