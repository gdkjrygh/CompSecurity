// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;


// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            Vector, Permutation

public abstract class Matrix
{

    public static final char MATRIX_TYPE_RANDOM_LT = 76;
    public static final char MATRIX_TYPE_RANDOM_REGULAR = 82;
    public static final char MATRIX_TYPE_RANDOM_UT = 85;
    public static final char MATRIX_TYPE_UNIT = 73;
    public static final char MATRIX_TYPE_ZERO = 90;
    protected int numColumns;
    protected int numRows;

    public Matrix()
    {
    }

    public abstract Matrix computeInverse();

    public abstract byte[] getEncoded();

    public int getNumColumns()
    {
        return numColumns;
    }

    public int getNumRows()
    {
        return numRows;
    }

    public abstract boolean isZero();

    public abstract Vector leftMultiply(Vector vector);

    public abstract Matrix rightMultiply(Matrix matrix);

    public abstract Matrix rightMultiply(Permutation permutation);

    public abstract Vector rightMultiply(Vector vector);

    public abstract String toString();
}
