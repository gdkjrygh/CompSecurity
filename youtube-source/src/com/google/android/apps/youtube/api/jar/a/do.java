// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.Handler;
import com.google.android.apps.youtube.api.b.a.au;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.ak;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            cr, dr, dq, dp, 
//            ds

public final class do extends cr
{

    private final ak a;
    private final Handler b;
    private ds c;

    public do(ak ak1, Handler handler)
    {
        a = (ak)com.google.android.apps.youtube.common.fromguava.c.a(ak1, "target cannot be null");
        b = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
    }

    static ds a(do do1)
    {
        return do1.c;
    }

    static ds a(do do1, ds ds1)
    {
        do1.c = ds1;
        return ds1;
    }

    static ak b(do do1)
    {
        return do1.a;
    }

    public final void a()
    {
        b.post(new dr(this));
    }

    public final void a(long l, boolean flag, boolean flag1)
    {
        b.post(new dq(this, l, flag, flag1));
    }

    public final void a(au au)
    {
        b.post(new dp(this, au));
    }

    public final void b()
    {
        if (c != null)
        {
            c.a();
            c = null;
        }
    }
}
