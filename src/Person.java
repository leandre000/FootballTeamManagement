
interface Role {
    void performRole();
}


interface Trainable {
    void train();
}


interface Playable {
    void playMatch();
}


abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayInfo();
}
