package core_java.generiсs;

public class Animal {
    int id;

    public Animal() {
    }

    public Animal(int id) {
        this.id = id;
    }
    public void eat(){
        System.out.println("Animal eating");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
