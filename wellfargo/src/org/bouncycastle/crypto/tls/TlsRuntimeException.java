// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;


public class TlsRuntimeException extends RuntimeException
{

    private static final long serialVersionUID = 0x1ac1b7258a020516L;
    Throwable e;

    public TlsRuntimeException(String s)
    {
        super(s);
    }

    public TlsRuntimeException(String s, Throwable throwable)
    {
        super(s);
        e = throwable;
    }

    public Throwable getCause()
    {
        return e;
    }
}
