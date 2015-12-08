// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

// Referenced classes of package com.google.common.math:
//            MathPreconditions, DoubleUtils, LongMath

public final class DoubleMath
{
    private static final class MeanAccumulator
    {

        private long count;
        private double mean;

        void add(double d)
        {
            Preconditions.checkArgument(DoubleUtils.isFinite(d));
            count = count + 1L;
            mean = mean + (d - mean) / (double)count;
        }

        double mean()
        {
            boolean flag;
            if (count > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Cannot take mean of 0 values");
            return mean;
        }

        private MeanAccumulator()
        {
            count = 0L;
            mean = 0.0D;
        }

    }


    private static final double LN_2 = Math.log(2D);
    static final int MAX_FACTORIAL = 170;
    private static final double MAX_INT_AS_DOUBLE = 2147483647D;
    private static final double MAX_LONG_AS_DOUBLE_PLUS_ONE = 9.2233720368547758E+18D;
    private static final double MIN_INT_AS_DOUBLE = -2147483648D;
    private static final double MIN_LONG_AS_DOUBLE = -9.2233720368547758E+18D;
    static final double everySixteenthFactorial[] = {
        1.0D, 20922789888000D, 2.6313083693369352E+35D, 1.2413915592536073E+61D, 1.2688693218588417E+89D, 7.1569457046263806E+118D, 9.9167793487094965E+149D, 1.974506857221074E+182D, 3.8562048236258041E+215D, 5.5502938327393044E+249D, 
        4.7147236359920616E+284D
    };

    private DoubleMath()
    {
    }

    public static double factorial(int i)
    {
        MathPreconditions.checkNonNegative("n", i);
        if (i > 170)
        {
            return (1.0D / 0.0D);
        }
        double d = 1.0D;
        for (int j = (i & 0xfffffff0) + 1; j <= i; j++)
        {
            d *= j;
        }

        return everySixteenthFactorial[i >> 4] * d;
    }

    public static int fuzzyCompare(double d, double d1, double d2)
    {
        if (fuzzyEquals(d, d1, d2))
        {
            return 0;
        }
        if (d < d1)
        {
            return -1;
        }
        if (d > d1)
        {
            return 1;
        } else
        {
            return Booleans.compare(Double.isNaN(d), Double.isNaN(d1));
        }
    }

    public static boolean fuzzyEquals(double d, double d1, double d2)
    {
        MathPreconditions.checkNonNegative("tolerance", d2);
        return Math.copySign(d - d1, 1.0D) <= d2 || d == d1 || Double.isNaN(d) && Double.isNaN(d1);
    }

    public static boolean isMathematicalInteger(double d)
    {
        return DoubleUtils.isFinite(d) && (d == 0.0D || 52 - Long.numberOfTrailingZeros(DoubleUtils.getSignificand(d)) <= Math.getExponent(d));
    }

    public static boolean isPowerOfTwo(double d)
    {
        return d > 0.0D && DoubleUtils.isFinite(d) && LongMath.isPowerOfTwo(DoubleUtils.getSignificand(d));
    }

    public static double log2(double d)
    {
        return Math.log(d) / LN_2;
    }

    public static int log2(double d, RoundingMode roundingmode)
    {
        int j;
        int k;
        boolean flag1;
        flag1 = true;
        j = 1;
        boolean flag2;
        if (d > 0.0D && DoubleUtils.isFinite(d))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2, "x must be positive and finite");
        k = Math.getExponent(d);
        if (DoubleUtils.isNormal(d)) goto _L2; else goto _L1
_L1:
        j = log2(4503599627370496D * d, roundingmode) - 52;
_L11:
        return j;
_L2:
        static class _cls1
        {

            static final int $SwitchMap$java$math$RoundingMode[];

            static 
            {
                $SwitchMap$java$math$RoundingMode = new int[RoundingMode.values().length];
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.UNNECESSARY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.java.math.RoundingMode[roundingmode.ordinal()];
        JVM INSTR tableswitch 1 8: default 120
    //                   1 128
    //                   2 135
    //                   3 150
    //                   4 167
    //                   5 200
    //                   6 237
    //                   7 237
    //                   8 237;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L9 _L9
_L9:
        break MISSING_BLOCK_LABEL_237;
_L6:
        break; /* Loop/switch isn't completed */
_L3:
        throw new AssertionError();
_L4:
        MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(d));
_L5:
        int i = 0;
_L12:
        j = k;
        if (i != 0)
        {
            return k + 1;
        }
        if (true) goto _L11; else goto _L10
_L10:
        if (!isPowerOfTwo(d))
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L12
_L7:
        if (k < 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (isPowerOfTwo(d))
        {
            j = 0;
        }
        i &= j;
          goto _L12
_L8:
        boolean flag;
        if (k >= 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!isPowerOfTwo(d))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        i &= ((flag) ? 1 : 0);
          goto _L12
        d = DoubleUtils.scaleNormalize(d);
        if (d * d > 2D)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L12
    }

    public static double mean(Iterable iterable)
    {
        MeanAccumulator meanaccumulator = new MeanAccumulator(null);
        for (iterable = iterable.iterator(); iterable.hasNext(); meanaccumulator.add(((Number)iterable.next()).doubleValue())) { }
        return meanaccumulator.mean();
    }

    public static double mean(Iterator iterator)
    {
        MeanAccumulator meanaccumulator = new MeanAccumulator(null);
        for (; iterator.hasNext(); meanaccumulator.add(((Number)iterator.next()).doubleValue())) { }
        return meanaccumulator.mean();
    }

    public static transient double mean(double ad[])
    {
        MeanAccumulator meanaccumulator = new MeanAccumulator(null);
        int j = ad.length;
        for (int i = 0; i < j; i++)
        {
            meanaccumulator.add(ad[i]);
        }

        return meanaccumulator.mean();
    }

    public static transient double mean(int ai[])
    {
        MeanAccumulator meanaccumulator = new MeanAccumulator(null);
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            meanaccumulator.add(ai[i]);
        }

        return meanaccumulator.mean();
    }

    public static transient double mean(long al[])
    {
        MeanAccumulator meanaccumulator = new MeanAccumulator(null);
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            meanaccumulator.add(al[i]);
        }

        return meanaccumulator.mean();
    }

    static double roundIntermediate(double d, RoundingMode roundingmode)
    {
        if (!DoubleUtils.isFinite(d))
        {
            throw new ArithmeticException("input is infinite or NaN");
        }
        _cls1..SwitchMap.java.math.RoundingMode[roundingmode.ordinal()];
        JVM INSTR tableswitch 1 8: default 72
    //                   1 80
    //                   2 89
    //                   3 106
    //                   4 87
    //                   5 123
    //                   6 138
    //                   7 143
    //                   8 173;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        throw new AssertionError();
_L2:
        MathPreconditions.checkRoundingUnnecessary(isMathematicalInteger(d));
_L11:
        return d;
_L3:
        if (d < 0.0D && !isMathematicalInteger(d))
        {
            return d - 1.0D;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (d > 0.0D && !isMathematicalInteger(d))
        {
            return d + 1.0D;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (!isMathematicalInteger(d))
        {
            return d + Math.copySign(1.0D, d);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        return Math.rint(d);
_L8:
        double d1 = Math.rint(d);
        if (Math.abs(d - d1) == 0.5D)
        {
            return d + Math.copySign(0.5D, d);
        } else
        {
            return d1;
        }
_L9:
        double d2 = Math.rint(d);
        if (Math.abs(d - d2) != 0.5D)
        {
            return d2;
        }
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static BigInteger roundToBigInteger(double d, RoundingMode roundingmode)
    {
        boolean flag1 = true;
        d = roundIntermediate(d, roundingmode);
        boolean flag;
        if (-9.2233720368547758E+18D - d < 1.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d >= 9.2233720368547758E+18D)
        {
            flag1 = false;
        }
        if (flag1 & flag)
        {
            roundingmode = BigInteger.valueOf((long)d);
        } else
        {
            int i = Math.getExponent(d);
            BigInteger biginteger = BigInteger.valueOf(DoubleUtils.getSignificand(d)).shiftLeft(i - 52);
            roundingmode = biginteger;
            if (d < 0.0D)
            {
                return biginteger.negate();
            }
        }
        return roundingmode;
    }

    public static int roundToInt(double d, RoundingMode roundingmode)
    {
        boolean flag1 = true;
        d = roundIntermediate(d, roundingmode);
        boolean flag;
        if (d > -2147483649D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d >= 2147483648D)
        {
            flag1 = false;
        }
        MathPreconditions.checkInRange(flag1 & flag);
        return (int)d;
    }

    public static long roundToLong(double d, RoundingMode roundingmode)
    {
        boolean flag1 = true;
        d = roundIntermediate(d, roundingmode);
        boolean flag;
        if (-9.2233720368547758E+18D - d < 1.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d >= 9.2233720368547758E+18D)
        {
            flag1 = false;
        }
        MathPreconditions.checkInRange(flag1 & flag);
        return (long)d;
    }

}
