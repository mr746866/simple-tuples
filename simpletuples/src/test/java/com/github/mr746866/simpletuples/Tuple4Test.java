package com.github.mr746866.simpletuples;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;


public class Tuple4Test {

    //region equals(Object) tests

    @Test
    public void testEquals_nullValues_success() throws Exception {
        final Tuple4<Boolean, Integer, Double, String> aTuple4 =
            Tuple4.of(
                null,
                null,
                null,
                null);

        final Tuple4<Boolean, Integer, Double, String> bTuple4 =
            Tuple4.of(
                null,
                null,
                null,
                null);

        Assert.assertNotSame(aTuple4, bTuple4);
        Assert.assertTrue(aTuple4.equals(bTuple4) && bTuple4.equals(aTuple4));
        Assert.assertTrue(aTuple4.hashCode() == bTuple4.hashCode());
    }

    @Test
    public void testEquals_standardValues_success() throws Exception {
        final Tuple4<Boolean, Integer, Double, String> aTuple4;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";

            //noinspection ConstantConditions
            aTuple4 =
                Tuple4.of(
                    first,
                    second,
                    third,
                    fourth);
        }

        final Tuple4<Boolean, Integer, Double, String> bTuple4;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";

            //noinspection ConstantConditions
            bTuple4 =
                Tuple4.of(
                    first,
                    second,
                    third,
                    fourth);
        }

        Assert.assertNotSame(aTuple4, bTuple4);
        Assert.assertTrue(aTuple4.equals(bTuple4) && bTuple4.equals(aTuple4));
        Assert.assertTrue(aTuple4.hashCode() == bTuple4.hashCode());
    }

    @Test(expected = AssertionError.class)
    public void testEquals_unequalValues_fail() throws Exception {
        final Tuple4<Boolean, Integer, Double, String> aTuple4;
        {
            Boolean first = false;
            Integer second = 84;
            Double third = 4567.89;
            String fourth = "ab cd ef";

            //noinspection ConstantConditions
            aTuple4 =
                Tuple4.of(
                    first,
                    second,
                    third,
                    fourth);
        }

        final Tuple4<Boolean, Integer, Double, String> bTuple4;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";

            //noinspection ConstantConditions
            bTuple4 =
                Tuple4.of(
                    first,
                    second,
                    third,
                    fourth);
        }

        Assert.assertNotSame(aTuple4, bTuple4);
        Assert.assertTrue(aTuple4.equals(bTuple4) && bTuple4.equals(aTuple4));
        Assert.fail("Expected AssertionError.");
    }

    //endregion

    //region hashCode() tests

    @Test
    public void testHashCode_nullValues_success() throws Exception {
        final Tuple4<Boolean, Integer, Double, String> aTuple4 =
            Tuple4.of(
                null,
                null,
                null,
                null);

        final Tuple4<Boolean, Integer, Double, String> bTuple4 =
            Tuple4.of(
                null,
                null,
                null,
                null);

        Assert.assertNotSame(aTuple4, bTuple4);
        Assert.assertTrue(aTuple4.hashCode() == bTuple4.hashCode());
    }

    @Test
    public void testHashCode_contentBasedHashCodedValues_success() throws Exception {
        final Tuple4<Boolean, Integer, Double, String> aTuple4;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";

            //noinspection ConstantConditions
            aTuple4 =
                Tuple4.of(
                    first,
                    second,
                    third,
                    fourth);
        }

        final Tuple4<Boolean, Integer, Double, String> bTuple4;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";

            //noinspection ConstantConditions
            bTuple4 =
                Tuple4.of(
                    first,
                    second,
                    third,
                    fourth);
        }

        Assert.assertNotSame(aTuple4, bTuple4);
        Assert.assertTrue(aTuple4.hashCode() == bTuple4.hashCode());
    }

    @Test
    public void testHashCode_referenceBasedHashCodedValues_success() throws Exception {
        Object first = new Object();
        Timer second = new Timer("test");
        Random third = new Random(98765);
        int[] fourth = {-5, 0, 5};

        final Tuple4<Object, Timer, Random, int[]> aTuple4 =
            Tuple4.of(
                first,
                second,
                third,
                fourth);

        final Tuple4<Object, Timer, Random, int[]> bTuple4 =
            Tuple4.of(
                first,
                second,
                third,
                fourth);

        Assert.assertNotSame(aTuple4, bTuple4);
        Assert.assertTrue(aTuple4.hashCode() == bTuple4.hashCode());
    }

    @Test(expected = AssertionError.class)
    public void testHashCode_unequalHashCodedValues_fail() throws Exception {
        final Tuple4<Boolean, Integer, Double, String> aTuple4;
        {
            Boolean first = false;
            Integer second = 84;
            Double third = 4567.89;
            String fourth = "ab cd ef";

            //noinspection ConstantConditions
            aTuple4 =
                Tuple4.of(
                    first,
                    second,
                    third,
                    fourth);
        }

        final Tuple4<Boolean, Integer, Double, String> bTuple4;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";

            //noinspection ConstantConditions
            bTuple4 =
                Tuple4.of(
                    first,
                    second,
                    third,
                    fourth);
        }

        Assert.assertNotSame(aTuple4, bTuple4);
        Assert.assertTrue(aTuple4.hashCode() == bTuple4.hashCode());
        Assert.fail("Expected AssertionError.");
    }

    //endregion

    //region toString() tests

    @Test
    public void testToString_nullValues_success() throws Exception {
        final Tuple4<Boolean, Integer, Double, String> tuple4 =
            Tuple4.of(
                null,
                null,
                null,
                null);

        String expected = "Tuple4{"
            + "first=null"
            + ", second=null"
            + ", third=null"
            + ", fourth=null"
            + "}";

        Assert.assertEquals(expected, tuple4.toString());
    }

    @Test
    public void testToString_standardValues_success() throws Exception {
        Integer first = Integer.MIN_VALUE;
        Float second = Float.NaN;
        Double third = Double.NEGATIVE_INFINITY;
        Character fourth = Character.MAX_VALUE;

        final Tuple4<Integer, Float, Double, Character> tuple4 =
            Tuple4.of(
                first,
                second,
                third,
                fourth);

        //noinspection RedundantStringToString
        String expected = "Tuple4{"
            + "first=" + first.toString()
            + ", second=" + second.toString()
            + ", third=" + third.toString()
            + ", fourth=" + fourth.toString()
            + "}";

        Assert.assertEquals(expected, tuple4.toString());
    }

    @Test
    public void testToString_collectionValues_success() throws Exception {
        int[] first = {2, 4, 6};
        List<Double> second = new ArrayList<>();
        second.add(null);
        second.add(135.79);
        double[][] third = {null, {}, {-432.1, 0, 123.4}};
        Map<String, Object> fourth = new HashMap<>();
        fourth.put(null, null);
        fourth.put("true", true);
        fourth.put("thirty", 30.0);

        final Tuple4<int[], List<Double>, double[][], Map<String, Object>> tuple4 =
            Tuple4.of(
                first,
                second,
                third,
                fourth);

        //noinspection ImplicitArrayToString
        String expected = "Tuple4{"
            + "first=" + first.toString()
            + ", second=" + second.toString()
            + ", third=" + third.toString()
            + ", fourth=" + fourth.toString()
            + "}";

        Assert.assertEquals(expected, tuple4.toString());
    }

    //endregion
}
