public class FootballManagementApp {
    public static void main(String[] args) {

        Striker striker = new Striker("Leandre", 25, 85, 90);
        Goalkeeper goalkeeper = new Goalkeeper("Honore", 29, 88, 85);


        FitnessCoach fitnessCoach = new FitnessCoach("Chael", 40);
        TacticalCoach tacticalCoach = new TacticalCoach("Bonheur", 45);


        Manager manager = new Manager("Bahati", 55, tacticalCoach);


        Team team = new Team("Year2B");
        team.addPlayer(striker);
        team.addPlayer(goalkeeper);


        team.setStrategy(new OffensiveStrategy());


        striker.displayInfo();
        goalkeeper.displayInfo();
        fitnessCoach.displayInfo();
        tacticalCoach.displayInfo();
        manager.displayInfo();


        fitnessCoach.train();
        tacticalCoach.train();
        team.playGame();
    }
}
