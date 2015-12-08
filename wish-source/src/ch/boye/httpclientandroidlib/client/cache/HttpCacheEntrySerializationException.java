// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.cache;

import java.io.IOException;

public class HttpCacheEntrySerializationException extends IOException
{

    private static final long serialVersionUID = 0x7ff122f9319916efL;

    public HttpCacheEntrySerializationException(String s)
    {
    }

    public HttpCacheEntrySerializationException(String s, Throwable throwable)
    {
        super(s);
        initCause(throwable);
    }
}
