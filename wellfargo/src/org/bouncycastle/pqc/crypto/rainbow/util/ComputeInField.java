// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.rainbow.util;

import java.lang.reflect.Array;

// Referenced classes of package org.bouncycastle.pqc.crypto.rainbow.util:
//            GF2Field

public class ComputeInField
{

    private short A[][];
    short x[];

    public ComputeInField()
    {
    }

    private void computeZerosAbove()
    {
        for (int i = A.length - 1; i > 0; i--)
        {
            for (int j = i - 1; j >= 0; j--)
            {
                short word0 = A[j][i];
                short word1 = GF2Field.invElem(A[i][i]);
                if (word1 == 0)
                {
                    throw new RuntimeException("The matrix is not invertible");
                }
                for (int k = i; k < A.length * 2; k++)
                {
                    short word2 = GF2Field.multElem(word0, GF2Field.multElem(A[i][k], word1));
                    A[j][k] = GF2Field.addElem(A[j][k], word2);
                }

            }

        }

    }

    private void computeZerosUnder(boolean flag)
    {
        int i;
        int j;
        if (flag)
        {
            j = A.length * 2;
        } else
        {
            j = A.length + 1;
        }
        for (i = 0; i < A.length - 1; i++)
        {
            for (int k = i + 1; k < A.length; k++)
            {
                short word0 = A[k][i];
                short word1 = GF2Field.invElem(A[i][i]);
                if (word1 == 0)
                {
                    throw new RuntimeException("Matrix not invertible! We have to choose another one!");
                }
                for (int l = i; l < j; l++)
                {
                    short word2 = GF2Field.multElem(word0, GF2Field.multElem(A[i][l], word1));
                    A[k][l] = GF2Field.addElem(A[k][l], word2);
                }

            }

        }

    }

    private void substitute()
    {
        short word0 = GF2Field.invElem(A[A.length - 1][A.length - 1]);
        if (word0 == 0)
        {
            throw new RuntimeException("The equation system is not solvable");
        }
        x[A.length - 1] = GF2Field.multElem(A[A.length - 1][A.length], word0);
        for (int i = A.length - 2; i >= 0; i--)
        {
            short word1 = A[i][A.length];
            for (int j = A.length - 1; j > i; j--)
            {
                word1 = GF2Field.addElem(word1, GF2Field.multElem(A[i][j], x[j]));
            }

            short word2 = GF2Field.invElem(A[i][i]);
            if (word2 == 0)
            {
                throw new RuntimeException("Not solvable equation system");
            }
            x[i] = GF2Field.multElem(word1, word2);
        }

    }

    public short[][] addSquareMatrix(short aword0[][], short aword1[][])
    {
        if (aword0.length != aword1.length || aword0[0].length != aword1[0].length)
        {
            throw new RuntimeException("Addition is not possible!");
        }
        int i = aword0.length;
        int k = aword0.length;
        short aword2[][] = (short[][])Array.newInstance(Short.TYPE, new int[] {
            i, k
        });
        for (int j = 0; j < aword0.length; j++)
        {
            for (int l = 0; l < aword1.length; l++)
            {
                aword2[j][l] = GF2Field.addElem(aword0[j][l], aword1[j][l]);
            }

        }

        return aword2;
    }

    public short[] addVect(short aword0[], short aword1[])
    {
        if (aword0.length != aword1.length)
        {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short aword2[] = new short[aword0.length];
        for (int i = 0; i < aword2.length; i++)
        {
            aword2[i] = GF2Field.addElem(aword0[i], aword1[i]);
        }

        return aword2;
    }

    public short[][] inverse(short aword0[][])
    {
        int i = aword0.length;
        int k = aword0.length;
        A = (short[][])Array.newInstance(Short.TYPE, new int[] {
            i, k * 2
        });
        if (aword0.length != aword0[0].length)
        {
            throw new RuntimeException("The matrix is not invertible. Please choose another one!");
        }
          goto _L1
        aword0;
        aword0 = (short[][])null;
_L12:
        return aword0;
_L1:
        int j = 0;
_L6:
        if (j >= aword0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        int l = 0;
_L3:
        if (l >= aword0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        A[j][l] = aword0[j][l];
        l++;
        if (true) goto _L3; else goto _L2
_L2:
        l = aword0.length;
_L4:
        if (l >= aword0.length * 2)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        A[j][l] = 0;
        l++;
          goto _L4
        A[j][A.length + j] = 1;
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        computeZerosUnder(true);
        j = 0;
_L15:
        if (j >= A.length) goto _L8; else goto _L7
_L7:
        short word0 = GF2Field.invElem(A[j][j]);
        l = j;
_L10:
        if (l >= A.length * 2)
        {
            break; /* Loop/switch isn't completed */
        }
        A[j][l] = GF2Field.multElem(A[j][l], word0);
        l++;
        if (true) goto _L10; else goto _L9
_L8:
        short aword1[][];
        computeZerosAbove();
        j = A.length;
        l = A.length;
        aword1 = (short[][])Array.newInstance(Short.TYPE, new int[] {
            j, l
        });
        j = 0;
_L14:
        aword0 = aword1;
        if (j >= A.length) goto _L12; else goto _L11
_L11:
        l = A.length;
_L13:
        if (l >= A.length * 2)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        aword1[j][l - A.length] = A[j][l];
        l++;
          goto _L13
        j++;
          goto _L14
_L9:
        j++;
          goto _L15
    }

    public short[][] multMatrix(short word0, short aword0[][])
    {
        int i = aword0.length;
        int k = aword0[0].length;
        short aword1[][] = (short[][])Array.newInstance(Short.TYPE, new int[] {
            i, k
        });
        for (int j = 0; j < aword0.length; j++)
        {
            for (int l = 0; l < aword0[0].length; l++)
            {
                aword1[j][l] = GF2Field.multElem(word0, aword0[j][l]);
            }

        }

        return aword1;
    }

    public short[] multVect(short word0, short aword0[])
    {
        short aword1[] = new short[aword0.length];
        for (int i = 0; i < aword1.length; i++)
        {
            aword1[i] = GF2Field.multElem(word0, aword0[i]);
        }

        return aword1;
    }

    public short[][] multVects(short aword0[], short aword1[])
    {
        if (aword0.length != aword1.length)
        {
            throw new RuntimeException("Multiplication is not possible!");
        }
        int i = aword0.length;
        int k = aword1.length;
        short aword2[][] = (short[][])Array.newInstance(Short.TYPE, new int[] {
            i, k
        });
        for (int j = 0; j < aword0.length; j++)
        {
            for (int l = 0; l < aword1.length; l++)
            {
                aword2[j][l] = GF2Field.multElem(aword0[j], aword1[l]);
            }

        }

        return aword2;
    }

    public short[] multiplyMatrix(short aword0[][], short aword1[])
    {
        if (aword0[0].length != aword1.length)
        {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short aword2[] = new short[aword0.length];
        for (int i = 0; i < aword0.length; i++)
        {
            for (int j = 0; j < aword1.length; j++)
            {
                short word0 = GF2Field.multElem(aword0[i][j], aword1[j]);
                aword2[i] = GF2Field.addElem(aword2[i], word0);
            }

        }

        return aword2;
    }

    public short[][] multiplyMatrix(short aword0[][], short aword1[][])
    {
        if (aword0[0].length != aword1.length)
        {
            throw new RuntimeException("Multiplication is not possible!");
        }
        int i = aword0.length;
        int k = aword1[0].length;
        A = (short[][])Array.newInstance(Short.TYPE, new int[] {
            i, k
        });
        for (int j = 0; j < aword0.length; j++)
        {
            for (int l = 0; l < aword1.length; l++)
            {
                for (int i1 = 0; i1 < aword1[0].length; i1++)
                {
                    short word0 = GF2Field.multElem(aword0[j][l], aword1[l][i1]);
                    A[j][i1] = GF2Field.addElem(A[j][i1], word0);
                }

            }

        }

        return A;
    }

    public short[] solveEquation(short aword0[][], short aword1[])
    {
        int j;
        int l;
        try
        {
            if (aword0.length != aword1.length)
            {
                throw new RuntimeException("The equation system is not solvable");
            }
            int i = aword0.length;
            int k = aword0.length;
            A = (short[][])Array.newInstance(Short.TYPE, new int[] {
                i, k + 1
            });
            x = new short[aword0.length];
        }
        // Misplaced declaration of an exception variable
        catch (short aword0[][])
        {
            return null;
        }
        j = 0;
_L5:
        if (j >= aword0.length)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        l = 0;
_L2:
        if (l >= aword0[0].length)
        {
            break; /* Loop/switch isn't completed */
        }
        A[j][l] = aword0[j][l];
        l++;
        if (true) goto _L2; else goto _L1
_L3:
        for (; j >= aword1.length; j = 0)
        {
            break MISSING_BLOCK_LABEL_140;
        }

        A[j][aword1.length] = GF2Field.addElem(aword1[j], A[j][aword1.length]);
        j++;
          goto _L3
        computeZerosUnder(false);
        substitute();
        aword0 = x;
        return aword0;
_L1:
        j++;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
