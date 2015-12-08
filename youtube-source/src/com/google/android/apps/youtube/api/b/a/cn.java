// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.apps.youtube.api.jar.a.ct;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.medialib.player.n;
import com.google.android.apps.youtube.medialib.player.z;
import com.google.android.exoplayer.ak;
import com.google.android.exoplayer.d;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            a

public final class cn extends a
    implements android.view.SurfaceHolder.Callback
{

    private final SurfaceHolder b;
    private boolean c;

    public cn(SurfaceHolder surfaceholder, ct ct)
    {
        super(ct);
        b = (SurfaceHolder)com.google.android.apps.youtube.common.fromguava.c.a(surfaceholder, "surfaceHolder cannot be null");
        surfaceholder.setType(3);
        surfaceholder.addCallback(this);
    }

    public final void a(n n1)
    {
        n1.a(b);
    }

    public final void a(d d1, ak ak)
    {
        d1.a(ak, 1, b.getSurface());
    }

    public final void b(n n1)
    {
        n1.a(null);
    }

    public final void b(d d1, ak ak)
    {
        d1.a(ak, 1, null);
    }

    public final void g()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            Surface surface = b.getSurface();
            if (surface != null)
            {
                surface.release();
            }
        }
    }

    public final boolean h()
    {
        return c;
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        if (a != null)
        {
            a.b();
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
        c = true;
        if (a != null)
        {
            a.a();
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        c = false;
        if (a != null)
        {
            a.c();
        }
    }
}
