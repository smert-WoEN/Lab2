import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wooper extends Pokemon {
    public Wooper(String name, int level){
        super(name, level);
        setStats(55, 45, 45, 25, 25, 15);
        setType(Type.WATER, Type.GROUND);
        setMove(new Swagger(), new Confide(), new ThunderWave());
    }
}
