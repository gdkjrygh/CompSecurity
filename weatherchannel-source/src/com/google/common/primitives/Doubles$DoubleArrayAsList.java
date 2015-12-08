// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.primitives:
//            Doubles

private static class end extends AbstractList
    implements RandomAccess, Serializable
{

    private static final long serialVersionUID = 0L;
    final double array[];
    final int end;
    final int start;

    public boolean contains(Object obj)
    {
        return (obj instanceof Double) && Doubles.access$000(array, ((Double)obj).doubleValue(), start, end) != -1;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof end)
            {
                obj = (end)obj;
                int j = size();
                if (((size) (obj)).size() != j)
                {
                    return false;
                }
                int i = 0;
                while (i < j) 
                {
                    if (array[start + i] != ((start) (obj)).array[((array) (obj)).start + i])
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
            int i = Doubles.access$000(array, ((Double)obj).doubleValue(), start, end);
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
            int i = Doubles.access$100(array, ((Double)obj).doubleValue(), start, end);
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
            return new <init>(array, start + i, start + j);
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

    (double ad[])
    {
        this(ad, 0, ad.length);
    }

    <init>(double ad[], int i, int j)
    {
        array = ad;
        start = i;
        end = j;
    }
}
