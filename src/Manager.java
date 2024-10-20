class Manager extends Person {
    private Coach headCoach;

    public Manager(String name, int age, Coach headCoach) {
        super(name, age);
        this.headCoach = headCoach;
    }

    public void assignCoach(Coach newCoach) {
        this.headCoach = newCoach;
        System.out.println(name + " has assigned " + newCoach.name + " as the head coach.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager: " + name + ", Age: " + age);
    }
}