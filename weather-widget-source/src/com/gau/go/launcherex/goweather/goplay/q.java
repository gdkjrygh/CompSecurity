// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.go.weatherex.j.aa;
import com.go.weatherex.themestore.WidgetApplyThemeGuideActivity;
import com.jiubang.playsdk.a.a;
import com.jiubang.playsdk.a.a.b;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.main.BitmapBean;
import com.jiubang.playsdk.main.c;
import com.jiubang.playsdk.main.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            b, ThemeDataHandler, ThemeDetailActivity, n

public class q extends c
{

    private int b;
    private int c;
    private String d;
    private final Map e = new HashMap();

    public q()
    {
        a = 84;
        b = 40;
        c = 40;
    }

    public static void d(Context context)
    {
        Intent intent = new Intent("android.intent.action.VIEW_REFRESH");
        intent.addCategory(context.getPackageName());
        context.sendBroadcast(intent);
    }

    public int a()
    {
        return 0;
    }

    public View a(Context context, a a1)
    {
        com.gau.go.launcherex.goweather.goplay.b b1 = (com.gau.go.launcherex.goweather.goplay.b)e.get(context);
        if (b1 != null)
        {
            return b1.a(context, a1);
        } else
        {
            return null;
        }
    }

    public View a(Context context, a a1, e e1)
    {
        com.gau.go.launcherex.goweather.goplay.b b1 = (com.gau.go.launcherex.goweather.goplay.b)e.get(context);
        if (b1 != null)
        {
            return b1.a(context, a1, e1);
        } else
        {
            return null;
        }
    }

    public View a(Context context, e e1)
    {
        com.gau.go.launcherex.goweather.goplay.b b1 = (com.gau.go.launcherex.goweather.goplay.b)e.get(context);
        if (b1 != null)
        {
            return b1.a(context, e1);
        } else
        {
            return null;
        }
    }

    public ArrayList a(Context context, int i1)
    {
        java.util.List list = null;
        if (com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context) == null) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 1 4: default 40
    //                   1 50
    //                   2 68
    //                   3 80
    //                   4 92;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        throw new IllegalArgumentException("bad theme type");
_L4:
        list = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).b(context);
_L2:
        return new ArrayList(list);
_L5:
        list = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).c(context);
        continue; /* Loop/switch isn't completed */
_L6:
        list = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).d(context);
        continue; /* Loop/switch isn't completed */
_L7:
        list = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).e(context);
        if (true) goto _L2; else goto _L8
_L8:
    }

    public void a(Context context, int i1, a a1, com.jiubang.playsdk.main.f f1)
    {
        if (com.gau.go.launcherex.gowidget.weather.c.c.a(context.getApplicationContext()).e().c())
        {
            if (f1 != null)
            {
                f1.a();
            }
        } else
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.j(a1.a(), context.getApplicationContext()))
        {
            if (f1 != null)
            {
                f1.a();
                return;
            }
        } else
        {
            com.go.weatherex.managegood.a.c c1 = com.go.weatherex.managegood.a.c.a();
            c1.a(context, new com.go.weatherex.managegood.b.a(a1.a(), 1, y.a().g(a1.a())));
            c1.a(f1);
            return;
        }
    }

    public void a(Context context, com.jiubang.playsdk.d.e e1)
    {
        Intent intent = new Intent(context, com/gau/go/launcherex/goweather/goplay/ThemeDetailActivity);
        intent.putExtra("extra_key_bean", e1);
        intent.putExtra("extra_key_type", 1);
        context.startActivity(intent);
    }

    public void a(com.gau.go.launcherex.goweather.goplay.b b1)
    {
        if (b1 == null || e.get(b1.b()) != null)
        {
            return;
        } else
        {
            e.put(b1.b(), b1);
            return;
        }
    }

    public void a(String s)
    {
        d = s;
    }

    public boolean a(Context context)
    {
        if (com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context) != null)
        {
            return com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).f(context.getApplicationContext());
        } else
        {
            return false;
        }
    }

    public boolean a(Context context, String s, String s1)
    {
        return super.a(context, s, s1);
    }

    public int b()
    {
        return 0x7f0a0071;
    }

    public BitmapBean b(Context context, a a1)
    {
        if (com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context) != null)
        {
            return com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).a(context.getApplicationContext(), a1);
        } else
        {
            return null;
        }
    }

    public void b(Context context, int i1)
    {
        if (com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context) != null)
        {
            com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).a(context, i1);
        }
    }

    public void b(com.gau.go.launcherex.goweather.goplay.b b1)
    {
        if (b1 == null)
        {
            return;
        } else
        {
            e.remove(b1.b());
            return;
        }
    }

    public boolean b(Context context)
    {
        if (com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context) != null)
        {
            return com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).a();
        } else
        {
            return false;
        }
    }

    public int c()
    {
        return 0x7f020652;
    }

    public String c(Context context)
    {
        return w.w(context);
    }

    public ArrayList c(Context context, a a1)
    {
        ArrayList arraylist = null;
        if (com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context) != null)
        {
            arraylist = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).b(context.getApplicationContext(), a1);
        }
        return arraylist;
    }

    public int d()
    {
        return 0x7f020641;
    }

    public boolean d(Context context, a a1)
    {
        if (com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context) != null)
        {
            return com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).c(context.getApplicationContext(), a1);
        } else
        {
            return false;
        }
    }

    public int e()
    {
        return 0x7f0205a6;
    }

    public boolean e(Context context, a a1)
    {
        if (com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context) != null)
        {
            context = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).a(a1);
            if (context != null)
            {
                return com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(context);
            }
        }
        return false;
    }

    public int f()
    {
        return 0x7f0205b4;
    }

    public boolean f(Context context, a a1)
    {
        if (e(context, a1))
        {
            com.go.weatherex.i.a.a(context, a1.a());
        } else
        if (com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context) != null)
        {
            a1 = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).a(a1);
            if (a1 != null)
            {
                com.gau.go.launcherex.goweather.goplay.b b1 = (com.gau.go.launcherex.goweather.goplay.b)e.get(context);
                if (b1 != null)
                {
                    b1.a().a((Activity)context, a1);
                    aa.a(context, "widget_theme_ts_ap", "4");
                    return true;
                }
            }
        }
        return true;
    }

    public int g()
    {
        return 0x7f02027e;
    }

    public boolean g(Context context, a a1)
    {
        com.gau.go.launcherex.goweather.goplay.n.a(context).a(a1.a(), a1.b(), a1.d(), a1.c());
        return super.g(context, a1);
    }

    public int h()
    {
        return 0x7f0205c4;
    }

    public void h(Context context, a a1)
    {
        Intent intent = new Intent(context, com/gau/go/launcherex/goweather/goplay/ThemeDetailActivity);
        intent.putExtra("extra_key_bean", a1);
        intent.putExtra("extra_key_type", 2);
        intent.putExtra("cityId", d);
        context.startActivity(intent);
    }

    public int i()
    {
        return 0x7f0205a7;
    }

    public void i(Context context, a a1)
    {
        if (com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context) != null)
        {
            com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).d(context, a1);
        }
    }

    public int j()
    {
        return 0x7f0200d4;
    }

    public boolean j(Context context, a a1)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (a1 == null)
            {
                break label0;
            }
            if (a1.h() != 1)
            {
                flag = flag1;
                if (a1.h() != 2)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public b k()
    {
        b b1 = new b();
        b1.b(new int[] {
            1, 3, 2
        });
        b1.a(new int[] {
            40, 41, 39
        });
        b1.c(new int[] {
            0x7f020065, 0x7f020058, 0x7f02025b
        });
        b1.d(new int[] {
            0x7f020066, 0x7f020059, 0x7f02025c
        });
        b1.e(new int[] {
            0x7f0804b9, 0x7f0804bb, 0x7f0804ba
        });
        b1.a(0x7f0a004b);
        b1.b(0x7f0205b5);
        return b1;
    }

    public void k(Context context, a a1)
    {
        context.startActivity(new Intent(context, com/go/weatherex/themestore/WidgetApplyThemeGuideActivity));
    }

    public int l()
    {
        return super.l();
    }

    public int m()
    {
        return super.m();
    }
}
