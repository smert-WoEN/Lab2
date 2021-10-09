import ru.ifmo.se.pokemon.Battle;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream out = new Analyze(System.out);
        System.setOut(out);
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
