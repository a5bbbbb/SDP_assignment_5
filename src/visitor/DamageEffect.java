package visitor;

import state.CharacterInterface;
import state.DefeatedState;
import state.NormalState;
import state.PoweredUpState;

public class DamageEffect implements EffectInterface {
    private int damage;

    public DamageEffect(int damage) {
        this.damage = damage;
    }

    @Override
    public void apply(CharacterInterface character) {
        if (character.getState() instanceof DefeatedState) {
            System.out.println(character.getName() + " is defeated and cannot take damage.");
            return;
        }
        if (character.getState() instanceof PoweredUpState) {
            damage /= 2;
        }
        character.setHp(character.getHp() - damage);
        System.out.println(character.getName() + " has taken " + damage + " points of damage.");
        if (character.getState() instanceof PoweredUpState) {
            character.setState(new NormalState(character));
            System.out.println(character.getName() + "'s boost ended.");
        }
    }
}
