package strategy;

public class RangedStrategy implements FightingStrategyInterface {
    @Override
    public void fight() {
        System.out.println("Choosing ranged strategy.");
    }
}
