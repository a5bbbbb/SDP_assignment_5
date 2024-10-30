package state;

public class DefeatedState implements CharacterStateInterface {
    private CharacterInterface context;

    public DefeatedState() {
    }

    public DefeatedState(CharacterInterface context) {
        this.context = context;
    }

    @Override
    public void attack() {
        System.out.println(context.getName() + " is defeated and cannot attack.");
    }

    @Override
    public void setContext(CharacterInterface context) {
        this.context = context;
    }

    @Override
    public void useSkill() {
        System.out.println(context.getName() + " is defeated and cannot use the skill.");
    }
}
