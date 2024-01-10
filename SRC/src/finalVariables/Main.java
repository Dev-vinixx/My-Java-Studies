package finalVariables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //simple final variable
        final double PI = 3.14159265358979323846; //final variable PI (immutable number)
        Scanner input = new Scanner(System.in);

        System.out.println("Please advise the radius!!");
        double radius = input.nextDouble();

        double area = radius * radius * PI;
        System.out.println("This area of circle: " + area);

        //final references
        final StringBuilder sb = new StringBuilder("I win!!");
        sb.append("Losers");
    }
}
