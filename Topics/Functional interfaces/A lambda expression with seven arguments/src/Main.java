import java.util.Locale;

class Seven {
    public static SeptenaryStringFunction fun = (a, b, c, d, e, f, g) -> a.toUpperCase(Locale.ROOT) + b.toUpperCase(Locale.ROOT) + c.toUpperCase(Locale.ROOT) + d.toUpperCase(Locale.ROOT) + e.toUpperCase(Locale.ROOT) + f.toUpperCase(Locale.ROOT) + g.toUpperCase(Locale.ROOT);
}

@FunctionalInterface
interface SeptenaryStringFunction {
    String apply(String s1, String s2, String s3, String s4, String s5, String s6, String s7);
}