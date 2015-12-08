// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import com.squareup.otto.Bus;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            l, s

public class ICaptureConstraint_RealtimeVideo
    implements l
{

    private final Bus a;
    private l b;

    public ICaptureConstraint_RealtimeVideo(Context context, Bus bus)
    {
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
        a.post(new BusEvents.RealtimeVideoEvent(previewimagereadybusevent));
        if (l1 != null)
        {
            return l1.isMet(previewimagereadybusevent);
        } else
        {
            return true;
        }
    }

    public void setNext(l l1)
    {
        b = l1;
    }
}
