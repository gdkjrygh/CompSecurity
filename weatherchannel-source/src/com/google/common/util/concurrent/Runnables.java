// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


public final class Runnables
{

    private static final Runnable EMPTY_RUNNABLE = new Runnable() {

        public void run()
        {
        }

    };

    private Runnables()
    {
    }

    public static Runnable doNothing()
    {
        return EMPTY_RUNNABLE;
    }

}
