// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.rainbow;


// Referenced classes of package org.bouncycastle.pqc.crypto.rainbow:
//            RainbowKeyParameters

public class RainbowPublicKeyParameters extends RainbowKeyParameters
{

    private short coeffquadratic[][];
    private short coeffscalar[];
    private short coeffsingular[][];

    public RainbowPublicKeyParameters(int i, short aword0[][], short aword1[][], short aword2[])
    {
        super(false, i);
        coeffquadratic = aword0;
        coeffsingular = aword1;
        coeffscalar = aword2;
    }

    public short[][] getCoeffQuadratic()
    {
        return coeffquadratic;
    }

    public short[] getCoeffScalar()
    {
        return coeffscalar;
    }

    public short[][] getCoeffSingular()
    {
        return coeffsingular;
    }
}
