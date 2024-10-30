package template;

import state.CharacterInterface;

public class HealAction implements GameAction {
    private CharacterInterface character;

    public void setCharacter(CharacterInterface character) {
        this.character = character;
    }

    @Override
    public void executeAction() {
        System.out.println("Using healing skill. +10hp");
        character.setHp(character.getHp() + 10);
    }
}
