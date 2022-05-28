package javaEssential.hw3.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("To use the document editor with extended functionality, enter the appropriate key PRO and/or Expert versions : ");
        String key = sc.nextLine();
        DocumentWorker documentVersion;
        switch (key) {
            case "PRO_VERSION_KEY": {
                System.out.println("You got access to PRO version");
                documentVersion = new ProDocumentWorker();
            }
            case "EXPERT_VERSION_KEY": {
                System.out.println("You got access to EXPERT version");
                documentVersion = new ExpertDocumentWorker();
            }
            default: {
                System.out.println("The key you entered is not valid. You will use the version with limited functionality");
                documentVersion = new DocumentWorker();
            }
        }

        while (true) {
            System.out.println("Select a command: ");
            System.out.println("Open document - 'o'/'open'");
            System.out.println("Edit document - 'e'/'edit'");
            System.out.println("Save document - 's'/'save'");
            String ans = sc.nextLine();
            if (ans.equals("o") || ans.equals("open")) {
                documentVersion.openDocument();
                break;
            } else if (ans.equals("e") || ans.equals("edit")) {
                documentVersion.editDocument();
                break;
            } else if (ans.equals("s") || ans.equals("save")) {
                documentVersion.saveDocument();
                break;
            } else {
                System.out.println("Command not recognized");
                System.out.println("Try again.");
                continue;
            }
        }
    }
}
