// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.gdata.parser;

import com.google.wireless.gdata.GDataException;

public class ConflictException extends GDataException
{

    public ConflictException()
    {
    }

    public ConflictException(String s)
    {
        super(s);
    }

    public ConflictException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
