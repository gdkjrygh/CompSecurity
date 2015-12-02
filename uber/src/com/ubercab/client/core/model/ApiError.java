// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class ApiError
{

    public static final String STATUS_CODE_INTERNAL_SERVER_ERROR = "555";
    public static final String STATUS_CODE_NOT_ACCEPTABLE = "406";
    String message;
    String statusCode;

    public ApiError()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ApiError)obj;
            if (message == null ? ((ApiError) (obj)).message != null : !message.equals(((ApiError) (obj)).message))
            {
                return false;
            }
            if (statusCode == null ? ((ApiError) (obj)).statusCode != null : !statusCode.equals(((ApiError) (obj)).statusCode))
            {
                return false;
            }
        }
        return true;
    }

    public String getMessage()
    {
        return message;
    }

    public String getStatusCode()
    {
        return statusCode;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (message != null)
        {
            i = message.hashCode();
        } else
        {
            i = 0;
        }
        if (statusCode != null)
        {
            j = statusCode.hashCode();
        }
        return i * 31 + j;
    }
}
