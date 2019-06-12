package staticdynamic;

public class Circle {

    private int radius;

    // wenn eine Variable als "final" (-endgueltig) deklariert ist, kann ihr Wert nicht geaendert werden.
    // wenn eine Variable als "static" (-statisch) deklariert ist, gehoert sie zur Klasse und nicht zum Objekt.
    private static final double PI = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double scope() {
        return 2 * PI * radius;
    }

}
