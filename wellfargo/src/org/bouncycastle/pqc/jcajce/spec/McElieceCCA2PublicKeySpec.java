// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

public class McElieceCCA2PublicKeySpec
    implements KeySpec
{

    private GF2Matrix matrixG;
    private int n;
    private String oid;
    private int t;

    public McElieceCCA2PublicKeySpec(String s, int i, int j, GF2Matrix gf2matrix)
    {
        oid = s;
        n = i;
        t = j;
        matrixG = new GF2Matrix(gf2matrix);
    }

    public McElieceCCA2PublicKeySpec(String s, int i, int j, byte abyte0[])
    {
        oid = s;
        n = i;
        t = j;
        matrixG = new GF2Matrix(abyte0);
    }

    public GF2Matrix getMatrixG()
    {
        return matrixG;
    }

    public int getN()
    {
        return n;
    }

    public String getOIDString()
    {
        return oid;
    }

    public int getT()
    {
        return t;
    }
}
