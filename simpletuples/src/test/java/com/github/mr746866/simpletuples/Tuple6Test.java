package com.github.mr746866.simpletuples;


import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Timer;


public class Tuple6Test {

    //region equals(Object) tests

    @Test
    public void testEquals_nullValues_success() throws Exception {
        final Tuple6<Boolean, Integer, Double, String, BigDecimal, Date> aTuple6 =
            Tuple6.of(
                null,
                null,
                null,
                null,
                null,
                null);

        final Tuple6<Boolean, Integer, Double, String, BigDecimal, Date> bTuple6 =
            Tuple6.of(
                null,
                null,
                null,
                null,
                null,
                null);

        Assert.assertNotSame(aTuple6, bTuple6);
        Assert.assertTrue(aTuple6.equals(bTuple6) && bTuple6.equals(aTuple6));
        Assert.assertTrue(aTuple6.hashCode() == bTuple6.hashCode());
    }

    @Test
    public void testEquals_standardValues_success() throws Exception {
        final Tuple6<Boolean, Integer, Double, String, BigDecimal, Date> aTuple6;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");
            Date sixth = new Date(123456789);

            //noinspection ConstantConditions
            aTuple6 =
                Tuple6.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth);
        }

        final Tuple6<Boolean, Integer, Double, String, BigDecimal, Date> bTuple6;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");
            Date sixth = new Date(123456789);

            //noinspection ConstantConditions
            bTuple6 =
                Tuple6.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth);
        }

        Assert.assertNotSame(aTuple6, bTuple6);
        Assert.assertTrue(aTuple6.equals(bTuple6) && bTuple6.equals(aTuple6));
        Assert.assertTrue(aTuple6.hashCode() == bTuple6.hashCode());
    }

    @Test(expected = AssertionError.class)
    public void testEquals_unequalValues_fail() throws Exception {
        final Tuple6<Boolean, Integer, Double, String, BigDecimal, Date> aTuple6;
        {
            Boolean first = false;
            Integer second = 84;
            Double third = 4567.89;
            String fourth = "ab cd ef";
            BigDecimal fifth = new BigDecimal("1.23456789");
            Date sixth = new Date(987654321);

            //noinspection ConstantConditions
            aTuple6 =
                Tuple6.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth);
        }

        final Tuple6<Boolean, Integer, Double, String, BigDecimal, Date> bTuple6;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");
            Date sixth = new Date(123456789);

            //noinspection ConstantConditions
            bTuple6 =
                Tuple6.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth);
        }

        Assert.assertNotSame(aTuple6, bTuple6);
        Assert.assertTrue(aTuple6.equals(bTuple6) && bTuple6.equals(aTuple6));
        Assert.fail("Expected AssertionError.");
    }

    //endregion

    //region hashCode() tests

    @Test
    public void testHashCode_nullValues_success() throws Exception {
        final Tuple6<Boolean, Integer, Double, String, BigDecimal, Date> aTuple6 =
            Tuple6.of(
                null,
                null,
                null,
                null,
                null,
                null);

        final Tuple6<Boolean, Integer, Double, String, BigDecimal, Date> bTuple6 =
            Tuple6.of(
                null,
                null,
                null,
                null,
                null,
                null);

        Assert.assertNotSame(aTuple6, bTuple6);
        Assert.assertTrue(aTuple6.hashCode() == bTuple6.hashCode());
    }

    @Test
    public void testHashCode_contentBasedHashCodedValues_success() throws Exception {
        final Tuple6<Boolean, Integer, Double, String, BigDecimal, Date> aTuple6;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");
            Date sixth = new Date(123456789);

            //noinspection ConstantConditions
            aTuple6 =
                Tuple6.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth);
        }

        final Tuple6<Boolean, Integer, Double, String, BigDecimal, Date> bTuple6;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");
            Date sixth = new Date(123456789);

            //noinspection ConstantConditions
            bTuple6 =
                Tuple6.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth);
        }

        Assert.assertNotSame(aTuple6, bTuple6);
        Assert.assertTrue(aTuple6.hashCode() == bTuple6.hashCode());
    }

    @Test
    public void testHashCode_referenceBasedHashCodedValues_success() throws Exception {
        Object first = new Object();
        Timer second = new Timer("test");
        Random third = new Random(98765);
        int[] fourth = {-5, 0, 5};
        double[] fifth = {1.2, 2.3, 3.4};
        String[] sixth = {null, "", "abc"};

        final Tuple6<Object, Timer, Random, int[], double[], String[]> aTuple6 =
            Tuple6.of(
                first,
                second,
                third,
                fourth,
                fifth,
                sixth);

        final Tuple6<Object, Timer, Random, int[], double[], String[]> bTuple6 =
            Tuple6.of(
                first,
                second,
                third,
                fourth,
                fifth,
                sixth);

        Assert.assertNotSame(aTuple6, bTuple6);
        Assert.assertTrue(aTuple6.hashCode() == bTuple6.hashCode());
    }

    @Test(expected = AssertionError.class)
    public void testHashCode_unequalHashCodedValues_fail() throws Exception {
        final Tuple6<Boolean, Integer, Double, String, BigDecimal, Date> aTuple6;
        {
            Boolean first = false;
            Integer second = 84;
            Double third = 4567.89;
            String fourth = "ab cd ef";
            BigDecimal fifth = new BigDecimal("1.23456789");
            Date sixth = new Date(987654321);

            //noinspection ConstantConditions
            aTuple6 =
                Tuple6.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth);
        }

        final Tuple6<Boolean, Integer, Double, String, BigDecimal, Date> bTuple6;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");
            Date sixth = new Date(123456789);

            //noinspection ConstantConditions
            bTuple6 =
                Tuple6.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth);
        }

        Assert.assertNotSame(aTuple6, bTuple6);
        Assert.assertTrue(aTuple6.hashCode() == bTuple6.hashCode());
        Assert.fail("Expected AssertionError.");
    }

    //endregion

    //region toString() tests

    @Test
    public void testToString_nullValues_success() throws Exception {
        final Tuple6<Boolean, Integer, Double, String, BigDecimal, Date> tuple6 =
            Tuple6.of(
                null,
                null,
                null,
                null,
                null,
                null);

        String expected = "Tuple6{"
            + "first=null"
            + ", second=null"
            + ", third=null"
            + ", fourth=null"
            + ", fifth=null"
            + ", sixth=null"
            + "}";

        Assert.assertEquals(expected, tuple6.toString());
    }

    @Test
    public void testToString_standardValues_success() throws Exception {
        Integer first = Integer.MIN_VALUE;
        Float second = Float.NaN;
        Double third = Double.NEGATIVE_INFINITY;
        Character fourth = Character.MAX_VALUE;
        String fifth = "\u0000\t\n\uFFFF";
        Date sixth = new Date();

        final Tuple6<Integer, Float, Double, Character, String, Date> tuple6 =
            Tuple6.of(
                first,
                second,
                third,
                fourth,
                fifth,
                sixth);

        //noinspection RedundantStringToString
        String expected = "Tuple6{"
            + "first=" + first.toString()
            + ", second=" + second.toString()
            + ", third=" + third.toString()
            + ", fourth=" + fourth.toString()
            + ", fifth=" + fifth.toString()
            + ", sixth=" + sixth.toString()
            + "}";

        Assert.assertEquals(expected, tuple6.toString());
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
        Set<Integer> sixth = new HashSet<>();
        sixth.add(null);
        sixth.add(0);
        sixth.add(9876);

        final Tuple6<int[], List<Double>, double[][], Map<String, Object>, String[][], Set<Integer>> tuple6 =
            Tuple6.of(
                first,
                second,
                third,
                fourth,
                fifth,
                sixth);

        //noinspection ImplicitArrayToString
        String expected = "Tuple6{"
            + "first=" + first.toString()
            + ", second=" + second.toString()
            + ", third=" + third.toString()
            + ", fourth=" + fourth.toString()
            + ", fifth=" + fifth.toString()
            + ", sixth=" + sixth.toString()
            + "}";

        Assert.assertEquals(expected, tuple6.toString());
    }

    //endregion
}
