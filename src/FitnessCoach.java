class FitnessCoach extends Coach {

    public FitnessCoach(String name, int age) {
        super(name, age, "Fitness");
    }

    @Override
    public void planTraining() {
        System.out.println(name + " is planning a fitness session.");
    }

    @Override
    public void train() {
        System.out.println(name + " is conducting a fitness training session.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Coach: " + name + ", Age: " + age + ", Specialization: " + specialization);
    }
}
