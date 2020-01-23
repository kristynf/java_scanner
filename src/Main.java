import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your First Initial? ");
        String FirstInitial = keyboard.nextLine();
        System.out.println("What is your Last Name? ");
        String LastName = keyboard.nextLine();
        System.out.println("What is your house number? ");
        int HouseNumber = keyboard.nextInt();
        System.out.println("What is your Street Name? ");
        String StreetName = keyboard.nextLine();
        System.out.println("What is your Street Type? ");
        String StreetType = keyboard.nextLine();
        System.out.println("What is your City? ");
        String City = keyboard.nextLine();
        System.out.print(FirstInitial + " " + LastName);
        System.out.println(HouseNumber + " " + StreetName + " " + StreetType + " " + City);

    }
}

   /* Your assignment....
        Complete the following program. Use the Scanner class to read the following string into variables. Input String: "P Sherman 42 Wallaby Way Sydney" Variables: firstInitial,lastName, houseNumber,streetName,streetType,city

        Your output should be handled with this code:

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);*/