// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.gdata.client;

import java.io.InputStream;

public class HttpException extends Exception
{

    public static final int SC_BAD_REQUEST = 400;
    public static final int SC_CONFLICT = 409;
    public static final int SC_FORBIDDEN = 403;
    public static final int SC_GONE = 410;
    public static final int SC_INTERNAL_SERVER_ERROR = 500;
    public static final int SC_NOT_FOUND = 404;
    public static final int SC_UNAUTHORIZED = 401;
    private final InputStream responseStream;
    private final int statusCode;

    public HttpException(String s, int i, InputStream inputstream)
    {
        super(s);
        statusCode = i;
        responseStream = inputstream;
    }

    public InputStream getResponseStream()
    {
        return responseStream;
    }

    public int getStatusCode()
    {
        return statusCode;
    }
}
