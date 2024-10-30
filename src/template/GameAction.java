package template;

import state.CharacterInterface;

public interface GameAction {
    void executeAction();
    void setCharacter(CharacterInterface character);
}
