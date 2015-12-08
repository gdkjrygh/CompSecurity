// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.Handler;
import com.google.android.apps.youtube.api.jar.h;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            cu, du, dv, dw, 
//            dx

public final class dt extends cu
{

    private final h a;
    private final Handler b;
    private final Runnable c;
    private final Runnable d;

    public dt(h h1, Handler handler)
    {
        a = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1, "target cannot be null");
        b = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
        c = new du(this, h1);
        d = new dv(this, h1);
    }

    static h a(dt dt1)
    {
        return dt1.a;
    }

    public final void a()
    {
        b.post(new dw(this));
    }

    public final void a(int i, int j)
    {
        b.post(new dx(this, i, j));
    }

    public final void b()
    {
        b.post(c);
    }

    public final void c()
    {
        b.post(d);
    }
}
