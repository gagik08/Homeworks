package javaEssential.hw3.task4;

public class ProDocumentWorker extends DocumentWorker{

    @Override
    void editDocument() {
        System.out.println("Document edited");
    }

    @Override
    void saveDocument() {
        System.out.println("The document is saved in the old format, saving in other formats is available in the Expert version");
    }
}
