package com.github.mr746866.simpletuples;


public final class Tuple5<A, B, C, D, E>
{
    public final A first;
    public final B second;
    public final C third;
    public final D fourth;
    public final E fifth;

    // MARK:

    public static <A, B, C, D, E> Tuple5<A, B, C, D, E> of(A first, B second, C third, D fourth, E fifth)
    {
        return new Tuple5<>(first, second, third, fourth, fifth);
    }

    // MARK:

    private Tuple5(A first, B second, C third, D fourth, E fifth)
    {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
    }

    // MARK:

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        final Tuple5<?, ?, ?, ?, ?> tuple5 = (Tuple5<?, ?, ?, ?, ?>) o;

        if (first != null ? !first.equals(tuple5.first) : tuple5.first != null)
        {
            return false;
        }
        if (second != null ? !second.equals(tuple5.second) : tuple5.second != null)
        {
            return false;
        }
        if (third != null ? !third.equals(tuple5.third) : tuple5.third != null)
        {
            return false;
        }
        if (fourth != null ? !fourth.equals(tuple5.fourth) : tuple5.fourth != null)
        {
            return false;
        }
        return fifth != null ? fifth.equals(tuple5.fifth) : tuple5.fifth == null;
    }

    @Override
    public int hashCode()
    {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        result = 31 * result + (fourth != null ? fourth.hashCode() : 0);
        result = 31 * result + (fifth != null ? fifth.hashCode() : 0);

        return result;
    }

    @Override
    public String toString()
    {
        return "Tuple5{"
            + "first=" + first
            + ", second=" + second
            + ", third=" + third
            + ", fourth=" + fourth
            + ", fifth=" + fifth
            + "}";
    }
}
