// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.math.BigInteger;

// Referenced classes of package com.google.common.primitives:
//            UnsignedInts

public final class UnsignedInteger extends Number
    implements Comparable
{

    public static final UnsignedInteger MAX_VALUE = fromIntBits(-1);
    public static final UnsignedInteger ONE = fromIntBits(1);
    public static final UnsignedInteger ZERO = fromIntBits(0);
    private final int value;

    private UnsignedInteger(int i)
    {
        value = i & -1;
    }

    public static UnsignedInteger fromIntBits(int i)
    {
        return new UnsignedInteger(i);
    }

    public static UnsignedInteger valueOf(long l)
    {
        boolean flag;
        if ((0xffffffffL & l) == l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "value (%s) is outside the range for an unsigned integer value", new Object[] {
            Long.valueOf(l)
        });
        return fromIntBits((int)l);
    }

    public static UnsignedInteger valueOf(String s)
    {
        return valueOf(s, 10);
    }

    public static UnsignedInteger valueOf(String s, int i)
    {
        return fromIntBits(UnsignedInts.parseUnsignedInt(s, i));
    }

    public static UnsignedInteger valueOf(BigInteger biginteger)
    {
        Preconditions.checkNotNull(biginteger);
        boolean flag;
        if (biginteger.signum() >= 0 && biginteger.bitLength() <= 32)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "value (%s) is outside the range for an unsigned integer value", new Object[] {
            biginteger
        });
        return fromIntBits(biginteger.intValue());
    }

    public BigInteger bigIntegerValue()
    {
        return BigInteger.valueOf(longValue());
    }

    public int compareTo(UnsignedInteger unsignedinteger)
    {
        Preconditions.checkNotNull(unsignedinteger);
        return UnsignedInts.compare(value, unsignedinteger.value);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((UnsignedInteger)obj);
    }

    public UnsignedInteger dividedBy(UnsignedInteger unsignedinteger)
    {
        return fromIntBits(UnsignedInts.divide(value, ((UnsignedInteger)Preconditions.checkNotNull(unsignedinteger)).value));
    }

    public double doubleValue()
    {
        return (double)longValue();
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof UnsignedInteger)
        {
            obj = (UnsignedInteger)obj;
            flag = flag1;
            if (value == ((UnsignedInteger) (obj)).value)
            {
                flag = true;
            }
        }
        return flag;
    }

    public float floatValue()
    {
        return (float)longValue();
    }

    public int hashCode()
    {
        return value;
    }

    public int intValue()
    {
        return value;
    }

    public long longValue()
    {
        return UnsignedInts.toLong(value);
    }

    public UnsignedInteger minus(UnsignedInteger unsignedinteger)
    {
        return fromIntBits(value - ((UnsignedInteger)Preconditions.checkNotNull(unsignedinteger)).value);
    }

    public UnsignedInteger mod(UnsignedInteger unsignedinteger)
    {
        return fromIntBits(UnsignedInts.remainder(value, ((UnsignedInteger)Preconditions.checkNotNull(unsignedinteger)).value));
    }

    public UnsignedInteger plus(UnsignedInteger unsignedinteger)
    {
        int i = value;
        return fromIntBits(((UnsignedInteger)Preconditions.checkNotNull(unsignedinteger)).value + i);
    }

    public UnsignedInteger times(UnsignedInteger unsignedinteger)
    {
        int i = value;
        return fromIntBits(((UnsignedInteger)Preconditions.checkNotNull(unsignedinteger)).value * i);
    }

    public String toString()
    {
        return toString(10);
    }

    public String toString(int i)
    {
        return UnsignedInts.toString(value, i);
    }

}
