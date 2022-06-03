package javaEssential.hw4.task2;

public class DOCHandler extends AbstractHandler{
    @Override
    void create() {
        System.out.println("'.doc' file created...");
    }

    @Override
    void open() {
        System.out.println("'.doc' file opened...");
    }

    @Override
    void change() {
        System.out.println("'.doc' file changed...");
    }

    @Override
    void save() {
        System.out.println("'.doc' file saved...");
    }
}
