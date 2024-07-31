package core_java.generiсs;

public class Cat extends Animal implements Comparable<Cat>{
    String name;

    public Cat(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Cat o) {

        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
