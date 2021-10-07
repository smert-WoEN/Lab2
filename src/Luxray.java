import ru.ifmo.se.pokemon.Type;

public class Luxray extends Luxio{
    public Luxray(String name, int level){
        super(name, level);
        setStats(80,120,79,95,79,70);
        setType(Type.ELECTRIC);
        setMove(new Rest(), new Flamethrower(), new ShadowBall(), new SteelWing());
    }
}
