// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma;

import com.vladium.util.exception.AbstractException;

public class EMMAException extends AbstractException
{

    public EMMAException()
    {
    }

    public EMMAException(String s)
    {
        super(s);
    }

    public EMMAException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public EMMAException(String s, Object aobj[])
    {
        super(s, aobj);
    }

    public EMMAException(String s, Object aobj[], Throwable throwable)
    {
        super(s, aobj, throwable);
    }

    public EMMAException(Throwable throwable)
    {
        super(throwable);
    }
}
