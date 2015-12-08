// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;


// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            GF2Matrix, Permutation

public class p
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

    public (GF2Matrix gf2matrix, GF2Matrix gf2matrix1, Permutation permutation)
    {
        s = gf2matrix;
        h = gf2matrix1;
        p = permutation;
    }
}
