import ru.ifmo.se.pokemon.Type;

public class Luxio extends Shinx{
    public Luxio(String name, int level){
        super(name, level);
        setStats(60,65,49,60,49,60);
        setType(Type.ELECTRIC);
        setMove(new Rest(), new Flamethrower(), new ShadowBall());
    }
}
