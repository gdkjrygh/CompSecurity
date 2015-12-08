// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.gdata2;


public class GDataException extends Exception
{

    private final Throwable cause;

    public GDataException()
    {
        cause = null;
    }

    public GDataException(String s)
    {
        super(s);
        cause = null;
    }

    public GDataException(String s, Throwable throwable)
    {
        super(s);
        cause = throwable;
    }

    public GDataException(Throwable throwable)
    {
        this("", throwable);
    }

    public Throwable getCause()
    {
        return cause;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(super.toString());
        String s;
        if (cause != null)
        {
            s = (new StringBuilder(" ")).append(cause.toString()).toString();
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).toString();
    }
}
