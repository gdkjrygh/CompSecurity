// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import com.squareup.otto.Bus;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            l, s

class o
    implements l
{

    public static final double a = 45D;
    private final Bus b;
    private l c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;

    public o(Context context, Bus bus)
    {
        e = false;
        Object obj = bus;
        if (bus == null)
        {
            obj = s.a(context);
        }
        b = ((Bus) (obj));
        b.register(this);
    }

    public void a(BusEvents.ContinuousModeChangedEvent continuousmodechangedevent)
    {
        if (continuousmodechangedevent.mode != f)
        {
            g = false;
            f = continuousmodechangedevent.mode;
            if (f)
            {
                if (!d)
                {
                    e = true;
                }
                d = true;
                return;
            }
            if (e)
            {
                d = false;
                return;
            }
        }
    }

    public void a(BusEvents.DeviceDeclinationPitchEvent devicedeclinationpitchevent)
    {
        h = devicedeclinationpitchevent.deviceDeclinationPitch;
    }

    public void a(BusEvents.DeviceDeclinationRollEvent devicedeclinationrollevent)
    {
        i = devicedeclinationrollevent.deviceDeclinationRoll;
    }

    public void a(BusEvents.ImageCapturedBusEvent imagecapturedbusevent)
    {
        d = false;
        g = true;
    }

    public void a(BusEvents.LevelChangedEvent levelchangedevent)
    {
        if (f && g && Math.max(Math.abs(levelchangedevent.pitch - (float)h), Math.abs(levelchangedevent.roll - (float)i)) >= 45D)
        {
            g = false;
            d = true;
        }
    }

    public void a(BusEvents.TryCaptureImageRequestEvent trycaptureimagerequestevent)
    {
        d = true;
        e = false;
    }

    public boolean isMet(BusEvents.PreviewImageReadyBusEvent previewimagereadybusevent)
    {
        return d && (c == null || c.isMet(previewimagereadybusevent));
    }

    public void setNext(l l1)
    {
        c = l1;
    }
}
