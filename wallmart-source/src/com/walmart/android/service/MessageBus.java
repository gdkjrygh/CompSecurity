// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

public class MessageBus
{

    private static Bus sBus;
    public static volatile ThreadEnforcer sThreadEnforcer;

    public MessageBus()
    {
    }

    public static Bus getBus()
    {
        if (sBus == null)
        {
            sBus = new Bus(sThreadEnforcer);
        }
        return sBus;
    }

    static 
    {
        sThreadEnforcer = ThreadEnforcer.MAIN;
    }
}
