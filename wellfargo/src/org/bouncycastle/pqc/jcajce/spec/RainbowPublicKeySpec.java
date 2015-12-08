// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;

public class RainbowPublicKeySpec
    implements KeySpec
{

    private short coeffquadratic[][];
    private short coeffscalar[];
    private short coeffsingular[][];
    private int docLength;

    public RainbowPublicKeySpec(int i, short aword0[][], short aword1[][], short aword2[])
    {
        docLength = i;
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

    public int getDocLength()
    {
        return docLength;
    }
}
