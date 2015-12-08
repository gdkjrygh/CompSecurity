// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Handler;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.h;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            aj, br, bt, bs, 
//            bu, bv

final class bq extends aj
{

    private final Handler a;
    private h b;

    public bq(Handler handler)
    {
        a = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
    }

    static h a(bq bq1)
    {
        return bq1.b;
    }

    public final void a()
    {
        a.post(new br(this));
    }

    public final void a(h h1)
    {
        b = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1, "listener cannot be null");
    }

    public final void a(boolean flag)
    {
        a.post(new bt(this, flag));
    }

    public final void b()
    {
        a.post(new bs(this));
    }

    public final void c()
    {
        a.post(new bu(this));
    }

    public final void d()
    {
        a.post(new bv(this));
    }
}
