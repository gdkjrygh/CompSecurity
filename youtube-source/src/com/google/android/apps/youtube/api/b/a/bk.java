// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Handler;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.b;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            ag, bn, bl, bm, 
//            bo

final class bk extends ag
    implements b
{

    private final Handler a;
    private b b;

    public bk(Handler handler)
    {
        a = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
    }

    static b a(bk bk1)
    {
        return bk1.b;
    }

    public final void a(int i, int j)
    {
        a.post(new bn(this, i, j));
    }

    public final void a(b b1)
    {
        b = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1, "listener cannot be null");
    }

    public final void b()
    {
        a.post(new bl(this));
    }

    public final void c()
    {
        a.post(new bm(this));
    }

    public final void d()
    {
        a.post(new bo(this));
    }
}
