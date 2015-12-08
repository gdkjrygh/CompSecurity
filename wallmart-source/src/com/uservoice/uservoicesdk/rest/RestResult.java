// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.rest;

import org.json.JSONObject;

public class RestResult
{

    private Exception exception;
    private JSONObject object;
    private int statusCode;

    public RestResult(int i, JSONObject jsonobject)
    {
        statusCode = i;
        object = jsonobject;
    }

    public RestResult(Exception exception1)
    {
        exception = exception1;
    }

    public RestResult(Exception exception1, int i, JSONObject jsonobject)
    {
        exception = exception1;
        statusCode = i;
        object = jsonobject;
    }

    public Exception getException()
    {
        return exception;
    }

    public String getMessage()
    {
        String s;
        if (exception == null)
        {
            s = String.valueOf(statusCode);
        } else
        {
            s = exception.getMessage();
        }
        return String.format("%s -- %s", new Object[] {
            s, object
        });
    }

    public JSONObject getObject()
    {
        return object;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public boolean isError()
    {
        return exception != null || statusCode > 400;
    }
}
