package com.github.mr746866.simpletuples;


public final class Tuple2<A, B>
{
    public final A first;
    public final B second;

    // MARK:

    public static <A, B> Tuple2<A, B> of(A first, B second)
    {
        return new Tuple2<>(first, second);
    }

    // MARK:

    private Tuple2(A first, B second)
    {
        this.first = first;
        this.second = second;
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

        final Tuple2<?, ?> tuple2 = (Tuple2<?, ?>) o;

        if (first != null ? !first.equals(tuple2.first) : tuple2.first != null)
        {
            return false;
        }
        return second != null ? second.equals(tuple2.second) : tuple2.second == null;
    }

    @Override
    public int hashCode()
    {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);

        return result;
    }

    @Override
    public String toString()
    {
        return "Tuple2{"
            + "first=" + first
            + ", second=" + second
            + "}";
    }
}
