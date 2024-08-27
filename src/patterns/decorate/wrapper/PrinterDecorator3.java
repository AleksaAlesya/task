package patterns.decorate.wrapper;

public class PrinterDecorator3 implements PrinterInterface {
    PrinterDecorator printerDecorator;

    public PrinterDecorator3(PrinterDecorator printerDecorator) {
        this.printerDecorator = printerDecorator;
    }

    @Override
    public void print() {
        System.out.print("!!! ");
        printerDecorator.print();
        System.out.println(" !!!");

    }
}
