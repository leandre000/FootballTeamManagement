
abstract class Player extends Person implements Playable {
    protected String position;
    protected int skillLevel;
    protected int fitnessLevel;

    public Player(String name, int age, String position, int skillLevel, int fitnessLevel) {
        super(name, age);
        this.position = position;
        this.skillLevel = skillLevel;
        this.fitnessLevel = fitnessLevel;
    }

    public void improveSkills() {
        skillLevel += 5;
        System.out.println(name + " has improved their skills to level " + skillLevel);
    }

    @Override
    public void playMatch() {
        System.out.println(name + " is playing as " + position + " with skill level " + skillLevel);
    }
}
