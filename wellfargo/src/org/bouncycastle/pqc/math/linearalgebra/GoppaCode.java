// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;

// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            GF2Matrix, Permutation, GF2mField, PolynomialGF2mSmallM, 
//            GF2Vector

public final class GoppaCode
{

    private GoppaCode()
    {
    }

    public static MaMaPe computeSystematicForm(GF2Matrix gf2matrix, SecureRandom securerandom)
    {
        GF2Matrix gf2matrix1;
        int i;
        i = gf2matrix.getNumColumns();
        gf2matrix1 = null;
_L2:
        Permutation permutation;
        GF2Matrix gf2matrix3;
        GF2Matrix gf2matrix4;
        permutation = new Permutation(i, securerandom);
        gf2matrix3 = (GF2Matrix)gf2matrix.rightMultiply(permutation);
        gf2matrix4 = gf2matrix3.getLeftSubMatrix();
        GF2Matrix gf2matrix2 = (GF2Matrix)gf2matrix4.computeInverse();
        boolean flag;
        flag = true;
        gf2matrix1 = gf2matrix2;
_L3:
        if (flag)
        {
            return new MaMaPe(gf2matrix4, ((GF2Matrix)gf2matrix1.rightMultiply(gf2matrix3)).getRightSubMatrix(), permutation);
        }
        if (true) goto _L2; else goto _L1
_L1:
        ArithmeticException arithmeticexception;
        arithmeticexception;
        flag = false;
          goto _L3
    }

    public static GF2Matrix createCanonicalCheckMatrix(GF2mField gf2mfield, PolynomialGF2mSmallM polynomialgf2msmallm)
    {
        int j2 = gf2mfield.getDegree();
        int k2 = 1 << j2;
        int l2 = polynomialgf2msmallm.getDegree();
        int ai[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            l2, k2
        });
        int ai1[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            l2, k2
        });
        for (int i = 0; i < k2; i++)
        {
            ai1[0][i] = gf2mfield.inverse(polynomialgf2msmallm.evaluateAt(i));
        }

        for (int j = 1; j < l2; j++)
        {
            for (int i1 = 0; i1 < k2; i1++)
            {
                ai1[j][i1] = gf2mfield.mult(ai1[j - 1][i1], i1);
            }

        }

        for (int k = 0; k < l2; k++)
        {
            for (int j1 = 0; j1 < k2; j1++)
            {
                for (int l1 = 0; l1 <= k; l1++)
                {
                    ai[k][j1] = gf2mfield.add(ai[k][j1], gf2mfield.mult(ai1[l1][j1], polynomialgf2msmallm.getCoefficient((l2 + l1) - k)));
                }

            }

        }

        gf2mfield = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            l2 * j2, k2 + 31 >>> 5
        });
        for (int l = 0; l < k2; l++)
        {
            int i3 = l >>> 5;
            for (int k1 = 0; k1 < l2; k1++)
            {
                int j3 = ai[k1][l];
                for (int i2 = 0; i2 < j2; i2++)
                {
                    if ((j3 >>> i2 & 1) != 0)
                    {
                        polynomialgf2msmallm = gf2mfield[(k1 + 1) * j2 - i2 - 1];
                        polynomialgf2msmallm[i3] = polynomialgf2msmallm[i3] ^ 1 << (l & 0x1f);
                    }
                }

            }

        }

        return new GF2Matrix(k2, gf2mfield);
    }

    public static GF2Vector syndromeDecode(GF2Vector gf2vector, GF2mField gf2mfield, PolynomialGF2mSmallM polynomialgf2msmallm, PolynomialGF2mSmallM apolynomialgf2msmallm[])
    {
        int i = 0;
        int j = 1 << gf2mfield.getDegree();
        GF2Vector gf2vector1 = new GF2Vector(j);
        if (!gf2vector.isZero())
        {
            gf2vector = (new PolynomialGF2mSmallM(gf2vector.toExtensionFieldVector(gf2mfield))).modInverse(polynomialgf2msmallm).addMonomial(1).modSquareRootMatrix(apolynomialgf2msmallm).modPolynomialToFracton(polynomialgf2msmallm);
            gf2vector = gf2vector[0].multiply(gf2vector[0]).add(gf2vector[1].multiply(gf2vector[1]).multWithMonomial(1));
            gf2vector = gf2vector.multWithElement(gf2mfield.inverse(gf2vector.getHeadCoefficient()));
            for (; i < j; i++)
            {
                if (gf2vector.evaluateAt(i) == 0)
                {
                    gf2vector1.setBit(i);
                }
            }

        }
        return gf2vector1;
    }

    private class MaMaPe
    {

        private GF2Matrix h;
        private Permutation p;
        private GF2Matrix s;

        public GF2Matrix getFirstMatrix()
        {
            return s;
        }

        public Permutation getPermutation()
        {
            return p;
        }

        public GF2Matrix getSecondMatrix()
        {
            return h;
        }

        public MaMaPe(GF2Matrix gf2matrix, GF2Matrix gf2matrix1, Permutation permutation)
        {
            s = gf2matrix;
            h = gf2matrix1;
            p = permutation;
        }
    }

}
