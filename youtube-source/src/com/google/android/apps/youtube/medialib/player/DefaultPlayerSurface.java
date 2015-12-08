// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer.ak;
import com.google.android.exoplayer.d;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            y, d, a, b, 
//            n, c, z, aa

public class DefaultPlayerSurface extends ViewGroup
    implements android.view.SurfaceHolder.Callback, y
{

    private final com.google.android.apps.youtube.medialib.player.d a;
    private final View b;
    private final Runnable c = new a(this);
    private final Runnable d = new b(this);
    private aa e;
    private z f;
    private int g;
    private int h;
    private final boolean i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private volatile boolean n;

    public DefaultPlayerSurface(Context context)
    {
        super(context);
        a = new com.google.android.apps.youtube.medialib.player.d(this, context);
        SurfaceHolder surfaceholder = a.getHolder();
        surfaceholder.setType(3);
        surfaceholder.addCallback(this);
        b = new View(context);
        b.setBackgroundColor(0xff000000);
        addView(a);
        addView(b);
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
    }

    static int a(DefaultPlayerSurface defaultplayersurface, int i1)
    {
        defaultplayersurface.k = i1;
        return i1;
    }

    static View a(DefaultPlayerSurface defaultplayersurface)
    {
        return defaultplayersurface.b;
    }

    static int b(DefaultPlayerSurface defaultplayersurface, int i1)
    {
        defaultplayersurface.l = i1;
        return i1;
    }

    static com.google.android.apps.youtube.medialib.player.d b(DefaultPlayerSurface defaultplayersurface)
    {
        return defaultplayersurface.a;
    }

    static aa c(DefaultPlayerSurface defaultplayersurface)
    {
        return defaultplayersurface.e;
    }

    static int d(DefaultPlayerSurface defaultplayersurface)
    {
        return defaultplayersurface.g;
    }

    static int e(DefaultPlayerSurface defaultplayersurface)
    {
        return defaultplayersurface.h;
    }

    static boolean f(DefaultPlayerSurface defaultplayersurface)
    {
        return defaultplayersurface.i;
    }

    static int g(DefaultPlayerSurface defaultplayersurface)
    {
        return defaultplayersurface.j;
    }

    public final void a(n n1)
    {
        n1.a(a.getHolder());
        n = true;
    }

    public final void a(d d1, ak ak)
    {
        d1.a(ak, 1, a.getHolder().getSurface());
    }

    public final boolean a(boolean flag)
    {
        return i && (!flag || android.os.Build.VERSION.SDK_INT >= 17);
    }

    public final int b()
    {
        return k;
    }

    public final void b(n n1)
    {
        n1.a(null);
        n = false;
    }

    public final void b(d d1, ak ak)
    {
        d1.b(ak, 1, null);
    }

    public final int c()
    {
        return l;
    }

    public final void d()
    {
        b.removeCallbacks(d);
        if (n)
        {
            b.postDelayed(c, 500L);
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            c.run();
            return;
        } else
        {
            b.post(c);
            return;
        }
    }

    public final void e()
    {
        b.removeCallbacks(c);
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            d.run();
            return;
        } else
        {
            b.post(d);
            return;
        }
    }

    public final void f()
    {
        post(new c(this));
    }

    public final void g()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            Surface surface = a.getHolder().getSurface();
            if (surface != null)
            {
                surface.release();
            }
        }
    }

    public final boolean h()
    {
        return m;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        a.layout(0, 0, a.getMeasuredWidth(), a.getMeasuredHeight());
        if (b.getVisibility() != 8)
        {
            b.layout(0, 0, b.getMeasuredWidth(), b.getMeasuredHeight());
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        a.measure(i1, j1);
        i1 = a.getMeasuredWidth();
        j1 = a.getMeasuredHeight();
        if (b.getVisibility() != 8)
        {
            b.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
        }
        setMeasuredDimension(i1, j1);
    }

    public void setListener(z z1)
    {
        f = z1;
    }

    public void setOnLetterboxChangedListener(aa aa)
    {
        e = aa;
    }

    public void setVideoSize(int i1, int j1)
    {
        g = i1;
        h = j1;
        a.requestLayout();
    }

    public void setZoom(int i1)
    {
        if (j != i1)
        {
            j = i1;
            requestLayout();
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
        if (f != null)
        {
            f.b();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        m = true;
        if (f != null)
        {
            f.a();
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        m = false;
        if (f != null)
        {
            f.c();
        }
        e();
    }
}
