// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.util.Arrays;

// Referenced classes of package com.google.common.hash:
//            BloomFilterStrategies

static final class bitCount
{

    long bitCount;
    final long data[];

    long bitCount()
    {
        return bitCount;
    }

    long bitSize()
    {
        return (long)data.length * 64L;
    }

    data copy()
    {
        return new <init>((long[])data.clone());
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof data)
        {
            obj = (data)obj;
            return Arrays.equals(data, ((data) (obj)).data);
        } else
        {
            return false;
        }
    }

    boolean get(long l)
    {
        return (data[(int)(l >>> 6)] & 1L << (int)l) != 0L;
    }

    public int hashCode()
    {
        return Arrays.hashCode(data);
    }

    void putAll(data data1)
    {
        boolean flag;
        if (data.length == data1.data.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "BitArrays must be of equal length (%s != %s)", new Object[] {
            Integer.valueOf(data.length), Integer.valueOf(data1.data.length)
        });
        bitCount = 0L;
        for (int i = 0; i < data.length; i++)
        {
            long al[] = data;
            al[i] = al[i] | data1.data[i];
            bitCount = bitCount + (long)Long.bitCount(data[i]);
        }

    }

    boolean set(long l)
    {
        if (!get(l))
        {
            long al[] = data;
            int i = (int)(l >>> 6);
            al[i] = al[i] | 1L << (int)l;
            bitCount = bitCount + 1L;
            return true;
        } else
        {
            return false;
        }
    }

    (long l)
    {
        this(new long[Ints.checkedCast(LongMath.divide(l, 64L, RoundingMode.CEILING))]);
    }

    <init>(long al[])
    {
        int j;
        long l;
        boolean flag;
        if (al.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "data length is zero!");
        data = al;
        l = 0L;
        j = al.length;
        for (int i = 0; i < j; i++)
        {
            l += Long.bitCount(al[i]);
        }

        bitCount = l;
    }
}
