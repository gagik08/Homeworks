package javaEssential.hw4.task5;

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
