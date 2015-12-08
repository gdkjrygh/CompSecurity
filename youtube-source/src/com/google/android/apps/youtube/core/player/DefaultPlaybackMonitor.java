// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.Analytics;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            ad, i, al

public final class DefaultPlaybackMonitor
    implements ad
{

    private a a;
    private Analytics b;
    private volatile al c;
    private i d;

    public DefaultPlaybackMonitor(a a1, Analytics analytics)
    {
        a = a1;
        b = analytics;
    }

    private void handlePlayerGeometry(al al)
    {
        c = al;
    }

    private void i()
    {
        if (!c())
        {
            b.b("PlaybackMonitor SequenceError");
            throw new RuntimeException("PlaybackMonitor queried outside playback sequence");
        } else
        {
            return;
        }
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        b();
        d = new i(this, (byte)0);
        a.a(d);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            a.b(d);
            d = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        i j = d;
        boolean flag;
        if (j != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final int d()
    {
        this;
        JVM INSTR monitorenter ;
        int j;
        i();
        j = com.google.android.apps.youtube.core.player.i.a(d);
        this;
        JVM INSTR monitorexit ;
        return j;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean e()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        i();
        flag = com.google.android.apps.youtube.core.player.i.b(d);
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean f()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        i();
        flag = com.google.android.apps.youtube.core.player.i.c(d);
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final al g()
    {
        return c;
    }

    public final String h()
    {
        i();
        return com.google.android.apps.youtube.core.player.i.d(d);
    }
}
