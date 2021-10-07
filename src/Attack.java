import ru.ifmo.se.pokemon.*;

class Facade extends PhysicalMove {
    protected Facade(){
        super(Type.NORMAL, 70, 100);
    }
}

class IcePinch extends PhysicalMove{
    protected IcePinch(){
        super(Type.ICE, 75, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) Effect.freeze(pokemon);
    }
}


class IceWind extends SpecialMove {
    protected IceWind(){
        super(Type.ICE, 55, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, -1);
    }
}

class ShadowClaw extends PhysicalMove{
    protected ShadowClaw(){
        super(Type.GHOST, 70, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        return 3 * super.calcCriticalHit(pokemon, pokemon1);
    }
}

class Swagger extends StatusMove{
    protected Swagger(){
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.ATTACK, 2);
        Effect.confuse(pokemon);
    }
}

class Confide extends StatusMove{
    protected Confide(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, -1);
    }
}

class ThunderWave extends StatusMove{
    protected ThunderWave(){
        super(Type.ELECTRIC, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.paralyze(pokemon);
        if (Math.random() < 0.25) pokemon.setMod(Stat.SPEED, -2);
    }
}

class EnergyBall extends SpecialMove{
    protected EnergyBall(){
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.1) pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
}

class Rest extends StatusMove{
    protected Rest(){
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect.sleep(pokemon);
        pokemon.restore();
    }
}

class Flamethrower extends SpecialMove{
    protected Flamethrower(){
        super(Type.FIRE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.1) Effect.burn(pokemon);
    }
}

class ShadowBall extends SpecialMove{
    protected ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.2) pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
}

class SteelWing extends PhysicalMove{
    protected SteelWing(){
        super(Type.STEEL, 70, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (Math.random() < 0.1) pokemon.setMod(Stat.DEFENSE, +1);
    }
}