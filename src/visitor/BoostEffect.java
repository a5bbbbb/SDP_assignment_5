package visitor;

import state.CharacterInterface;
import state.PoweredUpState;

public class BoostEffect implements EffectInterface {
    @Override
    public void apply(CharacterInterface character) {
        if (character.getState() instanceof PoweredUpState){
            System.out.println(character.getName() + " is already boosted, cannot apply boost.");
            return;
        }
        character.setState(new PoweredUpState(character));
        System.out.println(character.getName() + " is getting a boost from now!");
    }
}
