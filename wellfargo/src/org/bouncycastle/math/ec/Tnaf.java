// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECConstants, ZTauElement, SimpleBigDecimal, ECFieldElement

class Tnaf
{

    private static final BigInteger MINUS_ONE;
    private static final BigInteger MINUS_THREE;
    private static final BigInteger MINUS_TWO;
    public static final byte POW_2_WIDTH = 16;
    public static final byte WIDTH = 4;
    public static final ZTauElement alpha0[];
    public static final byte alpha0Tnaf[][];
    public static final ZTauElement alpha1[];
    public static final byte alpha1Tnaf[][] = {
        null, {
            1
        }, null, {
            -1, 0, 1
        }, null, {
            1, 0, 1
        }, null, {
            -1, 0, 0, -1
        }
    };

    Tnaf()
    {
    }

    public static SimpleBigDecimal approximateDivisionByN(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, byte byte0, int i, int j)
    {
        int k = (i + 5) / 2 + j;
        biginteger = biginteger1.multiply(biginteger.shiftRight((i - k - 2) + byte0));
        biginteger2 = biginteger.add(biginteger2.multiply(biginteger.shiftRight(i)));
        biginteger1 = biginteger2.shiftRight(k - j);
        biginteger = biginteger1;
        if (biginteger2.testBit(k - j - 1))
        {
            biginteger = biginteger1.add(ECConstants.ONE);
        }
        return new SimpleBigDecimal(biginteger, j);
    }

    public static BigInteger[] getLucas(byte byte0, int i, boolean flag)
    {
        if (byte0 != 1 && byte0 != -1)
        {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger biginteger;
        BigInteger biginteger1;
        int j;
        if (flag)
        {
            biginteger1 = ECConstants.TWO;
            biginteger = BigInteger.valueOf(byte0);
        } else
        {
            biginteger1 = ECConstants.ZERO;
            biginteger = ECConstants.ONE;
        }
        j = 1;
        while (j < i) 
        {
            BigInteger biginteger2;
            if (byte0 == 1)
            {
                biginteger2 = biginteger;
            } else
            {
                biginteger2 = biginteger.negate();
            }
            biginteger2 = biginteger2.subtract(biginteger1.shiftLeft(1));
            j++;
            biginteger1 = biginteger;
            biginteger = biginteger2;
        }
        return (new BigInteger[] {
            biginteger1, biginteger
        });
    }

    public static byte getMu(ECCurve.F2m f2m)
    {
        f2m = f2m.getA().toBigInteger();
        if (f2m.equals(ECConstants.ZERO))
        {
            return -1;
        }
        if (f2m.equals(ECConstants.ONE))
        {
            return 1;
        } else
        {
            throw new IllegalArgumentException("No Koblitz curve (ABC), TNAF multiplication not possible");
        }
    }

    public static ECPoint.F2m[] getPreComp(ECPoint.F2m f2m, byte byte0)
    {
        ECPoint.F2m af2m[] = new ECPoint.F2m[16];
        af2m[1] = f2m;
        byte abyte0[][];
        int i;
        if (byte0 == 0)
        {
            abyte0 = alpha0Tnaf;
        } else
        {
            abyte0 = alpha1Tnaf;
        }
        i = abyte0.length;
        for (byte0 = 3; byte0 < i; byte0 += 2)
        {
            af2m[byte0] = multiplyFromTnaf(f2m, abyte0[byte0]);
        }

        return af2m;
    }

    public static BigInteger[] getSi(ECCurve.F2m f2m)
    {
        if (!f2m.isKoblitz())
        {
            throw new IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int i = f2m.getM();
        int j = f2m.getA().toBigInteger().intValue();
        byte byte0 = f2m.getMu();
        int k = f2m.getH().intValue();
        f2m = getLucas(byte0, (i + 3) - j, false);
        BigInteger biginteger;
        BigInteger abiginteger[];
        if (byte0 == 1)
        {
            biginteger = ECConstants.ONE.subtract(f2m[1]);
            f2m = ECConstants.ONE.subtract(f2m[0]);
        } else
        if (byte0 == -1)
        {
            biginteger = ECConstants.ONE.add(f2m[1]);
            f2m = ECConstants.ONE.add(f2m[0]);
        } else
        {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        abiginteger = new BigInteger[2];
        if (k == 2)
        {
            abiginteger[0] = biginteger.shiftRight(1);
            abiginteger[1] = f2m.shiftRight(1).negate();
            return abiginteger;
        }
        if (k == 4)
        {
            abiginteger[0] = biginteger.shiftRight(2);
            abiginteger[1] = f2m.shiftRight(2).negate();
            return abiginteger;
        } else
        {
            throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
        }
    }

    public static BigInteger getTw(byte byte0, int i)
    {
        if (i == 4)
        {
            if (byte0 == 1)
            {
                return BigInteger.valueOf(6L);
            } else
            {
                return BigInteger.valueOf(10L);
            }
        } else
        {
            BigInteger abiginteger[] = getLucas(byte0, i, false);
            BigInteger biginteger = ECConstants.ZERO.setBit(i);
            BigInteger biginteger1 = abiginteger[1].modInverse(biginteger);
            return ECConstants.TWO.multiply(abiginteger[0]).multiply(biginteger1).mod(biginteger);
        }
    }

    public static ECPoint.F2m multiplyFromTnaf(ECPoint.F2m f2m, byte abyte0[])
    {
        ECPoint.F2m f2m1 = (ECPoint.F2m)((ECCurve.F2m)f2m.getCurve()).getInfinity();
        int i = abyte0.length - 1;
        while (i >= 0) 
        {
            ECPoint.F2m f2m2 = tau(f2m1);
            if (abyte0[i] == 1)
            {
                f2m1 = f2m2.addSimple(f2m);
            } else
            {
                f2m1 = f2m2;
                if (abyte0[i] == -1)
                {
                    f2m1 = f2m2.subtractSimple(f2m);
                }
            }
            i--;
        }
        return f2m1;
    }

    public static ECPoint.F2m multiplyRTnaf(ECPoint.F2m f2m, BigInteger biginteger)
    {
        ECCurve.F2m f2m1 = (ECCurve.F2m)f2m.getCurve();
        int i = f2m1.getM();
        byte byte0 = (byte)f2m1.getA().toBigInteger().intValue();
        byte byte1 = f2m1.getMu();
        return multiplyTnaf(f2m, partModReduction(biginteger, i, byte0, f2m1.getSi(), byte1, (byte)10));
    }

    public static ECPoint.F2m multiplyTnaf(ECPoint.F2m f2m, ZTauElement ztauelement)
    {
        return multiplyFromTnaf(f2m, tauAdicNaf(((ECCurve.F2m)f2m.getCurve()).getMu(), ztauelement));
    }

    public static BigInteger norm(byte byte0, ZTauElement ztauelement)
    {
        BigInteger biginteger = ztauelement.u.multiply(ztauelement.u);
        BigInteger biginteger1 = ztauelement.u.multiply(ztauelement.v);
        ztauelement = ztauelement.v.multiply(ztauelement.v).shiftLeft(1);
        if (byte0 == 1)
        {
            return biginteger.add(biginteger1).add(ztauelement);
        }
        if (byte0 == -1)
        {
            return biginteger.subtract(biginteger1).add(ztauelement);
        } else
        {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
    }

    public static SimpleBigDecimal norm(byte byte0, SimpleBigDecimal simplebigdecimal, SimpleBigDecimal simplebigdecimal1)
    {
        SimpleBigDecimal simplebigdecimal2 = simplebigdecimal.multiply(simplebigdecimal);
        simplebigdecimal = simplebigdecimal.multiply(simplebigdecimal1);
        simplebigdecimal1 = simplebigdecimal1.multiply(simplebigdecimal1).shiftLeft(1);
        if (byte0 == 1)
        {
            return simplebigdecimal2.add(simplebigdecimal).add(simplebigdecimal1);
        }
        if (byte0 == -1)
        {
            return simplebigdecimal2.subtract(simplebigdecimal).add(simplebigdecimal1);
        } else
        {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
    }

    public static ZTauElement partModReduction(BigInteger biginteger, int i, byte byte0, BigInteger abiginteger[], byte byte1, byte byte2)
    {
        BigInteger biginteger1;
        Object obj;
        if (byte1 == 1)
        {
            biginteger1 = abiginteger[0].add(abiginteger[1]);
        } else
        {
            biginteger1 = abiginteger[0].subtract(abiginteger[1]);
        }
        obj = getLucas(byte1, i, true)[1];
        obj = round(approximateDivisionByN(biginteger, abiginteger[0], ((BigInteger) (obj)), byte0, i, byte2), approximateDivisionByN(biginteger, abiginteger[1], ((BigInteger) (obj)), byte0, i, byte2), byte1);
        return new ZTauElement(biginteger.subtract(biginteger1.multiply(((ZTauElement) (obj)).u)).subtract(BigInteger.valueOf(2L).multiply(abiginteger[1]).multiply(((ZTauElement) (obj)).v)), abiginteger[1].multiply(((ZTauElement) (obj)).u).subtract(abiginteger[0].multiply(((ZTauElement) (obj)).v)));
    }

    public static ZTauElement round(SimpleBigDecimal simplebigdecimal, SimpleBigDecimal simplebigdecimal1, byte byte0)
    {
        byte byte1 = 0;
        boolean flag = true;
        int i = simplebigdecimal.getScale();
        if (simplebigdecimal1.getScale() != i)
        {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        if (byte0 != 1 && byte0 != -1)
        {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger biginteger = simplebigdecimal.round();
        BigInteger biginteger1 = simplebigdecimal1.round();
        SimpleBigDecimal simplebigdecimal3 = simplebigdecimal.subtract(biginteger);
        simplebigdecimal1 = simplebigdecimal1.subtract(biginteger1);
        simplebigdecimal = simplebigdecimal3.add(simplebigdecimal3);
        SimpleBigDecimal simplebigdecimal2;
        if (byte0 == 1)
        {
            simplebigdecimal = simplebigdecimal.add(simplebigdecimal1);
        } else
        {
            simplebigdecimal = simplebigdecimal.subtract(simplebigdecimal1);
        }
        simplebigdecimal2 = simplebigdecimal1.add(simplebigdecimal1).add(simplebigdecimal1);
        simplebigdecimal1 = simplebigdecimal2.add(simplebigdecimal1);
        if (byte0 == 1)
        {
            simplebigdecimal2 = simplebigdecimal3.subtract(simplebigdecimal2);
            simplebigdecimal1 = simplebigdecimal3.add(simplebigdecimal1);
        } else
        {
            simplebigdecimal2 = simplebigdecimal3.add(simplebigdecimal2);
            simplebigdecimal1 = simplebigdecimal3.subtract(simplebigdecimal1);
        }
        if (simplebigdecimal.compareTo(ECConstants.ONE) >= 0)
        {
            if (simplebigdecimal2.compareTo(MINUS_ONE) < 0)
            {
                flag = false;
                byte1 = byte0;
            }
        } else
        if (simplebigdecimal1.compareTo(ECConstants.TWO) >= 0)
        {
            flag = false;
            byte1 = byte0;
        } else
        {
            flag = false;
        }
        if (simplebigdecimal.compareTo(MINUS_ONE) >= 0) goto _L2; else goto _L1
_L1:
        if (simplebigdecimal2.compareTo(ECConstants.ONE) >= 0)
        {
            byte1 = (byte)(-byte0);
            i = ((flag) ? 1 : 0);
        } else
        {
            i = -1;
        }
_L4:
        return new ZTauElement(biginteger.add(BigInteger.valueOf(i)), biginteger1.add(BigInteger.valueOf(byte1)));
_L2:
        i = ((flag) ? 1 : 0);
        if (simplebigdecimal1.compareTo(MINUS_TWO) < 0)
        {
            byte1 = (byte)(-byte0);
            i = ((flag) ? 1 : 0);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static ECPoint.F2m tau(ECPoint.F2m f2m)
    {
        if (f2m.isInfinity())
        {
            return f2m;
        } else
        {
            ECFieldElement ecfieldelement = f2m.getX();
            ECFieldElement ecfieldelement1 = f2m.getY();
            return new ECPoint.F2m(f2m.getCurve(), ecfieldelement.square(), ecfieldelement1.square(), f2m.isCompressed());
        }
    }

    public static byte[] tauAdicNaf(byte byte0, ZTauElement ztauelement)
    {
        if (byte0 != 1 && byte0 != -1)
        {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int i = norm(byte0, ztauelement).bitLength();
        BigInteger biginteger;
        BigInteger biginteger1;
        byte abyte0[];
        int j;
        if (i > 30)
        {
            i += 4;
        } else
        {
            i = 34;
        }
        abyte0 = new byte[i];
        biginteger = ztauelement.u;
        biginteger1 = ztauelement.v;
        j = 0;
        i = 0;
        ztauelement = biginteger;
        biginteger = biginteger1;
        while (!ztauelement.equals(ECConstants.ZERO) || !biginteger.equals(ECConstants.ZERO)) 
        {
            ZTauElement ztauelement1;
            if (ztauelement.testBit(0))
            {
                abyte0[i] = (byte)ECConstants.TWO.subtract(ztauelement.subtract(biginteger.shiftLeft(1)).mod(ECConstants.FOUR)).intValue();
                if (abyte0[i] == 1)
                {
                    ztauelement = ztauelement.clearBit(0);
                } else
                {
                    ztauelement = ztauelement.add(ECConstants.ONE);
                }
                j = i;
                ztauelement1 = ztauelement;
            } else
            {
                abyte0[i] = 0;
                ztauelement1 = ztauelement;
            }
            ztauelement = ztauelement1.shiftRight(1);
            if (byte0 == 1)
            {
                ztauelement = biginteger.add(ztauelement);
            } else
            {
                ztauelement = biginteger.subtract(ztauelement);
            }
            biginteger = ztauelement1.shiftRight(1).negate();
            i++;
        }
        i = j + 1;
        ztauelement = new byte[i];
        System.arraycopy(abyte0, 0, ztauelement, 0, i);
        return ztauelement;
    }

    public static byte[] tauAdicWNaf(byte byte0, ZTauElement ztauelement, byte byte1, BigInteger biginteger, BigInteger biginteger1, ZTauElement aztauelement[])
    {
        if (byte0 != 1 && byte0 != -1)
        {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int i = norm(byte0, ztauelement).bitLength();
        BigInteger biginteger2;
        byte abyte0[];
        BigInteger biginteger4;
        if (i > 30)
        {
            byte1 = i + 4 + byte1;
        } else
        {
            byte1 += 34;
        }
        abyte0 = new byte[byte1];
        biginteger4 = biginteger.shiftRight(1);
        biginteger2 = ztauelement.u;
        ztauelement = ztauelement.v;
        byte1 = 0;
        while (!biginteger2.equals(ECConstants.ZERO) || !ztauelement.equals(ECConstants.ZERO)) 
        {
            if (biginteger2.testBit(0))
            {
                BigInteger biginteger3 = biginteger2.add(ztauelement.multiply(biginteger1)).mod(biginteger);
                byte byte2;
                boolean flag;
                byte byte3;
                if (biginteger3.compareTo(biginteger4) >= 0)
                {
                    byte2 = (byte)biginteger3.subtract(biginteger).intValue();
                } else
                {
                    byte2 = (byte)biginteger3.intValue();
                }
                abyte0[byte1] = byte2;
                if (byte2 < 0)
                {
                    byte3 = (byte)(-byte2);
                    flag = false;
                } else
                {
                    byte3 = byte2;
                    flag = true;
                }
                if (flag)
                {
                    biginteger2 = biginteger2.subtract(aztauelement[byte3].u);
                    ztauelement = ztauelement.subtract(aztauelement[byte3].v);
                } else
                {
                    biginteger2 = biginteger2.add(aztauelement[byte3].u);
                    ztauelement = ztauelement.add(aztauelement[byte3].v);
                }
                biginteger3 = biginteger2;
            } else
            {
                abyte0[byte1] = 0;
                biginteger3 = biginteger2;
            }
            if (byte0 == 1)
            {
                biginteger2 = ztauelement.add(biginteger3.shiftRight(1));
            } else
            {
                biginteger2 = ztauelement.subtract(biginteger3.shiftRight(1));
            }
            ztauelement = biginteger3.shiftRight(1).negate();
            byte1++;
        }
        return abyte0;
    }

    static 
    {
        MINUS_ONE = ECConstants.ONE.negate();
        MINUS_TWO = ECConstants.TWO.negate();
        MINUS_THREE = ECConstants.THREE.negate();
        alpha0 = (new ZTauElement[] {
            null, new ZTauElement(ECConstants.ONE, ECConstants.ZERO), null, new ZTauElement(MINUS_THREE, MINUS_ONE), null, new ZTauElement(MINUS_ONE, MINUS_ONE), null, new ZTauElement(ECConstants.ONE, MINUS_ONE), null
        });
        byte abyte0[] = {
            1
        };
        byte abyte1[] = {
            -1, 0, 1
        };
        byte abyte2[] = {
            -1, 0, 0, 1
        };
        alpha0Tnaf = (new byte[][] {
            null, abyte0, null, abyte1, null, new byte[] {
                1, 0, 1
            }, null, abyte2
        });
        alpha1 = (new ZTauElement[] {
            null, new ZTauElement(ECConstants.ONE, ECConstants.ZERO), null, new ZTauElement(MINUS_THREE, ECConstants.ONE), null, new ZTauElement(MINUS_ONE, ECConstants.ONE), null, new ZTauElement(ECConstants.ONE, ECConstants.ONE), null
        });
    }
}
