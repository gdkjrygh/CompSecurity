// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.math;

import java.math.BigInteger;

final class MathPreconditions
{

    private MathPreconditions()
    {
    }

    static void checkInRange(boolean flag)
    {
        if (!flag)
        {
            throw new ArithmeticException("not in range");
        } else
        {
            return;
        }
    }

    static void checkNoOverflow(boolean flag)
    {
        if (!flag)
        {
            throw new ArithmeticException("overflow");
        } else
        {
            return;
        }
    }

    static double checkNonNegative(String s, double d)
    {
        if (d < 0.0D)
        {
            s = String.valueOf(String.valueOf(s));
            throw new IllegalArgumentException((new StringBuilder(s.length() + 40)).append(s).append(" (").append(d).append(") must be >= 0").toString());
        } else
        {
            return d;
        }
    }

    static int checkNonNegative(String s, int i)
    {
        if (i < 0)
        {
            s = String.valueOf(String.valueOf(s));
            throw new IllegalArgumentException((new StringBuilder(s.length() + 27)).append(s).append(" (").append(i).append(") must be >= 0").toString());
        } else
        {
            return i;
        }
    }

    static long checkNonNegative(String s, long l)
    {
        if (l < 0L)
        {
            s = String.valueOf(String.valueOf(s));
            throw new IllegalArgumentException((new StringBuilder(s.length() + 36)).append(s).append(" (").append(l).append(") must be >= 0").toString());
        } else
        {
            return l;
        }
    }

    static BigInteger checkNonNegative(String s, BigInteger biginteger)
    {
        if (biginteger.signum() < 0)
        {
            s = String.valueOf(String.valueOf(s));
            biginteger = String.valueOf(String.valueOf(biginteger));
            throw new IllegalArgumentException((new StringBuilder(s.length() + 16 + biginteger.length())).append(s).append(" (").append(biginteger).append(") must be >= 0").toString());
        } else
        {
            return biginteger;
        }
    }

    static int checkPositive(String s, int i)
    {
        if (i <= 0)
        {
            s = String.valueOf(String.valueOf(s));
            throw new IllegalArgumentException((new StringBuilder(s.length() + 26)).append(s).append(" (").append(i).append(") must be > 0").toString());
        } else
        {
            return i;
        }
    }

    static long checkPositive(String s, long l)
    {
        if (l <= 0L)
        {
            s = String.valueOf(String.valueOf(s));
            throw new IllegalArgumentException((new StringBuilder(s.length() + 35)).append(s).append(" (").append(l).append(") must be > 0").toString());
        } else
        {
            return l;
        }
    }

    static BigInteger checkPositive(String s, BigInteger biginteger)
    {
        if (biginteger.signum() <= 0)
        {
            s = String.valueOf(String.valueOf(s));
            biginteger = String.valueOf(String.valueOf(biginteger));
            throw new IllegalArgumentException((new StringBuilder(s.length() + 15 + biginteger.length())).append(s).append(" (").append(biginteger).append(") must be > 0").toString());
        } else
        {
            return biginteger;
        }
    }

    static void checkRoundingUnnecessary(boolean flag)
    {
        if (!flag)
        {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        } else
        {
            return;
        }
    }
}
