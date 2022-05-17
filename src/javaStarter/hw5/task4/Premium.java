package javaStarter.hw5.task4;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double premium = 0;
        System.out.println("Please enter your work experience: ");
        int workExperience = sc.nextInt();
        System.out.println("Enter your salary in USD: ");
        int salary = sc.nextInt();

        if (workExperience >= 0 && salary >= 0){
            if (workExperience < 5 ) premium =  salary * 0.1;
            else if (workExperience >= 5 && workExperience < 10) premium =  salary * 0.15;
            else if (workExperience >= 10 && workExperience < 15) premium =  salary * 0.25;
            else if (workExperience >= 15 && workExperience < 20) premium =  salary * 0.35;
            else if (workExperience >= 20 && workExperience < 25) premium =  salary * 0.45;
            else if (workExperience >=25) premium += salary * 0.5;
            System.out.println("Your premium is " + premium + " USD");
        }
        else System.out.println("Salary or work experience cannot be negative numbers");
    }
}
