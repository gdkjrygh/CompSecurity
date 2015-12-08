// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

public class McElieceCCA2PrivateKeySpec
    implements KeySpec
{

    private GF2mField field;
    private PolynomialGF2mSmallM goppaPoly;
    private GF2Matrix h;
    private int k;
    private int n;
    private String oid;
    private Permutation p;
    private PolynomialGF2mSmallM qInv[];

    public McElieceCCA2PrivateKeySpec(String s, int i, int j, GF2mField gf2mfield, PolynomialGF2mSmallM polynomialgf2msmallm, Permutation permutation, GF2Matrix gf2matrix, 
            PolynomialGF2mSmallM apolynomialgf2msmallm[])
    {
        oid = s;
        n = i;
        k = j;
        field = gf2mfield;
        goppaPoly = polynomialgf2msmallm;
        p = permutation;
        h = gf2matrix;
        qInv = apolynomialgf2msmallm;
    }

    public McElieceCCA2PrivateKeySpec(String s, int i, int j, byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[], 
            byte abyte4[][])
    {
        oid = s;
        n = i;
        k = j;
        field = new GF2mField(abyte0);
        goppaPoly = new PolynomialGF2mSmallM(field, abyte1);
        p = new Permutation(abyte2);
        h = new GF2Matrix(abyte3);
        qInv = new PolynomialGF2mSmallM[abyte4.length];
        for (i = 0; i < abyte4.length; i++)
        {
            qInv[i] = new PolynomialGF2mSmallM(field, abyte4[i]);
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

    public Permutation getP()
    {
        return p;
    }

    public PolynomialGF2mSmallM[] getQInv()
    {
        return qInv;
    }
}
