// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            GF2nField, IntegerFunctions, GF2Polynomial, GF2nElement, 
//            GF2nPolynomialElement, GF2nPolynomial, GF2nONBElement

public class GF2nONBField extends GF2nField
{

    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    int mMult[][];
    private int mType;

    public GF2nONBField(int i)
    {
        if (i < 3)
        {
            throw new IllegalArgumentException("k must be at least 3");
        }
        mDegree = i;
        mLength = mDegree / 64;
        mBit = mDegree & 0x3f;
        if (mBit == 0)
        {
            mBit = 64;
        } else
        {
            mLength = mLength + 1;
        }
        computeType();
        if (mType < 3)
        {
            i = mDegree;
            mMult = (int[][])Array.newInstance(Integer.TYPE, new int[] {
                i, 2
            });
            for (i = 0; i < mDegree; i++)
            {
                mMult[i][0] = -1;
                mMult[i][1] = -1;
            }

            computeMultMatrix();
            computeFieldPolynomial();
            fields = new Vector();
            matrices = new Vector();
            return;
        } else
        {
            throw new RuntimeException((new StringBuilder()).append("\nThe type of this field is ").append(mType).toString());
        }
    }

    private void computeMultMatrix()
    {
        if ((mType & 7) != 0)
        {
            int j2 = mType * mDegree + 1;
            int ai[] = new int[j2];
            int i;
            int l;
            int k1;
            if (mType == 1)
            {
                i = 1;
            } else
            if (mType == 2)
            {
                i = j2 - 1;
            } else
            {
                i = elementOfOrder(mType, j2);
            }
            k1 = 0;
            l = 1;
            for (; k1 < mType; k1++)
            {
                int l1 = 0;
                int j1 = l;
                for (; l1 < mDegree; l1++)
                {
                    ai[j1] = l1;
                    int i2 = (j1 << 1) % j2;
                    j1 = i2;
                    if (i2 < 0)
                    {
                        j1 = i2 + j2;
                    }
                }

                j1 = (l * i) % j2;
                l = j1;
                if (j1 < 0)
                {
                    l = j1 + j2;
                }
            }

            if (mType == 1)
            {
                int j = 1;
                while (j < j2 - 1) 
                {
                    if (mMult[ai[j + 1]][0] == -1)
                    {
                        mMult[ai[j + 1]][0] = ai[j2 - j];
                    } else
                    {
                        mMult[ai[j + 1]][1] = ai[j2 - j];
                    }
                    j++;
                }
                int i1 = mDegree >> 1;
                j = 1;
                while (j <= i1) 
                {
                    if (mMult[j - 1][0] == -1)
                    {
                        mMult[j - 1][0] = (i1 + j) - 1;
                    } else
                    {
                        mMult[j - 1][1] = (i1 + j) - 1;
                    }
                    if (mMult[(i1 + j) - 1][0] == -1)
                    {
                        mMult[(i1 + j) - 1][0] = j - 1;
                    } else
                    {
                        mMult[(i1 + j) - 1][1] = j - 1;
                    }
                    j++;
                }
            } else
            if (mType == 2)
            {
                int k = 1;
                while (k < j2 - 1) 
                {
                    if (mMult[ai[k + 1]][0] == -1)
                    {
                        mMult[ai[k + 1]][0] = ai[j2 - k];
                    } else
                    {
                        mMult[ai[k + 1]][1] = ai[j2 - k];
                    }
                    k++;
                }
            } else
            {
                throw new RuntimeException("only type 1 or type 2 implemented");
            }
        } else
        {
            throw new RuntimeException("bisher nur fuer Gausssche Normalbasen implementiert");
        }
    }

    private void computeType()
    {
        if ((mDegree & 7) == 0)
        {
            throw new RuntimeException("The extension degree is divisible by 8!");
        }
        mType = 1;
        for (int i = 0; i != true;)
        {
            int k = mType * mDegree + 1;
            if (IntegerFunctions.isPrime(k))
            {
                i = IntegerFunctions.order(2, k);
                i = IntegerFunctions.gcd((mType * mDegree) / i, mDegree);
            }
            mType = mType + 1;
        }

        mType = mType - 1;
        if (mType == 1)
        {
            int j = (mDegree << 1) + 1;
            if (IntegerFunctions.isPrime(j))
            {
                j = IntegerFunctions.order(2, j);
                if (IntegerFunctions.gcd((mDegree << 1) / j, mDegree) == 1)
                {
                    mType = mType + 1;
                }
            }
        }
    }

    private int elementOfOrder(int i, int j)
    {
        Random random = new Random();
        int k = 0;
        do
        {
            if (k != 0)
            {
                break;
            }
            int l = random.nextInt() % (j - 1);
            k = l;
            if (l < 0)
            {
                k = l + (j - 1);
            }
        } while (true);
        int k1 = IntegerFunctions.order(k, j);
        do
        {
            int i1 = k;
            if (k1 % i == 0)
            {
                if (k1 != 0)
                {
                    break;
                }
                i1 = k;
            }
            do
            {
                if (i1 != 0)
                {
                    break;
                }
                k = random.nextInt() % (j - 1);
                i1 = k;
                if (k < 0)
                {
                    i1 = k + (j - 1);
                }
            } while (true);
            k1 = IntegerFunctions.order(i1, j);
            k = i1;
        } while (true);
        int j1 = i / k1;
        i = 2;
        j = k;
        for (; i <= j1; i++)
        {
            j *= k;
        }

        return j;
    }

    protected void computeCOBMatrix(GF2nField gf2nfield)
    {
        if (mDegree != gf2nfield.mDegree)
        {
            throw new IllegalArgumentException("GF2nField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
        }
        GF2Polynomial agf2polynomial[] = new GF2Polynomial[mDegree];
        for (int i = 0; i < mDegree; i++)
        {
            agf2polynomial[i] = new GF2Polynomial(mDegree);
        }

        GF2nElement gf2nelement;
        do
        {
            gf2nelement = gf2nfield.getRandomRoot(fieldPolynomial);
        } while (gf2nelement.isZero());
        GF2nPolynomialElement agf2npolynomialelement[] = new GF2nPolynomialElement[mDegree];
        agf2npolynomialelement[0] = (GF2nElement)gf2nelement.clone();
        for (int j = 1; j < mDegree; j++)
        {
            agf2npolynomialelement[j] = agf2npolynomialelement[j - 1].square();
        }

        for (int k = 0; k < mDegree; k++)
        {
            for (int l = 0; l < mDegree; l++)
            {
                if (agf2npolynomialelement[k].testBit(l))
                {
                    agf2polynomial[mDegree - l - 1].setBit(mDegree - k - 1);
                }
            }

        }

        fields.addElement(gf2nfield);
        matrices.addElement(agf2polynomial);
        gf2nfield.fields.addElement(this);
        gf2nfield.matrices.addElement(invertMatrix(agf2polynomial));
    }

    protected void computeFieldPolynomial()
    {
        int i = 1;
        if (mType == 1)
        {
            fieldPolynomial = new GF2Polynomial(mDegree + 1, "ALL");
        } else
        if (mType == 2)
        {
            GF2Polynomial gf2polynomial1 = new GF2Polynomial(mDegree + 1, "ONE");
            GF2Polynomial gf2polynomial = new GF2Polynomial(mDegree + 1, "X");
            gf2polynomial.addToThis(gf2polynomial1);
            while (i < mDegree) 
            {
                GF2Polynomial gf2polynomial2 = gf2polynomial.shiftLeft();
                gf2polynomial2.addToThis(gf2polynomial1);
                i++;
                gf2polynomial1 = gf2polynomial;
                gf2polynomial = gf2polynomial2;
            }
            fieldPolynomial = gf2polynomial;
            return;
        }
    }

    int getONBBit()
    {
        return mBit;
    }

    int getONBLength()
    {
        return mLength;
    }

    protected GF2nElement getRandomRoot(GF2Polynomial gf2polynomial)
    {
        gf2polynomial = new GF2nPolynomial(gf2polynomial, this);
        int i = gf2polynomial.getDegree();
        while (i > 1) 
        {
            Object obj;
            int j;
            do
            {
                obj = new GF2nONBElement(this, new Random());
                GF2nPolynomial gf2npolynomial = new GF2nPolynomial(2, GF2nONBElement.ZERO(this));
                gf2npolynomial.set(1, ((GF2nElement) (obj)));
                obj = new GF2nPolynomial(gf2npolynomial);
                for (i = 1; i <= mDegree - 1; i++)
                {
                    obj = ((GF2nPolynomial) (obj)).multiplyAndReduce(((GF2nPolynomial) (obj)), gf2polynomial).add(gf2npolynomial);
                }

                obj = ((GF2nPolynomial) (obj)).gcd(gf2polynomial);
                i = ((GF2nPolynomial) (obj)).getDegree();
                j = gf2polynomial.getDegree();
            } while (i == 0 || i == j);
            if (i << 1 > j)
            {
                gf2polynomial = gf2polynomial.quotient(((GF2nPolynomial) (obj)));
            } else
            {
                gf2polynomial = new GF2nPolynomial(((GF2nPolynomial) (obj)));
            }
            i = gf2polynomial.getDegree();
        }
        return gf2polynomial.at(0);
    }

    int[][] invMatrix(int ai[][])
    {
        int i;
        boolean flag = false;
        i = mDegree;
        int j = mDegree;
        int ai1[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i, j
        });
        i = mDegree;
        j = mDegree;
        ai1 = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i, j
        });
        j = 0;
        do
        {
            i = ((flag) ? 1 : 0);
            if (j >= mDegree)
            {
                break;
            }
            ai1[j][j] = 1;
            j++;
        } while (true);
_L3:
        if (i < mDegree)
        {
            int k = i;
            while (k < mDegree) 
            {
                ai[mDegree - 1 - i][k] = ai[i][i];
                k++;
            }
        } else
        {
            return (int[][])null;
        }
        if (true) goto _L2; else goto _L1
_L2:
        i++;
        if (true) goto _L3; else goto _L1
_L1:
    }
}
