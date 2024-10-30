package template;

import state.CharacterInterface;

public class DefendAction implements GameAction {
    private CharacterInterface character;

    public void setCharacter(CharacterInterface character) {
        this.character = character;
    }

    @Override
    public void executeAction() {
        System.out.println("Using defending skill!");
    }
}
