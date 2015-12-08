// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.dynamicbackground;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.go.weatherex.c.a;
import com.gtp.a.a.b.c;
import com.jiubang.core.a.g;
import com.jiubang.core.a.i;
import com.jiubang.core.a.k;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.dynamicbackground:
//            b, a

public class DynamicBackgroundView extends View
{

    private i a;
    private i b;
    private int c;
    private int d;
    private int e;
    private ArrayList f;
    private boolean g;
    private boolean h;
    private Handler i;
    private final com.gau.go.launcherex.gowidget.weather.dynamicbackground.a j;
    private final g k;
    private final a l;

    public DynamicBackgroundView(Context context)
    {
        super(context);
        a = null;
        b = null;
        e = 255;
        f = new ArrayList();
        i = new b(this);
        j = new com.gau.go.launcherex.gowidget.weather.dynamicbackground.a(this);
        k = new k(40);
        l = new a();
        e();
    }

    public DynamicBackgroundView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        b = null;
        e = 255;
        f = new ArrayList();
        i = new b(this);
        j = new com.gau.go.launcherex.gowidget.weather.dynamicbackground.a(this);
        k = new k(40);
        l = new a();
        e();
    }

    static void a(DynamicBackgroundView dynamicbackgroundview)
    {
        dynamicbackgroundview.f();
    }

    private void e()
    {
        c = 0;
    }

    private void f()
    {
        int k1 = f.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            i i1 = (i)f.get(j1);
            if (i1 != null)
            {
                i1.j();
            }
        }

        f.clear();
    }

    private void g()
    {
        c = 0;
    }

    private void h()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a != null)
        {
            flag = flag1;
            if (a.e())
            {
                k.b();
                flag = true;
                a.a(k.a());
            }
        }
        if (b != null && b.e())
        {
            if (!flag)
            {
                k.b();
            }
            b.a(k.a());
        }
    }

    private void i()
    {
        if ((g || d > 0) && h && j())
        {
            j.a();
            return;
        } else
        {
            j.b();
            return;
        }
    }

    private boolean j()
    {
        return a != null || b != null;
    }

    private void k()
    {
        com.gtp.a.a.b.c.a("DynamicBackgroundView", "screenOff");
        if (a != null)
        {
            a.r();
        }
        if (b != null)
        {
            b.r();
        }
    }

    private void l()
    {
        com.gtp.a.a.b.c.a("DynamicBackgroundView", "screenOn");
        if (a != null)
        {
            a.s();
        }
        if (b != null)
        {
            b.s();
        }
    }

    public void a()
    {
        if (a != null)
        {
            a.j();
            a = null;
        }
        if (b != null)
        {
            b.j();
            b = null;
        }
        f();
    }

    public void a(int i1)
    {
        e = i1;
    }

    public void a(i i1, boolean flag)
    {
        a(flag);
        if (b != null || a != null) goto _L2; else goto _L1
_L1:
        g();
        a = i1;
        a.a(getLeft(), getTop(), getRight(), getBottom());
        i();
_L4:
        return;
_L2:
        if (c != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a == i1) goto _L4; else goto _L3
_L3:
        b = i1;
        b.a(getLeft(), getTop(), getRight(), getBottom());
        i();
        return;
        if (b == i1) goto _L4; else goto _L5
_L5:
        i j1 = b;
        b = i1;
        f.add(j1);
        b.a(getLeft(), getTop(), getRight(), getBottom());
        i.sendEmptyMessage(1);
        i();
        return;
    }

    public void a(boolean flag)
    {
        g = flag;
        d = 30;
        i();
    }

    public void b()
    {
        h = false;
        k();
        i();
    }

    public void c()
    {
        h = true;
        l();
        i();
    }

    public void d()
    {
        d = 30;
        i();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        h();
        if (a != null && a.e())
        {
            a.f();
            float f1;
            float f2;
            int i1;
            if (android.os.Build.VERSION.SDK_INT >= 11 && a.u())
            {
                a.a(canvas, a.h(), a.i(), 0.0F, getWidth(), e, g);
            } else
            {
                a.a(canvas, a.h(), a.i(), 0.0F, getWidth(), 255, g);
            }
        }
        if (canvas != null && b != null && a.e())
        {
            a.f();
            c = (int)((long)c + 30L);
            if (c > 255)
            {
                c = 255;
            }
            f1 = canvas.getWidth();
            f2 = canvas.getHeight();
            i1 = (int)((float)c * ((float)e / 255F));
            int j1;
            if (android.os.Build.VERSION.SDK_INT >= 11 && a.u())
            {
                j1 = canvas.saveLayerAlpha(0.0F, 0.0F, f1, f2, i1, 4);
            } else
            {
                j1 = -1;
            }
            b.a(canvas, b.h(), b.i(), 0.0F, getWidth(), 255, g);
            if (j1 != -1)
            {
                canvas.restoreToCount(j1);
            }
            if (c >= 255)
            {
                c = 0;
                if (a != null)
                {
                    f.add(a);
                }
                a = b;
                b = null;
                i.sendEmptyMessage(1);
            }
        }
        if (android.os.Build.VERSION.SDK_INT < 11 || a != null && !a.u())
        {
            j1 = (int)((double)(255 - e) * 0.34999999999999998D);
            if (j1 != 0)
            {
                canvas.drawColor(Color.argb(j1, 0, 0, 0));
            }
        }
        if (d > 0)
        {
            d = d - 1;
        } else
        {
            i();
        }
        l.a();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (flag)
        {
            if (a != null)
            {
                a.a(i1, j1, k1, l1);
            }
            if (b != null)
            {
                b.a(i1, j1, k1, l1);
            }
        }
    }

    protected void onVisibilityChanged(View view, int i1)
    {
        super.onVisibilityChanged(view, i1);
        com.gtp.a.a.b.c.a("DynamicBackgroundView", (new StringBuilder()).append("onVisibilityChanged: ").append(i1).toString());
    }

    protected void onWindowVisibilityChanged(int i1)
    {
        super.onWindowVisibilityChanged(i1);
        com.gtp.a.a.b.c.a("DynamicBackgroundView", (new StringBuilder()).append("onWindowVisibilityChanged: ").append(i1).toString());
    }
}
