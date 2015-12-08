// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import com.gau.go.launcherex.goweather.livewallpaper.b.h;
import com.jiubang.core.a.i;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper:
//            e, GOWeatherWallpaperService, f, p

class d extends android.service.wallpaper.WallpaperService.Engine
    implements android.view.GestureDetector.OnGestureListener
{

    final GOWeatherWallpaperService a;
    private GestureDetector b;
    private final Handler c = new Handler();
    private Paint d;
    private boolean e;
    private boolean f;
    private float g;
    private int h;
    private final Runnable i = new e(this);

    d(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        a = goweatherwallpaperservice;
        super(goweatherwallpaperservice);
        e = false;
        g = 0.0F;
    }

    static void a(d d1)
    {
        d1.b();
    }

    private boolean a(long l)
    {
        boolean flag = false;
        if (GOWeatherWallpaperService.b(a).a(l))
        {
            flag = true;
        }
        boolean flag1 = flag;
        if (!GOWeatherWallpaperService.c(a))
        {
            flag1 = flag;
            if (h > 0)
            {
                h = h - 1;
                flag1 = flag | true;
            }
        }
        return flag1;
    }

    private void b()
    {
        Canvas canvas;
        SurfaceHolder surfaceholder;
        long l;
        surfaceholder = getSurfaceHolder();
        l = System.currentTimeMillis();
        canvas = null;
        Canvas canvas1 = surfaceholder.lockCanvas();
        canvas = canvas1;
_L1:
        if (canvas != null)
        {
            if (a(l))
            {
                canvas.drawRect(0.0F, 0.0F, GOWeatherWallpaperService.d(a), GOWeatherWallpaperService.e(a), d);
                if (GOWeatherWallpaperService.f(a))
                {
                    canvas.rotate(GOWeatherWallpaperService.g(a), com.gau.go.launcherex.goweather.livewallpaper.GOWeatherWallpaperService.h(a), com.gau.go.launcherex.goweather.livewallpaper.GOWeatherWallpaperService.i(a));
                    canvas.translate(GOWeatherWallpaperService.j(a), GOWeatherWallpaperService.k(a));
                }
                canvas.save();
                canvas.translate(g, 0.0F);
                GOWeatherWallpaperService.b(a).a(canvas, d, g, GOWeatherWallpaperService.d(a));
                canvas.restore();
                GOWeatherWallpaperService.l(a).a(canvas, d);
            }
            Exception exception1;
            try
            {
                surfaceholder.unlockCanvasAndPost(canvas);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        c.removeCallbacks(i);
        l = System.currentTimeMillis() - l;
        if (e && (GOWeatherWallpaperService.c(a) || h > 0))
        {
            if (l < 25L)
            {
                c.postDelayed(i, 25L - l);
                return;
            } else
            {
                c.postDelayed(i, 1L);
                return;
            }
        } else
        {
            c.removeCallbacks(i);
            return;
        }
        exception1;
        exception1.printStackTrace();
          goto _L1
    }

    public void a()
    {
        c.removeCallbacks(i);
        c.post(i);
    }

    public void a(float f1)
    {
        g = ((float)GOWeatherWallpaperService.d(a) - f1) * 0.5F;
    }

    public void a(int j)
    {
        h = j;
    }

    public void a(boolean flag)
    {
        if (e && !flag && h <= 0)
        {
            c.removeCallbacks(i);
            c.post(i);
        }
    }

    public void onCreate(SurfaceHolder surfaceholder)
    {
        super.onCreate(surfaceholder);
        setTouchEventsEnabled(true);
        b = new GestureDetector(a.getApplicationContext(), this);
        d = new Paint();
        d.setAntiAlias(true);
        d.setAlpha(255);
        h = 20;
        if (!GOWeatherWallpaperService.a(a) && !isPreview())
        {
            GOWeatherWallpaperService.a(a, true);
            surfaceholder = a.getApplicationContext();
            if (com.gau.go.launcherex.goweather.livewallpaper.b.h.c(surfaceholder))
            {
                com.gau.go.launcherex.goweather.livewallpaper.b.h.b(surfaceholder);
            }
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        c.removeCallbacks(i);
    }

    public boolean onDown(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        return false;
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    public void onOffsetsChanged(float f1, float f2, float f3, float f4, int j, int k)
    {
        i l = GOWeatherWallpaperService.b(a).b();
        if (l != null && !isPreview() && !GOWeatherWallpaperService.p(a) && !f)
        {
            g = (float)(GOWeatherWallpaperService.d(a) - l.a()) * f1;
            a(GOWeatherWallpaperService.c(a));
            GOWeatherWallpaperService.q(a);
        }
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        return false;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return false;
    }

    public void onSurfaceChanged(SurfaceHolder surfaceholder, int j, int k, int l)
    {
        if (k > 0 && l > 0 && (GOWeatherWallpaperService.m(a) != k || GOWeatherWallpaperService.n(a) != l) || f != GOWeatherWallpaperService.f(a))
        {
            if (k < l)
            {
                f = false;
            } else
            {
                f = true;
            }
            GOWeatherWallpaperService.a(a, k);
            GOWeatherWallpaperService.b(a, l);
            GOWeatherWallpaperService.a(a, k, l);
            if (!GOWeatherWallpaperService.c(a))
            {
                h = 20;
            } else
            {
                h = 0;
            }
            if (e && !GOWeatherWallpaperService.c(a))
            {
                a();
            }
        }
    }

    public void onSurfaceCreated(SurfaceHolder surfaceholder)
    {
        super.onSurfaceCreated(surfaceholder);
        b();
    }

    public void onSurfaceDestroyed(SurfaceHolder surfaceholder)
    {
        super.onSurfaceDestroyed(surfaceholder);
        e = false;
        c.removeCallbacks(i);
        GOWeatherWallpaperService.o(a).remove(this);
    }

    public void onTouchEvent(MotionEvent motionevent)
    {
        super.onTouchEvent(motionevent);
        b.onTouchEvent(motionevent);
    }

    public void onVisibilityChanged(boolean flag)
    {
        super.onVisibilityChanged(flag);
        e = flag;
        if (flag)
        {
            int j;
            if (!GOWeatherWallpaperService.c(a))
            {
                j = 20;
            } else
            {
                j = 0;
            }
            h = j;
            b();
            GOWeatherWallpaperService.b(a).d();
            return;
        } else
        {
            c.removeCallbacks(i);
            GOWeatherWallpaperService.b(a).e();
            return;
        }
    }
}
