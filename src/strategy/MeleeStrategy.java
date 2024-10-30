package strategy;

public class MeleeStrategy implements FightingStrategyInterface {
    @Override
    public void fight() {
        System.out.println("Choosing melee strategy.");
    }
}
