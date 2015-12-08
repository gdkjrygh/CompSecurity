// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;


// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            Permutation

public abstract class Vector
{

    protected int length;

    public Vector()
    {
    }

    public abstract Vector add(Vector vector);

    public abstract boolean equals(Object obj);

    public abstract byte[] getEncoded();

    public final int getLength()
    {
        return length;
    }

    public abstract int hashCode();

    public abstract boolean isZero();

    public abstract Vector multiply(Permutation permutation);

    public abstract String toString();
}
