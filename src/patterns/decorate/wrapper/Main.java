package patterns.decorate.wrapper;

public class Main {
    public static void main(String[] args) {
        PrinterInterface printerInterface =new PrinterDecorator3(new PrinterDecorator(new PrinterDecorator2 (new Printer("hello")))) ;
        printerInterface.print();
    }
}
