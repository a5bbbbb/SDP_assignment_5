package state;

public class NormalState implements CharacterStateInterface {
    private CharacterInterface context;

    public NormalState() {
    }

    public NormalState(CharacterInterface context) {
        this.context = context;
    }

    @Override
    public void attack() {
        System.out.println(context.getName() + " attacks with 5 damage from NormalState.");
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
