// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma;

import com.vladium.util.exception.AbstractRuntimeException;

public class EMMARuntimeException extends AbstractRuntimeException
{

    public EMMARuntimeException()
    {
    }

    public EMMARuntimeException(String s)
    {
        super(s);
    }

    public EMMARuntimeException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public EMMARuntimeException(String s, Object aobj[])
    {
        super(s, aobj);
    }

    public EMMARuntimeException(String s, Object aobj[], Throwable throwable)
    {
        super(s, aobj, throwable);
    }

    public EMMARuntimeException(Throwable throwable)
    {
        super(throwable);
    }
}
