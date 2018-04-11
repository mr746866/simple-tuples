package com.github.mr746866.simpletuples;


import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;


public class Tuple5Test {

    //region equals(Object) tests

    @Test
    public void testEquals_nullValues_success() throws Exception {
        final Tuple5<Boolean, Integer, Double, String, BigDecimal> aTuple5 =
            Tuple5.of(
                null,
                null,
                null,
                null,
                null);

        final Tuple5<Boolean, Integer, Double, String, BigDecimal> bTuple5 =
            Tuple5.of(
                null,
                null,
                null,
                null,
                null);

        Assert.assertNotSame(aTuple5, bTuple5);
        Assert.assertTrue(aTuple5.equals(bTuple5) && bTuple5.equals(aTuple5));
        Assert.assertTrue(aTuple5.hashCode() == bTuple5.hashCode());
    }

    @Test
    public void testEquals_standardValues_success() throws Exception {
        final Tuple5<Boolean, Integer, Double, String, BigDecimal> aTuple5;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");

            //noinspection ConstantConditions
            aTuple5 =
                Tuple5.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth);
        }

        final Tuple5<Boolean, Integer, Double, String, BigDecimal> bTuple5;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");

            //noinspection ConstantConditions
            bTuple5 =
                Tuple5.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth);
        }

        Assert.assertNotSame(aTuple5, bTuple5);
        Assert.assertTrue(aTuple5.equals(bTuple5) && bTuple5.equals(aTuple5));
        Assert.assertTrue(aTuple5.hashCode() == bTuple5.hashCode());
    }

    @Test(expected = AssertionError.class)
    public void testEquals_unequalValues_fail() throws Exception {
        final Tuple5<Boolean, Integer, Double, String, BigDecimal> aTuple5;
        {
            Boolean first = false;
            Integer second = 84;
            Double third = 4567.89;
            String fourth = "ab cd ef";
            BigDecimal fifth = new BigDecimal("1.23456789");

            //noinspection ConstantConditions
            aTuple5 =
                Tuple5.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth);
        }

        final Tuple5<Boolean, Integer, Double, String, BigDecimal> bTuple5;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");

            //noinspection ConstantConditions
            bTuple5 =
                Tuple5.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth);
        }

        Assert.assertNotSame(aTuple5, bTuple5);
        Assert.assertTrue(aTuple5.equals(bTuple5) && bTuple5.equals(aTuple5));
        Assert.fail("Expected AssertionError.");
    }

    //endregion

    //region hashCode() tests

    @Test
    public void testHashCode_nullValues_success() throws Exception {
        final Tuple5<Boolean, Integer, Double, String, BigDecimal> aTuple5 =
            Tuple5.of(
                null,
                null,
                null,
                null,
                null);

        final Tuple5<Boolean, Integer, Double, String, BigDecimal> bTuple5 =
            Tuple5.of(
                null,
                null,
                null,
                null,
                null);

        Assert.assertNotSame(aTuple5, bTuple5);
        Assert.assertTrue(aTuple5.hashCode() == bTuple5.hashCode());
    }

    @Test
    public void testHashCode_contentBasedHashCodedValues_success() throws Exception {
        final Tuple5<Boolean, Integer, Double, String, BigDecimal> aTuple5;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");

            //noinspection ConstantConditions
            aTuple5 =
                Tuple5.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth);
        }

        final Tuple5<Boolean, Integer, Double, String, BigDecimal> bTuple5;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");

            //noinspection ConstantConditions
            bTuple5 =
                Tuple5.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth);
        }

        Assert.assertNotSame(aTuple5, bTuple5);
        Assert.assertTrue(aTuple5.hashCode() == bTuple5.hashCode());
    }

    @Test
    public void testHashCode_referenceBasedHashCodedValues_success() throws Exception {
        Object first = new Object();
        Timer second = new Timer("test");
        Random third = new Random(98765);
        int[] fourth = {-5, 0, 5};
        double[] fifth = {1.2, 2.3, 3.4};

        final Tuple5<Object, Timer, Random, int[], double[]> aTuple5 =
            Tuple5.of(
                first,
                second,
                third,
                fourth,
                fifth);

        final Tuple5<Object, Timer, Random, int[], double[]> bTuple5 =
            Tuple5.of(
                first,
                second,
                third,
                fourth,
                fifth);

        Assert.assertNotSame(aTuple5, bTuple5);
        Assert.assertTrue(aTuple5.hashCode() == bTuple5.hashCode());
    }

    @Test(expected = AssertionError.class)
    public void testHashCode_unequalHashCodedValues_fail() throws Exception {
        final Tuple5<Boolean, Integer, Double, String, BigDecimal> aTuple5;
        {
            Boolean first = false;
            Integer second = 84;
            Double third = 4567.89;
            String fourth = "ab cd ef";
            BigDecimal fifth = new BigDecimal("1.23456789");

            //noinspection ConstantConditions
            aTuple5 =
                Tuple5.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth);
        }

        final Tuple5<Boolean, Integer, Double, String, BigDecimal> bTuple5;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");

            //noinspection ConstantConditions
            bTuple5 =
                Tuple5.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth);
        }

        Assert.assertNotSame(aTuple5, bTuple5);
        Assert.assertTrue(aTuple5.hashCode() == bTuple5.hashCode());
        Assert.fail("Expected AssertionError.");
    }

    //endregion

    //region toString() tests

    @Test
    public void testToString_nullValues_success() throws Exception {
        final Tuple5<Boolean, Integer, Double, String, BigDecimal> tuple5 =
            Tuple5.of(
                null,
                null,
                null,
                null,
                null);

        String expected = "Tuple5{"
            + "first=null"
            + ", second=null"
            + ", third=null"
            + ", fourth=null"
            + ", fifth=null"
            + "}";

        Assert.assertEquals(expected, tuple5.toString());
    }

    @Test
    public void testToString_standardValues_success() throws Exception {
        Integer first = Integer.MIN_VALUE;
        Float second = Float.NaN;
        Double third = Double.NEGATIVE_INFINITY;
        Character fourth = Character.MAX_VALUE;
        String fifth = "\u0000\t\n\uFFFF";

        final Tuple5<Integer, Float, Double, Character, String> tuple5 =
            Tuple5.of(
                first,
                second,
                third,
                fourth,
                fifth);

        //noinspection RedundantStringToString
        String expected = "Tuple5{"
            + "first=" + first.toString()
            + ", second=" + second.toString()
            + ", third=" + third.toString()
            + ", fourth=" + fourth.toString()
            + ", fifth=" + fifth.toString()
            + "}";

        Assert.assertEquals(expected, tuple5.toString());
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
        String[][] fifth = {null, {}, {null}, {"abc", "def"}};

        final Tuple5<int[], List<Double>, double[][], Map<String, Object>, String[][]> tuple5 =
            Tuple5.of(
                first,
                second,
                third,
                fourth,
                fifth);

        //noinspection ImplicitArrayToString
        String expected = "Tuple5{"
            + "first=" + first.toString()
            + ", second=" + second.toString()
            + ", third=" + third.toString()
            + ", fourth=" + fourth.toString()
            + ", fifth=" + fifth.toString()
            + "}";

        Assert.assertEquals(expected, tuple5.toString());
    }

    //endregion
}
