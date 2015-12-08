// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.gdata.parser;

import com.google.wireless.gdata.GDataException;

public class ParseException extends GDataException
{

    public ParseException()
    {
    }

    public ParseException(String s)
    {
        super(s);
    }

    public ParseException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
