// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.exceptions;


public class NotSendableException extends RuntimeException
{

    private static final long serialVersionUID = 0xa6399bfdfc71ea94L;

    public NotSendableException()
    {
    }

    public NotSendableException(String s)
    {
        super(s);
    }

    public NotSendableException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public NotSendableException(Throwable throwable)
    {
        super(throwable);
    }
}
