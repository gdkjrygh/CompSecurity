// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.auth;

import ch.boye.httpclientandroidlib.ProtocolException;

public class MalformedChallengeException extends ProtocolException
{

    private static final long serialVersionUID = 0xb4dfe7ec18440fcL;

    public MalformedChallengeException()
    {
    }

    public MalformedChallengeException(String s)
    {
        super(s);
    }

    public MalformedChallengeException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
