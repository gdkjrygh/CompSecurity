// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.parsing;


public class ValidationException extends Exception
{

    private static final long serialVersionUID = 0x567ec4533acbe5ceL;

    public ValidationException(String s)
    {
        super(s);
    }

    public ValidationException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
