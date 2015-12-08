// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.gdata2.client;

import com.google.wireless.gdata2.GDataException;

public class ResourceUnavailableException extends GDataException
{

    private long retryAfter;

    public ResourceUnavailableException(long l)
    {
        retryAfter = l;
    }

    public ResourceUnavailableException(String s, long l)
    {
        super(s);
        retryAfter = l;
    }

    public ResourceUnavailableException(String s, Throwable throwable, long l)
    {
        super(s, throwable);
        retryAfter = l;
    }

    public long getRetryAfter()
    {
        return retryAfter;
    }
}
