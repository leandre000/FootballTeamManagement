class TacticalCoach extends Coach {

    public TacticalCoach(String name, int age) {
        super(name, age, "Tactics");
    }

    @Override
    public void planTraining() {
        System.out.println(name + " is planning tactical drills.");
    }

    @Override
    public void train() {
        System.out.println(name + " is training the team on tactical play.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Coach: " + name + ", Age: " + age + ", Specialization: " + specialization);
    }

    public void developStrategy() {
        System.out.println(name + " is developing a match strategy.");
    }
}