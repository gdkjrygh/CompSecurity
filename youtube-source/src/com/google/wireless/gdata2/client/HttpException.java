// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.gdata2.client;

import com.google.wireless.gdata2.GDataException;
import java.io.InputStream;

public class HttpException extends GDataException
{

    public static final int SC_BAD_REQUEST = 400;
    public static final int SC_CONFLICT = 409;
    public static final int SC_FORBIDDEN = 403;
    public static final int SC_GONE = 410;
    public static final int SC_INTERNAL_SERVER_ERROR = 500;
    public static final int SC_NOT_FOUND = 404;
    public static final int SC_NOT_MODIFIED = 304;
    public static final int SC_PRECONDITION_FAILED = 412;
    public static final int SC_RESOURCE_UNAVAILABLE = 503;
    public static final int SC_UNAUTHORIZED = 401;
    private final InputStream responseStream;
    private long retryAfter;
    private final int statusCode;

    public HttpException(String s, int i, InputStream inputstream)
    {
        super(s);
        retryAfter = 0L;
        statusCode = i;
        responseStream = inputstream;
    }

    public InputStream getResponseStream()
    {
        return responseStream;
    }

    public long getRetryAfter()
    {
        return retryAfter;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public void setRetryAfter(long l)
    {
        retryAfter = l;
    }
}
