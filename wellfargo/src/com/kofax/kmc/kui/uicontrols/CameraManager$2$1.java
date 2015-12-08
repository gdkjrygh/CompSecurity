// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.graphics.Point;
import com.squareup.otto.Bus;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            CameraManager, Utility

class c
    implements Runnable
{

    final byte a[];
    final Point b;
    final int c;
    final turedBusEvent d;

    public void run()
    {
        android.graphics.Bitmap bitmap = Utility.imageDataToBitmap(a, b.x, b.y, c, CameraManager.c(d.d));
        CameraManager.d(d.d).post(new turedBusEvent(bitmap));
    }

    turedBusEvent(turedBusEvent turedbusevent, byte abyte0[], Point point, int i)
    {
        d = turedbusevent;
        a = abyte0;
        b = point;
        c = i;
        super();
    }
}
