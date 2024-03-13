package oving5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.BinaryOperator;

public class BinaryComputingIterator implements Iterator<Double> {

    private final Iterator<Double> iterator1;
    private final Iterator<Double> iterator2;
    private final BinaryOperator<Double> operator;
    private final Double default1;
    private final Double default2;

    public BinaryComputingIterator(Iterator<Double> iterator1, Iterator<Double> iterator2,
            BinaryOperator<Double> operator) {
        this(iterator1, iterator2, null, null, operator);
    }

    public BinaryComputingIterator(Iterator<Double> iterator1, Iterator<Double> iterator2, Double default1,
            Double default2, BinaryOperator<Double> operator) {
        this.iterator1 = iterator1;
        this.iterator2 = iterator2;
        this.operator = operator;
        this.default1 = default1;
        this.default2 = default2;
    }

    public boolean hasNext() {
        return ((iterator1.hasNext() && (this.default2 != null)) || (iterator2.hasNext() && (this.default1 != null))
                || (iterator2.hasNext() && iterator1.hasNext()));
    }

    public Double next() {
        // skriv kode som får den til å sjekke om det skal brukes
        Double value1;
        Double value2;
        if (!iterator1.hasNext()) {
            value1 = default1;
        } else {
            value1 = iterator1.next();
        }
        if (!iterator2.hasNext()) {
            value2 = default2;
        } else {
            value2 = iterator2.next();
        }
        try {
            return operator.apply(value1, value2);
        } catch (NullPointerException e) {
            throw new NoSuchElementException("Binary result is null value");
        }
    }
}
