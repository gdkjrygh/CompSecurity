// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import com.squareup.otto.Bus;

public class Focus_Infinity
    implements Focus_Manager.IFocus
{

    private final Bus a;

    public Focus_Infinity(Bus bus)
    {
        a = bus;
    }

    public void start(ICameraSource.Parameters parameters)
    {
        a.post(new BusEvents.FocusChangedEvent(true));
    }

    public void stop()
    {
    }
}
