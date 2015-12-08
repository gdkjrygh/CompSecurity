// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;

// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            Matrix, IntUtils, LittleEndianConversions, Permutation, 
//            GF2Vector, Vector

public class GF2Matrix extends Matrix
{

    private int length;
    private int matrix[][];

    public GF2Matrix(int i, char c)
    {
        this(i, c, new SecureRandom());
    }

    public GF2Matrix(int i, char c, SecureRandom securerandom)
    {
        if (i <= 0)
        {
            throw new ArithmeticException("Size of matrix is non-positive.");
        }
        switch (c)
        {
        default:
            throw new ArithmeticException("Unknown matrix type.");

        case 90: // 'Z'
            assignZeroMatrix(i, i);
            return;

        case 73: // 'I'
            assignUnitMatrix(i);
            return;

        case 76: // 'L'
            assignRandomLowerTriangularMatrix(i, securerandom);
            return;

        case 85: // 'U'
            assignRandomUpperTriangularMatrix(i, securerandom);
            return;

        case 82: // 'R'
            assignRandomRegularMatrix(i, securerandom);
            return;
        }
    }

    private GF2Matrix(int i, int j)
    {
        if (j <= 0 || i <= 0)
        {
            throw new ArithmeticException("size of matrix is non-positive");
        } else
        {
            assignZeroMatrix(i, j);
            return;
        }
    }

    public GF2Matrix(int i, int ai[][])
    {
        int j = 0;
        super();
        if (ai[0].length != i + 31 >> 5)
        {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        numColumns = i;
        numRows = ai.length;
        length = ai[0].length;
        i &= 0x1f;
        if (i == 0)
        {
            i = -1;
        } else
        {
            i = (1 << i) - 1;
        }
        for (; j < numRows; j++)
        {
            int ai1[] = ai[j];
            int k = length - 1;
            ai1[k] = ai1[k] & i;
        }

        matrix = ai;
    }

    public GF2Matrix(GF2Matrix gf2matrix)
    {
        numColumns = gf2matrix.getNumColumns();
        numRows = gf2matrix.getNumRows();
        length = gf2matrix.length;
        matrix = new int[gf2matrix.matrix.length][];
        for (int i = 0; i < matrix.length; i++)
        {
            matrix[i] = IntUtils.clone(gf2matrix.matrix[i]);
        }

    }

    public GF2Matrix(byte abyte0[])
    {
        if (abyte0.length < 9)
        {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        numRows = LittleEndianConversions.OS2IP(abyte0, 0);
        numColumns = LittleEndianConversions.OS2IP(abyte0, 4);
        int i = numColumns;
        int j = numRows;
        if (numRows <= 0 || (i + 7 >>> 3) * j != abyte0.length - 8)
        {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        length = numColumns + 31 >>> 5;
        i = numRows;
        j = length;
        matrix = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i, j
        });
        int j1 = numColumns >> 5;
        int k1 = numColumns;
        i = 8;
        for (int k = 0; k < numRows; k++)
        {
            for (int l = 0; l < j1;)
            {
                matrix[k][l] = LittleEndianConversions.OS2IP(abyte0, i);
                l++;
                i += 4;
            }

            for (int i1 = 0; i1 < (k1 & 0x1f);)
            {
                int ai[] = matrix[k];
                int l1 = ai[j1];
                ai[j1] = (abyte0[i] & 0xff) << i1 ^ l1;
                i1 += 8;
                i++;
            }

        }

    }

    private static void addToRow(int ai[], int ai1[], int i)
    {
        for (int j = ai1.length - 1; j >= i; j--)
        {
            ai1[j] = ai[j] ^ ai1[j];
        }

    }

    private void assignRandomLowerTriangularMatrix(int i, SecureRandom securerandom)
    {
        numRows = i;
        numColumns = i;
        length = i + 31 >>> 5;
        i = numRows;
        int j = length;
        matrix = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i, j
        });
        for (i = 0; i < numRows; i++)
        {
            int i1 = i >>> 5;
            int j1 = i & 0x1f;
            for (int k = 0; k < i1; k++)
            {
                matrix[i][k] = securerandom.nextInt();
            }

            matrix[i][i1] = securerandom.nextInt() >>> 31 - j1 | 1 << j1;
            for (int l = i1 + 1; l < length; l++)
            {
                matrix[i][l] = 0;
            }

        }

    }

    private void assignRandomRegularMatrix(int i, SecureRandom securerandom)
    {
        numRows = i;
        numColumns = i;
        length = i + 31 >>> 5;
        int j = numRows;
        int l = length;
        matrix = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            j, l
        });
        GF2Matrix gf2matrix = (GF2Matrix)(new GF2Matrix(i, 'L', securerandom)).rightMultiply(new GF2Matrix(i, 'U', securerandom));
        securerandom = (new Permutation(i, securerandom)).getVector();
        for (int k = 0; k < i; k++)
        {
            System.arraycopy(gf2matrix.matrix[k], 0, matrix[securerandom[k]], 0, length);
        }

    }

    private void assignRandomUpperTriangularMatrix(int i, SecureRandom securerandom)
    {
        numRows = i;
        numColumns = i;
        length = i + 31 >>> 5;
        int j = numRows;
        int k = length;
        matrix = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            j, k
        });
        i &= 0x1f;
        if (i == 0)
        {
            i = -1;
        } else
        {
            i = (1 << i) - 1;
        }
        for (j = 0; j < numRows; j++)
        {
            int k1 = j >>> 5;
            int l1 = j & 0x1f;
            for (int l = 0; l < k1; l++)
            {
                matrix[j][l] = 0;
            }

            matrix[j][k1] = securerandom.nextInt() << l1 | 1 << l1;
            for (int i1 = k1 + 1; i1 < length; i1++)
            {
                matrix[j][i1] = securerandom.nextInt();
            }

            int ai[] = matrix[j];
            int j1 = length - 1;
            ai[j1] = ai[j1] & i;
        }

    }

    private void assignUnitMatrix(int i)
    {
        boolean flag = false;
        numRows = i;
        numColumns = i;
        length = i + 31 >>> 5;
        i = numRows;
        int j = length;
        matrix = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i, j
        });
        i = 0;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= numRows)
            {
                break;
            }
            for (j = 0; j < length; j++)
            {
                matrix[i][j] = 0;
            }

            i++;
        } while (true);
        for (; j < numRows; j++)
        {
            matrix[j][j >>> 5] = 1 << (j & 0x1f);
        }

    }

    private void assignZeroMatrix(int i, int j)
    {
        numRows = i;
        numColumns = j;
        length = j + 31 >>> 5;
        i = numRows;
        j = length;
        matrix = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i, j
        });
        for (i = 0; i < numRows; i++)
        {
            for (j = 0; j < length; j++)
            {
                matrix[i][j] = 0;
            }

        }

    }

    public static GF2Matrix[] createRandomRegularMatrixAndItsInverse(int i, SecureRandom securerandom)
    {
        int i2 = i + 31 >> 5;
        GF2Matrix gf2matrix1 = new GF2Matrix(i, 'L', securerandom);
        GF2Matrix gf2matrix = new GF2Matrix(i, 'U', securerandom);
        GF2Matrix gf2matrix2 = (GF2Matrix)gf2matrix1.rightMultiply(gf2matrix);
        securerandom = new Permutation(i, securerandom);
        int ai[] = securerandom.getVector();
        int ai1[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i, i2
        });
        for (int j = 0; j < i; j++)
        {
            System.arraycopy(gf2matrix2.matrix[ai[j]], 0, ai1[j], 0, i2);
        }

        gf2matrix2 = new GF2Matrix(i, ai1);
        GF2Matrix gf2matrix3 = new GF2Matrix(i, 'I');
        for (int k = 0; k < i; k++)
        {
            int j2 = k >>> 5;
            for (int i1 = k + 1; i1 < i; i1++)
            {
                if ((gf2matrix1.matrix[i1][j2] & 1 << (k & 0x1f)) == 0)
                {
                    continue;
                }
                for (int k1 = 0; k1 <= j2; k1++)
                {
                    int ai2[] = gf2matrix3.matrix[i1];
                    ai2[k1] = ai2[k1] ^ gf2matrix3.matrix[k][k1];
                }

            }

        }

        gf2matrix1 = new GF2Matrix(i, 'I');
        for (i--; i >= 0; i--)
        {
            int l1 = i >>> 5;
            for (int l = i - 1; l >= 0; l--)
            {
                if ((gf2matrix.matrix[l][l1] & 1 << (i & 0x1f)) == 0)
                {
                    continue;
                }
                for (int j1 = l1; j1 < i2; j1++)
                {
                    int ai3[] = gf2matrix1.matrix[l];
                    ai3[j1] = ai3[j1] ^ gf2matrix1.matrix[i][j1];
                }

            }

        }

        return (new GF2Matrix[] {
            gf2matrix2, (GF2Matrix)gf2matrix1.rightMultiply(gf2matrix3.rightMultiply(securerandom))
        });
    }

    private static void swapRows(int ai[][], int i, int j)
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
        int i1 = length;
        int ai[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i, i1
        });
        for (i = numRows - 1; i >= 0; i--)
        {
            ai[i] = IntUtils.clone(matrix[i]);
        }

        i = numRows;
        i1 = length;
        int ai1[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i, i1
        });
        for (int j = numRows - 1; j >= 0; j--)
        {
            ai1[j][j >> 5] = 1 << (j & 0x1f);
        }

        for (int j1 = 0; j1 < numRows; j1++)
        {
            int l1 = j1 >> 5;
            int i2 = 1 << (j1 & 0x1f);
            if ((ai[j1][l1] & i2) == 0)
            {
                int k = j1 + 1;
                boolean flag = false;
                int k1;
                for (; k < numRows; k = k1 + 1)
                {
                    k1 = k;
                    if ((ai[k][l1] & i2) != 0)
                    {
                        swapRows(ai, j1, k);
                        swapRows(ai1, j1, k);
                        k1 = numRows;
                        flag = true;
                    }
                }

                if (!flag)
                {
                    throw new ArithmeticException("Matrix is not invertible.");
                }
            }
            for (int l = numRows - 1; l >= 0; l--)
            {
                if (l != j1 && (ai[l][l1] & i2) != 0)
                {
                    addToRow(ai[j1], ai[l], l1);
                    addToRow(ai1[j1], ai1[l], 0);
                }
            }

        }

        return new GF2Matrix(numColumns, ai1);
    }

    public Matrix computeTranspose()
    {
        int i = numColumns;
        int k = numRows;
        int ai[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i, k + 31 >>> 5
        });
        for (int j = 0; j < numRows; j++)
        {
            for (int l = 0; l < numColumns; l++)
            {
                int i1 = matrix[j][l >>> 5];
                int j1 = j >>> 5;
                if ((i1 >>> (l & 0x1f) & 1) == 1)
                {
                    int ai1[] = ai[l];
                    ai1[j1] = 1 << (j & 0x1f) | ai1[j1];
                }
            }

        }

        return new GF2Matrix(numRows, ai);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof GF2Matrix) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (numRows == ((GF2Matrix) (obj = (GF2Matrix)obj)).numRows && numColumns == ((GF2Matrix) (obj)).numColumns && length == ((GF2Matrix) (obj)).length)
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= numRows)
                    {
                        break label1;
                    }
                    if (!IntUtils.equals(matrix[i], ((GF2Matrix) (obj)).matrix[i]))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public GF2Matrix extendLeftCompactForm()
    {
        int i = numColumns;
        int j = numRows;
        GF2Matrix gf2matrix = new GF2Matrix(numRows, i + j);
        i = numRows;
        i = numColumns + (i - 1);
        for (int k = numRows - 1; k >= 0;)
        {
            System.arraycopy(matrix[k], 0, gf2matrix.matrix[k], 0, length);
            int ai[] = gf2matrix.matrix[k];
            int l = i >> 5;
            ai[l] = ai[l] | 1 << (i & 0x1f);
            k--;
            i--;
        }

        return gf2matrix;
    }

    public GF2Matrix extendRightCompactForm()
    {
        GF2Matrix gf2matrix = new GF2Matrix(numRows, numRows + numColumns);
        int i1 = numRows >> 5;
        int l1 = numRows & 0x1f;
        int i = numRows - 1;
        while (i >= 0) 
        {
            int ai[] = gf2matrix.matrix[i];
            int j = i >> 5;
            ai[j] = ai[j] | 1 << (i & 0x1f);
            if (l1 != 0)
            {
                int l = 0;
                int k;
                int j1;
                for (k = i1; l < length - 1; k = j1)
                {
                    int i2 = matrix[i][l];
                    int ai1[] = gf2matrix.matrix[i];
                    j1 = k + 1;
                    ai1[k] = ai1[k] | i2 << l1;
                    ai1 = gf2matrix.matrix[i];
                    ai1[j1] = i2 >>> 32 - l1 | ai1[j1];
                    l++;
                }

                l = matrix[i][length - 1];
                int ai2[] = gf2matrix.matrix[i];
                int k1 = k + 1;
                ai2[k] = ai2[k] | l << l1;
                if (k1 < gf2matrix.length)
                {
                    int ai3[] = gf2matrix.matrix[i];
                    ai3[k1] = l >>> 32 - l1 | ai3[k1];
                }
            } else
            {
                System.arraycopy(matrix[i], 0, gf2matrix.matrix[i], i1, length);
            }
            i--;
        }
        return gf2matrix;
    }

    public byte[] getEncoded()
    {
        byte abyte0[] = new byte[(numColumns + 7 >>> 3) * numRows + 8];
        LittleEndianConversions.I2OSP(numRows, abyte0, 0);
        LittleEndianConversions.I2OSP(numColumns, abyte0, 4);
        int i1 = numColumns >>> 5;
        int j1 = numColumns;
        int i = 8;
        for (int j = 0; j < numRows; j++)
        {
            for (int k = 0; k < i1;)
            {
                LittleEndianConversions.I2OSP(matrix[j][k], abyte0, i);
                k++;
                i += 4;
            }

            for (int l = 0; l < (j1 & 0x1f);)
            {
                abyte0[i] = (byte)(matrix[j][i1] >>> l & 0xff);
                l += 8;
                i++;
            }

        }

        return abyte0;
    }

    public double getHammingWeight()
    {
        double d = 0.0D;
        double d1 = 0.0D;
        int k1 = numColumns & 0x1f;
        int i;
        int j;
        if (k1 == 0)
        {
            i = length;
        } else
        {
            i = length - 1;
        }
        for (j = 0; j < numRows; j++)
        {
            for (int k = 0; k < i; k++)
            {
                int l1 = matrix[j][k];
                for (int i1 = 0; i1 < 32; i1++)
                {
                    d += l1 >>> i1 & 1;
                    d1++;
                }

            }

            int j1 = matrix[j][length - 1];
            for (int l = 0; l < k1;)
            {
                double d2 = j1 >>> l & 1;
                l++;
                d1 = 1.0D + d1;
                d = d2 + d;
            }

        }

        return d / d1;
    }

    public int[][] getIntArray()
    {
        return matrix;
    }

    public GF2Matrix getLeftSubMatrix()
    {
        if (numColumns <= numRows)
        {
            throw new ArithmeticException("empty submatrix");
        }
        int l = numRows + 31 >> 5;
        int i = numRows;
        int ai[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i, l
        });
        int j = (1 << (numRows & 0x1f)) - 1;
        i = j;
        if (j == 0)
        {
            i = -1;
        }
        for (int k = numRows - 1; k >= 0; k--)
        {
            System.arraycopy(matrix[k], 0, ai[k], 0, l);
            int ai1[] = ai[k];
            int i1 = l - 1;
            ai1[i1] = ai1[i1] & i;
        }

        return new GF2Matrix(numRows, ai);
    }

    public int getLength()
    {
        return length;
    }

    public GF2Matrix getRightSubMatrix()
    {
        if (numColumns <= numRows)
        {
            throw new ArithmeticException("empty submatrix");
        }
        int i1 = numRows >> 5;
        int l1 = numRows & 0x1f;
        GF2Matrix gf2matrix = new GF2Matrix(numRows, numColumns - numRows);
        int i = numRows - 1;
        while (i >= 0) 
        {
            if (l1 != 0)
            {
                int l = 0;
                int j;
                int j1;
                for (j = i1; l < gf2matrix.length - 1; j = j1)
                {
                    int ai[] = gf2matrix.matrix[i];
                    int ai3[] = matrix[i];
                    j1 = j + 1;
                    ai[l] = ai3[j] >>> l1 | matrix[i][j1] << 32 - l1;
                    l++;
                }

                int ai1[] = gf2matrix.matrix[i];
                int k1 = gf2matrix.length;
                int ai4[] = matrix[i];
                l = j + 1;
                ai1[k1 - 1] = ai4[j] >>> l1;
                if (l < length)
                {
                    int ai2[] = gf2matrix.matrix[i];
                    int k = gf2matrix.length - 1;
                    ai2[k] = ai2[k] | matrix[i][l] << 32 - l1;
                }
            } else
            {
                System.arraycopy(matrix[i], i1, gf2matrix.matrix[i], 0, gf2matrix.length);
            }
            i--;
        }
        return gf2matrix;
    }

    public int[] getRow(int i)
    {
        return matrix[i];
    }

    public int hashCode()
    {
        int i = numRows;
        int k = numColumns;
        k = length + (i * 31 + k) * 31;
        for (int j = 0; j < numRows; j++)
        {
            k = k * 31 + matrix[j].hashCode();
        }

        return k;
    }

    public boolean isZero()
    {
        for (int i = 0; i < numRows; i++)
        {
            for (int j = 0; j < length; j++)
            {
                if (matrix[i][j] != 0)
                {
                    return false;
                }
            }

        }

        return true;
    }

    public Matrix leftMultiply(Permutation permutation)
    {
        permutation = permutation.getVector();
        if (permutation.length != numRows)
        {
            throw new ArithmeticException("length mismatch");
        }
        int ai[][] = new int[numRows][];
        for (int i = numRows - 1; i >= 0; i--)
        {
            ai[i] = IntUtils.clone(matrix[permutation[i]]);
        }

        return new GF2Matrix(numRows, ai);
    }

    public Vector leftMultiply(Vector vector)
    {
        boolean flag = true;
        if (!(vector instanceof GF2Vector))
        {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != numRows)
        {
            throw new ArithmeticException("length mismatch");
        }
        vector = ((GF2Vector)vector).getVecArray();
        int ai[] = new int[length];
        int i2 = numRows >> 5;
        int j2 = numRows;
        int j = 0;
        int i;
        int k1;
        for (i = 0; j < i2; i = k1)
        {
            int l = 1;
            int l1;
            do
            {
                if ((vector[j] & l) != 0)
                {
                    for (int j1 = 0; j1 < length; j1++)
                    {
                        ai[j1] = ai[j1] ^ matrix[i][j1];
                    }

                }
                k1 = i + 1;
                l1 = l << 1;
                l = l1;
                i = k1;
            } while (l1 != 0);
            j++;
        }

        for (int k = ((flag) ? 1 : 0); k != 1 << (j2 & 0x1f);)
        {
            if ((vector[i2] & k) != 0)
            {
                for (int i1 = 0; i1 < length; i1++)
                {
                    ai[i1] = ai[i1] ^ matrix[i][i1];
                }

            }
            k <<= 1;
            i++;
        }

        return new GF2Vector(ai, numColumns);
    }

    public Vector leftMultiplyLeftCompactForm(Vector vector)
    {
        if (!(vector instanceof GF2Vector))
        {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != numRows)
        {
            throw new ArithmeticException("length mismatch");
        }
        vector = ((GF2Vector)vector).getVecArray();
        int ai[] = new int[numRows + numColumns + 31 >>> 5];
        int l2 = numRows >>> 5;
        int k = 0;
        int i;
        int i2;
        for (i = 0; k < l2; i = i2)
        {
            int l = 1;
            int k2;
            do
            {
                if ((vector[k] & l) != 0)
                {
                    for (int k1 = 0; k1 < length; k1++)
                    {
                        ai[k1] = ai[k1] ^ matrix[i][k1];
                    }

                    int l1 = numColumns + i >>> 5;
                    ai[l1] = 1 << (numColumns + i & 0x1f) | ai[l1];
                }
                i2 = i + 1;
                k2 = l << 1;
                l = k2;
                i = i2;
            } while (k2 != 0);
            k++;
        }

        int j2 = numRows;
        boolean flag = true;
        k = i;
        for (int j = ((flag) ? 1 : 0); j != 1 << (j2 & 0x1f); j <<= 1)
        {
            if ((vector[l2] & j) != 0)
            {
                for (int i1 = 0; i1 < length; i1++)
                {
                    ai[i1] = ai[i1] ^ matrix[k][i1];
                }

                int j1 = numColumns + k >>> 5;
                ai[j1] = 1 << (numColumns + k & 0x1f) | ai[j1];
            }
            k++;
        }

        return new GF2Vector(ai, numRows + numColumns);
    }

    public Matrix rightMultiply(Matrix matrix1)
    {
        if (!(matrix1 instanceof GF2Matrix))
        {
            throw new ArithmeticException("matrix is not defined over GF(2)");
        }
        if (matrix1.numRows != numColumns)
        {
            throw new ArithmeticException("length mismatch");
        }
        GF2Matrix gf2matrix = (GF2Matrix)matrix1;
        matrix1 = new GF2Matrix(numRows, matrix1.numColumns);
        int k2 = numColumns & 0x1f;
        int k;
        int l;
        if (k2 == 0)
        {
            k = length;
        } else
        {
            k = length - 1;
        }
        for (l = 0; l < numRows; l++)
        {
            int i = 0;
            for (int i1 = 0; i1 < k; i1++)
            {
                int l2 = matrix[l][i1];
                for (int k1 = 0; k1 < 32; k1++)
                {
                    if ((1 << k1 & l2) != 0)
                    {
                        for (int i2 = 0; i2 < gf2matrix.length; i2++)
                        {
                            int ai[] = ((GF2Matrix) (matrix1)).matrix[l];
                            ai[i2] = ai[i2] ^ gf2matrix.matrix[i][i2];
                        }

                    }
                    i++;
                }

            }

            int j2 = matrix[l][length - 1];
            boolean flag = false;
            int j1 = i;
            for (int j = ((flag) ? 1 : 0); j < k2; j++)
            {
                if ((1 << j & j2) != 0)
                {
                    for (int l1 = 0; l1 < gf2matrix.length; l1++)
                    {
                        int ai1[] = ((GF2Matrix) (matrix1)).matrix[l];
                        ai1[l1] = ai1[l1] ^ gf2matrix.matrix[j1][l1];
                    }

                }
                j1++;
            }

        }

        return matrix1;
    }

    public Matrix rightMultiply(Permutation permutation)
    {
        permutation = permutation.getVector();
        if (permutation.length != numColumns)
        {
            throw new ArithmeticException("length mismatch");
        }
        GF2Matrix gf2matrix = new GF2Matrix(numRows, numColumns);
        for (int i = numColumns - 1; i >= 0; i--)
        {
            int k = i >>> 5;
            int l = permutation[i];
            int i1 = permutation[i];
            for (int j = numRows - 1; j >= 0; j--)
            {
                int ai[] = gf2matrix.matrix[j];
                ai[k] = ai[k] | (matrix[j][l >>> 5] >>> (i1 & 0x1f) & 1) << (i & 0x1f);
            }

        }

        return gf2matrix;
    }

    public Vector rightMultiply(Vector vector)
    {
        if (!(vector instanceof GF2Vector))
        {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != numColumns)
        {
            throw new ArithmeticException("length mismatch");
        }
        vector = ((GF2Vector)vector).getVecArray();
        int ai[] = new int[numRows + 31 >>> 5];
        for (int i = 0; i < numRows; i++)
        {
            int l = 0;
            int j = 0;
            for (; l < length; l++)
            {
                j ^= matrix[i][l] & vector[l];
            }

            l = 0;
            int i1 = 0;
            for (; l < 32; l++)
            {
                i1 ^= j >>> l & 1;
            }

            if (i1 == 1)
            {
                int k = i >>> 5;
                ai[k] = ai[k] | 1 << (i & 0x1f);
            }
        }

        return new GF2Vector(ai, numRows);
    }

    public Vector rightMultiplyRightCompactForm(Vector vector)
    {
        int ai[];
        int i1;
        int j1;
        int l2;
        if (!(vector instanceof GF2Vector))
        {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != numColumns + numRows)
        {
            throw new ArithmeticException("length mismatch");
        }
        vector = ((GF2Vector)vector).getVecArray();
        ai = new int[numRows + 31 >>> 5];
        i1 = numRows >> 5;
        l2 = numRows & 0x1f;
        j1 = 0;
_L7:
        if (j1 >= numRows) goto _L2; else goto _L1
_L1:
        int i = vector[j1 >> 5] >>> (j1 & 0x1f) & 1;
        if (l2 == 0) goto _L4; else goto _L3
_L3:
        int l;
        int k1 = i1;
        for (int k = 0; k < length - 1;)
        {
            int i2 = k1 + 1;
            k1 = vector[k1];
            int i3 = vector[i2];
            int k3 = matrix[j1][k];
            k++;
            i = (k1 >>> l2 | i3 << 32 - l2) & k3 ^ i;
            k1 = i2;
        }

        int j2 = k1 + 1;
        k1 = vector[k1] >>> l2;
        l = k1;
        if (j2 < vector.length)
        {
            l = k1 | vector[j2] << 32 - l2;
        }
        l = i ^ l & matrix[j1][length - 1];
_L6:
        int l1;
        i = 0;
        l1 = 0;
        for (; i < 32; i++)
        {
            l1 ^= l & 1;
            l >>>= 1;
        }

        break MISSING_BLOCK_LABEL_348;
_L4:
        l1 = i1;
        int k2 = 0;
        do
        {
            l = i;
            if (k2 >= length)
            {
                break;
            }
            l = matrix[j1][k2];
            int j3 = vector[l1];
            k2++;
            i = j3 & l ^ i;
            l1++;
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
        if (l1 == 1)
        {
            int j = j1 >> 5;
            ai[j] = ai[j] | 1 << (j1 & 0x1f);
        }
        j1++;
          goto _L7
_L2:
        return new GF2Vector(ai, numRows);
    }

    public String toString()
    {
        int k1 = numColumns & 0x1f;
        StringBuffer stringbuffer;
        int i;
        if (k1 == 0)
        {
            i = length;
        } else
        {
            i = length - 1;
        }
        stringbuffer = new StringBuffer();
        for (int j = 0; j < numRows; j++)
        {
            stringbuffer.append((new StringBuilder()).append(j).append(": ").toString());
            for (int k = 0; k < i; k++)
            {
                int l1 = matrix[j][k];
                int i1 = 0;
                while (i1 < 32) 
                {
                    if ((l1 >>> i1 & 1) == 0)
                    {
                        stringbuffer.append('0');
                    } else
                    {
                        stringbuffer.append('1');
                    }
                    i1++;
                }
                stringbuffer.append(' ');
            }

            int j1 = matrix[j][length - 1];
            int l = 0;
            while (l < k1) 
            {
                if ((j1 >>> l & 1) == 0)
                {
                    stringbuffer.append('0');
                } else
                {
                    stringbuffer.append('1');
                }
                l++;
            }
            stringbuffer.append('\n');
        }

        return stringbuffer.toString();
    }
}
