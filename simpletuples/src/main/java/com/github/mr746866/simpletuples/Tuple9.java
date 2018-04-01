package com.github.mr746866.simpletuples;


public final class Tuple9<A, B, C, D, E, F, G, H, I>
{
    public final A first;
    public final B second;
    public final C third;
    public final D fourth;
    public final E fifth;
    public final F sixth;
    public final G seventh;
    public final H eighth;
    public final I ninth;

    // MARK:

    public static <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I> of(
        A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eighth, I ninth)
    {
        return new Tuple9<>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth);
    }

    // MARK:

    private Tuple9(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eighth, I ninth)
    {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eighth = eighth;
        this.ninth = ninth;
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

        final Tuple9<?, ?, ?, ?, ?, ?, ?, ?, ?> tuple9 = (Tuple9<?, ?, ?, ?, ?, ?, ?, ?, ?>) o;

        if (first != null ? !first.equals(tuple9.first) : tuple9.first != null)
        {
            return false;
        }
        if (second != null ? !second.equals(tuple9.second) : tuple9.second != null)
        {
            return false;
        }
        if (third != null ? !third.equals(tuple9.third) : tuple9.third != null)
        {
            return false;
        }
        if (fourth != null ? !fourth.equals(tuple9.fourth) : tuple9.fourth != null)
        {
            return false;
        }
        if (fifth != null ? !fifth.equals(tuple9.fifth) : tuple9.fifth != null)
        {
            return false;
        }
        if (sixth != null ? !sixth.equals(tuple9.sixth) : tuple9.sixth != null)
        {
            return false;
        }
        if (seventh != null ? !seventh.equals(tuple9.seventh) : tuple9.seventh != null)
        {
            return false;
        }
        if (eighth != null ? !eighth.equals(tuple9.eighth) : tuple9.eighth != null)
        {
            return false;
        }
        return ninth != null ? ninth.equals(tuple9.ninth) : tuple9.ninth == null;
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
        result = 31 * result + (ninth != null ? ninth.hashCode() : 0);

        return result;
    }

    @Override
    public String toString()
    {
        return "Tuple9{"
            + "first=" + first
            + ", second=" + second
            + ", third=" + third
            + ", fourth=" + fourth
            + ", fifth=" + fifth
            + ", sixth=" + sixth
            + ", seventh=" + seventh
            + ", eighth=" + eighth
            + ", ninth=" + ninth
            + "}";
    }
}
