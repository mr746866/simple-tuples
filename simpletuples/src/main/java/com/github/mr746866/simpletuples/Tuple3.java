package com.github.mr746866.simpletuples;


public final class Tuple3<A, B, C>
{
    public final A first;
    public final B second;
    public final C third;

    // MARK:

    public static <A, B, C> Tuple3<A, B, C> of(A first, B second, C third)
    {
        return new Tuple3<>(first, second, third);
    }

    // MARK:

    private Tuple3(A first, B second, C third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
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

        final Tuple3<?, ?, ?> tuple3 = (Tuple3<?, ?, ?>) o;

        if (first != null ? !first.equals(tuple3.first) : tuple3.first != null)
        {
            return false;
        }
        if (second != null ? !second.equals(tuple3.second) : tuple3.second != null)
        {
            return false;
        }
        return third != null ? third.equals(tuple3.third) : tuple3.third == null;
    }

    @Override
    public int hashCode()
    {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);

        return result;
    }

    @Override
    public String toString()
    {
        return "Tuple3{"
            + "first=" + first
            + ", second=" + second
            + ", third=" + third
            + "}";
    }
}
