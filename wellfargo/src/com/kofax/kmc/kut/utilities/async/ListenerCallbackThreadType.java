// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.async;


public final class ListenerCallbackThreadType extends Enum
{

    public static final ListenerCallbackThreadType UI_THREAD;
    public static final ListenerCallbackThreadType WORKER_THREAD;
    private static final ListenerCallbackThreadType a[];

    private ListenerCallbackThreadType(String s, int i)
    {
        super(s, i);
    }

    public static ListenerCallbackThreadType valueOf(String s)
    {
        return (ListenerCallbackThreadType)Enum.valueOf(com/kofax/kmc/kut/utilities/async/ListenerCallbackThreadType, s);
    }

    public static ListenerCallbackThreadType[] values()
    {
        return (ListenerCallbackThreadType[])a.clone();
    }

    static 
    {
        UI_THREAD = new ListenerCallbackThreadType("UI_THREAD", 0);
        WORKER_THREAD = new ListenerCallbackThreadType("WORKER_THREAD", 1);
        a = (new ListenerCallbackThreadType[] {
            UI_THREAD, WORKER_THREAD
        });
    }
}
