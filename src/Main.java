import state.Character;
import state.CharacterInterface;
import state.NormalState;
import strategy.MagicStrategy;
import strategy.MeleeStrategy;
import strategy.RangedStrategy;
import template.AttackAction;
import template.DefendAction;
import template.HealAction;
import visitor.BoostEffect;
import visitor.DamageEffect;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        CharacterInterface dd = new Character("Fighter", 100, new NormalState(), new MeleeStrategy(), new AttackAction());
        CharacterInterface tank = new Character("Tank", 200, new NormalState(), new MeleeStrategy(), new DefendAction());
        CharacterInterface mage = new Character("Mage", 60, new NormalState(), new MagicStrategy(), new HealAction());
        CharacterInterface archer = new Character("Archer", 60, new NormalState(), new RangedStrategy(), new HealAction());
        ArrayList<CharacterInterface> party = new ArrayList<>();
        party.add(dd);
        party.add(tank);
        party.add(mage);
        party.add(archer);

        party.forEach(CharacterInterface::fightReady);
        System.out.println();
        party.forEach(CharacterInterface::attack);
        System.out.println();
        party.forEach(CharacterInterface::useSkill);
        System.out.println();
        for (CharacterInterface ch : party){
            System.out.println(ch.getName() + " hp = " + ch.getHp());
        }
        for (CharacterInterface ch : party){
            ch.accept(new BoostEffect());
        }

        dd.setStrategy(new MagicStrategy());
        party.forEach(CharacterInterface::fightReady);
        System.out.println();

        party.forEach(CharacterInterface::attack);
        System.out.println();

        for (CharacterInterface ch : party){
            ch.accept(new DamageEffect(20));
        }
        for (CharacterInterface ch : party){
            System.out.println(ch.getName() + " hp = " + ch.getHp());
        }

        for (CharacterInterface ch : party){
            ch.accept(new DamageEffect(60));
        }
        party.forEach(CharacterInterface::attack);

    }
}
