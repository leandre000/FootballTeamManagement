
class Striker extends Player {

    public Striker(String name, int age, int skillLevel, int fitnessLevel) {
        super(name, age, "Striker", skillLevel, fitnessLevel);
    }

    @Override
    public void displayInfo() {
        System.out.println("Striker: " + name + ", Age: " + age + ", Skill: " + skillLevel + ", Fitness: " + fitnessLevel);
    }

    public void scoreGoal() {
        System.out.println(name + " has scored a fantastic goal!");
    }
}
