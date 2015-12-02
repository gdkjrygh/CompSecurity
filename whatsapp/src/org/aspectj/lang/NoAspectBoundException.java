// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang;


public class NoAspectBoundException extends RuntimeException
{

    Throwable cause;

    public NoAspectBoundException()
    {
    }

    public NoAspectBoundException(String s, Throwable throwable)
    {
        if (throwable != null)
        {
            s = "Exception while initializing " + s + ": " + throwable;
        }
        super(s);
        cause = throwable;
    }

    public Throwable getCause()
    {
        return cause;
    }
}
