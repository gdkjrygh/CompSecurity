// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.content.Context;

// Referenced classes of package com.go.weatherex.j:
//            k, m, g

public abstract class l
{

    protected Context a;
    protected g b;
    protected k c;
    private m d;

    public l(Context context)
    {
        a = context;
    }

    public abstract void a();

    public abstract void a(g g);

    public void a(m m1)
    {
        d = m1;
    }

    protected final void a(boolean flag)
    {
        if (c != null)
        {
            android.widget.RemoteViews remoteviews = c.o();
            if (d != null)
            {
                d.onViewUpdate(flag, remoteviews);
                return;
            }
        }
    }

    protected final void b()
    {
        a(false);
    }

    protected final void c()
    {
        a(true);
    }
}
