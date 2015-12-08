// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.api.b.a.bd;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            dg, ey, ex, ew

public final class ev extends dg
{

    private final ey a;
    private final Context b;
    private final Handler c;
    private ex d;

    public ev(ey ey1, Context context, Handler handler)
    {
        a = (ey)com.google.android.apps.youtube.common.fromguava.c.a(ey1, "listener cannot be null");
        b = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context, "context cannot be null");
        c = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
    }

    static ex a(ev ev1, ex ex1)
    {
        ev1.d = ex1;
        return ex1;
    }

    static ey a(ev ev1)
    {
        return ev1.a;
    }

    static Context b(ev ev1)
    {
        return ev1.b;
    }

    static ex c(ev ev1)
    {
        return ev1.d;
    }

    public final void a()
    {
        a.e();
        if (d != null)
        {
            d.a();
            d = null;
        }
    }

    public final void a(bd bd)
    {
        c.post(new ew(this, bd));
    }
}
