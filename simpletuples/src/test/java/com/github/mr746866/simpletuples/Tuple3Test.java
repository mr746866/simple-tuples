package com.github.mr746866.simpletuples;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;


public class Tuple3Test {

    //region equals(Object) tests

    @Test
    public void testEquals_nullValues_success() throws Exception {
        final Tuple3<Boolean, Integer, Double> aTuple3 =
            Tuple3.of(
                null,
                null,
                null);

        final Tuple3<Boolean, Integer, Double> bTuple3 =
            Tuple3.of(
                null,
                null,
                null);

        Assert.assertNotSame(aTuple3, bTuple3);
        Assert.assertTrue(aTuple3.equals(bTuple3) && bTuple3.equals(aTuple3));
        Assert.assertTrue(aTuple3.hashCode() == bTuple3.hashCode());
    }

    @Test
    public void testEquals_standardValues_success() throws Exception {
        final Tuple3<Boolean, Integer, Double> aTuple3;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;

            //noinspection ConstantConditions
            aTuple3 =
                Tuple3.of(
                    first,
                    second,
                    third);
        }

        final Tuple3<Boolean, Integer, Double> bTuple3;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;

            //noinspection ConstantConditions
            bTuple3 =
                Tuple3.of(
                    first,
                    second,
                    third);
        }

        Assert.assertNotSame(aTuple3, bTuple3);
        Assert.assertTrue(aTuple3.equals(bTuple3) && bTuple3.equals(aTuple3));
        Assert.assertTrue(aTuple3.hashCode() == bTuple3.hashCode());
    }

    @Test(expected = AssertionError.class)
    public void testEquals_unequalValues_fail() throws Exception {
        final Tuple3<Boolean, Integer, Double> aTuple3;
        {
            Boolean first = false;
            Integer second = 84;
            Double third = 4567.89;

            //noinspection ConstantConditions
            aTuple3 =
                Tuple3.of(
                    first,
                    second,
                    third);
        }

        final Tuple3<Boolean, Integer, Double> bTuple3;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;

            //noinspection ConstantConditions
            bTuple3 =
                Tuple3.of(
                    first,
                    second,
                    third);
        }

        Assert.assertNotSame(aTuple3, bTuple3);
        Assert.assertTrue(aTuple3.equals(bTuple3) && bTuple3.equals(aTuple3));
        Assert.fail("Expected AssertionError.");
    }

    //endregion

    //region hashCode() tests

    @Test
    public void testHashCode_nullValues_success() throws Exception {
        final Tuple3<Boolean, Integer, Double> aTuple3 =
            Tuple3.of(
                null,
                null,
                null);

        final Tuple3<Boolean, Integer, Double> bTuple3 =
            Tuple3.of(
                null,
                null,
                null);

        Assert.assertNotSame(aTuple3, bTuple3);
        Assert.assertTrue(aTuple3.hashCode() == bTuple3.hashCode());
    }

    @Test
    public void testHashCode_contentBasedHashCodedValues_success() throws Exception {
        final Tuple3<Boolean, Integer, Double> aTuple3;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;

            //noinspection ConstantConditions
            aTuple3 =
                Tuple3.of(
                    first,
                    second,
                    third);
        }

        final Tuple3<Boolean, Integer, Double> bTuple3;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;

            //noinspection ConstantConditions
            bTuple3 =
                Tuple3.of(
                    first,
                    second,
                    third);
        }

        Assert.assertNotSame(aTuple3, bTuple3);
        Assert.assertTrue(aTuple3.hashCode() == bTuple3.hashCode());
    }

    @Test
    public void testHashCode_referenceBasedHashCodedValues_success() throws Exception {
        Object first = new Object();
        Timer second = new Timer("test");
        Random third = new Random(98765);

        final Tuple3<Object, Timer, Random> aTuple3 =
            Tuple3.of(
                first,
                second,
                third);

        final Tuple3<Object, Timer, Random> bTuple3 =
            Tuple3.of(
                first,
                second,
                third);

        Assert.assertNotSame(aTuple3, bTuple3);
        Assert.assertTrue(aTuple3.hashCode() == bTuple3.hashCode());
    }

    @Test(expected = AssertionError.class)
    public void testHashCode_unequalHashCodedValues_fail() throws Exception {
        final Tuple3<Boolean, Integer, Double> aTuple3;
        {
            Boolean first = false;
            Integer second = 84;
            Double third = 4567.89;

            //noinspection ConstantConditions
            aTuple3 =
                Tuple3.of(
                    first,
                    second,
                    third);
        }

        final Tuple3<Boolean, Integer, Double> bTuple3;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;

            //noinspection ConstantConditions
            bTuple3 =
                Tuple3.of(
                    first,
                    second,
                    third);
        }

        Assert.assertNotSame(aTuple3, bTuple3);
        Assert.assertTrue(aTuple3.hashCode() == bTuple3.hashCode());
        Assert.fail("Expected AssertionError.");
    }

    //endregion

    //region toString() tests

    @Test
    public void testToString_nullValues_success() throws Exception {
        final Tuple3<Boolean, Integer, Double> tuple3 =
            Tuple3.of(
                null,
                null,
                null);

        String expected = "Tuple3{"
            + "first=null"
            + ", second=null"
            + ", third=null"
            + "}";

        Assert.assertEquals(expected, tuple3.toString());
    }

    @Test
    public void testToString_standardValues_success() throws Exception {
        Integer first = Integer.MIN_VALUE;
        Float second = Float.NaN;
        Double third = Double.NEGATIVE_INFINITY;

        final Tuple3<Integer, Float, Double> tuple3 =
            Tuple3.of(
                first,
                second,
                third);

        //noinspection RedundantStringToString
        String expected = "Tuple3{"
            + "first=" + first.toString()
            + ", second=" + second.toString()
            + ", third=" + third.toString()
            + "}";

        Assert.assertEquals(expected, tuple3.toString());
    }

    @Test
    public void testToString_collectionValues_success() throws Exception {
        int[] first = {2, 4, 6};
        List<Double> second = new ArrayList<>();
        second.add(null);
        second.add(135.79);
        double[][] third = {null, {}, {-432.1, 0, 123.4}};

        final Tuple3<int[], List<Double>, double[][]> tuple3 =
            Tuple3.of(
                first,
                second,
                third);

        //noinspection ImplicitArrayToString
        String expected = "Tuple3{"
            + "first=" + first.toString()
            + ", second=" + second.toString()
            + ", third=" + third.toString()
            + "}";

        Assert.assertEquals(expected, tuple3.toString());
    }

    //endregion
}
