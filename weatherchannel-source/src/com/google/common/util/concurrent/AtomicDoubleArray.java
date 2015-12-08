// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicDoubleArray
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private transient AtomicLongArray longs;

    public AtomicDoubleArray(int i)
    {
        longs = new AtomicLongArray(i);
    }

    public AtomicDoubleArray(double ad[])
    {
        int j = ad.length;
        long al[] = new long[j];
        for (int i = 0; i < j; i++)
        {
            al[i] = Double.doubleToRawLongBits(ad[i]);
        }

        longs = new AtomicLongArray(al);
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        int j = objectinputstream.readInt();
        longs = new AtomicLongArray(j);
        for (int i = 0; i < j; i++)
        {
            set(i, objectinputstream.readDouble());
        }

    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        int j = length();
        objectoutputstream.writeInt(j);
        for (int i = 0; i < j; i++)
        {
            objectoutputstream.writeDouble(get(i));
        }

    }

    public double addAndGet(int i, double d)
    {
        double d1;
        long l;
        long l1;
        do
        {
            l = longs.get(i);
            d1 = Double.longBitsToDouble(l) + d;
            l1 = Double.doubleToRawLongBits(d1);
        } while (!longs.compareAndSet(i, l, l1));
        return d1;
    }

    public final boolean compareAndSet(int i, double d, double d1)
    {
        return longs.compareAndSet(i, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d1));
    }

    public final double get(int i)
    {
        return Double.longBitsToDouble(longs.get(i));
    }

    public final double getAndAdd(int i, double d)
    {
        double d1;
        long l;
        long l1;
        do
        {
            l = longs.get(i);
            d1 = Double.longBitsToDouble(l);
            l1 = Double.doubleToRawLongBits(d1 + d);
        } while (!longs.compareAndSet(i, l, l1));
        return d1;
    }

    public final double getAndSet(int i, double d)
    {
        long l = Double.doubleToRawLongBits(d);
        return Double.longBitsToDouble(longs.getAndSet(i, l));
    }

    public final void lazySet(int i, double d)
    {
        set(i, d);
    }

    public final int length()
    {
        return longs.length();
    }

    public final void set(int i, double d)
    {
        long l = Double.doubleToRawLongBits(d);
        longs.set(i, l);
    }

    public String toString()
    {
        int j = length() - 1;
        if (j == -1)
        {
            return "[]";
        }
        StringBuilder stringbuilder = new StringBuilder((j + 1) * 19);
        stringbuilder.append('[');
        int i = 0;
        do
        {
            stringbuilder.append(Double.longBitsToDouble(longs.get(i)));
            if (i == j)
            {
                return stringbuilder.append(']').toString();
            }
            stringbuilder.append(',').append(' ');
            i++;
        } while (true);
    }

    public final boolean weakCompareAndSet(int i, double d, double d1)
    {
        return longs.weakCompareAndSet(i, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d1));
    }
}
