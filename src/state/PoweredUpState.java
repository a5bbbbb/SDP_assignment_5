package state;

public class PoweredUpState implements CharacterStateInterface {
    private CharacterInterface context;

    public PoweredUpState() {
    }

    public PoweredUpState(CharacterInterface context) {
        this.context = context;
    }

    @Override
    public void attack() {
        System.out.println(context.getName() + " attacks with 10 damage from a PoweredUpState.");
    }

    @Override
    public void setContext(CharacterInterface context) {
        this.context = context;
    }

    @Override
    public void useSkill() {
        context.getSkill().executeAction();
    }
}
