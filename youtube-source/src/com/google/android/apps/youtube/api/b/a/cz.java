// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Handler;
import android.os.IBinder;
import android.view.Surface;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            cw, cv, da

final class cz extends cw
{

    final cv b;

    private cz(cv cv1)
    {
        b = cv1;
        super(cv1, (byte)0);
    }

    cz(cv cv1, byte byte0)
    {
        this(cv1);
    }

    public final int a(IBinder ibinder, IBinder ibinder1, android.view.WindowManager.LayoutParams layoutparams, int i, int j, int k, boolean flag, 
            Rect rect, Rect rect1, Rect rect2, Configuration configuration, Surface surface)
    {
        throw new IllegalStateException("remoteSurfaceViewRelayout should not be called post ICS");
    }

    public final void a(Surface surface)
    {
        cv.a(b).post(new da(this, surface));
    }
}
