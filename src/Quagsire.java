import ru.ifmo.se.pokemon.Type;

public class Quagsire extends Wooper{
    public Quagsire(String name, int level){
        super(name, level);
        setStats(95, 85, 85, 65, 65, 35);
        setType(Type.WATER, Type.GROUND);
        setMove(new Swagger(), new Confide(), new ThunderWave(), new EnergyBall());
    }
}
