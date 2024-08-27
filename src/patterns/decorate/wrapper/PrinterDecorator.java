package patterns.decorate.wrapper;

public class PrinterDecorator implements PrinterInterface {
    PrinterInterface printerInterface;

    public PrinterDecorator(PrinterInterface printerInterface) {
        this.printerInterface = printerInterface;
    }


    @Override
    public void print() {
        System.out.print("{ ");
        printerInterface.print();

    }
}
