package javaEssential.hw7.task2;

import java.util.Arrays;
import java.util.Scanner;
import static javaEssential.hw7.task2.Worker.splitSurname;

public class Main {
    public static void main(String[] args) throws  UnrealisticNumberException {
        Scanner scanner = new Scanner(System.in);
        Worker[] workers = new Worker[5];
        System.out.println("Enter information about {5} employees:");
        String fullName;
        String jobTitle;
        int jobApplying;
        int workExperience;
        for (int i = 0; i < workers.length; i++) {
            System.out.println("Employee №" + (i + 1));
            System.out.print("First and Last name - ");
            fullName = scanner.nextLine();
            System.out.print("Job title - ");
            jobTitle = scanner.nextLine();
            while (true) {
                try {
                    System.out.print("Year of employment - ");
                    jobApplying = Integer.parseInt(scanner.nextLine());
                    if(!(jobApplying >= 1942 && jobApplying <=2022)){
                        throw new UnrealisticNumberException();
                    }
                    break;
                } catch (NumberFormatException ex1) {
                    System.out.println("Unacceptable symbols. You must enter a year.");
                } catch (UnrealisticNumberException ex2) {
                    System.out.println("You entered an unrealistic year. Try again/");
                }
            }
            workers[i] = new Worker(fullName, jobTitle, jobApplying);
        }
        Arrays.sort(workers);
        System.out.println(Arrays.toString(workers));
        while (true) {
           try {
               System.out.println("Now enter the work experience for which you want to select employees - ");
               workExperience = Integer.parseInt(scanner.nextLine());
               if (!(workExperience >=0 && workExperience <=80)){
                   throw new UnrealisticNumberException();
               }
               break;
           } catch (NumberFormatException ex1) {
               System.out.println("Unacceptable symbols. You must enter a year.");
           } catch (UnrealisticNumberException ex2) {
               System.out.println("You entered an unrealistic year. Try again/");
           }
       }
       for (int i = 0; i < workers.length; i++){
           if((2022 - workers[i].getJobApplying()) > workExperience) {
                   System.out.println(splitSurname(workers[i].getFullName()));

           }
       }
    }
}
