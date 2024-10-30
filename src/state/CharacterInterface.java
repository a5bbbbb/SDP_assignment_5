package state;

import strategy.FightingStrategyInterface;
import template.GameAction;
import visitor.EffectInterface;

public interface CharacterInterface {
    String getName();
    CharacterStateInterface getState();
    void setState(CharacterStateInterface state);
    void setStrategy(FightingStrategyInterface strategy);
    Integer getHp();
    void setHp(Integer hp);
    GameAction getSkill();
    void attack();
    void fightReady();
    void accept(EffectInterface effect);
    void useSkill();
}
