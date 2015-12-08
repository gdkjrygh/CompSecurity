// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

// Referenced classes of package org.bouncycastle.pqc.crypto.mceliece:
//            McElieceKeyParameters, McElieceParameters

public class McEliecePublicKeyParameters extends McElieceKeyParameters
{

    private GF2Matrix g;
    private int n;
    private String oid;
    private int t;

    public McEliecePublicKeyParameters(String s, int i, int j, GF2Matrix gf2matrix, McElieceParameters mcelieceparameters)
    {
        super(false, mcelieceparameters);
        oid = s;
        n = i;
        t = j;
        g = new GF2Matrix(gf2matrix);
    }

    public McEliecePublicKeyParameters(String s, int i, int j, byte abyte0[], McElieceParameters mcelieceparameters)
    {
        super(false, mcelieceparameters);
        oid = s;
        n = j;
        t = i;
        g = new GF2Matrix(abyte0);
    }

    public GF2Matrix getG()
    {
        return g;
    }

    public int getK()
    {
        return g.getNumRows();
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
