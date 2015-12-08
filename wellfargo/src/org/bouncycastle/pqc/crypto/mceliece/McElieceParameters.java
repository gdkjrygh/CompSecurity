// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2;

public class McElieceParameters
    implements CipherParameters
{

    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int fieldPoly;
    private int m;
    private int n;
    private int t;

    public McElieceParameters()
    {
        this(11, 50);
    }

    public McElieceParameters(int i)
    {
        if (i < 1)
        {
            throw new IllegalArgumentException("key size must be positive");
        }
        m = 0;
        for (n = 1; n < i;)
        {
            n = n << 1;
            m = m + 1;
        }

        t = n >>> 1;
        t = t / m;
        fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(m);
    }

    public McElieceParameters(int i, int j)
    {
        if (i < 1)
        {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i > 32)
        {
            throw new IllegalArgumentException("m is too large");
        }
        m = i;
        n = 1 << i;
        if (j < 0)
        {
            throw new IllegalArgumentException("t must be positive");
        }
        if (j > n)
        {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        } else
        {
            t = j;
            fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i);
            return;
        }
    }

    public McElieceParameters(int i, int j, int k)
    {
        m = i;
        if (i < 1)
        {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i > 32)
        {
            throw new IllegalArgumentException(" m is too large");
        }
        n = 1 << i;
        t = j;
        if (j < 0)
        {
            throw new IllegalArgumentException("t must be positive");
        }
        if (j > n)
        {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        if (PolynomialRingGF2.degree(k) == i && PolynomialRingGF2.isIrreducible(k))
        {
            fieldPoly = k;
            return;
        } else
        {
            throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
        }
    }

    public int getFieldPoly()
    {
        return fieldPoly;
    }

    public int getM()
    {
        return m;
    }

    public int getN()
    {
        return n;
    }

    public int getT()
    {
        return t;
    }
}
