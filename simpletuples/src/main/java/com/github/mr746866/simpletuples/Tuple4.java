package com.github.mr746866.simpletuples;


public final class Tuple4<A, B, C, D> {
    public final A first;
    public final B second;
    public final C third;
    public final D fourth;

    // MARK:

    public static <A, B, C, D> Tuple4<A, B, C, D> of(A first, B second, C third, D fourth) {
        return new Tuple4<>(first, second, third, fourth);
    }

    // MARK:

    private Tuple4(A first, B second, C third, D fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    // MARK:

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Tuple4<?, ?, ?, ?> tuple4 = (Tuple4<?, ?, ?, ?>) o;

        if (first != null ? !first.equals(tuple4.first) : tuple4.first != null) {
            return false;
        }

        if (second != null ? !second.equals(tuple4.second) : tuple4.second != null) {
            return false;
        }

        if (third != null ? !third.equals(tuple4.third) : tuple4.third != null) {
            return false;
        }

        return fourth != null ? fourth.equals(tuple4.fourth) : tuple4.fourth == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        result = 31 * result + (fourth != null ? fourth.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        return "Tuple4{"
            + "first=" + first
            + ", second=" + second
            + ", third=" + third
            + ", fourth=" + fourth
            + "}";
    }
}
