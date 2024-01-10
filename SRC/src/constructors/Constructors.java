package constructors;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Constructors {

    public Constructors() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please inform the month in which you were born");
        int monthOfBirth = input.nextInt();

        System.out.println("Please advise the day you were born");
        int dayOfBirth = input.nextInt();

        System.out.println("Please advise the year you were born");
        int yearOfBirth = input.nextInt();

        LocalDate nowDate = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);

        Period period = Period.between(dateOfBirth, nowDate);

        if (period.getYears() >= 18 && period.getYears() < 120) {
            System.out.print("If you are of legal age, then you are authorized to consume our products.");
        } else if (period.getYears() < 18) {
            System.out.println("You are not of legal age yet!! Come back when you turn 18");
            System.out.println("Come back when you turn 18");
        } else {
            System.out.println("This age is not valid");
        }
    }
}