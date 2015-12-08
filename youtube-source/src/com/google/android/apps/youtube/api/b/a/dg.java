// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Handler;
import android.view.Surface;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            be, dj, di, dh, 
//            df, dk, de

final class dg extends be
{

    final de a;
    private final Handler b;
    private df c;

    public dg(de de, Handler handler)
    {
        a = de;
        super();
        b = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler);
    }

    static df a(dg dg1)
    {
        return dg1.c;
    }

    public final void a()
    {
        b.post(new dj(this));
    }

    public final void a(int i, int j)
    {
        b.post(new di(this, i, j));
    }

    public final void a(Surface surface)
    {
        b.post(new dh(this, surface));
    }

    public final void a(df df1)
    {
        c = (df)com.google.android.apps.youtube.common.fromguava.c.a(df1, "listener cannot be null");
    }

    public final void b()
    {
        b.post(new dk(this));
    }
}
