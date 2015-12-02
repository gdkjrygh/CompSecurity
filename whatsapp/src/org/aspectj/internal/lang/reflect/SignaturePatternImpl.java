// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.SignaturePattern;

public class SignaturePatternImpl
    implements SignaturePattern
{

    private String sigPattern;

    public SignaturePatternImpl(String s)
    {
        sigPattern = s;
    }

    public String asString()
    {
        return sigPattern;
    }

    public String toString()
    {
        return asString();
    }
}
