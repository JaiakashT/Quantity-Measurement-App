import java.util.*;
/* =========================
   UC3, UC4, UC8: Length Unit
   ========================= */
enum LengthUnit {
    FEET(1.0),
    INCHES(1.0 / 12.0),
    YARDS(3.0),
    CENTIMETERS(1.0 / 30.48);

    private final double factor;

    LengthUnit(double factor) {
        this.factor = factor;
    }

    public double toBase(double value) {
        return value * factor;
    }

    public double fromBase(double base) {
        return base / factor;
    }
}

/* =========================
   UC3 → UC7 → UC8: QuantityLength
   ========================= */
class QuantityLength {

    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        if (unit == null || !Double.isFinite(value))
            throw new IllegalArgumentException("Invalid input");

        this.value = value;
        this.unit = unit;
    }

    private double toBase() {
        return unit.toBase(value);
    }

    /* UC1–UC4 Equality */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof QuantityLength)) return false;

        QuantityLength other = (QuantityLength) obj;
        return Math.abs(this.toBase() - other.toBase()) < 0.0001;
    }

    /* UC5 Conversion */
    public QuantityLength convertTo(LengthUnit target) {
        double base = toBase();
        return new QuantityLength(target.fromBase(base), target);
    }

    /* UC6 Addition */
    public QuantityLength add(QuantityLength other) {
        return add(other, this.unit);
    }

    /* UC7 Addition with target unit */
    public QuantityLength add(QuantityLength other, LengthUnit target) {
        double sum = this.toBase() + other.toBase();
        return new QuantityLength(target.fromBase(sum), target);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}

/* =========================
   UC9: Weight Unit
   ========================= */
enum WeightUnit {
    KILOGRAM(1.0),
    GRAM(0.001),
    POUND(0.453592);

    private final double factor;

    WeightUnit(double factor) {
        this.factor = factor;
    }

    public double toBase(double value) {
        return value * factor;
    }

    public double fromBase(double base) {
        return base / factor;
    }
}

/* =========================
   UC9: QuantityWeight
   ========================= */
class QuantityWeight {

    private final double value;
    private final WeightUnit unit;

    public QuantityWeight(double value, WeightUnit unit) {
        if (unit == null || !Double.isFinite(value))
            throw new IllegalArgumentException("Invalid input");

        this.value = value;
        this.unit = unit;
    }

    private double toBase() {
        return unit.toBase(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof QuantityWeight)) return false;

        QuantityWeight other = (QuantityWeight) obj;
        return Math.abs(this.toBase() - other.toBase()) < 0.0001;
    }

    public QuantityWeight add(QuantityWeight other) {
        double sum = this.toBase() + other.toBase();
        return new QuantityWeight(sum, WeightUnit.KILOGRAM);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}

/* =========================
   MAIN APPLICATION (UC1–UC9)
   ========================= */
public class QuantityMeasurementApp {

    public static void main(String[] args) {

        System.out.println("===== Quantity Measurement App =====");

        /* UC1 & UC2 */
        System.out.println("\nUC1 & UC2:");
        System.out.println(
                new QuantityLength(1, LengthUnit.FEET)
                        .equals(new QuantityLength(12, LengthUnit.INCHES))
        );

        /* UC3 & UC4 */
        System.out.println("\nUC3 & UC4:");
        System.out.println(
                new QuantityLength(1, LengthUnit.YARDS)
                        .equals(new QuantityLength(3, LengthUnit.FEET))
        );

        /* UC5 Conversion */
        System.out.println("\nUC5 Conversion:");
        System.out.println(
                new QuantityLength(1, LengthUnit.FEET)
                        .convertTo(LengthUnit.INCHES)
        );

        /* UC6 Addition */
        System.out.println("\nUC6 Add:");
        System.out.println(
                new QuantityLength(1, LengthUnit.FEET)
                        .add(new QuantityLength(12, LengthUnit.INCHES))
        );

        /* UC7 Addition with target */
        System.out.println("\nUC7 Add Target:");
        System.out.println(
                new QuantityLength(1, LengthUnit.FEET)
                        .add(new QuantityLength(12, LengthUnit.INCHES), LengthUnit.YARDS)
        );

        /* UC9 Weight */
        System.out.println("\nUC9 Weight:");
        System.out.println(
                new QuantityWeight(1, WeightUnit.KILOGRAM)
                        .equals(new QuantityWeight(1000, WeightUnit.GRAM))
        );

        System.out.println(
                new QuantityWeight(1, WeightUnit.KILOGRAM)
                        .add(new QuantityWeight(1000, WeightUnit.GRAM))
        );
    }
}