// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.util.Random;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            GF2nField, GF2Polynomial, GF2nONBField, GF2nElement, 
//            GF2nONBElement, GF2nPolynomialElement, GF2nPolynomial

public class GF2nPolynomialField extends GF2nField
{

    private boolean isPentanomial;
    private boolean isTrinomial;
    private int pc[];
    GF2Polynomial squaringMatrix[];
    private int tc;

    public GF2nPolynomialField(int i)
    {
        isTrinomial = false;
        isPentanomial = false;
        pc = new int[3];
        if (i < 3)
        {
            throw new IllegalArgumentException("k must be at least 3");
        } else
        {
            mDegree = i;
            computeFieldPolynomial();
            computeSquaringMatrix();
            fields = new Vector();
            matrices = new Vector();
            return;
        }
    }

    public GF2nPolynomialField(int i, GF2Polynomial gf2polynomial)
    {
        isTrinomial = false;
        isPentanomial = false;
        pc = new int[3];
        if (i < 3)
        {
            throw new IllegalArgumentException("degree must be at least 3");
        }
        if (gf2polynomial.getLength() != i + 1)
        {
            throw new RuntimeException();
        }
        if (!gf2polynomial.isIrreducible())
        {
            throw new RuntimeException();
        }
        mDegree = i;
        fieldPolynomial = gf2polynomial;
        computeSquaringMatrix();
        int k = 2;
        for (int j = 1; j < fieldPolynomial.getLength() - 1;)
        {
            i = k;
            if (fieldPolynomial.testBit(j))
            {
                k++;
                if (k == 3)
                {
                    tc = j;
                }
                i = k;
                if (k <= 5)
                {
                    pc[k - 3] = j;
                    i = k;
                }
            }
            j++;
            k = i;
        }

        if (k == 3)
        {
            isTrinomial = true;
        }
        if (k == 5)
        {
            isPentanomial = true;
        }
        fields = new Vector();
        matrices = new Vector();
    }

    public GF2nPolynomialField(int i, boolean flag)
    {
        isTrinomial = false;
        isPentanomial = false;
        pc = new int[3];
        if (i < 3)
        {
            throw new IllegalArgumentException("k must be at least 3");
        }
        mDegree = i;
        if (flag)
        {
            computeFieldPolynomial();
        } else
        {
            computeFieldPolynomial2();
        }
        computeSquaringMatrix();
        fields = new Vector();
        matrices = new Vector();
    }

    private void computeSquaringMatrix()
    {
        boolean flag = false;
        GF2Polynomial agf2polynomial[] = new GF2Polynomial[mDegree - 1];
        squaringMatrix = new GF2Polynomial[mDegree];
        int i = 0;
        int l;
        do
        {
            l = ((flag) ? 1 : 0);
            if (i >= squaringMatrix.length)
            {
                break;
            }
            squaringMatrix[i] = new GF2Polynomial(mDegree, "ZERO");
            i++;
        } while (true);
        for (; l < mDegree - 1; l++)
        {
            agf2polynomial[l] = (new GF2Polynomial(1, "ONE")).shiftLeft(mDegree + l).remainder(fieldPolynomial);
        }

        for (int j = 1; j <= Math.abs(mDegree >> 1); j++)
        {
            for (int i1 = 1; i1 <= mDegree; i1++)
            {
                if (agf2polynomial[mDegree - (j << 1)].testBit(mDegree - i1))
                {
                    squaringMatrix[i1 - 1].setBit(mDegree - j);
                }
            }

        }

        for (int k = Math.abs(mDegree >> 1) + 1; k <= mDegree; k++)
        {
            squaringMatrix[(k << 1) - mDegree - 1].setBit(mDegree - k);
        }

    }

    private boolean testPentanomials()
    {
        int i;
        int k;
        boolean flag4;
        fieldPolynomial = new GF2Polynomial(mDegree + 1);
        fieldPolynomial.setBit(0);
        fieldPolynomial.setBit(mDegree);
        flag4 = false;
        k = 0;
        i = 1;
_L13:
        boolean flag5 = flag4;
        if (i > mDegree - 3) goto _L2; else goto _L1
_L1:
        flag5 = flag4;
        if (flag4) goto _L2; else goto _L3
_L3:
        int j;
        fieldPolynomial.setBit(i);
        j = i + 1;
_L11:
        int l;
        if (j > mDegree - 2 || flag4)
        {
            break; /* Loop/switch isn't completed */
        }
        fieldPolynomial.setBit(j);
        l = j + 1;
_L9:
        if (l > mDegree - 1 || flag4) goto _L5; else goto _L4
_L4:
        int i1;
        fieldPolynomial.setBit(l);
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if ((mDegree & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i & 1) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((j & 1) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if ((l & 1) != 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        flag5 = flag4;
        i1 = k;
        if (!(flag3 | (flag | flag1 | flag2))) goto _L7; else goto _L6
_L6:
        flag4 = fieldPolynomial.isIrreducible();
        i1 = k + 1;
        flag5 = flag4;
        if (!flag4) goto _L7; else goto _L8
_L8:
        isPentanomial = true;
        pc[0] = i;
        pc[1] = j;
        pc[2] = l;
        flag5 = flag4;
_L2:
        return flag5;
_L7:
        fieldPolynomial.resetBit(l);
        l++;
        flag4 = flag5;
        k = i1;
          goto _L9
_L5:
        fieldPolynomial.resetBit(j);
        j++;
        if (true) goto _L11; else goto _L10
_L10:
        fieldPolynomial.resetBit(i);
        i++;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private boolean testRandom()
    {
        fieldPolynomial = new GF2Polynomial(mDegree + 1);
        int i = 0;
        do
        {
            i++;
            fieldPolynomial.randomize();
            fieldPolynomial.setBit(mDegree);
            fieldPolynomial.setBit(0);
        } while (!fieldPolynomial.isIrreducible());
        return true;
    }

    private boolean testTrinomials()
    {
        boolean flag = false;
        fieldPolynomial = new GF2Polynomial(mDegree + 1);
        fieldPolynomial.setBit(0);
        fieldPolynomial.setBit(mDegree);
        int j = 0;
        int i = 1;
        do
        {
label0:
            {
                boolean flag1 = flag;
                if (i < mDegree)
                {
                    flag1 = flag;
                    if (!flag)
                    {
                        fieldPolynomial.setBit(i);
                        flag1 = fieldPolynomial.isIrreducible();
                        j++;
                        if (!flag1)
                        {
                            break label0;
                        }
                        isTrinomial = true;
                        tc = i;
                    }
                }
                return flag1;
            }
            fieldPolynomial.resetBit(i);
            flag = fieldPolynomial.isIrreducible();
            i++;
        } while (true);
    }

    protected void computeCOBMatrix(GF2nField gf2nfield)
    {
        if (mDegree != gf2nfield.mDegree)
        {
            throw new IllegalArgumentException("GF2nPolynomialField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
        }
        if (gf2nfield instanceof GF2nONBField)
        {
            gf2nfield.computeCOBMatrix(this);
            return;
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
        Object aobj[];
        if (gf2nelement instanceof GF2nONBElement)
        {
            aobj = new GF2nONBElement[mDegree];
            aobj[mDegree - 1] = GF2nONBElement.ONE((GF2nONBField)gf2nfield);
        } else
        {
            aobj = new GF2nPolynomialElement[mDegree];
            aobj[mDegree - 1] = GF2nPolynomialElement.ONE((GF2nPolynomialField)gf2nfield);
        }
        aobj[mDegree - 2] = gf2nelement;
        for (int j = mDegree - 3; j >= 0; j--)
        {
            aobj[j] = (GF2nElement)aobj[j + 1].multiply(gf2nelement);
        }

        if (gf2nfield instanceof GF2nONBField)
        {
            for (int k = 0; k < mDegree; k++)
            {
                for (int i1 = 0; i1 < mDegree; i1++)
                {
                    if (((GF2nElement) (aobj[k])).testBit(mDegree - i1 - 1))
                    {
                        agf2polynomial[mDegree - i1 - 1].setBit(mDegree - k - 1);
                    }
                }

            }

        } else
        {
            for (int l = 0; l < mDegree; l++)
            {
                for (int j1 = 0; j1 < mDegree; j1++)
                {
                    if (((GF2nElement) (aobj[l])).testBit(j1))
                    {
                        agf2polynomial[mDegree - j1 - 1].setBit(mDegree - l - 1);
                    }
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
        while (testTrinomials() || testPentanomials()) 
        {
            return;
        }
        testRandom();
    }

    protected void computeFieldPolynomial2()
    {
        while (testTrinomials() || testPentanomials()) 
        {
            return;
        }
        testRandom();
    }

    public int[] getPc()
    {
        if (!isPentanomial)
        {
            throw new RuntimeException();
        } else
        {
            int ai[] = new int[3];
            System.arraycopy(pc, 0, ai, 0, 3);
            return ai;
        }
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
                obj = new GF2nPolynomialElement(this, new Random());
                GF2nPolynomial gf2npolynomial = new GF2nPolynomial(2, GF2nPolynomialElement.ZERO(this));
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

    public GF2Polynomial getSquaringVector(int i)
    {
        return new GF2Polynomial(squaringMatrix[i]);
    }

    public int getTc()
    {
        if (!isTrinomial)
        {
            throw new RuntimeException();
        } else
        {
            return tc;
        }
    }

    public boolean isPentanomial()
    {
        return isPentanomial;
    }

    public boolean isTrinomial()
    {
        return isTrinomial;
    }
}
