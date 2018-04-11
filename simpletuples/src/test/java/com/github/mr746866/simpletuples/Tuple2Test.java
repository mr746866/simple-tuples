package com.github.mr746866.simpletuples;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;


public class Tuple2Test {

    //region equals(Object) tests

    @Test
    public void testEquals_nullValues_success() throws Exception {
        final Tuple2<Boolean, Integer> aTuple2 =
            Tuple2.of(
                null,
                null);

        final Tuple2<Boolean, Integer> bTuple2 =
            Tuple2.of(
                null,
                null);

        Assert.assertNotSame(aTuple2, bTuple2);
        Assert.assertTrue(aTuple2.equals(bTuple2) && bTuple2.equals(aTuple2));
        Assert.assertTrue(aTuple2.hashCode() == bTuple2.hashCode());
    }

    @Test
    public void testEquals_standardValues_success() throws Exception {
        final Tuple2<Boolean, Integer> aTuple2;
        {
            Boolean first = true;
            Integer second = 57;

            //noinspection ConstantConditions
            aTuple2 =
                Tuple2.of(
                    first,
                    second);
        }

        final Tuple2<Boolean, Integer> bTuple2;
        {
            Boolean first = true;
            Integer second = 57;

            //noinspection ConstantConditions
            bTuple2 =
                Tuple2.of(
                    first,
                    second);
        }

        Assert.assertNotSame(aTuple2, bTuple2);
        Assert.assertTrue(aTuple2.equals(bTuple2) && bTuple2.equals(aTuple2));
        Assert.assertTrue(aTuple2.hashCode() == bTuple2.hashCode());
    }

    @Test(expected = AssertionError.class)
    public void testEquals_unequalValues_fail() throws Exception {
        final Tuple2<Boolean, Integer> aTuple2;
        {
            Boolean first = false;
            Integer second = 84;

            //noinspection ConstantConditions
            aTuple2 =
                Tuple2.of(
                    first,
                    second);
        }

        final Tuple2<Boolean, Integer> bTuple2;
        {
            Boolean first = true;
            Integer second = 57;

            //noinspection ConstantConditions
            bTuple2 =
                Tuple2.of(
                    first,
                    second);
        }

        Assert.assertNotSame(aTuple2, bTuple2);
        Assert.assertTrue(aTuple2.equals(bTuple2) && bTuple2.equals(aTuple2));
        Assert.fail("Expected AssertionError.");
    }

    //endregion

    //region hashCode() tests

    @Test
    public void testHashCode_nullValues_success() throws Exception {
        final Tuple2<Boolean, Integer> aTuple2 =
            Tuple2.of(
                null,
                null);

        final Tuple2<Boolean, Integer> bTuple2 =
            Tuple2.of(
                null,
                null);

        Assert.assertNotSame(aTuple2, bTuple2);
        Assert.assertTrue(aTuple2.hashCode() == bTuple2.hashCode());
    }

    @Test
    public void testHashCode_contentBasedHashCodedValues_success() throws Exception {
        final Tuple2<Boolean, Integer> aTuple2;
        {
            Boolean first = true;
            Integer second = 57;

            //noinspection ConstantConditions
            aTuple2 =
                Tuple2.of(
                    first,
                    second);
        }

        final Tuple2<Boolean, Integer> bTuple2;
        {
            Boolean first = true;
            Integer second = 57;

            //noinspection ConstantConditions
            bTuple2 =
                Tuple2.of(
                    first,
                    second);
        }

        Assert.assertNotSame(aTuple2, bTuple2);
        Assert.assertTrue(aTuple2.hashCode() == bTuple2.hashCode());
    }

    @Test
    public void testHashCode_referenceBasedHashCodedValues_success() throws Exception {
        Object first = new Object();
        Timer second = new Timer("test");

        final Tuple2<Object, Timer> aTuple2 =
            Tuple2.of(
                first,
                second);

        final Tuple2<Object, Timer> bTuple2 =
            Tuple2.of(
                first,
                second);

        Assert.assertNotSame(aTuple2, bTuple2);
        Assert.assertTrue(aTuple2.hashCode() == bTuple2.hashCode());
    }

    @Test(expected = AssertionError.class)
    public void testHashCode_unequalHashCodedValues_fail() throws Exception {
        final Tuple2<Boolean, Integer> aTuple2;
        {
            Boolean first = false;
            Integer second = 84;

            //noinspection ConstantConditions
            aTuple2 =
                Tuple2.of(
                    first,
                    second);
        }

        final Tuple2<Boolean, Integer> bTuple2;
        {
            Boolean first = true;
            Integer second = 57;

            //noinspection ConstantConditions
            bTuple2 =
                Tuple2.of(
                    first,
                    second);
        }

        Assert.assertNotSame(aTuple2, bTuple2);
        Assert.assertTrue(aTuple2.hashCode() == bTuple2.hashCode());
        Assert.fail("Expected AssertionError.");
    }

    //endregion

    //region toString() tests

    @Test
    public void testToString_nullValues_success() throws Exception {
        final Tuple2<Boolean, Integer> tuple2 =
            Tuple2.of(
                null,
                null);

        String expected = "Tuple2{"
            + "first=null"
            + ", second=null"
            + "}";

        Assert.assertEquals(expected, tuple2.toString());
    }

    @Test
    public void testToString_standardValues_success() throws Exception {
        Integer first = Integer.MIN_VALUE;
        Float second = Float.NaN;

        final Tuple2<Integer, Float> tuple2 =
            Tuple2.of(
                first,
                second);

        //noinspection RedundantStringToString
        String expected = "Tuple2{"
            + "first=" + first.toString()
            + ", second=" + second.toString()
            + "}";

        Assert.assertEquals(expected, tuple2.toString());
    }

    @Test
    public void testToString_collectionValues_success() throws Exception {
        int[] first = {2, 4, 6};
        List<Double> second = new ArrayList<>();
        second.add(null);
        second.add(135.79);

        final Tuple2<int[], List<Double>> tuple2 =
            Tuple2.of(
                first,
                second);

        //noinspection ImplicitArrayToString
        String expected = "Tuple2{"
            + "first=" + first.toString()
            + ", second=" + second.toString()
            + "}";

        Assert.assertEquals(expected, tuple2.toString());
    }

    //endregion
}
