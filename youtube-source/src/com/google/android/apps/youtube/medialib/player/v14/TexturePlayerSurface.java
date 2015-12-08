// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player.v14;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
import android.view.ViewGroup;
import com.google.android.apps.youtube.medialib.player.aa;
import com.google.android.apps.youtube.medialib.player.n;
import com.google.android.apps.youtube.medialib.player.y;
import com.google.android.apps.youtube.medialib.player.z;
import com.google.android.exoplayer.ak;
import com.google.android.exoplayer.d;

// Referenced classes of package com.google.android.apps.youtube.medialib.player.v14:
//            a, b, d, c

public class TexturePlayerSurface extends ViewGroup
    implements android.view.TextureView.SurfaceTextureListener, y
{

    private com.google.android.apps.youtube.medialib.player.v14.d a;
    private final Runnable b = new a(this);
    private final Runnable c = new b(this);
    private z d;
    private Surface e;
    private int f;
    private int g;
    private volatile boolean h;

    public TexturePlayerSurface(Context context)
    {
        super(context);
        a();
        addView(a);
    }

    static com.google.android.apps.youtube.medialib.player.v14.d a(TexturePlayerSurface textureplayersurface)
    {
        return textureplayersurface.a;
    }

    private void a()
    {
        a = new com.google.android.apps.youtube.medialib.player.v14.d(this, getContext());
        a.setSurfaceTextureListener(this);
        a.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        a.setPivotX(0.0F);
        a.setPivotY(0.0F);
        a.setScaleX(1.00001F);
    }

    static void b(TexturePlayerSurface textureplayersurface)
    {
        textureplayersurface.a();
    }

    static int c(TexturePlayerSurface textureplayersurface)
    {
        return textureplayersurface.f;
    }

    static int d(TexturePlayerSurface textureplayersurface)
    {
        return textureplayersurface.g;
    }

    public final void a(n n1)
    {
        if (e == null)
        {
            throw new IllegalStateException("MediaPlayer should only be attached after Surface has been created");
        } else
        {
            n1.a(e);
            h = true;
            return;
        }
    }

    public final void a(d d1, ak ak)
    {
        d1.a(ak, 1, new Surface(a.getSurfaceTexture()));
    }

    public final boolean a(boolean flag)
    {
        return false;
    }

    public final int b()
    {
        return a.getMeasuredWidth();
    }

    public final void b(n n1)
    {
        n1.a(null);
        h = false;
    }

    public final void b(d d1, ak ak)
    {
        d1.b(ak, 1, null);
    }

    public final int c()
    {
        return a.getMeasuredHeight();
    }

    public final void d()
    {
        removeCallbacks(c);
        if (h)
        {
            postDelayed(b, 500L);
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            b.run();
            return;
        } else
        {
            post(b);
            return;
        }
    }

    public final void e()
    {
        removeCallbacks(b);
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            c.run();
            return;
        } else
        {
            post(c);
            return;
        }
    }

    public final void f()
    {
        post(new c(this));
    }

    public final void g()
    {
        if (e != null)
        {
            e.release();
        }
    }

    public final boolean h()
    {
        return e != null;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        a.layout(0, 0, a.getMeasuredWidth(), a.getMeasuredHeight());
    }

    protected void onMeasure(int i, int j)
    {
        a.measure(i, j);
        setMeasuredDimension(a.getMeasuredWidth(), a.getMeasuredHeight());
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        e = new Surface(surfacetexture);
        if (d != null)
        {
            d.a();
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        e = null;
        if (d != null)
        {
            d.c();
        }
        removeCallbacks(b);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        if (d != null)
        {
            d.b();
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        if (d != null)
        {
            d.b();
        }
    }

    public void setListener(z z1)
    {
        d = z1;
    }

    public void setOnLetterboxChangedListener(aa aa)
    {
    }

    public void setVideoSize(int i, int j)
    {
        f = i;
        g = j;
        a.requestLayout();
    }

    public void setZoom(int i)
    {
    }
}
