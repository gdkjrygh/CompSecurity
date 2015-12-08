// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.math;

import com.google.common.base.Preconditions;
import java.math.RoundingMode;

// Referenced classes of package com.google.common.math:
//            MathPreconditions

public final class IntMath
{

    static final int FLOOR_SQRT_MAX_INT = 46340;
    static final int MAX_POWER_OF_SQRT2_UNSIGNED = 0xb504f333;
    static int biggestBinomials[] = {
        0x7fffffff, 0x7fffffff, 0x10000, 2345, 477, 193, 110, 75, 58, 49, 
        43, 39, 37, 35, 34, 34, 33
    };
    private static final int factorials[] = {
        1, 1, 2, 6, 24, 120, 720, 5040, 40320, 0x58980, 
        0x375f00, 0x2611500, 0x1c8cfc00
    };
    static final int halfPowersOf10[] = {
        3, 31, 316, 3162, 31622, 0x4d343, 0x3040a5, 0x1e28678, 0x12d940b6, 0x7fffffff
    };
    static final byte maxLog10ForLeadingZeros[] = {
        9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 
        6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 
        3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 
        0, 0, 0
    };
    static final int powersOf10[] = {
        1, 10, 100, 1000, 10000, 0x186a0, 0xf4240, 0x989680, 0x5f5e100, 0x3b9aca00
    };

    private IntMath()
    {
    }

    public static int binomial(int i, int j)
    {
        int k;
        boolean flag;
        flag = true;
        MathPreconditions.checkNonNegative("n", i);
        MathPreconditions.checkNonNegative("k", j);
        boolean flag1;
        if (j <= i)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "k (%s) > n (%s)", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        });
        k = j;
        if (j > i >> 1)
        {
            k = i - j;
        }
        if (k < biggestBinomials.length && i <= biggestBinomials[k]) goto _L2; else goto _L1
_L1:
        j = 0x7fffffff;
_L4:
        return j;
_L2:
        long l;
        j = ((flag) ? 1 : 0);
        switch (k)
        {
        default:
            l = 1L;
            for (j = 0; j < k; j++)
            {
                l = (l * (long)(i - j)) / (long)(j + 1);
            }

            break; /* Loop/switch isn't completed */

        case 0: // '\0'
            break;

        case 1: // '\001'
            return i;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return (int)l;
    }

    public static int checkedAdd(int i, int j)
    {
        long l = (long)i + (long)j;
        boolean flag;
        if (l == (long)(int)l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        MathPreconditions.checkNoOverflow(flag);
        return (int)l;
    }

    public static int checkedMultiply(int i, int j)
    {
        long l = (long)i * (long)j;
        boolean flag;
        if (l == (long)(int)l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        MathPreconditions.checkNoOverflow(flag);
        return (int)l;
    }

    public static int checkedPow(int i, int j)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        MathPreconditions.checkNonNegative("exponent", j);
        i;
        JVM INSTR tableswitch -2 2: default 48
    //                   -2 173
    //                   -1 147
    //                   0 139
    //                   1 143
    //                   2 155;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        int l = 1;
        int k = j;
        do
        {
            switch (k)
            {
            default:
                j = l;
                if ((k & 1) != 0)
                {
                    j = checkedMultiply(l, i);
                }
                int i1 = k >> 1;
                l = j;
                k = i1;
                if (i1 > 0)
                {
                    if (-46340 <= i)
                    {
                        k = 1;
                    } else
                    {
                        k = 0;
                    }
                    if (i <= 46340)
                    {
                        l = 1;
                    } else
                    {
                        l = 0;
                    }
                    MathPreconditions.checkNoOverflow(l & k);
                    i *= i;
                    l = j;
                    k = i1;
                }
                break;

            case 0: // '\0'
                return l;

            case 1: // '\001'
                return checkedMultiply(l, i);
            }
        } while (true);
_L4:
        if (j != 0) goto _L7; else goto _L5
_L5:
        return 1;
_L7:
        return 0;
_L3:
        if ((j & 1) == 0) goto _L5; else goto _L8
_L8:
        return -1;
_L6:
        if (j < 31)
        {
            flag = true;
        }
        MathPreconditions.checkNoOverflow(flag);
        return 1 << j;
_L2:
        flag = flag1;
        if (j < 32)
        {
            flag = true;
        }
        MathPreconditions.checkNoOverflow(flag);
        if ((j & 1) == 0)
        {
            return 1 << j;
        } else
        {
            return -1 << j;
        }
    }

    public static int checkedSubtract(int i, int j)
    {
        long l = (long)i - (long)j;
        boolean flag;
        if (l == (long)(int)l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        MathPreconditions.checkNoOverflow(flag);
        return (int)l;
    }

    public static int divide(int i, int j, RoundingMode roundingmode)
    {
        int k;
        int i1;
        boolean flag;
        flag = true;
        Preconditions.checkNotNull(roundingmode);
        if (j == 0)
        {
            throw new ArithmeticException("/ by zero");
        }
        k = i / j;
        i1 = i - j * k;
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        return k;
_L2:
        int l = (i ^ j) >> 31 | 1;
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

        _cls1..SwitchMap.java.math.RoundingMode[roundingmode.ordinal()];
        JVM INSTR tableswitch 1 8: default 104
    //                   1 112
    //                   2 122
    //                   3 159
    //                   4 139
    //                   5 144
    //                   6 174
    //                   7 174
    //                   8 174;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L9 _L9
_L7:
        break; /* Loop/switch isn't completed */
_L3:
        throw new AssertionError();
_L4:
        if (i1 != 0)
        {
            flag = false;
        }
        MathPreconditions.checkRoundingUnnecessary(flag);
_L5:
        i = 0;
_L11:
        if (i != 0)
        {
            return k + l;
        }
        if (true) goto _L1; else goto _L10
_L10:
        i = 1;
          goto _L11
_L8:
        if (l > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L11
_L6:
        if (l < 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L11
_L9:
label0:
        {
            i = Math.abs(i1);
            i -= Math.abs(j) - i;
            if (i != 0)
            {
                break MISSING_BLOCK_LABEL_243;
            }
            if (roundingmode != RoundingMode.HALF_UP)
            {
                if (roundingmode == RoundingMode.HALF_EVEN)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if ((k & 1) != 0)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                if ((j & i) == 0)
                {
                    break label0;
                }
            }
            i = 1;
        }
          goto _L11
        i = 0;
          goto _L11
        if (i > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L11
    }

    public static int factorial(int i)
    {
        MathPreconditions.checkNonNegative("n", i);
        if (i < factorials.length)
        {
            return factorials[i];
        } else
        {
            return 0x7fffffff;
        }
    }

    public static int gcd(int i, int j)
    {
        MathPreconditions.checkNonNegative("a", i);
        MathPreconditions.checkNonNegative("b", j);
        int k;
        if (i == 0)
        {
            k = j;
        } else
        {
            k = i;
            if (j != 0)
            {
                int i1 = Integer.numberOfTrailingZeros(i);
                int l = i >> i1;
                int j1 = Integer.numberOfTrailingZeros(j);
                i = j >> j1;
                for (j = l; j != i; j = l >> Integer.numberOfTrailingZeros(l))
                {
                    l = j - i;
                    j = l & l >> 31;
                    l = l - j - j;
                    i += j;
                }

                return j << Math.min(i1, j1);
            }
        }
        return k;
    }

    public static boolean isPowerOfTwo(int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i - 1 & i) == 0)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        return i & flag;
    }

    static int lessThanBranchFree(int i, int j)
    {
        return ~~(i - j) >>> 31;
    }

    public static int log10(int i, RoundingMode roundingmode)
    {
        MathPreconditions.checkPositive("x", i);
        int j = log10Floor(i);
        int k = powersOf10[j];
        switch (_cls1..SwitchMap.java.math.RoundingMode[roundingmode.ordinal()])
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            boolean flag;
            if (i == k)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            MathPreconditions.checkRoundingUnnecessary(flag);
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            return j;

        case 4: // '\004'
        case 5: // '\005'
            return j + lessThanBranchFree(k, i);

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            return j + lessThanBranchFree(halfPowersOf10[j], i);
        }
    }

    private static int log10Floor(int i)
    {
        byte byte0 = maxLog10ForLeadingZeros[Integer.numberOfLeadingZeros(i)];
        return byte0 - lessThanBranchFree(i, powersOf10[byte0]);
    }

    public static int log2(int i, RoundingMode roundingmode)
    {
        MathPreconditions.checkPositive("x", i);
        int j;
        switch (_cls1..SwitchMap.java.math.RoundingMode[roundingmode.ordinal()])
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(i));
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            return 31 - Integer.numberOfLeadingZeros(i);

        case 4: // '\004'
        case 5: // '\005'
            return 32 - Integer.numberOfLeadingZeros(i - 1);

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            j = Integer.numberOfLeadingZeros(i);
            break;
        }
        return lessThanBranchFree(0xb504f333 >>> j, i) + (31 - j);
    }

    public static int mean(int i, int j)
    {
        return (i & j) + ((i ^ j) >> 1);
    }

    public static int mod(int i, int j)
    {
        if (j <= 0)
        {
            throw new ArithmeticException((new StringBuilder(31)).append("Modulus ").append(j).append(" must be > 0").toString());
        }
        i %= j;
        if (i >= 0)
        {
            return i;
        } else
        {
            return i + j;
        }
    }

    public static int pow(int i, int j)
    {
        int k;
        k = 0;
        MathPreconditions.checkNonNegative("exponent", j);
        i;
        JVM INSTR tableswitch -2 2: default 44
    //                   -2 121
    //                   -1 99
    //                   0 91
    //                   1 95
    //                   2 107;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        k = 1;
        do
        {
            switch (j)
            {
            default:
                int l;
                if ((j & 1) == 0)
                {
                    l = 1;
                } else
                {
                    l = i;
                }
                k *= l;
                i *= i;
                j >>= 1;
                break;

            case 0: // '\0'
                return k;

            case 1: // '\001'
                return i * k;
            }
        } while (true);
_L4:
        if (j != 0) goto _L7; else goto _L5
_L5:
        return 1;
_L7:
        return 0;
_L3:
        if ((j & 1) == 0) goto _L5; else goto _L8
_L8:
        return -1;
_L6:
        i = k;
        if (j < 32)
        {
            i = 1 << j;
        }
        return i;
_L2:
        if (j < 32)
        {
            if ((j & 1) == 0)
            {
                return 1 << j;
            } else
            {
                return -(1 << j);
            }
        } else
        {
            return 0;
        }
    }

    public static int sqrt(int i, RoundingMode roundingmode)
    {
        MathPreconditions.checkNonNegative("x", i);
        int j = sqrtFloor(i);
        switch (_cls1..SwitchMap.java.math.RoundingMode[roundingmode.ordinal()])
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            boolean flag;
            if (j * j == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            MathPreconditions.checkRoundingUnnecessary(flag);
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            return j;

        case 4: // '\004'
        case 5: // '\005'
            return j + lessThanBranchFree(j * j, i);

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            return j + lessThanBranchFree(j * j + j, i);
        }
    }

    private static int sqrtFloor(int i)
    {
        return (int)Math.sqrt(i);
    }

}
