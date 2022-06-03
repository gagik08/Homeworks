package javaEssential.hw4.task5;

import java.util.Scanner;

public class DocEdit {
    public static void main(String[] args) {
//        ExtendedDocumentWorker extendedDocumentWorker = new ExtendedDocumentWorker();
//        ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
//        ExpertDocumentWork expertDocumentWork = new ExpertDocumentWork();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("To use the document editor with extended functionality, enter the appropriate key PRO and/or Expert versions : ");
//        String key = sc.nextLine();
        Scanner sc = new Scanner(System.in);
        System.out.print("To use the document editor with extended functionality, enter the appropriate key PRO and/or Expert versions : ");
        String key = sc.nextLine();
        DocumentWorker1 documentVersion;
        switch (key) {
            case "PRO_VERSION_KEY": {
                System.out.println("You got access to PRO version");
                documentVersion = new ProDocumentWorker1();
                break;
            }
            case "EXPERT_VERSION_KEY": {
                System.out.println("You got access to EXPERT version");
                documentVersion = new ExpertDocumentWorker1();
                break;
            }
            default: {
                System.out.println("The key you entered is not valid. You will use the version with limited functionality");
                documentVersion = new ExtendedDocumentWorker1();
            }
        }

        while (true) {
            System.out.println("Select a command: ");
            System.out.println("Open document - 'o'/'open'");
            System.out.println("Edit document - 'e'/'edit'");
            System.out.println("Save document - 's'/'save'");
            String ans = sc.nextLine();
            if (ans.equals("o") || ans.equals("open")) {
                documentVersion.openDocument1();
                break;
            } else if (ans.equals("e") || ans.equals("edit")) {
                documentVersion.editDocument1();
                break;
            } else if (ans.equals("s") || ans.equals("save")) {
                documentVersion.saveDocument1();
                break;
            } else {
                System.out.println("Command not recognized");
                System.out.println("Try again.");
                continue;
            }
        }
    }
}



