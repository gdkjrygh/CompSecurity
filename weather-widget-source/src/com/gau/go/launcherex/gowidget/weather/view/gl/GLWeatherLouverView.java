// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.graphics.GLDrawable;
import com.go.gl.view.GLView;
import com.gtp.a.a.b.c;
import java.lang.ref.WeakReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.gl:
//            b

public class GLWeatherLouverView extends GLView
{

    private Paint a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f[];
    private int g[];
    private int h;
    private boolean i;
    private float j;
    private b k;
    private GLDrawable l;
    private boolean m;

    public GLWeatherLouverView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = new int[8];
        g = new int[8];
        h = 0;
        i = true;
        m = false;
        k = new b(new WeakReference(this));
        a();
    }

    private void a()
    {
        Object obj;
        a = new Paint(1);
        a.setFilterBitmap(true);
        a.setAntiAlias(true);
        obj = null;
        GLDrawable gldrawable = GLDrawable.getDrawable(getResources(), 0x7f020245);
_L2:
        setWeather(gldrawable, false);
        return;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        gldrawable = obj;
        if (com.gtp.a.a.b.c.a())
        {
            outofmemoryerror.printStackTrace();
            gldrawable = obj;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void b()
    {
        boolean flag = false;
        m = false;
        int i1 = l.getIntrinsicWidth();
        int j1 = l.getIntrinsicHeight();
        int k1 = getWidth();
        int l1 = getHeight();
        j = Math.min((float)k1 / ((float)i1 + 0.0F), (float)l1 / ((float)j1 + 0.0F));
        b = i1;
        c = j1;
        d = c / 8;
        e = j1 / 8;
        i1 = 0;
        do
        {
            j1 = ((flag) ? 1 : 0);
            if (i1 >= f.length)
            {
                break;
            }
            f[i1] = d * i1;
            i1++;
        } while (true);
        for (; j1 < g.length; j1++)
        {
            g[j1] = e * j1;
        }

    }

    private void c()
    {
        h = h + 1;
    }

    private boolean d()
    {
        return h >= d;
    }

    private void e()
    {
        i = true;
        h = 0;
    }

    public void cleanup()
    {
        super.cleanup();
        if (l != null)
        {
            releaseDrawableReference(l);
            l.clear();
            l.setCallback(null);
            l = null;
        }
    }

    protected void onDraw(GLCanvas glcanvas)
    {
        super.onDraw(glcanvas);
        if (l != null)
        {
            if (m)
            {
                b();
            }
            float f1 = ((float)getWidth() - (float)b * j) / 2.0F;
            float f2 = ((float)getHeight() - (float)c * j) / 2.0F;
            if (!i)
            {
                int i1 = 0;
                while (i1 < f.length) 
                {
                    glcanvas.save();
                    glcanvas.translate(f1, f2);
                    glcanvas.scale(j, j, j);
                    glcanvas.clipRect(0.0F, f[i1], b, f[i1] + h);
                    glcanvas.drawDrawable(l);
                    glcanvas.restore();
                    i1++;
                }
            } else
            {
                glcanvas.save();
                glcanvas.translate(f1, f2);
                glcanvas.scale(j, j, j);
                glcanvas.drawDrawable(l);
                glcanvas.restore();
                return;
            }
        }
    }

    public void setWeather(GLDrawable gldrawable, boolean flag)
    {
        if (gldrawable != null)
        {
            if (l != null)
            {
                releaseDrawableReference(l);
                l.clear();
                l.setCallback(null);
            }
            l = gldrawable;
            m = true;
            if (flag && i)
            {
                i = false;
                k.sendEmptyMessage(0);
                return;
            }
        }
    }



}
