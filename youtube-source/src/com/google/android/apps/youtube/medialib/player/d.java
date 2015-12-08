// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.content.Context;
import android.view.SurfaceView;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            e, DefaultPlayerSurface

final class d extends SurfaceView
{

    protected float a;
    protected float b;
    final DefaultPlayerSurface c;
    private final Runnable d;

    public d(DefaultPlayerSurface defaultplayersurface, Context context)
    {
        c = defaultplayersurface;
        super(context);
        d = new e(this, defaultplayersurface);
    }

    protected final void onMeasure(int i, int j)
    {
        float f1;
        int i1;
        int j1;
        f1 = 1.0F;
        j1 = getDefaultSize(DefaultPlayerSurface.d(c), i);
        i1 = getDefaultSize(DefaultPlayerSurface.e(c), j);
        if (DefaultPlayerSurface.d(c) <= 0 || DefaultPlayerSurface.e(c) <= 0) goto _L2; else goto _L1
_L1:
        float f;
        int k;
        int l;
        float f2 = (float)DefaultPlayerSurface.d(c) / (float)DefaultPlayerSurface.e(c);
        f = f2 / ((float)j1 / (float)i1) - 1.0F;
        if (f > 0.01F)
        {
            k = (DefaultPlayerSurface.e(c) * j1) / DefaultPlayerSurface.d(c);
            l = j1;
        } else
        if (f < -0.01F)
        {
            l = (DefaultPlayerSurface.d(c) * i1) / DefaultPlayerSurface.e(c);
            k = i1;
        } else
        {
            k = i1;
            l = j1;
        }
        DefaultPlayerSurface.a(c, l);
        DefaultPlayerSurface.b(c, k);
        if (!DefaultPlayerSurface.f(c)) goto _L4; else goto _L3
_L3:
        if (l >= j1) goto _L6; else goto _L5
_L5:
        f1 = (float)l / (float)j1;
        l += ((j1 - l) * DefaultPlayerSurface.g(c)) / 100;
        DefaultPlayerSurface.a(c, l);
        DefaultPlayerSurface.b(c, (int)((float)l / f2));
        f = 1.0F;
_L8:
        if (a != f1 || b != f)
        {
            a = f1;
            b = f;
            if (DefaultPlayerSurface.c(c) != null)
            {
                post(d);
            }
        }
        setMeasuredDimension(resolveSize(l, i), resolveSize(k, j));
        return;
_L6:
        if (k < i1)
        {
            f = (float)k / (float)i1;
            k += ((i1 - k) * DefaultPlayerSurface.g(c)) / 100;
            DefaultPlayerSurface.b(c, k);
            DefaultPlayerSurface.a(c, (int)(f2 * (float)k));
            continue; /* Loop/switch isn't completed */
        }
_L4:
        f = 1.0F;
        continue; /* Loop/switch isn't completed */
_L2:
        f = 1.0F;
        l = j1;
        k = i1;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
