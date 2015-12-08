// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


public class UncheckedExecutionException extends RuntimeException
{

    private static final long serialVersionUID = 0L;

    protected UncheckedExecutionException()
    {
    }

    protected UncheckedExecutionException(String s)
    {
        super(s);
    }

    public UncheckedExecutionException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public UncheckedExecutionException(Throwable throwable)
    {
        super(throwable);
    }
}
