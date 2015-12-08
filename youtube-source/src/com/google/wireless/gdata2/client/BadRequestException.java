// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.gdata2.client;

import com.google.wireless.gdata2.GDataException;

public class BadRequestException extends GDataException
{

    public BadRequestException()
    {
    }

    public BadRequestException(String s)
    {
        super(s);
    }

    public BadRequestException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
