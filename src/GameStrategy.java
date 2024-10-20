interface GameStrategy {
    void execute();
}

class OffensiveStrategy implements GameStrategy {
    @Override
    public void execute() {
        System.out.println("Playing with an offensive strategy: Focus on attacking and scoring goals.");
    }
}

class DefensiveStrategy implements GameStrategy {
    @Override
    public void execute() {
        System.out.println("Playing with a defensive strategy: Focus on defending and keeping a clean sheet.");
    }
}