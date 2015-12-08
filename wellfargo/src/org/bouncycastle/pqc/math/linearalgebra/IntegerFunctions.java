// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;

public final class IntegerFunctions
{

    private static final BigInteger FOUR = BigInteger.valueOf(4L);
    private static final BigInteger ONE = BigInteger.valueOf(1L);
    private static final int SMALL_PRIMES[] = {
        3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 
        37, 41
    };
    private static final long SMALL_PRIME_PRODUCT = 0x8a5b6470af95L;
    private static final BigInteger TWO = BigInteger.valueOf(2L);
    private static final BigInteger ZERO = BigInteger.valueOf(0L);
    private static final int jacobiTable[] = {
        0, 1, 0, -1, 0, -1, 0, 1
    };
    private static SecureRandom sr = null;

    private IntegerFunctions()
    {
    }

    public static BigInteger binomial(int i, int j)
    {
        BigInteger biginteger = ONE;
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (j != 0) goto _L4; else goto _L3
_L3:
        BigInteger biginteger1 = biginteger;
_L6:
        return biginteger1;
_L4:
        return ZERO;
_L2:
        int k = j;
        if (j > i >>> 1)
        {
            k = i - j;
        }
        j = 1;
        do
        {
            biginteger1 = biginteger;
            if (j > k)
            {
                continue;
            }
            biginteger = biginteger.multiply(BigInteger.valueOf(i - (j - 1))).divide(BigInteger.valueOf(j));
            j++;
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static int bitCount(int i)
    {
        int j = 0;
        for (; i != 0; i >>>= 1)
        {
            j += i & 1;
        }

        return j;
    }

    public static int ceilLog(int i)
    {
        int j = 0;
        for (int k = 1; k < i;)
        {
            k <<= 1;
            j++;
        }

        return j;
    }

    public static int ceilLog(BigInteger biginteger)
    {
        int i = 0;
        for (BigInteger biginteger1 = ONE; biginteger1.compareTo(biginteger) < 0; biginteger1 = biginteger1.shiftLeft(1))
        {
            i++;
        }

        return i;
    }

    public static int ceilLog256(int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        int k = 1;
_L4:
        return k;
_L2:
        int j = i;
        if (i < 0)
        {
            j = -i;
        }
        i = 0;
        do
        {
            k = i;
            if (j <= 0)
            {
                continue;
            }
            i++;
            j >>>= 8;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int ceilLog256(long l)
    {
        if (l != 0L) goto _L2; else goto _L1
_L1:
        int j = 1;
_L4:
        return j;
_L2:
        long l1 = l;
        if (l < 0L)
        {
            l1 = -l;
        }
        int i = 0;
        do
        {
            j = i;
            if (l1 <= 0L)
            {
                continue;
            }
            i++;
            l1 >>>= 8;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static BigInteger divideAndRound(BigInteger biginteger, BigInteger biginteger1)
    {
        if (biginteger.signum() < 0)
        {
            return divideAndRound(biginteger.negate(), biginteger1).negate();
        }
        if (biginteger1.signum() < 0)
        {
            return divideAndRound(biginteger, biginteger1.negate()).negate();
        } else
        {
            return biginteger.shiftLeft(1).add(biginteger1).divide(biginteger1.shiftLeft(1));
        }
    }

    public static BigInteger[] divideAndRound(BigInteger abiginteger[], BigInteger biginteger)
    {
        BigInteger abiginteger1[] = new BigInteger[abiginteger.length];
        for (int i = 0; i < abiginteger.length; i++)
        {
            abiginteger1[i] = divideAndRound(abiginteger[i], biginteger);
        }

        return abiginteger1;
    }

    public static int[] extGCD(int i, int j)
    {
        BigInteger abiginteger[] = extgcd(BigInteger.valueOf(i), BigInteger.valueOf(j));
        return (new int[] {
            abiginteger[0].intValue(), abiginteger[1].intValue(), abiginteger[2].intValue()
        });
    }

    public static BigInteger[] extgcd(BigInteger biginteger, BigInteger biginteger1)
    {
        BigInteger biginteger2 = ONE;
        BigInteger biginteger3 = ZERO;
        BigInteger biginteger4;
        BigInteger biginteger5;
        if (biginteger1.signum() != 0)
        {
            BigInteger biginteger6 = ZERO;
            biginteger5 = biginteger;
            biginteger3 = biginteger1;
            biginteger4 = biginteger2;
            BigInteger biginteger8;
            for (biginteger2 = biginteger6; biginteger3.signum() != 0; biginteger2 = biginteger8)
            {
                BigInteger abiginteger[] = biginteger5.divideAndRemainder(biginteger3);
                biginteger5 = abiginteger[0];
                BigInteger biginteger7 = abiginteger[1];
                biginteger8 = biginteger4.subtract(biginteger5.multiply(biginteger2));
                biginteger5 = biginteger3;
                biginteger3 = biginteger7;
                biginteger4 = biginteger2;
            }

            biginteger = biginteger5.subtract(biginteger.multiply(biginteger4)).divide(biginteger1);
        } else
        {
            biginteger5 = biginteger;
            biginteger = biginteger3;
            biginteger4 = biginteger2;
        }
        return (new BigInteger[] {
            biginteger5, biginteger4, biginteger
        });
    }

    public static float floatLog(float f)
    {
        double d1 = (f - 1.0F) / (1.0F + f);
        int i = 1;
        f = (float)d1;
        for (double d = d1; d > 0.001D;)
        {
            i += 2;
            d *= d1 * d1;
            f = (float)((double)f + (1.0D / (double)i) * d);
        }

        return f * 2.0F;
    }

    public static float floatPow(float f, int i)
    {
        float f1 = 1.0F;
        for (; i > 0; i--)
        {
            f1 *= f;
        }

        return f1;
    }

    public static int floorLog(int i)
    {
        if (i > 0) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        return k;
_L2:
        k = 0;
        int j = i >>> 1;
        i = k;
        do
        {
            k = i;
            if (j <= 0)
            {
                continue;
            }
            j >>>= 1;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int floorLog(BigInteger biginteger)
    {
        int i = -1;
        for (BigInteger biginteger1 = ONE; biginteger1.compareTo(biginteger) <= 0; biginteger1 = biginteger1.shiftLeft(1))
        {
            i++;
        }

        return i;
    }

    public static int gcd(int i, int j)
    {
        return BigInteger.valueOf(i).gcd(BigInteger.valueOf(j)).intValue();
    }

    public static float intRoot(int i, int j)
    {
        float f = i / j;
        float f1 = 0.0F;
        int k = 0;
        float f2;
        for (; (double)Math.abs(f1 - f) > 0.0001D; f = f2)
        {
            for (f2 = floatPow(f, j); Float.isInfinite(f2); f2 = floatPow(f, j))
            {
                f = (f + f1) / 2.0F;
            }

            k++;
            f2 = f - (f2 - (float)i) / ((float)j * floatPow(f, j - 1));
            f1 = f;
        }

        return f;
    }

    public static byte[] integerToOctets(BigInteger biginteger)
    {
        byte abyte0[] = biginteger.abs().toByteArray();
        if ((biginteger.bitLength() & 7) != 0)
        {
            return abyte0;
        } else
        {
            biginteger = new byte[biginteger.bitLength() >> 3];
            System.arraycopy(abyte0, 1, biginteger, 0, biginteger.length);
            return biginteger;
        }
    }

    public static boolean isIncreasing(int ai[])
    {
        boolean flag1 = true;
        int i = 1;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < ai.length)
                {
                    if (ai[i - 1] < ai[i])
                    {
                        break label0;
                    }
                    System.out.println((new StringBuilder()).append("a[").append(i - 1).append("] = ").append(ai[i - 1]).append(" >= ").append(ai[i]).append(" = a[").append(i).append("]").toString());
                    flag = false;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public static int isPower(int i, int j)
    {
        if (i > 0) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        boolean flag = false;
        int k = i;
        i = ((flag) ? 1 : 0);
label0:
        do
        {
label1:
            {
                if (k <= 1)
                {
                    break label1;
                }
                if (k % j != 0)
                {
                    break label0;
                }
                k /= j;
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return i;
    }

    public static boolean isPrime(int i)
    {
        if (i >= 2)
        {
            if (i == 2)
            {
                return true;
            }
            if ((i & 1) != 0)
            {
                if (i < 42)
                {
                    for (int j = 0; j < SMALL_PRIMES.length; j++)
                    {
                        if (i == SMALL_PRIMES[j])
                        {
                            return true;
                        }
                    }

                }
                if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0 && i % 13 != 0 && i % 17 != 0 && i % 19 != 0 && i % 23 != 0 && i % 29 != 0 && i % 31 != 0 && i % 37 != 0 && i % 41 != 0)
                {
                    return BigInteger.valueOf(i).isProbablePrime(20);
                }
            }
        }
        return false;
    }

    public static int jacobi(BigInteger biginteger, BigInteger biginteger1)
    {
        int i;
        boolean flag;
        long l;
        i = 1;
        flag = false;
        l = 1L;
        if (!biginteger1.equals(ZERO)) goto _L2; else goto _L1
_L1:
        if (!biginteger.abs().equals(ONE))
        {
            i = 0;
        }
_L4:
        return i;
_L2:
        if (biginteger.testBit(0))
        {
            break; /* Loop/switch isn't completed */
        }
        i = ((flag) ? 1 : 0);
        if (!biginteger1.testBit(0)) goto _L4; else goto _L3
_L3:
        long l2 = l;
        BigInteger biginteger3 = biginteger1;
        if (biginteger1.signum() == -1)
        {
            biginteger1 = biginteger1.negate();
            l2 = l;
            biginteger3 = biginteger1;
            if (biginteger.signum() == -1)
            {
                l2 = -1L;
                biginteger3 = biginteger1;
            }
        }
        biginteger1 = ZERO;
        for (; !biginteger3.testBit(0); biginteger3 = biginteger3.divide(TWO))
        {
            biginteger1 = biginteger1.add(ONE);
        }

        l = l2;
        if (biginteger1.testBit(0))
        {
            l = l2 * (long)jacobiTable[biginteger.intValue() & 7];
        }
        l2 = l;
        BigInteger biginteger2 = biginteger;
        biginteger1 = biginteger3;
        if (biginteger.signum() < 0)
        {
            l2 = l;
            if (biginteger3.testBit(1))
            {
                l2 = -l;
            }
            biginteger2 = biginteger.negate();
            biginteger1 = biginteger3;
        }
        while (biginteger2.signum() != 0) 
        {
            BigInteger biginteger4 = ZERO;
            biginteger = biginteger2;
            biginteger2 = biginteger4;
            for (; !biginteger.testBit(0); biginteger = biginteger.divide(TWO))
            {
                biginteger2 = biginteger2.add(ONE);
            }

            long l1 = l2;
            if (biginteger2.testBit(0))
            {
                l1 = l2 * (long)jacobiTable[biginteger1.intValue() & 7];
            }
            l2 = l1;
            biginteger2 = biginteger;
            biginteger4 = biginteger1;
            if (biginteger.compareTo(biginteger1) < 0)
            {
                if (biginteger1.testBit(1) && biginteger.testBit(1))
                {
                    l2 = -l1;
                    biginteger4 = biginteger;
                    biginteger2 = biginteger1;
                } else
                {
                    l2 = l1;
                    biginteger2 = biginteger1;
                    biginteger4 = biginteger;
                }
            }
            biginteger2 = biginteger2.subtract(biginteger4);
            biginteger1 = biginteger4;
        }
        i = ((flag) ? 1 : 0);
        if (biginteger1.equals(ONE))
        {
            return (int)l2;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public static BigInteger leastCommonMultiple(BigInteger abiginteger[])
    {
        int j = abiginteger.length;
        BigInteger biginteger = abiginteger[0];
        for (int i = 1; i < j; i++)
        {
            BigInteger biginteger1 = biginteger.gcd(abiginteger[i]);
            biginteger = biginteger.multiply(abiginteger[i]).divide(biginteger1);
        }

        return biginteger;
    }

    public static int leastDiv(int i)
    {
        int j;
        int k;
        if (i < 0)
        {
            j = -i;
        } else
        {
            j = i;
        }
        if (j != 0) goto _L2; else goto _L1
_L1:
        k = 1;
_L4:
        return k;
_L2:
        if ((j & 1) == 0)
        {
            return 2;
        }
        i = 3;
label0:
        do
        {
label1:
            {
                if (i > j / i)
                {
                    break label1;
                }
                k = i;
                if (j % i == 0)
                {
                    break label0;
                }
                i += 2;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return j;
    }

    public static double log(double d)
    {
        if (d > 0.0D && d < 1.0D)
        {
            return -log(1.0D / d);
        }
        int i = 0;
        double d1 = 1.0D;
        for (double d2 = d; d2 > 2D;)
        {
            d2 /= 2D;
            i++;
            d1 *= 2D;
        }

        return logBKM(d / d1) + (double)i;
    }

    public static double log(long l)
    {
        int i = floorLog(BigInteger.valueOf(l));
        long l1 = 1 << i;
        double d = logBKM((double)l / (double)l1);
        return (double)i + d;
    }

    private static double logBKM(double d)
    {
        int i = 0;
        double d2 = 1.0D;
        double d3 = 0.0D;
        double d1 = 1.0D;
        for (; i < 53; i++)
        {
            double d4 = d1 * d2 + d1;
            if (d4 <= d)
            {
                d3 += (new double[] {
                    1.0D, 0.58496250072115619D, 0.32192809488736235D, 0.16992500144231237D, 0.087462841250339401D, 0.044394119358453436D, 0.02236781302845451D, 0.011227255423254119D, 0.0056245491938781067D, 0.0028150156070540383D, 
                    0.0014081943928083889D, 0.00070426901124664325D, 0.00035217748030102726D, 0.00017609948644250602D, 8.8052430122176906E-05D, 4.4026886827316716E-05D, 2.2013611360340496E-05D, 1.1006847667481442E-05D, 5.503434330648604E-06D, 2.7517197895612829E-06D, 
                    1.3758605508411381E-06D, 6.8793043943584969E-07D, 3.4396526072176454E-07D, 1.7198264061184464E-07D, 8.5991322868663213E-08D, 4.2995662075016872E-08D, 2.1497831197679756E-08D, 1.0748915638882709E-08D, 5.374457829452062E-09D, 2.6872289172287081E-09D, 
                    1.3436144592400231E-09D, 6.7180722977642895E-10D, 3.3590361492731876E-10D, 1.6795180747343547E-10D, 8.3975903739161756E-11D, 4.1987951870191886E-11D, 2.0993975935248694E-11D, 1.0496987967662534E-11D, 5.2484939838408146E-12D, 2.6242469919227939E-12D, 
                    1.3121234959619935E-12D, 6.5606174798114599E-13D, 3.2803087399061026E-13D, 1.6401543699531447E-13D, 8.2007718497659557E-14D, 4.1003859248830365E-14D, 2.0501929624415328E-14D, 1.02509648122077E-14D, 5.1254824061038595E-15D, 2.5627412030519317E-15D, 
                    1.2813706015259665E-15D, 6.4068530076298343E-16D, 3.2034265038149171E-16D, 1.6017132519074588E-16D, 8.0085662595372941E-17D, 4.0042831297686471E-17D, 2.0021415648843235E-17D, 1.0010707824421618E-17D, 5.0053539122108088E-18D, 2.5026769561054044E-18D, 
                    1.2513384780527022E-18D, 6.256692390263511E-19D, 3.1283461951317555E-19D, 1.5641730975658778E-19D, 7.8208654878293888E-20D, 3.9104327439146944E-20D, 1.9552163719573472E-20D, 9.776081859786736E-21D, 4.888040929893368E-21D, 2.444020464946684E-21D, 
                    1.222010232473342E-21D, 6.11005116236671E-22D, 3.055025581183355E-22D, 1.5275127905916775E-22D, 7.6375639529583875E-23D, 3.8187819764791937E-23D, 1.9093909882395969E-23D, 9.5469549411979843E-24D, 4.7734774705989922E-24D, 2.3867387352994961E-24D, 
                    1.193369367649748E-24D, 5.9668468382487402E-25D, 2.9834234191243701E-25D, 1.4917117095621851E-25D, 7.4585585478109253E-26D, 3.7292792739054626E-26D, 1.8646396369527313E-26D, 9.3231981847636566E-27D, 4.6615990923818283E-27D, 2.3307995461909141E-27D, 
                    1.1653997730954571E-27D, 5.8269988654772854E-28D, 2.9134994327386427E-28D, 1.4567497163693213E-28D, 7.2837485818466067E-29D, 3.6418742909233034E-29D, 1.8209371454616517E-29D, 9.1046857273082584E-30D, 4.5523428636541292E-30D, 2.2761714318270646E-30D
                })[i];
                d1 = d4;
            }
            d2 *= 0.5D;
        }

        return d3;
    }

    public static void main(String args[])
    {
        System.out.println("test");
        System.out.println(floatLog(10F));
        System.out.println("test2");
    }

    public static int maxPower(int i)
    {
        int l = 0;
        int j = 0;
        if (i != 0)
        {
            int k = 1;
            do
            {
                l = j;
                if ((i & k) != 0)
                {
                    break;
                }
                k <<= 1;
                j++;
            } while (true);
        }
        return l;
    }

    public static long mod(long l, long l1)
    {
        long l2 = l % l1;
        l = l2;
        if (l2 < 0L)
        {
            l = l2 + l1;
        }
        return l;
    }

    public static int modInverse(int i, int j)
    {
        return BigInteger.valueOf(i).modInverse(BigInteger.valueOf(j)).intValue();
    }

    public static long modInverse(long l, long l1)
    {
        return BigInteger.valueOf(l).modInverse(BigInteger.valueOf(l1)).longValue();
    }

    public static int modPow(int i, int j, int k)
    {
        if (k > 0 && k * k <= 0x7fffffff && j >= 0) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L4:
        return i1;
_L2:
        int l = (i % k + k) % k;
        i = 1;
        do
        {
            i1 = i;
            if (j <= 0)
            {
                continue;
            }
            i1 = i;
            if ((j & 1) == 1)
            {
                i1 = (i * l) % k;
            }
            l = (l * l) % k;
            j >>>= 1;
            i = i1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static BigInteger nextPrime(long l)
    {
        boolean flag = false;
        long l2 = 0L;
        if (l <= 1L)
        {
            return BigInteger.valueOf(2L);
        }
        if (l == 2L)
        {
            return BigInteger.valueOf(3L);
        }
        long l1 = (1L & l) + (1L + l);
        while (l1 <= l << 1 && !flag) 
        {
            for (long l3 = 3L; l3 <= l1 >> 1 && !flag; l3 += 2L)
            {
                if (l1 % l3 == 0L)
                {
                    flag = true;
                }
            }

            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
                l2 = l1;
            }
            l1 += 2L;
        }
        return BigInteger.valueOf(l2);
    }

    public static BigInteger nextProbablePrime(BigInteger biginteger)
    {
        return nextProbablePrime(biginteger, 20);
    }

    public static BigInteger nextProbablePrime(BigInteger biginteger, int i)
    {
        if (biginteger.signum() >= 0 && biginteger.signum() != 0 && !biginteger.equals(ONE)) goto _L2; else goto _L1
_L1:
        BigInteger biginteger1 = TWO;
_L4:
        return biginteger1;
_L2:
        biginteger1 = biginteger.add(ONE);
        biginteger = biginteger1;
        if (!biginteger1.testBit(0))
        {
            biginteger = biginteger1.add(ONE);
        }
_L6:
        do
        {
label0:
            {
                if (biginteger.bitLength() <= 6)
                {
                    break label0;
                }
                long l = biginteger.remainder(BigInteger.valueOf(0x8a5b6470af95L)).longValue();
                if (l % 3L != 0L && l % 5L != 0L && l % 7L != 0L && l % 11L != 0L && l % 13L != 0L && l % 17L != 0L && l % 19L != 0L && l % 23L != 0L && l % 29L != 0L && l % 31L != 0L && l % 37L != 0L && l % 41L != 0L)
                {
                    break label0;
                }
                biginteger = biginteger.add(TWO);
            }
        } while (true);
        biginteger1 = biginteger;
        if (biginteger.bitLength() < 4) goto _L4; else goto _L3
_L3:
        biginteger1 = biginteger;
        if (biginteger.isProbablePrime(i)) goto _L4; else goto _L5
_L5:
        biginteger = biginteger.add(TWO);
          goto _L6
    }

    public static int nextSmallerPrime(int i)
    {
        if (i <= 2)
        {
            return 1;
        }
        if (i == 3)
        {
            return 2;
        }
        if ((i & 1) == 0)
        {
            i--;
        } else
        {
            i -= 2;
        }
        do
        {
            boolean flag;
            boolean flag1;
            if (i > 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!isPrime(i))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag & flag1)
            {
                i -= 2;
            } else
            {
                return i;
            }
        } while (true);
    }

    public static BigInteger octetsToInteger(byte abyte0[])
    {
        return octetsToInteger(abyte0, 0, abyte0.length);
    }

    public static BigInteger octetsToInteger(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j + 1];
        abyte1[0] = 0;
        System.arraycopy(abyte0, i, abyte1, 1, j);
        return new BigInteger(abyte1);
    }

    public static int order(int i, int j)
    {
_L2:
        int l;
        while (k != 1) 
        {
            int i1 = (k * i) % j;
            k = i1;
            if (i1 < 0)
            {
                k = i1 + j;
            }
            l++;
        }
        return l;
        int k = i % j;
        if (k == 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(i).append(" is not an element of Z/(").append(j).append("Z)^*; it is not meaningful to compute its order.").toString());
        }
        l = 1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean passesSmallPrimeTest(BigInteger biginteger)
    {
        int ai[] = new int[239];
        int[] _tmp = ai;
        ai[0] = 2;
        ai[1] = 3;
        ai[2] = 5;
        ai[3] = 7;
        ai[4] = 11;
        ai[5] = 13;
        ai[6] = 17;
        ai[7] = 19;
        ai[8] = 23;
        ai[9] = 29;
        ai[10] = 31;
        ai[11] = 37;
        ai[12] = 41;
        ai[13] = 43;
        ai[14] = 47;
        ai[15] = 53;
        ai[16] = 59;
        ai[17] = 61;
        ai[18] = 67;
        ai[19] = 71;
        ai[20] = 73;
        ai[21] = 79;
        ai[22] = 83;
        ai[23] = 89;
        ai[24] = 97;
        ai[25] = 101;
        ai[26] = 103;
        ai[27] = 107;
        ai[28] = 109;
        ai[29] = 113;
        ai[30] = 127;
        ai[31] = 131;
        ai[32] = 137;
        ai[33] = 139;
        ai[34] = 149;
        ai[35] = 151;
        ai[36] = 157;
        ai[37] = 163;
        ai[38] = 167;
        ai[39] = 173;
        ai[40] = 179;
        ai[41] = 181;
        ai[42] = 191;
        ai[43] = 193;
        ai[44] = 197;
        ai[45] = 199;
        ai[46] = 211;
        ai[47] = 223;
        ai[48] = 227;
        ai[49] = 229;
        ai[50] = 233;
        ai[51] = 239;
        ai[52] = 241;
        ai[53] = 251;
        ai[54] = 257;
        ai[55] = 263;
        ai[56] = 269;
        ai[57] = 271;
        ai[58] = 277;
        ai[59] = 281;
        ai[60] = 283;
        ai[61] = 293;
        ai[62] = 307;
        ai[63] = 311;
        ai[64] = 313;
        ai[65] = 317;
        ai[66] = 331;
        ai[67] = 337;
        ai[68] = 347;
        ai[69] = 349;
        ai[70] = 353;
        ai[71] = 359;
        ai[72] = 367;
        ai[73] = 373;
        ai[74] = 379;
        ai[75] = 383;
        ai[76] = 389;
        ai[77] = 397;
        ai[78] = 401;
        ai[79] = 409;
        ai[80] = 419;
        ai[81] = 421;
        ai[82] = 431;
        ai[83] = 433;
        ai[84] = 439;
        ai[85] = 443;
        ai[86] = 449;
        ai[87] = 457;
        ai[88] = 461;
        ai[89] = 463;
        ai[90] = 467;
        ai[91] = 479;
        ai[92] = 487;
        ai[93] = 491;
        ai[94] = 499;
        ai[95] = 503;
        ai[96] = 509;
        ai[97] = 521;
        ai[98] = 523;
        ai[99] = 541;
        ai[100] = 547;
        ai[101] = 557;
        ai[102] = 563;
        ai[103] = 569;
        ai[104] = 571;
        ai[105] = 577;
        ai[106] = 587;
        ai[107] = 593;
        ai[108] = 599;
        ai[109] = 601;
        ai[110] = 607;
        ai[111] = 613;
        ai[112] = 617;
        ai[113] = 619;
        ai[114] = 631;
        ai[115] = 641;
        ai[116] = 643;
        ai[117] = 647;
        ai[118] = 653;
        ai[119] = 659;
        ai[120] = 661;
        ai[121] = 673;
        ai[122] = 677;
        ai[123] = 683;
        ai[124] = 691;
        ai[125] = 701;
        ai[126] = 709;
        ai[127] = 719;
        ai[128] = 727;
        ai[129] = 733;
        ai[130] = 739;
        ai[131] = 743;
        ai[132] = 751;
        ai[133] = 757;
        ai[134] = 761;
        ai[135] = 769;
        ai[136] = 773;
        ai[137] = 787;
        ai[138] = 797;
        ai[139] = 809;
        ai[140] = 811;
        ai[141] = 821;
        ai[142] = 823;
        ai[143] = 827;
        ai[144] = 829;
        ai[145] = 839;
        ai[146] = 853;
        ai[147] = 857;
        ai[148] = 859;
        ai[149] = 863;
        ai[150] = 877;
        ai[151] = 881;
        ai[152] = 883;
        ai[153] = 887;
        ai[154] = 907;
        ai[155] = 911;
        ai[156] = 919;
        ai[157] = 929;
        ai[158] = 937;
        ai[159] = 941;
        ai[160] = 947;
        ai[161] = 953;
        ai[162] = 967;
        ai[163] = 971;
        ai[164] = 977;
        ai[165] = 983;
        ai[166] = 991;
        ai[167] = 997;
        ai[168] = 1009;
        ai[169] = 1013;
        ai[170] = 1019;
        ai[171] = 1021;
        ai[172] = 1031;
        ai[173] = 1033;
        ai[174] = 1039;
        ai[175] = 1049;
        ai[176] = 1051;
        ai[177] = 1061;
        ai[178] = 1063;
        ai[179] = 1069;
        ai[180] = 1087;
        ai[181] = 1091;
        ai[182] = 1093;
        ai[183] = 1097;
        ai[184] = 1103;
        ai[185] = 1109;
        ai[186] = 1117;
        ai[187] = 1123;
        ai[188] = 1129;
        ai[189] = 1151;
        ai[190] = 1153;
        ai[191] = 1163;
        ai[192] = 1171;
        ai[193] = 1181;
        ai[194] = 1187;
        ai[195] = 1193;
        ai[196] = 1201;
        ai[197] = 1213;
        ai[198] = 1217;
        ai[199] = 1223;
        ai[200] = 1229;
        ai[201] = 1231;
        ai[202] = 1237;
        ai[203] = 1249;
        ai[204] = 1259;
        ai[205] = 1277;
        ai[206] = 1279;
        ai[207] = 1283;
        ai[208] = 1289;
        ai[209] = 1291;
        ai[210] = 1297;
        ai[211] = 1301;
        ai[212] = 1303;
        ai[213] = 1307;
        ai[214] = 1319;
        ai[215] = 1321;
        ai[216] = 1327;
        ai[217] = 1361;
        ai[218] = 1367;
        ai[219] = 1373;
        ai[220] = 1381;
        ai[221] = 1399;
        ai[222] = 1409;
        ai[223] = 1423;
        ai[224] = 1427;
        ai[225] = 1429;
        ai[226] = 1433;
        ai[227] = 1439;
        ai[228] = 1447;
        ai[229] = 1451;
        ai[230] = 1453;
        ai[231] = 1459;
        ai[232] = 1471;
        ai[233] = 1481;
        ai[234] = 1483;
        ai[235] = 1487;
        ai[236] = 1489;
        ai[237] = 1493;
        ai[238] = 1499;
        for (int i = 0; i < ai.length; i++)
        {
            if (biginteger.mod(BigInteger.valueOf(ai[i])).equals(ZERO))
            {
                return false;
            }
        }

        return true;
    }

    public static int pow(int i, int j)
    {
        int k;
        int l;
        for (k = 1; j > 0; k = l)
        {
            l = k;
            if ((j & 1) == 1)
            {
                l = k * i;
            }
            i *= i;
            j >>>= 1;
        }

        return k;
    }

    public static long pow(long l, int i)
    {
        long l1;
        long l2;
        for (l1 = 1L; i > 0; l1 = l2)
        {
            l2 = l1;
            if ((i & 1) == 1)
            {
                l2 = l1 * l;
            }
            l *= l;
            i >>>= 1;
        }

        return l1;
    }

    public static BigInteger randomize(BigInteger biginteger)
    {
        if (sr == null)
        {
            sr = new SecureRandom();
        }
        return randomize(biginteger, sr);
    }

    public static BigInteger randomize(BigInteger biginteger, SecureRandom securerandom)
    {
        int j = biginteger.bitLength();
        BigInteger biginteger1 = BigInteger.valueOf(0L);
        int i;
        if (securerandom == null)
        {
            if (sr != null)
            {
                securerandom = sr;
            } else
            {
                securerandom = new SecureRandom();
            }
        }
        for (i = 0; i < 20; i++)
        {
            biginteger1 = new BigInteger(j, securerandom);
            if (biginteger1.compareTo(biginteger) < 0)
            {
                return biginteger1;
            }
        }

        return biginteger1.mod(biginteger);
    }

    public static BigInteger reduceInto(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        return biginteger.subtract(biginteger1).mod(biginteger2.subtract(biginteger1)).add(biginteger1);
    }

    public static BigInteger ressol(BigInteger biginteger, BigInteger biginteger1)
    {
        BigInteger biginteger2 = biginteger;
        if (biginteger.compareTo(ZERO) < 0)
        {
            biginteger2 = biginteger.add(biginteger1);
        }
        if (biginteger2.equals(ZERO))
        {
            biginteger = ZERO;
        } else
        {
            biginteger = biginteger2;
            if (!biginteger1.equals(TWO))
            {
                if (biginteger1.testBit(0) && biginteger1.testBit(1))
                {
                    if (jacobi(biginteger2, biginteger1) == 1)
                    {
                        return biginteger2.modPow(biginteger1.add(ONE).shiftRight(2), biginteger1);
                    } else
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("No quadratic residue: ").append(biginteger2).append(", ").append(biginteger1).toString());
                    }
                }
                biginteger = biginteger1.subtract(ONE);
                long l = 0L;
                for (; !biginteger.testBit(0); biginteger = biginteger.shiftRight(1))
                {
                    l++;
                }

                BigInteger biginteger4 = biginteger.subtract(ONE).shiftRight(1);
                biginteger = biginteger2.modPow(biginteger4, biginteger1);
                BigInteger biginteger5 = biginteger.multiply(biginteger).remainder(biginteger1).multiply(biginteger2).remainder(biginteger1);
                BigInteger biginteger3 = biginteger.multiply(biginteger2).remainder(biginteger1);
                if (biginteger5.equals(ONE))
                {
                    return biginteger3;
                }
                for (biginteger = TWO; jacobi(biginteger, biginteger1) == 1; biginteger = biginteger.add(ONE)) { }
                biginteger4 = biginteger.modPow(biginteger4.multiply(TWO).add(ONE), biginteger1);
                biginteger = biginteger5;
                for (long l1 = l; biginteger.compareTo(ONE) == 1; l1 = l)
                {
                    l = 0L;
                    for (BigInteger biginteger6 = biginteger; !biginteger6.equals(ONE);)
                    {
                        biginteger6 = biginteger6.multiply(biginteger6).mod(biginteger1);
                        l++;
                    }

                    long l2 = l1 - l;
                    if (l2 == 0L)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("No quadratic residue: ").append(biginteger2).append(", ").append(biginteger1).toString());
                    }
                    BigInteger biginteger7 = ONE;
                    for (l1 = 0L; l1 < l2 - 1L; l1++)
                    {
                        biginteger7 = biginteger7.shiftLeft(1);
                    }

                    biginteger4 = biginteger4.modPow(biginteger7, biginteger1);
                    biginteger3 = biginteger3.multiply(biginteger4).remainder(biginteger1);
                    biginteger4 = biginteger4.multiply(biginteger4).remainder(biginteger1);
                    biginteger = biginteger.multiply(biginteger4).mod(biginteger1);
                }

                return biginteger3;
            }
        }
        return biginteger;
    }

    public static BigInteger squareRoot(BigInteger biginteger)
    {
        if (biginteger.compareTo(ZERO) < 0)
        {
            throw new ArithmeticException((new StringBuilder()).append("cannot extract root of negative number").append(biginteger).append(".").toString());
        }
        int i = biginteger.bitLength();
        BigInteger biginteger1 = ZERO;
        BigInteger biginteger2 = ZERO;
        if ((i & 1) != 0)
        {
            biginteger1 = biginteger1.add(ONE);
            i--;
        }
        while (i > 0) 
        {
            biginteger2 = biginteger2.multiply(FOUR);
            int j = i - 1;
            BigInteger biginteger3;
            int k;
            if (biginteger.testBit(j))
            {
                i = 2;
            } else
            {
                i = 0;
            }
            j--;
            if (biginteger.testBit(j))
            {
                k = 1;
            } else
            {
                k = 0;
            }
            biginteger2 = biginteger2.add(BigInteger.valueOf(i + k));
            biginteger3 = biginteger1.multiply(FOUR).add(ONE);
            biginteger1 = biginteger1.multiply(TWO);
            if (biginteger2.compareTo(biginteger3) != -1)
            {
                biginteger1 = biginteger1.add(ONE);
                biginteger2 = biginteger2.subtract(biginteger3);
                i = j;
            } else
            {
                i = j;
            }
        }
        return biginteger1;
    }

}
