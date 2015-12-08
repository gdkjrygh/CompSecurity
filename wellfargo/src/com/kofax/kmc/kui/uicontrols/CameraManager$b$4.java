// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import com.squareup.otto.Bus;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            CameraManager

class c
    implements Runnable
{

    final meters a;
    final long b;
    final Exception c;
    final meters d;

    public void run()
    {
        CameraManager.d(d.d).post(new rametersAppliedFailedEvent(a, b, c));
    }

    meters(meters meters, meters meters1, long l, Exception exception)
    {
        d = meters;
        a = meters1;
        b = l;
        c = exception;
        super();
    }
}
