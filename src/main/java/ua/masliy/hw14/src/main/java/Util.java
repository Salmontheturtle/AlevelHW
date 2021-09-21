import java.util.List;

public class Util <T> implements Multiplier {
    T value;

    public void printHashCode(T value) {
        System.out.println("HashCode: " + value.hashCode());
    }

    public void save(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public <A extends Number> Number[] doubleValueIn(A[] array) {
        Number[] res = new Number[array.length];
        for (int i = 0; i < array.length; i++) {
            res[i] = array[i].doubleValue() * array[i].doubleValue();
        }
        return res;
    }

    public <N extends Number> void sum(N one, N two) { // should work only with numbers
        System.out.println(one.intValue() + two.intValue());
    }

    public double sumOfArray(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list) {
            s += n.doubleValue();
        }
        return s;
    }

    public void addNumbers(List<Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}

