package com.github.mr746866.simpletuples;


public final class Tuple7<A, B, C, D, E, F, G> {
    public final A first;
    public final B second;
    public final C third;
    public final D fourth;
    public final E fifth;
    public final F sixth;
    public final G seventh;

    // MARK:

    public static <A, B, C, D, E, F, G> Tuple7<A, B, C, D, E, F, G> of(
        A first, B second, C third, D fourth, E fifth, F sixth, G seventh) {
        return new Tuple7<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    // MARK:

    private Tuple7(A first, B second, C third, D fourth, E fifth, F sixth, G seventh) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
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

        final Tuple7<?, ?, ?, ?, ?, ?, ?> tuple7 = (Tuple7<?, ?, ?, ?, ?, ?, ?>) o;

        if (first != null ? !first.equals(tuple7.first) : tuple7.first != null) {
            return false;
        }

        if (second != null ? !second.equals(tuple7.second) : tuple7.second != null) {
            return false;
        }

        if (third != null ? !third.equals(tuple7.third) : tuple7.third != null) {
            return false;
        }

        if (fourth != null ? !fourth.equals(tuple7.fourth) : tuple7.fourth != null) {
            return false;
        }

        if (fifth != null ? !fifth.equals(tuple7.fifth) : tuple7.fifth != null) {
            return false;
        }

        if (sixth != null ? !sixth.equals(tuple7.sixth) : tuple7.sixth != null) {
            return false;
        }

        return seventh != null ? seventh.equals(tuple7.seventh) : tuple7.seventh == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        result = 31 * result + (fourth != null ? fourth.hashCode() : 0);
        result = 31 * result + (fifth != null ? fifth.hashCode() : 0);
        result = 31 * result + (sixth != null ? sixth.hashCode() : 0);
        result = 31 * result + (seventh != null ? seventh.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        return "Tuple7{"
            + "first=" + first
            + ", second=" + second
            + ", third=" + third
            + ", fourth=" + fourth
            + ", fifth=" + fifth
            + ", sixth=" + sixth
            + ", seventh=" + seventh
            + "}";
    }
}
