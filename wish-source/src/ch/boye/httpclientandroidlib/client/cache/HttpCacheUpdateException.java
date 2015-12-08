// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.cache;


public class HttpCacheUpdateException extends Exception
{

    private static final long serialVersionUID = 0xb6debcfdc7d692cL;

    public HttpCacheUpdateException(String s)
    {
        super(s);
    }

    public HttpCacheUpdateException(String s, Throwable throwable)
    {
        super(s);
        initCause(throwable);
    }
}
