// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import com.gau.go.launcherex.goweather.livewallpaper.b.e;
import com.jiubang.core.a.i;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper:
//            g

public class f
{

    private i a;
    private volatile i b;
    private Paint c;
    private volatile int d;
    private Canvas e;
    private Bitmap f;
    private boolean g;
    private Handler h;
    private e i;

    public f(e e1)
    {
        b = null;
        i = e1;
    }

    static boolean a(f f1)
    {
        return f1.g;
    }

    static e b(f f1)
    {
        return f1.i;
    }

    private void f()
    {
        h = new g(this);
    }

    private void g()
    {
        d = 0;
    }

    public void a()
    {
        d = 0;
        c = new Paint();
        f();
    }

    public void a(Canvas canvas, Paint paint, float f1, int j)
    {
        if (a != null)
        {
            a.a(canvas, a.h(), a.i(), f1, j, 255, g);
        }
        if (b != null && f != null)
        {
            d = (int)((long)d + 35L);
            if (d > 255)
            {
                d = 255;
            }
            c.setAlpha(d);
            b.a(e, b.h(), b.i(), f1, j, 255, g);
            canvas.drawBitmap(f, 0.0F, 0.0F, c);
            if (d >= 255)
            {
                d = 0;
                canvas = h.obtainMessage();
                canvas.what = 2;
                canvas.obj = a;
                h.sendMessage(canvas);
                a = b;
                b = null;
            }
        }
    }

    public void a(i j, boolean flag)
    {
        g = flag;
        if (f == null)
        {
            f = Bitmap.createBitmap(j.a(), j.b(), android.graphics.Bitmap.Config.ARGB_8888);
            e = new Canvas(f);
        }
        if (b == null && a == null)
        {
            a = j;
            a.a(0, 0, j.a(), j.b());
            i.a(g);
            return;
        }
        if (d == 0)
        {
            b = j;
            b.a(0, 0, j.a(), j.b());
        } else
        {
            b.j();
            b = j;
            b.a(0, 0, j.a(), j.b());
        }
        g();
    }

    public boolean a(long l)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a != null)
        {
            flag = flag1;
            if (a.e())
            {
                flag = flag1;
                if (a.a(l))
                {
                    flag = true;
                }
            }
        }
        flag1 = flag;
        if (b != null)
        {
            flag1 = flag;
            if (b.e())
            {
                flag1 = flag;
                if (b.a(l))
                {
                    flag1 = true;
                }
            }
        }
        if (!flag1 && a != null && b != null)
        {
            return true;
        } else
        {
            return flag1;
        }
    }

    public i b()
    {
        return a;
    }

    public void c()
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
        if (f != null && !f.isRecycled())
        {
            f.recycle();
            f = null;
        }
    }

    public void d()
    {
        if (a != null)
        {
            a.s();
        }
    }

    public void e()
    {
        if (a != null)
        {
            a.r();
        }
    }
}
