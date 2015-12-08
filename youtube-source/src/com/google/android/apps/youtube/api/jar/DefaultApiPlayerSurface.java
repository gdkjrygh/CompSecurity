// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import com.google.android.apps.youtube.api.jar.a.et;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            ApiVideoView, h, i, s

public final class DefaultApiPlayerSurface extends ApiVideoView
    implements et, h
{

    private final i a;
    private SurfaceView b;
    private final View c;
    private final Runnable d = new s(this);

    public DefaultApiPlayerSurface(Context context, i j)
    {
        super(context);
        a = (i)com.google.android.apps.youtube.common.fromguava.c.a(j);
        c = new View(context);
        c.setBackgroundColor(0xff000000);
        addView(c);
    }

    static View a(DefaultApiPlayerSurface defaultapiplayersurface)
    {
        return defaultapiplayersurface.c;
    }

    public final View a()
    {
        return this;
    }

    public final void a(Surface surface)
    {
        a.a();
    }

    public final void a(SurfaceView surfaceview)
    {
        b = surfaceview;
        addView(surfaceview, 0);
    }

    public final void b()
    {
        if (b != null)
        {
            removeView(b);
            addView(b, 0);
        }
    }

    public final void c()
    {
        postDelayed(d, 500L);
    }

    public final void d()
    {
        removeCallbacks(d);
        c.setVisibility(0);
    }

    public final void e()
    {
        if (b != null)
        {
            removeView(b);
        }
        b = null;
    }

    public final void f()
    {
        a.b();
    }

    protected final void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        if (b != null)
        {
            b.layout(0, 0, b.getMeasuredWidth(), b.getMeasuredHeight());
        }
        if (c.getVisibility() != 8)
        {
            c.layout(0, 0, c.getMeasuredWidth(), c.getMeasuredHeight());
        }
    }

    protected final void onMeasure(int j, int k)
    {
        super.onMeasure(j, k);
        j = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
        k = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
        if (b != null)
        {
            b.measure(j, k);
        }
        if (c.getVisibility() != 8)
        {
            c.measure(j, k);
        }
    }
}
