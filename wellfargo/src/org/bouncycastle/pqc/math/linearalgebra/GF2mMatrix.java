// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;

// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            Matrix, GF2mField, IntUtils, Vector, 
//            Permutation

public class GF2mMatrix extends Matrix
{

    protected GF2mField field;
    protected int matrix[][];

    public GF2mMatrix(GF2mField gf2mfield, byte abyte0[])
    {
        field = gf2mfield;
        int j = 8;
        int i = 1;
        for (; gf2mfield.getDegree() > j; j += 8)
        {
            i++;
        }

        if (abyte0.length < 5)
        {
            throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
        }
        int k = abyte0[3];
        byte byte0 = abyte0[2];
        numRows = (abyte0[1] & 0xff) << 8 ^ ((k & 0xff) << 24 ^ (byte0 & 0xff) << 16) ^ abyte0[0] & 0xff;
        i *= numRows;
        if (numRows <= 0 || (abyte0.length - 4) % i != 0)
        {
            throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
        }
        numColumns = (abyte0.length - 4) / i;
        i = numRows;
        k = numColumns;
        matrix = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i, k
        });
        i = 4;
        for (int l = 0; l < numRows; l++)
        {
            for (int i1 = 0; i1 < numColumns; i1++)
            {
                for (int j1 = 0; j1 < j;)
                {
                    gf2mfield = matrix[l];
                    int k1 = gf2mfield[i1];
                    gf2mfield[i1] = (abyte0[i] & 0xff) << j1 ^ k1;
                    j1 += 8;
                    i++;
                }

                if (!field.isElementOfThisField(matrix[l][i1]))
                {
                    throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
                }
            }

        }

    }

    protected GF2mMatrix(GF2mField gf2mfield, int ai[][])
    {
        field = gf2mfield;
        matrix = ai;
        numRows = ai.length;
        numColumns = ai[0].length;
    }

    public GF2mMatrix(GF2mMatrix gf2mmatrix)
    {
        numRows = gf2mmatrix.numRows;
        numColumns = gf2mmatrix.numColumns;
        field = gf2mmatrix.field;
        matrix = new int[numRows][];
        for (int i = 0; i < numRows; i++)
        {
            matrix[i] = IntUtils.clone(gf2mmatrix.matrix[i]);
        }

    }

    private void addToRow(int ai[], int ai1[])
    {
        for (int i = ai1.length - 1; i >= 0; i--)
        {
            ai1[i] = field.add(ai[i], ai1[i]);
        }

    }

    private int[] multRowWithElement(int ai[], int i)
    {
        int ai1[] = new int[ai.length];
        for (int j = ai.length - 1; j >= 0; j--)
        {
            ai1[j] = field.mult(ai[j], i);
        }

        return ai1;
    }

    private void multRowWithElementThis(int ai[], int i)
    {
        for (int j = ai.length - 1; j >= 0; j--)
        {
            ai[j] = field.mult(ai[j], i);
        }

    }

    private static void swapColumns(int ai[][], int i, int j)
    {
        int ai1[] = ai[i];
        ai[i] = ai[j];
        ai[j] = ai1;
    }

    public Matrix computeInverse()
    {
        if (numRows != numColumns)
        {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        int i = numRows;
        int j1 = numRows;
        int ai[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i, j1
        });
        for (i = numRows - 1; i >= 0; i--)
        {
            ai[i] = IntUtils.clone(matrix[i]);
        }

        i = numRows;
        j1 = numRows;
        int ai1[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i, j1
        });
        for (int j = numRows - 1; j >= 0; j--)
        {
            ai1[j][j] = 1;
        }

        for (int k1 = 0; k1 < numRows; k1++)
        {
            if (ai[k1][k1] == 0)
            {
                int k = k1 + 1;
                boolean flag = false;
                int i2;
                for (; k < numRows; k = i2 + 1)
                {
                    i2 = k;
                    if (ai[k][k1] != 0)
                    {
                        swapColumns(ai, k1, k);
                        swapColumns(ai1, k1, k);
                        i2 = numRows;
                        flag = true;
                    }
                }

                if (!flag)
                {
                    throw new ArithmeticException("Matrix is not invertible.");
                }
            }
            int l = ai[k1][k1];
            l = field.inverse(l);
            multRowWithElementThis(ai[k1], l);
            multRowWithElementThis(ai1[k1], l);
            for (int i1 = 0; i1 < numRows; i1++)
            {
                if (i1 == k1)
                {
                    continue;
                }
                int l1 = ai[i1][k1];
                if (l1 != 0)
                {
                    int ai2[] = multRowWithElement(ai[k1], l1);
                    int ai3[] = multRowWithElement(ai1[k1], l1);
                    addToRow(ai2, ai[i1]);
                    addToRow(ai3, ai1[i1]);
                }
            }

        }

        return new GF2mMatrix(field, ai1);
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof GF2mMatrix))
        {
            break MISSING_BLOCK_LABEL_18;
        }
        return false;
        int i;
        int j;
        if (!field.equals(((GF2mMatrix) (obj = (GF2mMatrix)obj)).field) || ((GF2mMatrix) (obj)).numRows != numColumns || ((GF2mMatrix) (obj)).numColumns != numColumns)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
          goto _L1
        continue; /* Loop/switch isn't completed */
        i++;
    }

    public byte[] getEncoded()
    {
        int j = 8;
        int i = 1;
        for (; field.getDegree() > j; j += 8)
        {
            i++;
        }

        byte abyte0[] = new byte[i * (numRows * numColumns) + 4];
        abyte0[0] = (byte)(numRows & 0xff);
        abyte0[1] = (byte)(numRows >>> 8 & 0xff);
        abyte0[2] = (byte)(numRows >>> 16 & 0xff);
        abyte0[3] = (byte)(numRows >>> 24 & 0xff);
        i = 4;
        for (int k = 0; k < numRows; k++)
        {
            for (int l = 0; l < numColumns; l++)
            {
                for (int i1 = 0; i1 < j;)
                {
                    abyte0[i] = (byte)(matrix[k][l] >>> i1);
                    i1 += 8;
                    i++;
                }

            }

        }

        return abyte0;
    }

    public int hashCode()
    {
        int j = (field.hashCode() * 31 + numRows) * 31 + numColumns;
        for (int i = 0; i < numRows; i++)
        {
            for (int k = 0; k < numColumns;)
            {
                int l = matrix[i][k];
                k++;
                j = l + j * 31;
            }

        }

        return j;
    }

    public boolean isZero()
    {
        for (int i = 0; i < numRows; i++)
        {
            for (int j = 0; j < numColumns; j++)
            {
                if (matrix[i][j] != 0)
                {
                    return false;
                }
            }

        }

        return true;
    }

    public Vector leftMultiply(Vector vector)
    {
        throw new RuntimeException("Not implemented.");
    }

    public Matrix rightMultiply(Matrix matrix1)
    {
        throw new RuntimeException("Not implemented.");
    }

    public Matrix rightMultiply(Permutation permutation)
    {
        throw new RuntimeException("Not implemented.");
    }

    public Vector rightMultiply(Vector vector)
    {
        throw new RuntimeException("Not implemented.");
    }

    public String toString()
    {
        String s = (new StringBuilder()).append(numRows).append(" x ").append(numColumns).append(" Matrix over ").append(field.toString()).append(": \n").toString();
        for (int i = 0; i < numRows; i++)
        {
            for (int j = 0; j < numColumns; j++)
            {
                s = (new StringBuilder()).append(s).append(field.elementToStr(matrix[i][j])).append(" : ").toString();
            }

            s = (new StringBuilder()).append(s).append("\n").toString();
        }

        return s;
    }
}
