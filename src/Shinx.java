import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Shinx extends Pokemon {
    public Shinx(String name, int level){
        super(name, level);
        setStats(45, 65, 34, 40, 34, 45);
        setType(Type.ELECTRIC);
        setMove(new Rest(), new Flamethrower());
    }
}
