// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;


// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            PolynomialGF2mSmallM, GF2mField

public class PolynomialRingGF2m
{

    private GF2mField field;
    private PolynomialGF2mSmallM p;
    protected PolynomialGF2mSmallM sqMatrix[];
    protected PolynomialGF2mSmallM sqRootMatrix[];

    public PolynomialRingGF2m(GF2mField gf2mfield, PolynomialGF2mSmallM polynomialgf2msmallm)
    {
        field = gf2mfield;
        p = polynomialgf2msmallm;
        computeSquaringMatrix();
        computeSquareRootMatrix();
    }

    private void computeSquareRootMatrix()
    {
        int i2 = p.getDegree();
        PolynomialGF2mSmallM apolynomialgf2msmallm[] = new PolynomialGF2mSmallM[i2];
        for (int i = i2 - 1; i >= 0; i--)
        {
            apolynomialgf2msmallm[i] = new PolynomialGF2mSmallM(sqMatrix[i]);
        }

        sqRootMatrix = new PolynomialGF2mSmallM[i2];
        for (int j = i2 - 1; j >= 0; j--)
        {
            sqRootMatrix[j] = new PolynomialGF2mSmallM(field, j);
        }

        for (int j1 = 0; j1 < i2; j1++)
        {
            if (apolynomialgf2msmallm[j1].getCoefficient(j1) == 0)
            {
                int k = j1 + 1;
                boolean flag = false;
                int l1;
                for (; k < i2; k = l1 + 1)
                {
                    l1 = k;
                    if (apolynomialgf2msmallm[k].getCoefficient(j1) != 0)
                    {
                        flag = true;
                        swapColumns(apolynomialgf2msmallm, j1, k);
                        swapColumns(sqRootMatrix, j1, k);
                        l1 = i2;
                    }
                }

                if (!flag)
                {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int l = apolynomialgf2msmallm[j1].getCoefficient(j1);
            l = field.inverse(l);
            apolynomialgf2msmallm[j1].multThisWithElement(l);
            sqRootMatrix[j1].multThisWithElement(l);
            for (int i1 = 0; i1 < i2; i1++)
            {
                if (i1 == j1)
                {
                    continue;
                }
                int k1 = apolynomialgf2msmallm[i1].getCoefficient(j1);
                if (k1 != 0)
                {
                    PolynomialGF2mSmallM polynomialgf2msmallm = apolynomialgf2msmallm[j1].multWithElement(k1);
                    PolynomialGF2mSmallM polynomialgf2msmallm1 = sqRootMatrix[j1].multWithElement(k1);
                    apolynomialgf2msmallm[i1].addToThis(polynomialgf2msmallm);
                    sqRootMatrix[i1].addToThis(polynomialgf2msmallm1);
                }
            }

        }

    }

    private void computeSquaringMatrix()
    {
        int k = p.getDegree();
        sqMatrix = new PolynomialGF2mSmallM[k];
        for (int i = 0; i < k >> 1; i++)
        {
            int ai[] = new int[(i << 1) + 1];
            ai[i << 1] = 1;
            sqMatrix[i] = new PolynomialGF2mSmallM(field, ai);
        }

        for (int j = k >> 1; j < k; j++)
        {
            int ai1[] = new int[(j << 1) + 1];
            ai1[j << 1] = 1;
            PolynomialGF2mSmallM polynomialgf2msmallm = new PolynomialGF2mSmallM(field, ai1);
            sqMatrix[j] = polynomialgf2msmallm.mod(p);
        }

    }

    private static void swapColumns(PolynomialGF2mSmallM apolynomialgf2msmallm[], int i, int j)
    {
        PolynomialGF2mSmallM polynomialgf2msmallm = apolynomialgf2msmallm[i];
        apolynomialgf2msmallm[i] = apolynomialgf2msmallm[j];
        apolynomialgf2msmallm[j] = polynomialgf2msmallm;
    }

    public PolynomialGF2mSmallM[] getSquareRootMatrix()
    {
        return sqRootMatrix;
    }

    public PolynomialGF2mSmallM[] getSquaringMatrix()
    {
        return sqMatrix;
    }
}
