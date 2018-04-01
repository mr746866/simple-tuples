package com.github.mr746866.simpletuples;


public final class Tuple8<A, B, C, D, E, F, G, H>
{
    public final A first;
    public final B second;
    public final C third;
    public final D fourth;
    public final E fifth;
    public final F sixth;
    public final G seventh;
    public final H eighth;

    // MARK:

    public static <A, B, C, D, E, F, G, H> Tuple8<A, B, C, D, E, F, G, H> of(
        A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eighth)
    {
        return new Tuple8<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    // MARK:

    private Tuple8(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eighth)
    {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eighth = eighth;
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

        final Tuple8<?, ?, ?, ?, ?, ?, ?, ?> tuple8 = (Tuple8<?, ?, ?, ?, ?, ?, ?, ?>) o;

        if (first != null ? !first.equals(tuple8.first) : tuple8.first != null)
        {
            return false;
        }
        if (second != null ? !second.equals(tuple8.second) : tuple8.second != null)
        {
            return false;
        }
        if (third != null ? !third.equals(tuple8.third) : tuple8.third != null)
        {
            return false;
        }
        if (fourth != null ? !fourth.equals(tuple8.fourth) : tuple8.fourth != null)
        {
            return false;
        }
        if (fifth != null ? !fifth.equals(tuple8.fifth) : tuple8.fifth != null)
        {
            return false;
        }
        if (sixth != null ? !sixth.equals(tuple8.sixth) : tuple8.sixth != null)
        {
            return false;
        }
        if (seventh != null ? !seventh.equals(tuple8.seventh) : tuple8.seventh != null)
        {
            return false;
        }
        return eighth != null ? eighth.equals(tuple8.eighth) : tuple8.eighth == null;
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
        result = 31 * result + (seventh != null ? seventh.hashCode() : 0);
        result = 31 * result + (eighth != null ? eighth.hashCode() : 0);

        return result;
    }

    @Override
    public String toString()
    {
        return "Tuple8{"
            + "first=" + first
            + ", second=" + second
            + ", third=" + third
            + ", fourth=" + fourth
            + ", fifth=" + fifth
            + ", sixth=" + sixth
            + ", seventh=" + seventh
            + ", eighth=" + eighth
            + "}";
    }
}
