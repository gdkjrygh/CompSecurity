// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


public class CryptoException extends Exception
{

    private Throwable cause;

    public CryptoException()
    {
    }

    public CryptoException(String s)
    {
        super(s);
    }

    public CryptoException(String s, Throwable throwable)
    {
        super(s);
        cause = throwable;
    }

    public Throwable getCause()
    {
        return cause;
    }
}
