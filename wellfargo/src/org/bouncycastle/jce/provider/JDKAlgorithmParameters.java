// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;

public abstract class JDKAlgorithmParameters extends AlgorithmParametersSpi
{

    public JDKAlgorithmParameters()
    {
    }

    protected AlgorithmParameterSpec engineGetParameterSpec(Class class1)
    {
        if (class1 == null)
        {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        } else
        {
            return localEngineGetParameterSpec(class1);
        }
    }

    protected boolean isASN1FormatString(String s)
    {
        return s == null || s.equals("ASN.1");
    }

    protected abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class class1);
}
