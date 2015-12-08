// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import com.gau.go.launcherex.goweather.livewallpaper.a.a;
import com.gau.go.launcherex.goweather.livewallpaper.a.b;
import com.gau.go.launcherex.goweather.livewallpaper.a.d;
import com.gau.go.launcherex.goweather.livewallpaper.a.e;
import com.gau.go.launcherex.goweather.livewallpaper.a.f;
import com.gau.go.launcherex.goweather.livewallpaper.a.g;
import com.gau.go.launcherex.goweather.livewallpaper.b.h;
import com.gau.go.launcherex.gowidget.weather.globaltheme.c.c;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import java.util.ArrayList;
import java.util.List;

public class p
{

    private List a;
    private boolean b;
    private Context c;

    public p(Context context)
    {
        c = context;
        a = new ArrayList();
        for (int i = 0; i < 9; i++)
        {
            context = new f();
            a.add(context);
        }

        b = true;
    }

    private float a(Paint paint, float f1)
    {
        paint.setTextSize(f1);
        paint = paint.getFontMetrics();
        return (float)Math.ceil(((android.graphics.Paint.FontMetrics) (paint)).descent - ((android.graphics.Paint.FontMetrics) (paint)).ascent);
    }

    private float a(Paint paint, String s)
    {
        float f1 = 0.0F;
        if (!TextUtils.isEmpty(s))
        {
            f1 = paint.measureText(s);
        }
        return f1;
    }

    private float a(String s, float f1, Paint paint, float f2)
    {
        paint.setTextSize(f2);
        return a(paint, s) + f1;
    }

    private Resources a(Context context, String s)
    {
        try
        {
            s = context.createPackageContext(s, 3);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            s = null;
        }
        if (s != null)
        {
            context = s;
        }
        return context.getResources();
    }

    private String a(int i, float f1, String s)
    {
        switch (i)
        {
        case 2: // '\002'
        default:
            return (new StringBuilder()).append(c.getString(0x7f080291)).append(" : ").append(f1).append(" ").append(c.getString(0x7f080200)).append(" , ").append(s).toString();

        case 1: // '\001'
            return (new StringBuilder()).append(c.getString(0x7f080291)).append(" : ").append(q.c(f1, 1)).append(" ").append(c.getString(0x7f0801ff)).append(" , ").append(s).toString();

        case 4: // '\004'
            return (new StringBuilder()).append(c.getString(0x7f080291)).append(" : ").append(q.e(f1, 1)).append(" ").append(c.getString(0x7f080202)).append(" , ").append(s).toString();

        case 3: // '\003'
            return (new StringBuilder()).append(c.getString(0x7f080291)).append(" : ").append(q.d(f1, 1)).append(" ").append(c.getString(0x7f080201)).append(" , ").append(s).toString();

        case 6: // '\006'
            return (new StringBuilder()).append(c.getString(0x7f080291)).append(" : ").append(q.f(f1, 1)).append(" ").append(c.getString(0x7f080204)).append(" , ").append(s).toString();

        case 5: // '\005'
            return c.getString(0x7f080293, new Object[] {
                s, Integer.valueOf(q.a(f1))
            });
        }
    }

    private String a(g g1, e e1, Resources resources)
    {
        int i = g1.d();
        g1 = e1.g();
        float f1 = e1.h();
        boolean flag = r.a(g1);
        boolean flag1 = r.b(f1);
        if (flag || flag1)
        {
            if (flag1)
            {
                if (flag)
                {
                    return a(i, f1, ((String) (g1)));
                } else
                {
                    return "--";
                }
            } else
            {
                return (new StringBuilder()).append("").append(resources.getString(0x7f080291)).append(" : ").append(g1).toString();
            }
        } else
        {
            return "--";
        }
    }

    private String a(String s, int i)
    {
        if (!r.b(i))
        {
            return "--";
        } else
        {
            return (new StringBuilder()).append(i).append(s).toString();
        }
    }

    private boolean a(boolean flag)
    {
        boolean flag1 = false;
        if (flag != b)
        {
            b = flag;
            flag1 = true;
        }
        return flag1;
    }

    public void a()
    {
        a.clear();
    }

    public void a(int i, boolean flag, String s)
    {
        Resources resources;
        d d1;
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(s))
        {
            resources = c.getResources();
        } else
        {
            resources = a(c, s);
        }
        d1 = new d();
        d1.a(i, flag, resources, s, c.getResources());
        s = (f)a.get(0);
        s.a(d1.a());
        s.b(d1.h());
        s = (f)a.get(1);
        s.a(d1.a());
        s.b(d1.h());
        s = (f)a.get(2);
        s.a(d1.a());
        s.b(d1.h());
        s = (f)a.get(3);
        s.a(d1.e());
        s.b(d1.h());
        s = (f)a.get(4);
        s.a(d1.d());
        s.b(d1.h());
        s = (f)a.get(5);
        s.a(d1.b());
        s.b(d1.f());
        s = (f)a.get(6);
        s.a(d1.d());
        s.b(d1.h());
        s = (f)a.get(7);
        s.a(d1.c());
        s.b(d1.g());
        s = (f)a.get(8);
        s.a(d1.d());
        s.b(d1.h());
    }

    public void a(Canvas canvas, Paint paint)
    {
        b = false;
        if (b)
        {
            int j = a.size();
            for (int i = 0; i < j; i++)
            {
                f f1 = (f)a.get(i);
                if (f1.d())
                {
                    paint.setTextSize(f1.e());
                    paint.setColor(f1.f());
                    paint.setShadowLayer(1.0F, 0.0F, 1.0F, f1.g());
                    canvas.drawText(f1.a(), f1.b(), f1.c(), paint);
                }
            }

            paint.clearShadowLayer();
        }
    }

    public void a(e e1, g g1, com.gau.go.launcherex.goweather.livewallpaper.a.c c1, boolean flag, Resources resources)
    {
        float f1;
        float f9;
        Resources resources1;
        Object obj;
        Object obj1;
        b = c1.c();
        com.gtp.a.a.b.c.a("wallpaper", (new StringBuilder()).append("wallpaperSettingBean.isDisplayInfo(): -- mIsVisible: ").append(b).toString());
        if (b)
        {
            flag = h.d(c);
            com.gtp.a.a.b.c.a("wallpaper", (new StringBuilder()).append("WeatherInfoPanel.init(): -- isScreenLockEnabled: ").append(flag).toString());
            int i = c1.b();
            com.gtp.a.a.b.c.a("wallpaper", (new StringBuilder()).append("WeatherInfoPanel.init(): -- displayTiming: ").append(i).toString());
            if (flag && i == 1 || !flag && i == 2)
            {
                b = false;
            }
        }
        com.gtp.a.a.b.c.a("wallpaper", (new StringBuilder()).append("wallpaperSettingBean.isDisplayInfo()-- after: -- mIsVisible: ").append(b).toString());
        obj = c.getResources();
        resources1 = resources;
        if (resources == null)
        {
            resources1 = ((Resources) (obj));
        }
        resources = c1.b(((Resources) (obj)));
        f9 = resources.a();
        f1 = resources.b();
        obj1 = (f)a.get(0);
        if (e1.a()) goto _L2; else goto _L1
_L1:
        float f2 = resources.n();
        float f6 = a(new Paint(), f2);
        ((f) (obj1)).a(f9, c1.a(((Resources) (obj))) + f6 + f1, f2, resources1.getString(0x7f08021b), true);
        int l = a.size();
        for (int j = 1; j < l; j++)
        {
            ((f)a.get(j)).a(false);
        }

          goto _L3
_L2:
        Paint paint;
        int k;
        float f7 = resources.c();
        paint = new Paint();
        float f3 = a(paint, f7);
        f1 = c1.a(((Resources) (obj))) + f3 + f1;
        ((f) (obj1)).a(f9, f1, f7, e1.d(), true);
        obj1 = g1.b();
        k = g1.c();
        f3 = e1.a(k);
        boolean flag1 = e1.c(f3);
        f1 += resources.d();
        f f14;
        boolean flag3;
        if (flag1)
        {
            f f13 = (f)a.get(1);
            f7 = resources.e();
            float f10 = a(paint, f7);
            f1 += f10;
            obj = String.valueOf(q.a(f3));
            f13.a(f9, f1, f7, ((String) (obj)), true);
            f13 = (f)a.get(2);
            f7 = resources.f();
            f13.a(f9 + a(paint, ((String) (obj))), a(paint, f7) + resources.l() + (f1 - f10), f7, ((String) (obj1)), true);
        } else
        {
            ((f)a.get(1)).a(false);
            ((f)a.get(2)).a(false);
        }
        obj = c1.a();
        f14 = (f)a.get(3);
        flag3 = e1.f();
        if (flag3)
        {
            c1 = e1.e();
        } else
        {
            c1 = resources1.getString(0x7f0801e2);
        }
        flag = ((a) (obj)).a();
        f14.a(flag);
        if (flag)
        {
            f3 = resources.i();
            f1 += a(paint, f3) + resources.g();
            f14.a(f9, f1, f3, c1, flag);
        } else
        {
            float f4 = f1;
            if (flag1)
            {
                f4 = f1 + resources.g();
            }
            f14.a(f9, f4, f7, c1, flag);
            f1 = f4;
        }
        if (flag3 || flag1) goto _L5; else goto _L4
_L4:
        f3 = resources.n();
        f1 = a(paint, f3) + f1;
        f14.b(f1);
        f14.a(f9, f1, f3, resources1.getString(0x7f08021a), true);
        ((f)a.get(4)).a(false);
        ((f)a.get(5)).a(false);
        ((f)a.get(6)).a(false);
        ((f)a.get(7)).a(false);
        ((f)a.get(8)).a(false);
_L3:
        return;
_L5:
        f f15 = (f)a.get(4);
        boolean flag2 = ((a) (obj)).b();
        float f5 = resources.j();
        float f8;
        if (flag2)
        {
            f8 = a(paint, f5);
            float f11;
            float f12;
            if (flag)
            {
                f1 += f8 + resources.h();
            } else
            {
                f1 += f8;
            }
            c1 = resources1.getString(0x7f08028f);
            f15.a(f9, f1, f5, c1, flag2);
            f15 = (f)a.get(5);
            f8 = e1.c(k);
            f11 = f9 + a(paint, ((String) (c1)));
            if (e1.c(f8))
            {
                c1 = a(((String) (obj1)), q.a(f8));
            } else
            {
                c1 = c.getString(0x7f0801e2);
            }
            f15.a(f11, f1, f5, c1, flag2);
            f15 = (f)a.get(6);
            f8 = f11 + a(paint, ((String) (c1)));
            c1 = (new StringBuilder()).append(" ").append(resources1.getString(0x7f080290)).toString();
            f15.a(f8, f1, f5, c1, flag2);
            f15 = (f)a.get(7);
            f11 = a(paint, ((String) (c1)));
            f12 = e1.b(k);
            if (e1.c(f12))
            {
                c1 = a(((String) (obj1)), q.a(f12));
            } else
            {
                c1 = resources1.getString(0x7f0801e2);
            }
            f15.a(f8 + f11, f1, f5, c1, flag2);
            f5 = f1;
        } else
        {
            f15.a(false);
            ((f)a.get(5)).a(false);
            ((f)a.get(6)).a(false);
            ((f)a.get(7)).a(false);
            f5 = f1;
        }
        c1 = (f)a.get(8);
        if (flag2)
        {
            f1 = f5 + resources.m();
        } else
        {
            f1 = f5;
            if (flag)
            {
                f1 = f5 + resources.h();
            }
        }
        f5 = resources.k();
        f8 = a(paint, f5);
        e1 = a(g1, e1, resources1);
        if (e1.equals("--"))
        {
            c1.a(false);
            return;
        } else
        {
            c1.a(f9, f8 + f1, f5, e1, ((a) (obj)).c());
            return;
        }
    }

    public boolean a(int i, boolean flag)
    {
        boolean flag2 = false;
        boolean flag1 = flag2;
        if (flag)
        {
            if (i == 1)
            {
                flag1 = a(true);
            } else
            {
                flag1 = flag2;
                if (i == 2)
                {
                    return a(false);
                }
            }
        }
        return flag1;
    }

    public boolean a(int i, boolean flag, boolean flag1)
    {
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag2 = flag3;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!flag1) goto _L4; else goto _L3
_L3:
        if (i != 1) goto _L6; else goto _L5
_L5:
        flag2 = a(false);
_L2:
        return flag2;
_L6:
        flag2 = flag3;
        if (i == 2)
        {
            return a(true);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (i == 1)
        {
            return a(true);
        }
        flag2 = flag3;
        if (i == 2)
        {
            return a(false);
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public boolean a(e e1, g g1, Resources resources)
    {
        boolean flag = true;
        Resources resources1 = resources;
        if (resources == null)
        {
            resources1 = c.getResources();
        }
        resources = new Paint();
        String s = g1.b();
        int j = g1.c();
        Object obj = (f)a.get(1);
        int i;
        boolean flag1;
        if (((f) (obj)).d())
        {
            g1 = String.valueOf(q.a(e1.a(j)));
            float f1 = ((f) (obj)).b();
            ((f) (obj)).a(g1);
            float f3 = ((f) (obj)).e();
            obj = (f)a.get(2);
            ((f) (obj)).a(a(((String) (g1)), f1, ((Paint) (resources)), f3));
            ((f) (obj)).a(s);
            i = 2;
        } else
        {
            i = 1;
            flag = false;
        }
        i += 3;
        obj = (f)a.get(i);
        flag1 = flag;
        if (((f) (obj)).d())
        {
            resources.setTextSize(((f) (obj)).e());
            float f2 = ((f) (obj)).b();
            float f4 = e1.c(j);
            float f5;
            String s1;
            if (e1.c(f4))
            {
                g1 = a(s, q.a(f4));
            } else
            {
                g1 = resources1.getString(0x7f0801e2);
            }
            ((f) (obj)).a(g1);
            obj = a;
            i++;
            obj = (f)((List) (obj)).get(i);
            f4 = a(((Paint) (resources)), ((String) (g1)));
            s1 = ((f) (obj)).a();
            f2 = f4 + f2;
            ((f) (obj)).a(f2);
            g1 = (f)a.get(i + 1);
            f4 = a(((Paint) (resources)), s1);
            f5 = e1.b(j);
            if (e1.c(f5))
            {
                e1 = a(s, q.a(f5));
            } else
            {
                e1 = resources1.getString(0x7f0801e2);
            }
            g1.a(f4 + f2);
            g1.a(e1);
            flag1 = flag | true;
        }
        return flag1;
    }

    public boolean b(e e1, g g1, Resources resources)
    {
        int i = a.size();
        f f1 = (f)a.get(i - 1);
        if (f1.d())
        {
            e1 = a(g1, e1, resources);
            if ("--".equals(e1))
            {
                f1.a(false);
            } else
            {
                f1.a(e1);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void c(e e1, g g1, Resources resources)
    {
        f f3 = (f)a.get(4);
        String s = resources.getString(0x7f08028f);
        float f1 = f3.b();
        f3.a(s);
        Paint paint = new Paint();
        paint.setTextSize(f3.e());
        float f2 = a(paint, s);
        f3 = (f)a.get(5);
        s = f3.a();
        f1 = f2 + f1;
        f3.a(f1);
        f1 += a(paint, s);
        f3 = (f)a.get(6);
        s = (new StringBuilder()).append(" ").append(resources.getString(0x7f080290)).toString();
        f3.a(s);
        f3.a(f1);
        f2 = a(paint, s);
        ((f)a.get(7)).a(f1 + f2);
        ((f)a.get(8)).a(a(g1, e1, resources));
    }
}
