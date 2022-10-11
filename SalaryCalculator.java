/**
 * @author: Abhi Patel
 * Calculate employee's gross yearly salary.
 * Get number of hours employee works per week and amount of money employee makes per hour as input
 * LinkedinLearning: https://www.linkedin.com/learning/learning-java-4/challenge-salary-calculator?autoplay=true&contextUrn=urn%3Ali%3AlyndaLearningPath%3A56d8919392015a1a081f9141&resume=false&u=2218586
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        // Get number of hours employee works.
        System.out.print("Enter number of hours employee worked in a week: ");
        int hoursWorkedPerWeek = input.nextInt();
        // Get amount of money employee earns per hour.
        System.out.print("Enter per hour salary for the employee: ");
        double perHourSalary = input.nextDouble();
        // Get vacation days.
        System.out.print("Enter vacation days for the employee: ");
        int vacationDays = input.nextInt();
        // Calculate gross salary.
        System.out.println("Employees gross yearly salary is: " + calculateGrossSalary(hoursWorkedPerWeek, perHourSalary, vacationDays));
        input.close();
    }

    public static double calculateGrossSalary(int hoursWorkedPerWeek, double perHourSalary, int vacationDays) {
        if (hoursWorkedPerWeek > 0 && perHourSalary > 0 && vacationDays >= 0) {
         return (perHourSalary * hoursWorkedPerWeek * 52.14) - (vacationDays * 8 * perHourSalary);   
        }
        return -1;
    }
}