package com.github.mr746866.simpletuples;


import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Timer;
import java.util.UUID;


public class Tuple9Test {

    //region equals(Object) tests

    @Test
    public void testEquals_nullValues_success() throws Exception {
        final Tuple9<Boolean, Integer, Double, String, BigDecimal, Date, URI,
            List<Integer>, Map<String, Object>> aTuple9 =
            Tuple9.of(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null);

        final Tuple9<Boolean, Integer, Double, String, BigDecimal, Date, URI,
            List<Integer>, Map<String, Object>> bTuple9 =
            Tuple9.of(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null);

        Assert.assertNotSame(aTuple9, bTuple9);
        Assert.assertTrue(aTuple9.equals(bTuple9) && bTuple9.equals(aTuple9));
        Assert.assertTrue(aTuple9.hashCode() == bTuple9.hashCode());
    }

    @Test
    public void testEquals_standardValues_success() throws Exception {
        final Tuple9<Boolean, Integer, Double, String, BigDecimal, Date, URI,
            List<Integer>, Map<String, Object>> aTuple9;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");
            Date sixth = new Date(123456789);
            URI seventh = URI.create("http://www.google.com");
            List<Integer> eighth = new ArrayList<>();
            eighth.add(123);
            eighth.add(321);
            Map<String, Object> ninth = new HashMap<>();
            ninth.put("fifteen", 15);
            ninth.put("half", 0.5);

            //noinspection ConstantConditions
            aTuple9 =
                Tuple9.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth,
                    seventh,
                    eighth,
                    ninth);
        }

        final Tuple9<Boolean, Integer, Double, String, BigDecimal, Date, URI,
            List<Integer>, Map<String, Object>> bTuple9;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");
            Date sixth = new Date(123456789);
            URI seventh = URI.create("http://www.google.com");
            List<Integer> eighth = new ArrayList<>();
            eighth.add(123);
            eighth.add(321);
            Map<String, Object> ninth = new HashMap<>();
            ninth.put("fifteen", 15);
            ninth.put("half", 0.5);

            //noinspection ConstantConditions
            bTuple9 =
                Tuple9.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth,
                    seventh,
                    eighth,
                    ninth);
        }

        Assert.assertNotSame(aTuple9, bTuple9);
        Assert.assertTrue(aTuple9.equals(bTuple9) && bTuple9.equals(aTuple9));
        Assert.assertTrue(aTuple9.hashCode() == bTuple9.hashCode());
    }

    @Test(expected = AssertionError.class)
    public void testEquals_unequalValues_fail() throws Exception {
        final Tuple9<Boolean, Integer, Double, String, BigDecimal, Date, URI,
            List<Integer>, Map<String, Object>> aTuple9;
        {
            Boolean first = false;
            Integer second = 84;
            Double third = 4567.89;
            String fourth = "ab cd ef";
            BigDecimal fifth = new BigDecimal("1.23456789");
            Date sixth = new Date(987654321);
            URI seventh = URI.create("http://www.facebook.com");
            List<Integer> eighth = new ArrayList<>();
            eighth.add(12);
            eighth.add(34);
            Map<String, Object> ninth = new HashMap<>();
            ninth.put("five", 5.0);
            ninth.put("quarter", 0.25);

            //noinspection ConstantConditions
            aTuple9 =
                Tuple9.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth,
                    seventh,
                    eighth,
                    ninth);
        }

        final Tuple9<Boolean, Integer, Double, String, BigDecimal, Date, URI,
            List<Integer>, Map<String, Object>> bTuple9;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");
            Date sixth = new Date(123456789);
            URI seventh = URI.create("http://www.google.com");
            List<Integer> eighth = new ArrayList<>();
            eighth.add(123);
            eighth.add(321);
            Map<String, Object> ninth = new HashMap<>();
            ninth.put("fifteen", 15);
            ninth.put("half", 0.5);

            //noinspection ConstantConditions
            bTuple9 =
                Tuple9.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth,
                    seventh,
                    eighth,
                    ninth);
        }

        Assert.assertNotSame(aTuple9, bTuple9);
        Assert.assertTrue(aTuple9.equals(bTuple9) && bTuple9.equals(aTuple9));
        Assert.fail("Expected AssertionError.");
    }

    //endregion

    //region hashCode() tests

    @Test
    public void testHashCode_nullValues_success() throws Exception {
        final Tuple9<Boolean, Integer, Double, String, BigDecimal, Date, URI,
            List<Integer>, Map<String, Object>> aTuple9 =
            Tuple9.of(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null);

        final Tuple9<Boolean, Integer, Double, String, BigDecimal, Date, URI,
            List<Integer>, Map<String, Object>> bTuple9 =
            Tuple9.of(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null);

        Assert.assertNotSame(aTuple9, bTuple9);
        Assert.assertTrue(aTuple9.hashCode() == bTuple9.hashCode());
    }

    @Test
    public void testHashCode_contentBasedHashCodedValues_success() throws Exception {
        final Tuple9<Boolean, Integer, Double, String, BigDecimal, Date, URI,
            List<Integer>, Map<String, Object>> aTuple9;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");
            Date sixth = new Date(123456789);
            URI seventh = URI.create("http://www.google.com");
            List<Integer> eighth = new ArrayList<>();
            eighth.add(123);
            eighth.add(321);
            Map<String, Object> ninth = new HashMap<>();
            ninth.put("fifteen", 15);
            ninth.put("half", 0.5);

            //noinspection ConstantConditions
            aTuple9 =
                Tuple9.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth,
                    seventh,
                    eighth,
                    ninth);
        }

        final Tuple9<Boolean, Integer, Double, String, BigDecimal, Date, URI,
            List<Integer>, Map<String, Object>> bTuple9;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");
            Date sixth = new Date(123456789);
            URI seventh = URI.create("http://www.google.com");
            List<Integer> eighth = new ArrayList<>();
            eighth.add(123);
            eighth.add(321);
            Map<String, Object> ninth = new HashMap<>();
            ninth.put("fifteen", 15);
            ninth.put("half", 0.5);

            //noinspection ConstantConditions
            bTuple9 =
                Tuple9.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth,
                    seventh,
                    eighth,
                    ninth);
        }

        Assert.assertNotSame(aTuple9, bTuple9);
        Assert.assertTrue(aTuple9.hashCode() == bTuple9.hashCode());
    }

    @Test
    public void testHashCode_referenceBasedHashCodedValues_success() throws Exception {
        Object first = new Object();
        Timer second = new Timer("test");
        Random third = new Random(98765);
        int[] fourth = {-5, 0, 5};
        double[] fifth = {1.2, 2.3, 3.4};
        String[] sixth = {null, "", "abc"};
        Object[] seventh = {"three", 4, 5.0, new Date(6)};
        int[][] eighth = {{}, {1}, {2, 3}};
        double[][] ninth = {{11.11, 12.12}, {21.21, 22.22}};

        final Tuple9<Object, Timer, Random, int[], double[], String[], Object[],
            int[][], double[][]> aTuple9 =
            Tuple9.of(
                first,
                second,
                third,
                fourth,
                fifth,
                sixth,
                seventh,
                eighth,
                ninth);

        final Tuple9<Object, Timer, Random, int[], double[], String[], Object[],
            int[][], double[][]> bTuple9 =
            Tuple9.of(
                first,
                second,
                third,
                fourth,
                fifth,
                sixth,
                seventh,
                eighth,
                ninth);

        Assert.assertNotSame(aTuple9, bTuple9);
        Assert.assertTrue(aTuple9.hashCode() == bTuple9.hashCode());
    }

    @Test(expected = AssertionError.class)
    public void testHashCode_unequalHashCodedValues_fail() throws Exception {
        final Tuple9<Boolean, Integer, Double, String, BigDecimal, Date, URI,
            List<Integer>, Map<String, Object>> aTuple9;
        {
            Boolean first = false;
            Integer second = 84;
            Double third = 4567.89;
            String fourth = "ab cd ef";
            BigDecimal fifth = new BigDecimal("1.23456789");
            Date sixth = new Date(987654321);
            URI seventh = URI.create("http://www.facebook.com");
            List<Integer> eighth = new ArrayList<>();
            eighth.add(12);
            eighth.add(34);
            Map<String, Object> ninth = new HashMap<>();
            ninth.put("five", 5.0);
            ninth.put("quarter", 0.25);

            //noinspection ConstantConditions
            aTuple9 =
                Tuple9.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth,
                    seventh,
                    eighth,
                    ninth);
        }

        final Tuple9<Boolean, Integer, Double, String, BigDecimal, Date, URI,
            List<Integer>, Map<String, Object>> bTuple9;
        {
            Boolean first = true;
            Integer second = 57;
            Double third = -9876.54;
            String fourth = "abc def";
            BigDecimal fifth = new BigDecimal("3.141592654");
            Date sixth = new Date(123456789);
            URI seventh = URI.create("http://www.google.com");
            List<Integer> eighth = new ArrayList<>();
            eighth.add(123);
            eighth.add(321);
            Map<String, Object> ninth = new HashMap<>();
            ninth.put("fifteen", 15);
            ninth.put("half", 0.5);

            //noinspection ConstantConditions
            bTuple9 =
                Tuple9.of(
                    first,
                    second,
                    third,
                    fourth,
                    fifth,
                    sixth,
                    seventh,
                    eighth,
                    ninth);
        }

        Assert.assertNotSame(aTuple9, bTuple9);
        Assert.assertTrue(aTuple9.hashCode() == bTuple9.hashCode());
        Assert.fail("Expected AssertionError.");
    }

    //endregion

    //region toString() tests

    @Test
    public void testToString_nullValues_success() throws Exception {
        final Tuple9<Boolean, Integer, Double, String, BigDecimal, Date, URI,
            List<Integer>, Map<String, Object>> tuple9 =
            Tuple9.of(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null);

        String expected = "Tuple9{"
            + "first=null"
            + ", second=null"
            + ", third=null"
            + ", fourth=null"
            + ", fifth=null"
            + ", sixth=null"
            + ", seventh=null"
            + ", eighth=null"
            + ", ninth=null"
            + "}";

        Assert.assertEquals(expected, tuple9.toString());
    }

    @Test
    public void testToString_standardValues_success() throws Exception {
        Integer first = Integer.MIN_VALUE;
        Float second = Float.NaN;
        Double third = Double.NEGATIVE_INFINITY;
        Character fourth = Character.MAX_VALUE;
        String fifth = "\u0000\t\n\uFFFF";
        Date sixth = new Date();
        UUID seventh = UUID.randomUUID();
        URI eighth = URI.create("http://www.google.com");
        Exception ninth = new Exception("test");

        final Tuple9<Integer, Float, Double, Character, String, Date, UUID, URI, Exception> tuple9 =
            Tuple9.of(
                first,
                second,
                third,
                fourth,
                fifth,
                sixth,
                seventh,
                eighth,
                ninth);

        //noinspection RedundantStringToString
        String expected = "Tuple9{"
            + "first=" + first.toString()
            + ", second=" + second.toString()
            + ", third=" + third.toString()
            + ", fourth=" + fourth.toString()
            + ", fifth=" + fifth.toString()
            + ", sixth=" + sixth.toString()
            + ", seventh=" + seventh.toString()
            + ", eighth=" + eighth.toString()
            + ", ninth=" + ninth.toString()
            + "}";

        Assert.assertEquals(expected, tuple9.toString());
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
        int[][][] seventh = {null, {}, {{}}, {{1, 2, 3}}};
        List<Date> eighth = new LinkedList<>();
        eighth.add(new Date(11111111));
        eighth.add(new Date(22222222));
        double[][][][] ninth = {};

        final Tuple9<int[], List<Double>, double[][], Map<String, Object>, String[][],
            Set<Integer>, int[][][], List<Date>, double[][][][]> tuple9 =
            Tuple9.of(
                first,
                second,
                third,
                fourth,
                fifth,
                sixth,
                seventh,
                eighth,
                ninth);

        //noinspection ImplicitArrayToString
        String expected = "Tuple9{"
            + "first=" + first.toString()
            + ", second=" + second.toString()
            + ", third=" + third.toString()
            + ", fourth=" + fourth.toString()
            + ", fifth=" + fifth.toString()
            + ", sixth=" + sixth.toString()
            + ", seventh=" + seventh.toString()
            + ", eighth=" + eighth.toString()
            + ", ninth=" + ninth.toString()
            + "}";

        Assert.assertEquals(expected, tuple9.toString());
    }

    //endregion
}
