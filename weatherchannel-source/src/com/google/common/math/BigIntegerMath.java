// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.math;

import com.google.common.base.Preconditions;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.common.math:
//            MathPreconditions, LongMath, IntMath, DoubleUtils, 
//            DoubleMath

public final class BigIntegerMath
{

    private static final double LN_10 = Math.log(10D);
    private static final double LN_2 = Math.log(2D);
    static final BigInteger SQRT2_PRECOMPUTED_BITS = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
    static final int SQRT2_PRECOMPUTE_THRESHOLD = 256;

    private BigIntegerMath()
    {
    }

    public static BigInteger binomial(int i, int j)
    {
        MathPreconditions.checkNonNegative("n", i);
        MathPreconditions.checkNonNegative("k", j);
        int k;
        boolean flag;
        if (j <= i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "k (%s) > n (%s)", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        });
        k = j;
        if (j > i >> 1)
        {
            k = i - j;
        }
        if (k < LongMath.biggestBinomials.length && i <= LongMath.biggestBinomials[k])
        {
            return BigInteger.valueOf(LongMath.binomial(i, k));
        }
        BigInteger biginteger = BigInteger.ONE;
        long l1 = i;
        long l2 = 1L;
        int l = LongMath.log2(i, RoundingMode.CEILING);
        j = l;
        int i1 = 1;
        while (i1 < k) 
        {
            int j1 = i - i1;
            int k1 = i1 + 1;
            if (j + l >= 63)
            {
                biginteger = biginteger.multiply(BigInteger.valueOf(l1)).divide(BigInteger.valueOf(l2));
                l1 = j1;
                l2 = k1;
                j = l;
            } else
            {
                l1 *= j1;
                l2 *= k1;
                j += l;
            }
            i1++;
        }
        return biginteger.multiply(BigInteger.valueOf(l1)).divide(BigInteger.valueOf(l2));
    }

    public static BigInteger divide(BigInteger biginteger, BigInteger biginteger1, RoundingMode roundingmode)
    {
        return (new BigDecimal(biginteger)).divide(new BigDecimal(biginteger1), 0, roundingmode).toBigIntegerExact();
    }

    public static BigInteger factorial(int i)
    {
        MathPreconditions.checkNonNegative("n", i);
        if (i < LongMath.factorials.length)
        {
            return BigInteger.valueOf(LongMath.factorials[i]);
        }
        ArrayList arraylist = new ArrayList(IntMath.divide(IntMath.log2(i, RoundingMode.CEILING) * i, 64, RoundingMode.CEILING));
        int l = LongMath.factorials.length;
        long l2 = LongMath.factorials[l - 1];
        int k = Long.numberOfTrailingZeros(l2);
        l2 >>= k;
        int j = LongMath.log2(l2, RoundingMode.FLOOR) + 1;
        int j1 = LongMath.log2(l, RoundingMode.FLOOR) + 1;
        int k1 = 1 << j1 - 1;
        for (long l3 = l; l3 <= (long)i;)
        {
            int l1 = j1;
            int i1 = k1;
            if (((long)k1 & l3) != 0L)
            {
                i1 = k1 << 1;
                l1 = j1 + 1;
            }
            j1 = Long.numberOfTrailingZeros(l3);
            k += j1;
            long l4 = l2;
            if ((l1 - j1) + j >= 64)
            {
                arraylist.add(BigInteger.valueOf(l2));
                l4 = 1L;
            }
            l2 = l4 * (l3 >> j1);
            j = LongMath.log2(l2, RoundingMode.FLOOR) + 1;
            l3++;
            j1 = l1;
            k1 = i1;
        }

        if (l2 > 1L)
        {
            arraylist.add(BigInteger.valueOf(l2));
        }
        return listProduct(arraylist).shiftLeft(k);
    }

    static boolean fitsInLong(BigInteger biginteger)
    {
        return biginteger.bitLength() <= 63;
    }

    public static boolean isPowerOfTwo(BigInteger biginteger)
    {
        Preconditions.checkNotNull(biginteger);
        return biginteger.signum() > 0 && biginteger.getLowestSetBit() == biginteger.bitLength() - 1;
    }

    static BigInteger listProduct(List list)
    {
        return listProduct(list, 0, list.size());
    }

    static BigInteger listProduct(List list, int i, int j)
    {
        switch (j - i)
        {
        default:
            int k = j + i >>> 1;
            return listProduct(list, i, k).multiply(listProduct(list, k, j));

        case 0: // '\0'
            return BigInteger.ONE;

        case 1: // '\001'
            return (BigInteger)list.get(i);

        case 2: // '\002'
            return ((BigInteger)list.get(i)).multiply((BigInteger)list.get(i + 1));

        case 3: // '\003'
            return ((BigInteger)list.get(i)).multiply((BigInteger)list.get(i + 1)).multiply((BigInteger)list.get(i + 2));
        }
    }

    public static int log10(BigInteger biginteger, RoundingMode roundingmode)
    {
        MathPreconditions.checkPositive("x", biginteger);
        if (!fitsInLong(biginteger)) goto _L2; else goto _L1
_L1:
        int i = LongMath.log10(biginteger.longValue(), roundingmode);
_L9:
        return i;
_L2:
        BigInteger biginteger3;
        int j;
        int k;
        j = (int)(((double)log2(biginteger, RoundingMode.FLOOR) * LN_2) / LN_10);
        biginteger3 = BigInteger.TEN.pow(j);
        k = biginteger3.compareTo(biginteger);
        if (k <= 0) goto _L4; else goto _L3
_L3:
        int l;
        BigInteger biginteger1;
        do
        {
            k = j - 1;
            biginteger1 = biginteger3.divide(BigInteger.TEN);
            l = biginteger1.compareTo(biginteger);
            j = k;
            biginteger3 = biginteger1;
        } while (l > 0);
        biginteger3 = biginteger1;
_L6:
        i = k;
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
                    $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        BigInteger biginteger2;
        BigInteger biginteger4;
        switch (_cls1..SwitchMap.java.math.RoundingMode[roundingmode.ordinal()])
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            boolean flag;
            if (l == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            MathPreconditions.checkRoundingUnnecessary(flag);
            return k;

        case 4: // '\004'
        case 5: // '\005'
            i = k;
            if (!biginteger3.equals(biginteger))
            {
                return k + 1;
            }
            break;

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            i = k;
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
        case 3: // '\003'
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        biginteger2 = BigInteger.TEN.multiply(biginteger3);
        i = biginteger2.compareTo(biginteger);
_L7:
        l = k;
        k = j;
        if (i > 0) goto _L6; else goto _L5
_L5:
        j++;
        biginteger4 = BigInteger.TEN.multiply(biginteger2);
        l = biginteger4.compareTo(biginteger);
        k = i;
        biginteger3 = biginteger2;
        i = l;
        biginteger2 = biginteger4;
          goto _L7
        if (true) goto _L9; else goto _L8
_L8:
        if (biginteger.pow(2).compareTo(biginteger3.pow(2).multiply(BigInteger.TEN)) <= 0) goto _L9; else goto _L10
_L10:
        return k + 1;
    }

    public static int log2(BigInteger biginteger, RoundingMode roundingmode)
    {
        int i;
        MathPreconditions.checkPositive("x", (BigInteger)Preconditions.checkNotNull(biginteger));
        i = biginteger.bitLength() - 1;
        _cls1..SwitchMap.java.math.RoundingMode[roundingmode.ordinal()];
        JVM INSTR tableswitch 1 8: default 76
    //                   1 84
    //                   2 91
    //                   3 91
    //                   4 93
    //                   5 93
    //                   6 104
    //                   7 104
    //                   8 104;
           goto _L1 _L2 _L3 _L3 _L4 _L4 _L5 _L5 _L5
_L3:
        break MISSING_BLOCK_LABEL_91;
_L1:
        throw new AssertionError();
_L2:
        MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(biginteger));
_L7:
        return i;
_L4:
        if (isPowerOfTwo(biginteger)) goto _L7; else goto _L6
_L6:
        return i + 1;
_L5:
        if (i >= 256)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (biginteger.compareTo(SQRT2_PRECOMPUTED_BITS.shiftRight(256 - i)) <= 0) goto _L7; else goto _L8
_L8:
        return i + 1;
        if (biginteger.pow(2).bitLength() - 1 < i * 2 + 1) goto _L7; else goto _L9
_L9:
        return i + 1;
    }

    public static BigInteger sqrt(BigInteger biginteger, RoundingMode roundingmode)
    {
        MathPreconditions.checkNonNegative("x", biginteger);
        if (!fitsInLong(biginteger)) goto _L2; else goto _L1
_L1:
        BigInteger biginteger1 = BigInteger.valueOf(LongMath.sqrt(biginteger.longValue(), roundingmode));
_L4:
        return biginteger1;
_L2:
        BigInteger biginteger2;
        biginteger2 = sqrtFloor(biginteger);
        biginteger1 = biginteger2;
        switch (_cls1..SwitchMap.java.math.RoundingMode[roundingmode.ordinal()])
        {
        default:
            throw new AssertionError();

        case 2: // '\002'
        case 3: // '\003'
            break;

        case 1: // '\001'
            MathPreconditions.checkRoundingUnnecessary(biginteger2.pow(2).equals(biginteger));
            return biginteger2;

        case 4: // '\004'
        case 5: // '\005'
            int i = biginteger2.intValue();
            boolean flag;
            if (i * i == biginteger.intValue() && biginteger2.pow(2).equals(biginteger))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            biginteger1 = biginteger2;
            if (!flag)
            {
                return biginteger2.add(BigInteger.ONE);
            }
            break;

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            biginteger1 = biginteger2;
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (biginteger2.pow(2).add(biginteger2).compareTo(biginteger) >= 0) goto _L4; else goto _L5
_L5:
        return biginteger2.add(BigInteger.ONE);
    }

    private static BigInteger sqrtApproxWithDoubles(BigInteger biginteger)
    {
        return DoubleMath.roundToBigInteger(Math.sqrt(DoubleUtils.bigToDouble(biginteger)), RoundingMode.HALF_EVEN);
    }

    private static BigInteger sqrtFloor(BigInteger biginteger)
    {
        int i = log2(biginteger, RoundingMode.FLOOR);
        BigInteger biginteger1;
        BigInteger biginteger2;
        BigInteger biginteger3;
        if (i < 1023)
        {
            biginteger2 = sqrtApproxWithDoubles(biginteger);
        } else
        {
            i = i - 52 & -2;
            biginteger2 = sqrtApproxWithDoubles(biginteger.shiftRight(i)).shiftLeft(i >> 1);
        }
        biginteger3 = biginteger2.add(biginteger.divide(biginteger2)).shiftRight(1);
        biginteger1 = biginteger3;
        if (biginteger2.equals(biginteger3))
        {
            return biginteger2;
        }
        do
        {
            biginteger2 = biginteger1;
            biginteger3 = biginteger2.add(biginteger.divide(biginteger2)).shiftRight(1);
            biginteger1 = biginteger3;
        } while (biginteger3.compareTo(biginteger2) < 0);
        return biginteger2;
    }

}
