// Specific player class: Goalkeeper
class Goalkeeper extends Player {

    public Goalkeeper(String name, int age, int skillLevel, int fitnessLevel) {
        super(name, age, "Goalkeeper", skillLevel, fitnessLevel);
    }

    @Override
    public void displayInfo() {
        System.out.println("Goalkeeper: " + name + ", Age: " + age + ", Skill: " + skillLevel + ", Fitness: " + fitnessLevel);
    }

    public void saveGoal() {
        System.out.println(name + " has made an incredible save!");
    }
}
