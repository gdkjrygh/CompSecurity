// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

// Referenced classes of package org.bouncycastle.pqc.crypto.mceliece:
//            McElieceCCA2KeyParameters, McElieceCCA2Parameters

public class McElieceCCA2PublicKeyParameters extends McElieceCCA2KeyParameters
{

    private GF2Matrix matrixG;
    private int n;
    private String oid;
    private int t;

    public McElieceCCA2PublicKeyParameters(String s, int i, int j, GF2Matrix gf2matrix, McElieceCCA2Parameters mceliececca2parameters)
    {
        super(false, mceliececca2parameters);
        oid = s;
        n = i;
        t = j;
        matrixG = new GF2Matrix(gf2matrix);
    }

    public McElieceCCA2PublicKeyParameters(String s, int i, int j, byte abyte0[], McElieceCCA2Parameters mceliececca2parameters)
    {
        super(false, mceliececca2parameters);
        oid = s;
        n = i;
        t = j;
        matrixG = new GF2Matrix(abyte0);
    }

    public int getK()
    {
        return matrixG.getNumRows();
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
