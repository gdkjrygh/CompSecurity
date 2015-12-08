// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


public final class exception
{

    public final Throwable exception;
    public final Level lvl;
    public final String message;
    public final String tag;

    public Level(String s, Level level, String s1)
    {
        this(s, level, s1, null);
    }

    public Level(String s, Level level, String s1, Throwable throwable)
    {
        tag = s;
        lvl = level;
        message = s1;
        exception = throwable;
    }
}
