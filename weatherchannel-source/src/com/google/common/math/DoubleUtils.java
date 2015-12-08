// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.math;

import com.google.common.base.Preconditions;
import java.math.BigInteger;

final class DoubleUtils
{

    static final int EXPONENT_BIAS = 1023;
    static final long EXPONENT_MASK = 0x7ff0000000000000L;
    static final long IMPLICIT_BIT = 0x10000000000000L;
    private static final long ONE_BITS = Double.doubleToRawLongBits(1.0D);
    static final int SIGNIFICAND_BITS = 52;
    static final long SIGNIFICAND_MASK = 0xfffffffffffffL;
    static final long SIGN_MASK = 0x8000000000000000L;

    private DoubleUtils()
    {
    }

    static double bigToDouble(BigInteger biginteger)
    {
        BigInteger biginteger1 = biginteger.abs();
        int j = biginteger1.bitLength() - 1;
        if (j < 63)
        {
            return (double)biginteger.longValue();
        }
        if (j > 1023)
        {
            return (double)biginteger.signum() * (1.0D / 0.0D);
        }
        int i = j - 52 - 1;
        long l1 = biginteger1.shiftRight(i).longValue();
        long l = l1 >> 1 & 0xfffffffffffffL;
        boolean flag;
        if ((1L & l1) != 0L && ((1L & l) != 0L || biginteger1.getLowestSetBit() < i))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            l++;
        }
        return Double.longBitsToDouble(((long)(j + 1023) << 52) + l | (long)biginteger.signum() & 0x8000000000000000L);
    }

    static double ensureNonNegative(double d)
    {
        boolean flag;
        if (!Double.isNaN(d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (d > 0.0D)
        {
            return d;
        } else
        {
            return 0.0D;
        }
    }

    static long getSignificand(double d)
    {
        Preconditions.checkArgument(isFinite(d), "not a normal value");
        int i = Math.getExponent(d);
        long l = Double.doubleToRawLongBits(d) & 0xfffffffffffffL;
        if (i == -1023)
        {
            return l << 1;
        } else
        {
            return 0x10000000000000L | l;
        }
    }

    static boolean isFinite(double d)
    {
        return Math.getExponent(d) <= 1023;
    }

    static boolean isNormal(double d)
    {
        return Math.getExponent(d) >= -1022;
    }

    static double nextDown(double d)
    {
        return -Math.nextUp(-d);
    }

    static double scaleNormalize(double d)
    {
        long l = Double.doubleToRawLongBits(d);
        return Double.longBitsToDouble(ONE_BITS | l & 0xfffffffffffffL);
    }

}
