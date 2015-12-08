// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.math.BigInteger;
import java.util.Random;

// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            GF2nElement, GF2Polynomial, GF2nField, GF2nPolynomialField, 
//            IntegerFunctions, GFElement

public class GF2nPolynomialElement extends GF2nElement
{

    private static final int bitMask[] = {
        1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 
        1024, 2048, 4096, 8192, 16384, 32768, 0x10000, 0x20000, 0x40000, 0x80000, 
        0x100000, 0x200000, 0x400000, 0x800000, 0x1000000, 0x2000000, 0x4000000, 0x8000000, 0x10000000, 0x20000000, 
        0x40000000, 0x80000000, 0
    };
    private GF2Polynomial polynomial;

    public GF2nPolynomialElement(GF2nPolynomialElement gf2npolynomialelement)
    {
        mField = gf2npolynomialelement.mField;
        mDegree = gf2npolynomialelement.mDegree;
        polynomial = new GF2Polynomial(gf2npolynomialelement.polynomial);
    }

    public GF2nPolynomialElement(GF2nPolynomialField gf2npolynomialfield, Random random)
    {
        mField = gf2npolynomialfield;
        mDegree = mField.getDegree();
        polynomial = new GF2Polynomial(mDegree);
        randomize(random);
    }

    public GF2nPolynomialElement(GF2nPolynomialField gf2npolynomialfield, GF2Polynomial gf2polynomial)
    {
        mField = gf2npolynomialfield;
        mDegree = mField.getDegree();
        polynomial = new GF2Polynomial(gf2polynomial);
        polynomial.expandN(mDegree);
    }

    public GF2nPolynomialElement(GF2nPolynomialField gf2npolynomialfield, byte abyte0[])
    {
        mField = gf2npolynomialfield;
        mDegree = mField.getDegree();
        polynomial = new GF2Polynomial(mDegree, abyte0);
        polynomial.expandN(mDegree);
    }

    public GF2nPolynomialElement(GF2nPolynomialField gf2npolynomialfield, int ai[])
    {
        mField = gf2npolynomialfield;
        mDegree = mField.getDegree();
        polynomial = new GF2Polynomial(mDegree, ai);
        polynomial.expandN(gf2npolynomialfield.mDegree);
    }

    public static GF2nPolynomialElement ONE(GF2nPolynomialField gf2npolynomialfield)
    {
        return new GF2nPolynomialElement(gf2npolynomialfield, new GF2Polynomial(gf2npolynomialfield.getDegree(), new int[] {
            1
        }));
    }

    public static GF2nPolynomialElement ZERO(GF2nPolynomialField gf2npolynomialfield)
    {
        return new GF2nPolynomialElement(gf2npolynomialfield, new GF2Polynomial(gf2npolynomialfield.getDegree()));
    }

    private GF2Polynomial getGF2Polynomial()
    {
        return new GF2Polynomial(polynomial);
    }

    private GF2nPolynomialElement halfTrace()
    {
        if ((mDegree & 1) == 0)
        {
            throw new RuntimeException();
        }
        GF2nPolynomialElement gf2npolynomialelement = new GF2nPolynomialElement(this);
        for (int i = 1; i <= mDegree - 1 >> 1; i++)
        {
            gf2npolynomialelement.squareThis();
            gf2npolynomialelement.squareThis();
            gf2npolynomialelement.addToThis(this);
        }

        return gf2npolynomialelement;
    }

    private void randomize(Random random)
    {
        polynomial.expandN(mDegree);
        polynomial.randomize(random);
    }

    private void reducePentanomialBitwise(int ai[])
    {
        int j = mDegree;
        int k = ai[2];
        int l = mDegree;
        int i1 = ai[1];
        int j1 = mDegree;
        int k1 = ai[0];
        for (int i = polynomial.getLength() - 1; i >= mDegree; i--)
        {
            if (polynomial.testBit(i))
            {
                polynomial.xorBit(i);
                polynomial.xorBit(i - (j - k));
                polynomial.xorBit(i - (l - i1));
                polynomial.xorBit(i - (j1 - k1));
                polynomial.xorBit(i - mDegree);
            }
        }

        polynomial.reduceN();
        polynomial.expandN(mDegree);
    }

    private void reduceThis()
    {
        if (polynomial.getLength() <= mDegree) goto _L2; else goto _L1
_L1:
        if (!((GF2nPolynomialField)mField).isTrinomial()) goto _L4; else goto _L3
_L3:
        int i;
        try
        {
            i = ((GF2nPolynomialField)mField).getTc();
        }
        catch (RuntimeException runtimeexception)
        {
            throw new RuntimeException("GF2nPolynomialElement.reduce: the field polynomial is not a trinomial");
        }
        if (mDegree - i > 32 && polynomial.getLength() <= mDegree << 1) goto _L6; else goto _L5
_L5:
        reduceTrinomialBitwise(i);
_L8:
        return;
_L6:
        polynomial.reduceTrinomial(mDegree, i);
        return;
_L4:
        if (((GF2nPolynomialField)mField).isPentanomial())
        {
            Object obj;
            try
            {
                obj = ((GF2nPolynomialField)mField).getPc();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException("GF2nPolynomialElement.reduce: the field polynomial is not a pentanomial");
            }
            if (mDegree - obj[2] <= 32 || polynomial.getLength() > mDegree << 1)
            {
                reducePentanomialBitwise(((int []) (obj)));
                return;
            } else
            {
                polynomial.reducePentanomial(mDegree, ((int []) (obj)));
                return;
            }
        } else
        {
            polynomial = polynomial.remainder(mField.getFieldPolynomial());
            polynomial.expandN(mDegree);
            return;
        }
_L2:
        if (polynomial.getLength() < mDegree)
        {
            polynomial.expandN(mDegree);
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void reduceTrinomialBitwise(int i)
    {
        int k = mDegree;
        for (int j = polynomial.getLength() - 1; j >= mDegree; j--)
        {
            if (polynomial.testBit(j))
            {
                polynomial.xorBit(j);
                polynomial.xorBit(j - (k - i));
                polynomial.xorBit(j - mDegree);
            }
        }

        polynomial.reduceN();
        polynomial.expandN(mDegree);
    }

    public GFElement add(GFElement gfelement)
    {
        GF2nPolynomialElement gf2npolynomialelement = new GF2nPolynomialElement(this);
        gf2npolynomialelement.addToThis(gfelement);
        return gf2npolynomialelement;
    }

    public void addToThis(GFElement gfelement)
    {
        if (!(gfelement instanceof GF2nPolynomialElement))
        {
            throw new RuntimeException();
        }
        if (!mField.equals(((GF2nPolynomialElement)gfelement).mField))
        {
            throw new RuntimeException();
        } else
        {
            polynomial.addToThis(((GF2nPolynomialElement)gfelement).polynomial);
            return;
        }
    }

    void assignOne()
    {
        polynomial.assignOne();
    }

    void assignZero()
    {
        polynomial.assignZero();
    }

    public Object clone()
    {
        return new GF2nPolynomialElement(this);
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof GF2nPolynomialElement))
        {
            if (mField == ((GF2nPolynomialElement) (obj = (GF2nPolynomialElement)obj)).mField || mField.getFieldPolynomial().equals(((GF2nPolynomialElement) (obj)).mField.getFieldPolynomial()))
            {
                return polynomial.equals(((GF2nPolynomialElement) (obj)).polynomial);
            }
        }
        return false;
    }

    public int hashCode()
    {
        return mField.hashCode() + polynomial.hashCode();
    }

    public GF2nElement increase()
    {
        GF2nPolynomialElement gf2npolynomialelement = new GF2nPolynomialElement(this);
        gf2npolynomialelement.increaseThis();
        return gf2npolynomialelement;
    }

    public void increaseThis()
    {
        polynomial.increaseThis();
    }

    public GFElement invert()
    {
        return invertMAIA();
    }

    public GF2nPolynomialElement invertEEA()
    {
        if (isZero())
        {
            throw new ArithmeticException();
        }
        GF2Polynomial gf2polynomial = new GF2Polynomial(mDegree + 32, "ONE");
        gf2polynomial.reduceN();
        GF2Polynomial gf2polynomial1 = new GF2Polynomial(mDegree + 32);
        gf2polynomial1.reduceN();
        GF2Polynomial gf2polynomial2 = getGF2Polynomial();
        GF2Polynomial gf2polynomial3 = mField.getFieldPolynomial();
        gf2polynomial2.reduceN();
        while (!gf2polynomial2.isOne()) 
        {
            gf2polynomial2.reduceN();
            gf2polynomial3.reduceN();
            int j = gf2polynomial2.getLength() - gf2polynomial3.getLength();
            GF2Polynomial gf2polynomial7 = gf2polynomial3;
            GF2Polynomial gf2polynomial6 = gf2polynomial2;
            GF2Polynomial gf2polynomial5 = gf2polynomial1;
            GF2Polynomial gf2polynomial4 = gf2polynomial;
            int i = j;
            if (j < 0)
            {
                i = -j;
                gf2polynomial.reduceN();
                gf2polynomial4 = gf2polynomial1;
                gf2polynomial5 = gf2polynomial;
                gf2polynomial6 = gf2polynomial3;
                gf2polynomial7 = gf2polynomial2;
            }
            gf2polynomial6.shiftLeftAddThis(gf2polynomial7, i);
            gf2polynomial4.shiftLeftAddThis(gf2polynomial5, i);
            gf2polynomial3 = gf2polynomial7;
            gf2polynomial2 = gf2polynomial6;
            gf2polynomial1 = gf2polynomial5;
            gf2polynomial = gf2polynomial4;
        }
        gf2polynomial.reduceN();
        return new GF2nPolynomialElement((GF2nPolynomialField)mField, gf2polynomial);
    }

    public GF2nPolynomialElement invertMAIA()
    {
        if (isZero())
        {
            throw new ArithmeticException();
        }
        GF2Polynomial gf2polynomial = new GF2Polynomial(mDegree, "ONE");
        GF2Polynomial gf2polynomial1 = new GF2Polynomial(mDegree);
        GF2Polynomial gf2polynomial2 = getGF2Polynomial();
        GF2Polynomial gf2polynomial3 = mField.getFieldPolynomial();
        do
        {
            while (!gf2polynomial2.testBit(0)) 
            {
                gf2polynomial2.shiftRightThis();
                if (!gf2polynomial.testBit(0))
                {
                    gf2polynomial.shiftRightThis();
                } else
                {
                    gf2polynomial.addToThis(mField.getFieldPolynomial());
                    gf2polynomial.shiftRightThis();
                }
            }
            if (gf2polynomial2.isOne())
            {
                return new GF2nPolynomialElement((GF2nPolynomialField)mField, gf2polynomial);
            }
            gf2polynomial2.reduceN();
            gf2polynomial3.reduceN();
            GF2Polynomial gf2polynomial7 = gf2polynomial3;
            GF2Polynomial gf2polynomial6 = gf2polynomial2;
            GF2Polynomial gf2polynomial5 = gf2polynomial1;
            GF2Polynomial gf2polynomial4 = gf2polynomial;
            if (gf2polynomial2.getLength() < gf2polynomial3.getLength())
            {
                gf2polynomial4 = gf2polynomial1;
                gf2polynomial5 = gf2polynomial;
                gf2polynomial6 = gf2polynomial3;
                gf2polynomial7 = gf2polynomial2;
            }
            gf2polynomial6.addToThis(gf2polynomial7);
            gf2polynomial4.addToThis(gf2polynomial5);
            gf2polynomial3 = gf2polynomial7;
            gf2polynomial2 = gf2polynomial6;
            gf2polynomial1 = gf2polynomial5;
            gf2polynomial = gf2polynomial4;
        } while (true);
    }

    public GF2nPolynomialElement invertSquare()
    {
        if (isZero())
        {
            throw new ArithmeticException();
        }
        int i1 = mField.getDegree() - 1;
        GF2nPolynomialElement gf2npolynomialelement = new GF2nPolynomialElement(this);
        gf2npolynomialelement.polynomial.expandN((mDegree << 1) + 32);
        gf2npolynomialelement.polynomial.reduceN();
        int j = IntegerFunctions.floorLog(i1);
        int i = 1;
        for (j--; j >= 0; j--)
        {
            GF2nPolynomialElement gf2npolynomialelement1 = new GF2nPolynomialElement(gf2npolynomialelement);
            for (int k = 1; k <= i; k++)
            {
                gf2npolynomialelement1.squareThisPreCalc();
            }

            gf2npolynomialelement.multiplyThisBy(gf2npolynomialelement1);
            int l = i << 1;
            i = l;
            if ((bitMask[j] & i1) != 0)
            {
                gf2npolynomialelement.squareThisPreCalc();
                gf2npolynomialelement.multiplyThisBy(this);
                i = l + 1;
            }
        }

        gf2npolynomialelement.squareThisPreCalc();
        return gf2npolynomialelement;
    }

    public boolean isOne()
    {
        return polynomial.isOne();
    }

    public boolean isZero()
    {
        return polynomial.isZero();
    }

    public GFElement multiply(GFElement gfelement)
    {
        GF2nPolynomialElement gf2npolynomialelement = new GF2nPolynomialElement(this);
        gf2npolynomialelement.multiplyThisBy(gfelement);
        return gf2npolynomialelement;
    }

    public void multiplyThisBy(GFElement gfelement)
    {
        if (!(gfelement instanceof GF2nPolynomialElement))
        {
            throw new RuntimeException();
        }
        if (!mField.equals(((GF2nPolynomialElement)gfelement).mField))
        {
            throw new RuntimeException();
        }
        if (equals(gfelement))
        {
            squareThis();
            return;
        } else
        {
            polynomial = polynomial.multiply(((GF2nPolynomialElement)gfelement).polynomial);
            reduceThis();
            return;
        }
    }

    public GF2nPolynomialElement power(int i)
    {
        if (i == 1)
        {
            return new GF2nPolynomialElement(this);
        }
        GF2nPolynomialElement gf2npolynomialelement = ONE((GF2nPolynomialField)mField);
        if (i == 0)
        {
            return gf2npolynomialelement;
        }
        GF2nPolynomialElement gf2npolynomialelement1 = new GF2nPolynomialElement(this);
        gf2npolynomialelement1.polynomial.expandN((gf2npolynomialelement1.mDegree << 1) + 32);
        gf2npolynomialelement1.polynomial.reduceN();
        for (int j = 0; j < mDegree; j++)
        {
            if ((1 << j & i) != 0)
            {
                gf2npolynomialelement.multiplyThisBy(gf2npolynomialelement1);
            }
            gf2npolynomialelement1.square();
        }

        return gf2npolynomialelement;
    }

    public GF2nElement solveQuadraticEquation()
    {
        if (isZero())
        {
            return ZERO((GF2nPolynomialField)mField);
        }
        if ((mDegree & 1) == 1)
        {
            return halfTrace();
        }
        GF2nPolynomialElement gf2npolynomialelement1;
        GF2nPolynomialElement gf2npolynomialelement2;
        do
        {
            GF2nPolynomialElement gf2npolynomialelement = new GF2nPolynomialElement((GF2nPolynomialField)mField, new Random());
            gf2npolynomialelement1 = ZERO((GF2nPolynomialField)mField);
            gf2npolynomialelement2 = (GF2nPolynomialElement)gf2npolynomialelement.clone();
            for (int i = 1; i < mDegree; i++)
            {
                gf2npolynomialelement1.squareThis();
                gf2npolynomialelement2.squareThis();
                gf2npolynomialelement1.addToThis(gf2npolynomialelement2.multiply(this));
                gf2npolynomialelement2.addToThis(gf2npolynomialelement);
            }

        } while (gf2npolynomialelement2.isZero());
        if (!equals(gf2npolynomialelement1.square().add(gf2npolynomialelement1)))
        {
            throw new RuntimeException();
        } else
        {
            return gf2npolynomialelement1;
        }
    }

    public GF2nElement square()
    {
        return squarePreCalc();
    }

    public GF2nPolynomialElement squareBitwise()
    {
        GF2nPolynomialElement gf2npolynomialelement = new GF2nPolynomialElement(this);
        gf2npolynomialelement.squareThisBitwise();
        gf2npolynomialelement.reduceThis();
        return gf2npolynomialelement;
    }

    public GF2nPolynomialElement squareMatrix()
    {
        GF2nPolynomialElement gf2npolynomialelement = new GF2nPolynomialElement(this);
        gf2npolynomialelement.squareThisMatrix();
        gf2npolynomialelement.reduceThis();
        return gf2npolynomialelement;
    }

    public GF2nPolynomialElement squarePreCalc()
    {
        GF2nPolynomialElement gf2npolynomialelement = new GF2nPolynomialElement(this);
        gf2npolynomialelement.squareThisPreCalc();
        gf2npolynomialelement.reduceThis();
        return gf2npolynomialelement;
    }

    public GF2nElement squareRoot()
    {
        GF2nPolynomialElement gf2npolynomialelement = new GF2nPolynomialElement(this);
        gf2npolynomialelement.squareRootThis();
        return gf2npolynomialelement;
    }

    public void squareRootThis()
    {
        polynomial.expandN((mDegree << 1) + 32);
        polynomial.reduceN();
        for (int i = 0; i < mField.getDegree() - 1; i++)
        {
            squareThis();
        }

    }

    public void squareThis()
    {
        squareThisPreCalc();
    }

    public void squareThisBitwise()
    {
        polynomial.squareThisBitwise();
        reduceThis();
    }

    public void squareThisMatrix()
    {
        GF2Polynomial gf2polynomial = new GF2Polynomial(mDegree);
        for (int i = 0; i < mDegree; i++)
        {
            if (polynomial.vectorMult(((GF2nPolynomialField)mField).squaringMatrix[mDegree - i - 1]))
            {
                gf2polynomial.setBit(i);
            }
        }

        polynomial = gf2polynomial;
    }

    public void squareThisPreCalc()
    {
        polynomial.squareThisPreCalc();
        reduceThis();
    }

    boolean testBit(int i)
    {
        return polynomial.testBit(i);
    }

    public boolean testRightmostBit()
    {
        return polynomial.testBit(0);
    }

    public byte[] toByteArray()
    {
        return polynomial.toByteArray();
    }

    public BigInteger toFlexiBigInt()
    {
        return polynomial.toFlexiBigInt();
    }

    public String toString()
    {
        return polynomial.toString(16);
    }

    public String toString(int i)
    {
        return polynomial.toString(i);
    }

    public int trace()
    {
        GF2nPolynomialElement gf2npolynomialelement = new GF2nPolynomialElement(this);
        for (int i = 1; i < mDegree; i++)
        {
            gf2npolynomialelement.squareThis();
            gf2npolynomialelement.addToThis(this);
        }

        return !gf2npolynomialelement.isOne() ? 0 : 1;
    }

}
