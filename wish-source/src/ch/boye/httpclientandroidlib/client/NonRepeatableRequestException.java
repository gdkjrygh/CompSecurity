// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client;

import ch.boye.httpclientandroidlib.ProtocolException;

public class NonRepeatableRequestException extends ProtocolException
{

    private static final long serialVersionUID = 0x125c1cf89b2bea0L;

    public NonRepeatableRequestException()
    {
    }

    public NonRepeatableRequestException(String s)
    {
        super(s);
    }

    public NonRepeatableRequestException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
