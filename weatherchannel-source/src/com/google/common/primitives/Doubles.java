// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Doubles
{
    private static class DoubleArrayAsList extends AbstractList
        implements RandomAccess, Serializable
    {

        private static final long serialVersionUID = 0L;
        final double array[];
        final int end;
        final int start;

        public boolean contains(Object obj)
        {
            return (obj instanceof Double) && Doubles.indexOf(array, ((Double)obj).doubleValue(), start, end) != -1;
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof DoubleArrayAsList)
                {
                    obj = (DoubleArrayAsList)obj;
                    int j = size();
                    if (((DoubleArrayAsList) (obj)).size() != j)
                    {
                        return false;
                    }
                    int i = 0;
                    while (i < j) 
                    {
                        if (array[start + i] != ((DoubleArrayAsList) (obj)).array[((DoubleArrayAsList) (obj)).start + i])
                        {
                            return false;
                        }
                        i++;
                    }
                } else
                {
                    return super.equals(obj);
                }
            }
            return true;
        }

        public Double get(int i)
        {
            Preconditions.checkElementIndex(i, size());
            return Double.valueOf(array[start + i]);
        }

        public volatile Object get(int i)
        {
            return get(i);
        }

        public int hashCode()
        {
            int j = 1;
            for (int i = start; i < end; i++)
            {
                j = j * 31 + Doubles.hashCode(array[i]);
            }

            return j;
        }

        public int indexOf(Object obj)
        {
            if (obj instanceof Double)
            {
                int i = Doubles.indexOf(array, ((Double)obj).doubleValue(), start, end);
                if (i >= 0)
                {
                    return i - start;
                }
            }
            return -1;
        }

        public boolean isEmpty()
        {
            return false;
        }

        public int lastIndexOf(Object obj)
        {
            if (obj instanceof Double)
            {
                int i = Doubles.lastIndexOf(array, ((Double)obj).doubleValue(), start, end);
                if (i >= 0)
                {
                    return i - start;
                }
            }
            return -1;
        }

        public Double set(int i, Double double1)
        {
            Preconditions.checkElementIndex(i, size());
            double d = array[start + i];
            array[start + i] = ((Double)Preconditions.checkNotNull(double1)).doubleValue();
            return Double.valueOf(d);
        }

        public volatile Object set(int i, Object obj)
        {
            return set(i, (Double)obj);
        }

        public int size()
        {
            return end - start;
        }

        public List subList(int i, int j)
        {
            Preconditions.checkPositionIndexes(i, j, size());
            if (i == j)
            {
                return Collections.emptyList();
            } else
            {
                return new DoubleArrayAsList(array, start + i, start + j);
            }
        }

        double[] toDoubleArray()
        {
            int i = size();
            double ad[] = new double[i];
            System.arraycopy(array, start, ad, 0, i);
            return ad;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(size() * 12);
            stringbuilder.append('[').append(array[start]);
            for (int i = start + 1; i < end; i++)
            {
                stringbuilder.append(", ").append(array[i]);
            }

            return stringbuilder.append(']').toString();
        }

        DoubleArrayAsList(double ad[])
        {
            this(ad, 0, ad.length);
        }

        DoubleArrayAsList(double ad[], int i, int j)
        {
            array = ad;
            start = i;
            end = j;
        }
    }

    private static final class DoubleConverter extends Converter
        implements Serializable
    {

        static final DoubleConverter INSTANCE = new DoubleConverter();
        private static final long serialVersionUID = 1L;

        private Object readResolve()
        {
            return INSTANCE;
        }

        protected volatile Object doBackward(Object obj)
        {
            return doBackward((Double)obj);
        }

        protected String doBackward(Double double1)
        {
            return double1.toString();
        }

        protected Double doForward(String s)
        {
            return Double.valueOf(s);
        }

        protected volatile Object doForward(Object obj)
        {
            return doForward((String)obj);
        }

        public String toString()
        {
            return "Doubles.stringConverter()";
        }


        private DoubleConverter()
        {
        }
    }

    private static final class LexicographicalComparator extends Enum
        implements Comparator
    {

        private static final LexicographicalComparator $VALUES[];
        public static final LexicographicalComparator INSTANCE;

        public static LexicographicalComparator valueOf(String s)
        {
            return (LexicographicalComparator)Enum.valueOf(com/google/common/primitives/Doubles$LexicographicalComparator, s);
        }

        public static LexicographicalComparator[] values()
        {
            return (LexicographicalComparator[])$VALUES.clone();
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((double[])obj, (double[])obj1);
        }

        public int compare(double ad[], double ad1[])
        {
            int j = Math.min(ad.length, ad1.length);
            for (int i = 0; i < j; i++)
            {
                int k = Double.compare(ad[i], ad1[i]);
                if (k != 0)
                {
                    return k;
                }
            }

            return ad.length - ad1.length;
        }

        static 
        {
            INSTANCE = new LexicographicalComparator("INSTANCE", 0);
            $VALUES = (new LexicographicalComparator[] {
                INSTANCE
            });
        }

        private LexicographicalComparator(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int BYTES = 8;
    static final Pattern FLOATING_POINT_PATTERN = fpPattern();

    private Doubles()
    {
    }

    public static transient List asList(double ad[])
    {
        if (ad.length == 0)
        {
            return Collections.emptyList();
        } else
        {
            return new DoubleArrayAsList(ad);
        }
    }

    public static int compare(double d, double d1)
    {
        return Double.compare(d, d1);
    }

    public static transient double[] concat(double ad[][])
    {
        int k = 0;
        int l = ad.length;
        for (int i = 0; i < l; i++)
        {
            k += ad[i].length;
        }

        double ad1[] = new double[k];
        k = 0;
        l = ad.length;
        for (int j = 0; j < l; j++)
        {
            double ad2[] = ad[j];
            System.arraycopy(ad2, 0, ad1, k, ad2.length);
            k += ad2.length;
        }

        return ad1;
    }

    public static boolean contains(double ad[], double d)
    {
        int j = ad.length;
        for (int i = 0; i < j; i++)
        {
            if (ad[i] == d)
            {
                return true;
            }
        }

        return false;
    }

    private static double[] copyOf(double ad[], int i)
    {
        double ad1[] = new double[i];
        System.arraycopy(ad, 0, ad1, 0, Math.min(ad.length, i));
        return ad1;
    }

    public static double[] ensureCapacity(double ad[], int i, int j)
    {
        double ad1[];
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Invalid minLength: %s", new Object[] {
            Integer.valueOf(i)
        });
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Invalid padding: %s", new Object[] {
            Integer.valueOf(j)
        });
        ad1 = ad;
        if (ad.length < i)
        {
            ad1 = copyOf(ad, i + j);
        }
        return ad1;
    }

    private static Pattern fpPattern()
    {
        String s = String.valueOf("(?:\\d++(?:\\.\\d*+)?|\\.\\d++)").concat("(?:[eE][+-]?\\d++)?[fFdD]?");
        String s1 = String.valueOf(String.valueOf("(?:\\p{XDigit}++(?:\\.\\p{XDigit}*+)?|\\.\\p{XDigit}++)"));
        s1 = (new StringBuilder(s1.length() + 25)).append("0[xX]").append(s1).append("[pP][+-]?\\d++[fFdD]?").toString();
        s = String.valueOf(String.valueOf(s));
        s1 = String.valueOf(String.valueOf(s1));
        return Pattern.compile((new StringBuilder(s.length() + 23 + s1.length())).append("[+-]?(?:NaN|Infinity|").append(s).append("|").append(s1).append(")").toString());
    }

    public static int hashCode(double d)
    {
        return Double.valueOf(d).hashCode();
    }

    public static int indexOf(double ad[], double d)
    {
        return indexOf(ad, d, 0, ad.length);
    }

    private static int indexOf(double ad[], double d, int i, int j)
    {
        for (; i < j; i++)
        {
            if (ad[i] == d)
            {
                return i;
            }
        }

        return -1;
    }

    public static int indexOf(double ad[], double ad1[])
    {
        Preconditions.checkNotNull(ad, "array");
        Preconditions.checkNotNull(ad1, "target");
        if (ad1.length != 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i;
        int k;
        for (i = 0; i >= (ad.length - ad1.length) + 1;)
        {
            break MISSING_BLOCK_LABEL_78;
        }

        k = 0;
_L5:
        j = i;
        if (k >= ad1.length) goto _L4; else goto _L3
_L3:
label0:
        {
            if (ad[i + k] == ad1[k])
            {
                break label0;
            }
            i++;
        }
          goto _L2
        k++;
          goto _L5
        return -1;
          goto _L2
    }

    public static boolean isFinite(double d)
    {
        boolean flag1 = true;
        boolean flag;
        if ((-1.0D / 0.0D) < d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d >= (1.0D / 0.0D))
        {
            flag1 = false;
        }
        return flag1 & flag;
    }

    public static transient String join(String s, double ad[])
    {
        Preconditions.checkNotNull(s);
        if (ad.length == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(ad.length * 12);
        stringbuilder.append(ad[0]);
        for (int i = 1; i < ad.length; i++)
        {
            stringbuilder.append(s).append(ad[i]);
        }

        return stringbuilder.toString();
    }

    public static int lastIndexOf(double ad[], double d)
    {
        return lastIndexOf(ad, d, 0, ad.length);
    }

    private static int lastIndexOf(double ad[], double d, int i, int j)
    {
        for (j--; j >= i; j--)
        {
            if (ad[j] == d)
            {
                return j;
            }
        }

        return -1;
    }

    public static Comparator lexicographicalComparator()
    {
        return LexicographicalComparator.INSTANCE;
    }

    public static transient double max(double ad[])
    {
        double d;
        boolean flag;
        if (ad.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        d = ad[0];
        for (int i = 1; i < ad.length; i++)
        {
            d = Math.max(d, ad[i]);
        }

        return d;
    }

    public static transient double min(double ad[])
    {
        double d;
        boolean flag;
        if (ad.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        d = ad[0];
        for (int i = 1; i < ad.length; i++)
        {
            d = Math.min(d, ad[i]);
        }

        return d;
    }

    public static Converter stringConverter()
    {
        return DoubleConverter.INSTANCE;
    }

    public static double[] toArray(Collection collection)
    {
        if (!(collection instanceof DoubleArrayAsList)) goto _L2; else goto _L1
_L1:
        collection = ((DoubleArrayAsList)collection).toDoubleArray();
_L4:
        return collection;
_L2:
        Object aobj[] = collection.toArray();
        int j = aobj.length;
        double ad[] = new double[j];
        int i = 0;
        do
        {
            collection = ad;
            if (i >= j)
            {
                continue;
            }
            ad[i] = ((Number)Preconditions.checkNotNull(aobj[i])).doubleValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Double tryParse(String s)
    {
        if (!FLOATING_POINT_PATTERN.matcher(s).matches())
        {
            break MISSING_BLOCK_LABEL_24;
        }
        double d = Double.parseDouble(s);
        return Double.valueOf(d);
        s;
        return null;
    }



}
