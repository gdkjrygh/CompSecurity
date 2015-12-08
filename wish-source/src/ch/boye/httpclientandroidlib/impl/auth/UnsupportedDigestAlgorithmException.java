// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.auth;


public class UnsupportedDigestAlgorithmException extends RuntimeException
{

    private static final long serialVersionUID = 0x46f4ccb3aea9246L;

    public UnsupportedDigestAlgorithmException()
    {
    }

    public UnsupportedDigestAlgorithmException(String s)
    {
        super(s);
    }

    public UnsupportedDigestAlgorithmException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
