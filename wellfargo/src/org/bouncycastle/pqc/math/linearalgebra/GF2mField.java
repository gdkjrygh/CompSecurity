// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            PolynomialRingGF2, LittleEndianConversions, RandUtils

public class GF2mField
{

    private int degree;
    private int polynomial;

    public GF2mField(int i)
    {
        degree = 0;
        if (i >= 32)
        {
            throw new IllegalArgumentException(" Error: the degree of field is too large ");
        }
        if (i < 1)
        {
            throw new IllegalArgumentException(" Error: the degree of field is non-positive ");
        } else
        {
            degree = i;
            polynomial = PolynomialRingGF2.getIrreduciblePolynomial(i);
            return;
        }
    }

    public GF2mField(int i, int j)
    {
        degree = 0;
        if (i != PolynomialRingGF2.degree(j))
        {
            throw new IllegalArgumentException(" Error: the degree is not correct");
        }
        if (!PolynomialRingGF2.isIrreducible(j))
        {
            throw new IllegalArgumentException(" Error: given polynomial is reducible");
        } else
        {
            degree = i;
            polynomial = j;
            return;
        }
    }

    public GF2mField(GF2mField gf2mfield)
    {
        degree = 0;
        degree = gf2mfield.degree;
        polynomial = gf2mfield.polynomial;
    }

    public GF2mField(byte abyte0[])
    {
        degree = 0;
        if (abyte0.length != 4)
        {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        polynomial = LittleEndianConversions.OS2IP(abyte0);
        if (!PolynomialRingGF2.isIrreducible(polynomial))
        {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        } else
        {
            degree = PolynomialRingGF2.degree(polynomial);
            return;
        }
    }

    private static String polyToString(int i)
    {
        String s = "";
        if (i != 0) goto _L2; else goto _L1
_L1:
        String s1 = "0";
_L4:
        return s1;
_L2:
        if ((byte)(i & 1) == 1)
        {
            s = "1";
        }
        int j = i >>> 1;
        i = 1;
        do
        {
            s1 = s;
            if (j == 0)
            {
                continue;
            }
            s1 = s;
            if ((byte)(j & 1) == 1)
            {
                s1 = (new StringBuilder()).append(s).append("+x^").append(i).toString();
            }
            j >>>= 1;
            i++;
            s = s1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int add(int i, int j)
    {
        return i ^ j;
    }

    public String elementToStr(int i)
    {
        String s = "";
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        while (i < degree) 
        {
            if (((byte)j & 1) == 0)
            {
                s = (new StringBuilder()).append("0").append(s).toString();
            } else
            {
                s = (new StringBuilder()).append("1").append(s).toString();
            }
            j >>>= 1;
            i++;
        }
        return s;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof GF2mField))
        {
            if (degree == ((GF2mField) (obj = (GF2mField)obj)).degree && polynomial == ((GF2mField) (obj)).polynomial)
            {
                return true;
            }
        }
        return false;
    }

    public int exp(int i, int j)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        int l = 0;
_L4:
        return l;
_L2:
        if (i == 1)
        {
            return 1;
        }
        int k;
        if (j < 0)
        {
            i = inverse(i);
            j = -j;
            k = 1;
        } else
        {
            k = 1;
        }
        l = k;
        if (j != 0)
        {
            l = k;
            if ((j & 1) == 1)
            {
                l = mult(k, i);
            }
            i = mult(i, i);
            j >>>= 1;
            k = l;
            break MISSING_BLOCK_LABEL_32;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getDegree()
    {
        return degree;
    }

    public byte[] getEncoded()
    {
        return LittleEndianConversions.I2OSP(polynomial);
    }

    public int getPolynomial()
    {
        return polynomial;
    }

    public int getRandomElement(SecureRandom securerandom)
    {
        return RandUtils.nextInt(securerandom, 1 << degree);
    }

    public int getRandomNonZeroElement()
    {
        return getRandomNonZeroElement(new SecureRandom());
    }

    public int getRandomNonZeroElement(SecureRandom securerandom)
    {
        int i = 0;
        int j;
        for (j = RandUtils.nextInt(securerandom, 1 << degree); j == 0 && i < 0x100000; i++)
        {
            j = RandUtils.nextInt(securerandom, 1 << degree);
        }

        if (i == 0x100000)
        {
            return 1;
        } else
        {
            return j;
        }
    }

    public int hashCode()
    {
        return polynomial;
    }

    public int inverse(int i)
    {
        return exp(i, (1 << degree) - 2);
    }

    public boolean isElementOfThisField(int i)
    {
        if (degree != 31) goto _L2; else goto _L1
_L1:
        if (i < 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (i < 0 || i >= 1 << degree)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public int mult(int i, int j)
    {
        return PolynomialRingGF2.modMultiply(i, j, polynomial);
    }

    public int sqRoot(int i)
    {
        boolean flag = true;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < degree; i++)
        {
            j = mult(j, j);
        }

        return j;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Finite Field GF(2^").append(degree).append(") = ").append("GF(2)[X]/<").append(polyToString(polynomial)).append("> ").toString();
    }
}
