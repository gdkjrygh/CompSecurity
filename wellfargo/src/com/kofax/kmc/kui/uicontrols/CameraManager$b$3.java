// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import com.squareup.otto.Bus;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            CameraManager

class b
    implements Runnable
{

    final meters a;
    final long b;
    final meters c;

    public void run()
    {
        CameraManager.d(c.c).post(new rametersAppliedEvent(a, b, false));
    }

    meters(meters meters, meters meters1, long l)
    {
        c = meters;
        a = meters1;
        b = l;
        super();
    }
}
