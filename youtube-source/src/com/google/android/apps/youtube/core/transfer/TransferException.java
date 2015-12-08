// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;


public class TransferException extends Exception
{

    public final boolean fatal;

    public TransferException(String s, Throwable throwable, boolean flag)
    {
        super(s, throwable);
        fatal = flag;
    }

    public TransferException(String s, boolean flag)
    {
        super(s);
        fatal = flag;
    }

    public TransferException(Throwable throwable, boolean flag)
    {
        super(throwable);
        fatal = flag;
    }

    public TransferException(boolean flag)
    {
        fatal = flag;
    }
}
