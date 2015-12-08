// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;


// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            GF2Matrix

public class setJ
{

    private GF2Matrix g;
    private int setJ[];

    public GF2Matrix getG()
    {
        return g;
    }

    public int[] getSetJ()
    {
        return setJ;
    }

    public A(GF2Matrix gf2matrix, int ai[])
    {
        g = gf2matrix;
        setJ = ai;
    }
}
