// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


public class ExoPlaybackException extends Exception
{

    public ExoPlaybackException(String s)
    {
        super(s);
    }

    public ExoPlaybackException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public ExoPlaybackException(Throwable throwable)
    {
        super(throwable);
    }
}
