import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class Analyze extends PrintStream {

    public Analyze(OutputStream out) {
        super(out);
    }

    @Override
    public void write(byte[] buf, int off, int len) {

        String str = new String(buf, off, len, StandardCharsets.UTF_8);
        if (str.contains("теряет сознание")) {
            str = str + " bahhh";
            buf = str.getBytes(StandardCharsets.UTF_8);
            len += 6;
        }
        super.write(buf, off, len);
    }
}
