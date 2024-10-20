abstract class Coach extends Person implements Trainable {
    protected String specialization;

    public Coach(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public abstract void planTraining();
}
