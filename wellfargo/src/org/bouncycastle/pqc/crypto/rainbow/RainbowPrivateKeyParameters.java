// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.rainbow;


// Referenced classes of package org.bouncycastle.pqc.crypto.rainbow:
//            RainbowKeyParameters, Layer

public class RainbowPrivateKeyParameters extends RainbowKeyParameters
{

    private short A1inv[][];
    private short A2inv[][];
    private short b1[];
    private short b2[];
    private Layer layers[];
    private int vi[];

    public RainbowPrivateKeyParameters(short aword0[][], short aword1[], short aword2[][], short aword3[], int ai[], Layer alayer[])
    {
        super(true, ai[ai.length - 1] - ai[0]);
        A1inv = aword0;
        b1 = aword1;
        A2inv = aword2;
        b2 = aword3;
        vi = ai;
        layers = alayer;
    }

    public short[] getB1()
    {
        return b1;
    }

    public short[] getB2()
    {
        return b2;
    }

    public short[][] getInvA1()
    {
        return A1inv;
    }

    public short[][] getInvA2()
    {
        return A2inv;
    }

    public Layer[] getLayers()
    {
        return layers;
    }

    public int[] getVi()
    {
        return vi;
    }
}
