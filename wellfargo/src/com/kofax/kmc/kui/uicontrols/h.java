// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import com.squareup.otto.Bus;

class h
    implements Focus_Manager.IFocus
{

    private final Bus a;
    private boolean b;
    private boolean c;
    private ICameraSource.Parameters d;
    private final ICameraSource.FocusMode e;

    private h(Bus bus, ICameraSource.FocusMode focusmode)
    {
        a = bus;
        if (focusmode != ICameraSource.FocusMode.CONTINUOUS_PICTURE && focusmode != ICameraSource.FocusMode.CONTINUOUS_VIDEO)
        {
            throw new IllegalArgumentException("mode must either be CONTINUOUS_VIDEO or CONTINUOUS_PICTURE");
        } else
        {
            e = focusmode;
            return;
        }
    }

    public static Focus_Manager.IFocus a(Bus bus)
    {
        return new h(bus, ICameraSource.FocusMode.CONTINUOUS_PICTURE);
    }

    public static Focus_Manager.IFocus b(Bus bus)
    {
        return new h(bus, ICameraSource.FocusMode.CONTINUOUS_VIDEO);
    }

    public void a(BusEvents.AutoFocusMoveCallbackEvent autofocusmovecallbackevent)
    {
        b = autofocusmovecallbackevent.start;
        if (!c && b)
        {
            a.post(new BusEvents.FocusChangedEvent(false));
        }
        if (c && !b)
        {
            a.post(new BusEvents.FocusChangedEvent(true));
        }
        c = b;
        return;
        autofocusmovecallbackevent;
        c = b;
        throw autofocusmovecallbackevent;
    }

    public void start(ICameraSource.Parameters parameters)
    {
        d = parameters;
        a.register(this);
        d.setFocusMode(e);
        a.post(new BusEvents.SetCameraParametersEvent(d));
        a.post(new BusEvents.CancelAutoFocusRequestEvent());
    }

    public void stop()
    {
        a.unregister(this);
    }
}
