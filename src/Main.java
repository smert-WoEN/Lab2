import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Maractus("A", 10));
        b.addAlly(new Luxray("B", 10));
        b.addAlly(new Wooper("C", 10));
        b.addFoe(new Luxio("D", 10));
        b.addFoe(new Shinx("E", 10));
        b.addFoe(new Quagsire("F", 10));
        b.go();
    }
}
