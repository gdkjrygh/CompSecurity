// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;

public class ElGamalGenParameterSpec
    implements AlgorithmParameterSpec
{

    private int primeSize;

    public ElGamalGenParameterSpec(int i)
    {
        primeSize = i;
    }

    public int getPrimeSize()
    {
        return primeSize;
    }
}
