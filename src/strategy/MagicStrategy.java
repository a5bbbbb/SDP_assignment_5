package strategy;

public class MagicStrategy implements FightingStrategyInterface {
    @Override
    public void fight() {
        System.out.println("Choosing magic strategy.");
    }
}
