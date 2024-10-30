package visitor;

import state.CharacterInterface;

public interface EffectInterface {
    void apply(CharacterInterface character);
}
