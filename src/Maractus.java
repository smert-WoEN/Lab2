import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Maractus extends Pokemon {
    public Maractus(String name, int level) {
        super(name, level);
        setStats(75, 86, 67, 106, 67, 60);
        setType(Type.GRASS);
        setMove(new Facade(), new IcePinch(), new IceWind(), new ShadowClaw());
    }
}
