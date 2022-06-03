package javaEssential.hw4.task2;

public class InvokeMethods {
    public static void main(String[] args) {
        AbstractHandler docHandler = new DOCHandler();
        AbstractHandler xmlHandler = new XMLHandler();
        AbstractHandler txtHandler = new TXTHandler();

        AbstractHandler[] handlers = {docHandler,xmlHandler,txtHandler};

        for (AbstractHandler invoke : handlers) {
            invoke.create();
            invoke.open();
            invoke.change();
            invoke.save();
            System.out.println();
        }
    }
}
