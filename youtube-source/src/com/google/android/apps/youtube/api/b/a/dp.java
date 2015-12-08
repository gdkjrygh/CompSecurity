// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.view.Surface;
import com.google.android.apps.youtube.api.jar.a.ct;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.medialib.player.n;
import com.google.android.apps.youtube.medialib.player.z;
import com.google.android.exoplayer.ak;
import com.google.android.exoplayer.d;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            a, df, de

public final class dp extends a
    implements df
{

    private final de b;
    private Surface c;

    public dp(de de1, ct ct)
    {
        super(ct);
        b = (de)com.google.android.apps.youtube.common.fromguava.c.a(de1);
        de1.a(this);
    }

    public final void a(Surface surface)
    {
        c = surface;
        if (a != null)
        {
            a.a();
        }
    }

    public final void a(n n1)
    {
        if (c == null)
        {
            throw new IllegalStateException("MediaPlayer should only be attached after Surface has been created");
        } else
        {
            n1.a(c);
            return;
        }
    }

    public final void a(d d1, ak ak)
    {
        if (c == null)
        {
            throw new IllegalStateException("ExoPlayer should only be attached after Surface has been created");
        } else
        {
            d1.a(ak, 1, c);
            return;
        }
    }

    public final void b(n n1)
    {
        n1.a(null);
    }

    public final void b(d d1, ak ak)
    {
        d1.a(ak, 1, null);
    }

    public final void b_()
    {
        if (a != null)
        {
            a.b();
        }
    }

    public final void c_()
    {
        if (a != null)
        {
            a.b();
        }
    }

    public final void d_()
    {
        c = null;
        if (a != null)
        {
            a.c();
        }
    }

    public final void g()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && c != null)
        {
            c.release();
        }
    }

    public final boolean h()
    {
        return c != null;
    }
}
