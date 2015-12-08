// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.math.BigInteger;

// Referenced classes of package com.google.common.primitives:
//            UnsignedLongs, Longs

public final class UnsignedLong extends Number
    implements Comparable, Serializable
{

    public static final UnsignedLong MAX_VALUE = new UnsignedLong(-1L);
    public static final UnsignedLong ONE = new UnsignedLong(1L);
    private static final long UNSIGNED_MASK = 0x7fffffffffffffffL;
    public static final UnsignedLong ZERO = new UnsignedLong(0L);
    private final long value;

    private UnsignedLong(long l)
    {
        value = l;
    }

    public static UnsignedLong fromLongBits(long l)
    {
        return new UnsignedLong(l);
    }

    public static UnsignedLong valueOf(long l)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "value (%s) is outside the range for an unsigned long value", new Object[] {
            Long.valueOf(l)
        });
        return fromLongBits(l);
    }

    public static UnsignedLong valueOf(String s)
    {
        return valueOf(s, 10);
    }

    public static UnsignedLong valueOf(String s, int i)
    {
        return fromLongBits(UnsignedLongs.parseUnsignedLong(s, i));
    }

    public static UnsignedLong valueOf(BigInteger biginteger)
    {
        Preconditions.checkNotNull(biginteger);
        boolean flag;
        if (biginteger.signum() >= 0 && biginteger.bitLength() <= 64)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "value (%s) is outside the range for an unsigned long value", new Object[] {
            biginteger
        });
        return fromLongBits(biginteger.longValue());
    }

    public BigInteger bigIntegerValue()
    {
        BigInteger biginteger1 = BigInteger.valueOf(value & 0x7fffffffffffffffL);
        BigInteger biginteger = biginteger1;
        if (value < 0L)
        {
            biginteger = biginteger1.setBit(63);
        }
        return biginteger;
    }

    public int compareTo(UnsignedLong unsignedlong)
    {
        Preconditions.checkNotNull(unsignedlong);
        return UnsignedLongs.compare(value, unsignedlong.value);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((UnsignedLong)obj);
    }

    public UnsignedLong dividedBy(UnsignedLong unsignedlong)
    {
        return fromLongBits(UnsignedLongs.divide(value, ((UnsignedLong)Preconditions.checkNotNull(unsignedlong)).value));
    }

    public double doubleValue()
    {
        double d1 = value & 0x7fffffffffffffffL;
        double d = d1;
        if (value < 0L)
        {
            d = d1 + 9.2233720368547758E+18D;
        }
        return d;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof UnsignedLong)
        {
            obj = (UnsignedLong)obj;
            flag = flag1;
            if (value == ((UnsignedLong) (obj)).value)
            {
                flag = true;
            }
        }
        return flag;
    }

    public float floatValue()
    {
        float f1 = value & 0x7fffffffffffffffL;
        float f = f1;
        if (value < 0L)
        {
            f = f1 + 9.223372E+18F;
        }
        return f;
    }

    public int hashCode()
    {
        return Longs.hashCode(value);
    }

    public int intValue()
    {
        return (int)value;
    }

    public long longValue()
    {
        return value;
    }

    public UnsignedLong minus(UnsignedLong unsignedlong)
    {
        return fromLongBits(value - ((UnsignedLong)Preconditions.checkNotNull(unsignedlong)).value);
    }

    public UnsignedLong mod(UnsignedLong unsignedlong)
    {
        return fromLongBits(UnsignedLongs.remainder(value, ((UnsignedLong)Preconditions.checkNotNull(unsignedlong)).value));
    }

    public UnsignedLong plus(UnsignedLong unsignedlong)
    {
        long l = value;
        return fromLongBits(((UnsignedLong)Preconditions.checkNotNull(unsignedlong)).value + l);
    }

    public UnsignedLong times(UnsignedLong unsignedlong)
    {
        long l = value;
        return fromLongBits(((UnsignedLong)Preconditions.checkNotNull(unsignedlong)).value * l);
    }

    public String toString()
    {
        return UnsignedLongs.toString(value);
    }

    public String toString(int i)
    {
        return UnsignedLongs.toString(value, i);
    }

}
