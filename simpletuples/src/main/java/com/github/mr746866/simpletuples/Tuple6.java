package com.github.mr746866.simpletuples;


public final class Tuple6<A, B, C, D, E, F>
{
    public final A first;
    public final B second;
    public final C third;
    public final D fourth;
    public final E fifth;
    public final F sixth;

    // MARK:

    public static <A, B, C, D, E, F> Tuple6<A, B, C, D, E, F> of(A first, B second, C third, D fourth, E fifth, F sixth)
    {
        return new Tuple6<>(first, second, third, fourth, fifth, sixth);
    }

    // MARK:

    private Tuple6(A first, B second, C third, D fourth, E fifth, F sixth)
    {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
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

        final Tuple6<?, ?, ?, ?, ?, ?> tuple6 = (Tuple6<?, ?, ?, ?, ?, ?>) o;

        if (first != null ? !first.equals(tuple6.first) : tuple6.first != null)
        {
            return false;
        }
        if (second != null ? !second.equals(tuple6.second) : tuple6.second != null)
        {
            return false;
        }
        if (third != null ? !third.equals(tuple6.third) : tuple6.third != null)
        {
            return false;
        }
        if (fourth != null ? !fourth.equals(tuple6.fourth) : tuple6.fourth != null)
        {
            return false;
        }
        if (fifth != null ? !fifth.equals(tuple6.fifth) : tuple6.fifth != null)
        {
            return false;
        }
        return sixth != null ? sixth.equals(tuple6.sixth) : tuple6.sixth == null;
    }

    @Override
    public int hashCode()
    {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        result = 31 * result + (fourth != null ? fourth.hashCode() : 0);
        result = 31 * result + (fifth != null ? fifth.hashCode() : 0);
        result = 31 * result + (sixth != null ? sixth.hashCode() : 0);

        return result;
    }

    @Override
    public String toString()
    {
        return "Tuple6{"
            + "first=" + first
            + ", second=" + second
            + ", third=" + third
            + ", fourth=" + fourth
            + ", fifth=" + fifth
            + ", sixth=" + sixth
            + "}";
    }
}
