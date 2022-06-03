package javaEssential.hw4.task5;

import javaEssential.hw3.task4.DocumentWorker;

public class ExpertDocumentWorker1 implements DocumentWorker1 {
    @Override
    public void openDocument1(){
        System.out.println("Document opened");
    }

    @Override
    public void editDocument1(){
        System.out.println("Document edited");
    }

    @Override
    public void saveDocument1() {
        System.out.println("Document is saved");
    }
}
