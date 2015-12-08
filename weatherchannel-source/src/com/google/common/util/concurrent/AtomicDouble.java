// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicDouble extends Number
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private static final AtomicLongFieldUpdater updater = AtomicLongFieldUpdater.newUpdater(com/google/common/util/concurrent/AtomicDouble, "value");
    private volatile transient long value;

    public AtomicDouble()
    {
    }

    public AtomicDouble(double d)
    {
        value = Double.doubleToRawLongBits(d);
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        set(objectinputstream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeDouble(get());
    }

    public final double addAndGet(double d)
    {
        double d1;
        long l;
        long l1;
        do
        {
            l = value;
            d1 = Double.longBitsToDouble(l) + d;
            l1 = Double.doubleToRawLongBits(d1);
        } while (!updater.compareAndSet(this, l, l1));
        return d1;
    }

    public final boolean compareAndSet(double d, double d1)
    {
        return updater.compareAndSet(this, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d1));
    }

    public double doubleValue()
    {
        return get();
    }

    public float floatValue()
    {
        return (float)get();
    }

    public final double get()
    {
        return Double.longBitsToDouble(value);
    }

    public final double getAndAdd(double d)
    {
        double d1;
        long l;
        long l1;
        do
        {
            l = value;
            d1 = Double.longBitsToDouble(l);
            l1 = Double.doubleToRawLongBits(d1 + d);
        } while (!updater.compareAndSet(this, l, l1));
        return d1;
    }

    public final double getAndSet(double d)
    {
        long l = Double.doubleToRawLongBits(d);
        return Double.longBitsToDouble(updater.getAndSet(this, l));
    }

    public int intValue()
    {
        return (int)get();
    }

    public final void lazySet(double d)
    {
        set(d);
    }

    public long longValue()
    {
        return (long)get();
    }

    public final void set(double d)
    {
        value = Double.doubleToRawLongBits(d);
    }

    public String toString()
    {
        return Double.toString(get());
    }

    public final boolean weakCompareAndSet(double d, double d1)
    {
        return updater.weakCompareAndSet(this, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d1));
    }

}
