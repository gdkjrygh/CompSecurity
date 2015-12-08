// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player.v14;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.medialib.player.DefaultPlayerSurface;
import com.google.android.apps.youtube.medialib.player.aa;
import com.google.android.apps.youtube.medialib.player.n;
import com.google.android.apps.youtube.medialib.player.y;
import com.google.android.apps.youtube.medialib.player.z;
import com.google.android.exoplayer.ak;
import com.google.android.exoplayer.d;

// Referenced classes of package com.google.android.apps.youtube.medialib.player.v14:
//            TexturePlayerSurface

public final class SafeTexturePlayerSurface extends ViewGroup
    implements y
{

    private y a;
    private View b;
    private boolean c;
    private boolean d;
    private z e;

    public SafeTexturePlayerSurface(Context context)
    {
        super(context);
    }

    private void a()
    {
        if (!i())
        {
            throw new IllegalStateException("PlayerSurface method called before surface created");
        } else
        {
            return;
        }
    }

    private boolean i()
    {
        return a != null;
    }

    public final void a(n n)
    {
        a();
        a.a(n);
    }

    public final void a(d d1, ak ak)
    {
        a();
        a.a(d1, ak);
    }

    public final boolean a(boolean flag)
    {
        a();
        return a.a(flag);
    }

    public final int b()
    {
        a();
        return a.b();
    }

    public final void b(n n)
    {
        a();
        a.b(n);
    }

    public final void b(d d1, ak ak)
    {
        a();
        a.b(d1, ak);
    }

    public final int c()
    {
        a();
        return a.c();
    }

    public final void d()
    {
        if (i())
        {
            d = false;
            a.d();
            return;
        } else
        {
            d = true;
            return;
        }
    }

    public final void e()
    {
        if (i())
        {
            a.e();
        }
        d = false;
    }

    public final void f()
    {
        if (i())
        {
            a.f();
        }
    }

    public final void g()
    {
        if (i())
        {
            a.g();
        }
    }

    public final boolean h()
    {
        if (a == null)
        {
            return false;
        } else
        {
            return a.h();
        }
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (b != null)
        {
            removeView(b);
            b = null;
        }
        if (isHardwareAccelerated())
        {
            TexturePlayerSurface textureplayersurface = new TexturePlayerSurface(getContext());
            a = textureplayersurface;
            b = textureplayersurface;
        } else
        {
            DefaultPlayerSurface defaultplayersurface = new DefaultPlayerSurface(getContext());
            a = defaultplayersurface;
            b = defaultplayersurface;
        }
        addView(b);
        if (c)
        {
            c = false;
            a.setListener(e);
            if (d)
            {
                d();
            }
        }
    }

    protected final void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        if (getChildCount() > 0)
        {
            View view = getChildAt(0);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    protected final void onMeasure(int j, int k)
    {
        if (getChildCount() > 0)
        {
            View view = getChildAt(0);
            view.measure(j, k);
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
            return;
        } else
        {
            setMeasuredDimension(0, 0);
            return;
        }
    }

    public final void setListener(z z)
    {
        e = z;
        if (a != null)
        {
            c = false;
            a.setListener(z);
            return;
        } else
        {
            c = true;
            return;
        }
    }

    public final void setOnLetterboxChangedListener(aa aa)
    {
        a();
        a.setOnLetterboxChangedListener(aa);
    }

    public final void setVideoSize(int j, int k)
    {
        a();
        a.setVideoSize(j, k);
    }

    public final void setZoom(int j)
    {
        a();
        a.setZoom(j);
    }
}
