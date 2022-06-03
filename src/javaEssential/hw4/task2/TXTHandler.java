package javaEssential.hw4.task2;

public class TXTHandler extends AbstractHandler{
    @Override
    void create() {
        System.out.println("'.txt' file created...");
    }

    @Override
    void open() {
        System.out.println("'.txt' file opened...");
    }

    @Override
    void change() {
        System.out.println("'.txt' file changed...");
    }

    @Override
    void save() {
        System.out.println("'.txt' file saved...");
    }
}
