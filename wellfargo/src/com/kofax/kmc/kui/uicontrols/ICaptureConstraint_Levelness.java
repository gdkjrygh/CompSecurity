// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import com.squareup.otto.Bus;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            l, s

public class ICaptureConstraint_Levelness
    implements l
{

    private final Bus a;
    private l b;
    private boolean c;

    public ICaptureConstraint_Levelness(Context context, Bus bus)
    {
        c = false;
        Object obj = bus;
        if (bus == null)
        {
            obj = s.a(context);
        }
        a = ((Bus) (obj));
        a.register(this);
    }

    public boolean isMet(BusEvents.PreviewImageReadyBusEvent previewimagereadybusevent)
    {
        l l1 = b;
        return c && (l1 == null || l1.isMet(previewimagereadybusevent));
    }

    public void onStabilityChanged(BusEvents.LevelChangedEvent levelchangedevent)
    {
        c = levelchangedevent.level;
    }

    public void setNext(l l1)
    {
        b = l1;
    }
}
