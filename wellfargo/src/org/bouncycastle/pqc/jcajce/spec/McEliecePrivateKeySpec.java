// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

public class McEliecePrivateKeySpec
    implements KeySpec
{

    private GF2mField field;
    private PolynomialGF2mSmallM goppaPoly;
    private GF2Matrix h;
    private int k;
    private int n;
    private String oid;
    private Permutation p1;
    private Permutation p2;
    private PolynomialGF2mSmallM qInv[];
    private GF2Matrix sInv;

    public McEliecePrivateKeySpec(String s, int i, int j, GF2mField gf2mfield, PolynomialGF2mSmallM polynomialgf2msmallm, GF2Matrix gf2matrix, Permutation permutation, 
            Permutation permutation1, GF2Matrix gf2matrix1, PolynomialGF2mSmallM apolynomialgf2msmallm[])
    {
        oid = s;
        k = j;
        n = i;
        field = gf2mfield;
        goppaPoly = polynomialgf2msmallm;
        sInv = gf2matrix;
        p1 = permutation;
        p2 = permutation1;
        h = gf2matrix1;
        qInv = apolynomialgf2msmallm;
    }

    public McEliecePrivateKeySpec(String s, int i, int j, byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[], 
            byte abyte4[], byte abyte5[], byte abyte6[][])
    {
        oid = s;
        n = i;
        k = j;
        field = new GF2mField(abyte0);
        goppaPoly = new PolynomialGF2mSmallM(field, abyte1);
        sInv = new GF2Matrix(abyte2);
        p1 = new Permutation(abyte3);
        p2 = new Permutation(abyte4);
        h = new GF2Matrix(abyte5);
        qInv = new PolynomialGF2mSmallM[abyte6.length];
        for (i = 0; i < abyte6.length; i++)
        {
            qInv[i] = new PolynomialGF2mSmallM(field, abyte6[i]);
        }

    }

    public GF2mField getField()
    {
        return field;
    }

    public PolynomialGF2mSmallM getGoppaPoly()
    {
        return goppaPoly;
    }

    public GF2Matrix getH()
    {
        return h;
    }

    public int getK()
    {
        return k;
    }

    public int getN()
    {
        return n;
    }

    public String getOIDString()
    {
        return oid;
    }

    public Permutation getP1()
    {
        return p1;
    }

    public Permutation getP2()
    {
        return p2;
    }

    public PolynomialGF2mSmallM[] getQInv()
    {
        return qInv;
    }

    public GF2Matrix getSInv()
    {
        return sInv;
    }
}
