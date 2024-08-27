package patterns.decorate.wrapper;



public class Printer implements PrinterInterface {
    String string;

    public Printer(String string) {
        this.string = string;
    }

    @Override
    public void print() {
        System.out.print(string);
    }
}

