package javaEssential.hw4.task5;

public class ExtendedDocumentWorker1 implements DocumentWorker1{
    @Override
    public void openDocument1(){
        System.out.println("Document opened");
    }

    @Override
    public void editDocument1(){
        System.out.println("Document editing is available in Pro version");
    }
    @Override
    public void saveDocument1(){
        System.out.println("Saving a document is available in Pro version");
    }
}
