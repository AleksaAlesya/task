package patterns.decorate.wrapper;

public class PrinterDecorator2 implements PrinterInterface{
    PrinterInterface printerInterface;

    public PrinterDecorator2(PrinterInterface printerInterface) {
        this.printerInterface = printerInterface;
    }

    @Override
    public void print() {
        printerInterface.print();
        System.out.print(" }");

    }
}
