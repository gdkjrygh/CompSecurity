// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.spec;

import java.security.InvalidParameterException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2;

public class ECCKeyGenParameterSpec
    implements AlgorithmParameterSpec
{

    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int fieldPoly;
    private int m;
    private int n;
    private int t;

    public ECCKeyGenParameterSpec()
    {
        this(11, 50);
    }

    public ECCKeyGenParameterSpec(int i)
    {
        if (i < 1)
        {
            throw new InvalidParameterException("key size must be positive");
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

    public ECCKeyGenParameterSpec(int i, int j)
    {
        if (i < 1)
        {
            throw new InvalidParameterException("m must be positive");
        }
        if (i > 32)
        {
            throw new InvalidParameterException("m is too large");
        }
        m = i;
        n = 1 << i;
        if (j < 0)
        {
            throw new InvalidParameterException("t must be positive");
        }
        if (j > n)
        {
            throw new InvalidParameterException("t must be less than n = 2^m");
        } else
        {
            t = j;
            fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i);
            return;
        }
    }

    public ECCKeyGenParameterSpec(int i, int j, int k)
    {
        m = i;
        if (i < 1)
        {
            throw new InvalidParameterException("m must be positive");
        }
        if (i > 32)
        {
            throw new InvalidParameterException(" m is too large");
        }
        n = 1 << i;
        t = j;
        if (j < 0)
        {
            throw new InvalidParameterException("t must be positive");
        }
        if (j > n)
        {
            throw new InvalidParameterException("t must be less than n = 2^m");
        }
        if (PolynomialRingGF2.degree(k) == i && PolynomialRingGF2.isIrreducible(k))
        {
            fieldPoly = k;
            return;
        } else
        {
            throw new InvalidParameterException("polynomial is not a field polynomial for GF(2^m)");
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
