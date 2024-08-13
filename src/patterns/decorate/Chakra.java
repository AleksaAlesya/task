package patterns.decorate;

public class Chakra extends OptionDecorator {
    public Chakra(Service service) {
        super(service, "Характеристика чакр", 500);
    }
}
