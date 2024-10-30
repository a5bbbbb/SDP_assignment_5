package state;

import strategy.FightingStrategyInterface;
import template.GameAction;
import visitor.AcceptsEffectsInterface;
import visitor.EffectInterface;

public class Character implements CharacterInterface, AcceptsEffectsInterface {
    private String name;
    private Integer hp;
    private CharacterStateInterface state;
    private FightingStrategyInterface strategy;
    private GameAction skill;

    public Character(String name, Integer hp, CharacterStateInterface state, FightingStrategyInterface strategy, GameAction skill) {
        this.name = name;
        this.hp = hp;
        this.state = state;
        state.setContext(this);
        this.strategy = strategy;
        this.skill = skill;
        skill.setCharacter(this);
    }

    public CharacterStateInterface getState() {
        return state;
    }

    public GameAction getSkill() {
        return skill;
    }

    public void setState(CharacterStateInterface state){
        this.state = state;
    }

    public void setStrategy(FightingStrategyInterface strategy) {
        this.strategy = strategy;
    }

    public void attack(){
        state.attack();
    }

    public void useSkill(){
        state.useSkill();
    }

    public void fightReady(){
        System.out.println(getName());
        strategy.fight();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void accept(EffectInterface effect) {
        effect.apply(this);
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
        checkHealth();
    }

    private void checkHealth(){
        if(hp <= 0) {
            setState(new DefeatedState(this));
            hp = 0;
        }
    }

}
