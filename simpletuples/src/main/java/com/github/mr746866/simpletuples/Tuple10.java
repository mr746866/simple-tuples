package com.github.mr746866.simpletuples;


public final class Tuple10<A, B, C, D, E, F, G, H, I, J>
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
    public final J tenth;

    // MARK:

    public static <A, B, C, D, E, F, G, H, I, J> Tuple10<A, B, C, D, E, F, G, H, I, J> of(
        A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eighth, I ninth, J tenth)
    {
        return new Tuple10<>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth);
    }

    // MARK:

    private Tuple10(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eighth, I ninth, J tenth)
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
        this.tenth = tenth;
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

        final Tuple10<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple10 = (Tuple10<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;

        if (first != null ? !first.equals(tuple10.first) : tuple10.first != null)
        {
            return false;
        }
        if (second != null ? !second.equals(tuple10.second) : tuple10.second != null)
        {
            return false;
        }
        if (third != null ? !third.equals(tuple10.third) : tuple10.third != null)
        {
            return false;
        }
        if (fourth != null ? !fourth.equals(tuple10.fourth) : tuple10.fourth != null)
        {
            return false;
        }
        if (fifth != null ? !fifth.equals(tuple10.fifth) : tuple10.fifth != null)
        {
            return false;
        }
        if (sixth != null ? !sixth.equals(tuple10.sixth) : tuple10.sixth != null)
        {
            return false;
        }
        if (seventh != null ? !seventh.equals(tuple10.seventh) : tuple10.seventh != null)
        {
            return false;
        }
        if (eighth != null ? !eighth.equals(tuple10.eighth) : tuple10.eighth != null)
        {
            return false;
        }
        if (ninth != null ? !ninth.equals(tuple10.ninth) : tuple10.ninth != null)
        {
            return false;
        }
        return tenth != null ? tenth.equals(tuple10.tenth) : tuple10.tenth == null;
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
        result = 31 * result + (tenth != null ? tenth.hashCode() : 0);

        return result;
    }

    @Override
    public String toString()
    {
        return "Tuple10{"
            + "first=" + first
            + ", second=" + second
            + ", third=" + third
            + ", fourth=" + fourth
            + ", fifth=" + fifth
            + ", sixth=" + sixth
            + ", seventh=" + seventh
            + ", eighth=" + eighth
            + ", ninth=" + ninth
            + ", tenth=" + tenth
            + "}";
    }
}
