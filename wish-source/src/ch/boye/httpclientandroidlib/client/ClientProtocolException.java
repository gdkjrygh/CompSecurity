// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client;

import java.io.IOException;

public class ClientProtocolException extends IOException
{

    private static final long serialVersionUID = 0xb254ea47b43e6ea7L;

    public ClientProtocolException()
    {
    }

    public ClientProtocolException(String s)
    {
        super(s);
    }

    public ClientProtocolException(String s, Throwable throwable)
    {
        super(s);
        initCause(throwable);
    }

    public ClientProtocolException(Throwable throwable)
    {
        initCause(throwable);
    }
}
