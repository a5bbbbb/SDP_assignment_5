package template;

import state.CharacterInterface;

public class AttackAction implements GameAction {
    private CharacterInterface character;

    public void setCharacter(CharacterInterface character) {
        this.character = character;
    }

    @Override
    public void executeAction() {
        System.out.println("Using attacking skill!");
    }
}
