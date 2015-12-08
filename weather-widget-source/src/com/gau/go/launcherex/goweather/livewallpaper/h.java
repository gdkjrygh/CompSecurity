// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.widget.Toast;
import com.gau.go.launcherex.goweather.livewallpaper.b.a;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.x;
import com.jiubang.core.a.i;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper:
//            a, i, j

public class h
{

    private int a;
    private boolean b;
    private boolean c;
    private com.gau.go.launcherex.goweather.livewallpaper.a d;
    private j e;
    private ExecutorService f;
    private Context g;
    private Handler h;
    private boolean i;
    private a j;
    private x k;

    public h(Context context, a a1, com.gau.go.launcherex.goweather.livewallpaper.b.c c1)
    {
        a = 1;
        b = true;
        c = true;
        g = context;
        d = new com.gau.go.launcherex.goweather.livewallpaper.a(context, c1);
        f = Executors.newFixedThreadPool(1);
        j = a1;
        k = new x(context);
        c();
    }

    private String a(int l, boolean flag, boolean flag1)
    {
        switch (l)
        {
        default:
            if (flag1)
            {
                if (flag)
                {
                    return "wallpaper/weather_dynamicbackground_sunny_day.xml";
                } else
                {
                    return "wallpaper/weather_background_sunny_day.xml";
                }
            }
            break;

        case 2: // '\002'
            if (flag1)
            {
                if (flag)
                {
                    return "wallpaper/weather_dynamicbackground_sunny_day.xml";
                } else
                {
                    return "wallpaper/weather_background_sunny_day.xml";
                }
            }
            if (flag)
            {
                return "wallpaper/weather_dynamicbackground_sunny_night.xml";
            } else
            {
                return "wallpaper/weather_background_sunny_night.xml";
            }

        case 3: // '\003'
            if (flag1)
            {
                if (flag)
                {
                    return "wallpaper/weather_dynamicbackground_cloudy_day.xml";
                } else
                {
                    return "wallpaper/weather_background_cloudy_day.xml";
                }
            }
            if (flag)
            {
                return "wallpaper/weather_dynamicbackground_cloudy_night.xml";
            } else
            {
                return "wallpaper/weather_background_cloudy_night.xml";
            }

        case 4: // '\004'
            if (flag1)
            {
                if (flag)
                {
                    return "wallpaper/weather_dynamicbackground_overcast_day.xml";
                } else
                {
                    return "wallpaper/weather_background_overcast_day.xml";
                }
            }
            if (flag)
            {
                return "wallpaper/weather_dynamicbackground_overcast_night.xml";
            } else
            {
                return "wallpaper/weather_background_overcast_night.xml";
            }

        case 5: // '\005'
            if (flag1)
            {
                if (flag)
                {
                    return "wallpaper/weather_dynamicbackground_snowy_day.xml";
                } else
                {
                    return "wallpaper/weather_background_snowy_day.xml";
                }
            }
            if (flag)
            {
                return "wallpaper/weather_dynamicbackground_snowy_night.xml";
            } else
            {
                return "wallpaper/weather_background_snowy_night.xml";
            }

        case 6: // '\006'
            if (flag1)
            {
                if (flag)
                {
                    return "wallpaper/weather_dynamicbackground_foggy_day.xml";
                } else
                {
                    return "wallpaper/weather_background_foggy_day.xml";
                }
            }
            if (flag)
            {
                return "wallpaper/weather_dynamicbackground_foggy_night.xml";
            } else
            {
                return "wallpaper/weather_background_foggy_night.xml";
            }

        case 7: // '\007'
            if (flag1)
            {
                if (flag)
                {
                    return "wallpaper/weather_dynamicbackground_rainy_day.xml";
                } else
                {
                    return "wallpaper/weather_background_rainy_day.xml";
                }
            }
            if (flag)
            {
                return "wallpaper/weather_dynamicbackground_rainy_night.xml";
            } else
            {
                return "wallpaper/weather_background_rainy_night.xml";
            }

        case 8: // '\b'
            if (flag1)
            {
                if (flag)
                {
                    return "wallpaper/weather_dynamicbackground_thunderstorm_day.xml";
                } else
                {
                    return "wallpaper/weather_background_thunderstorm_day.xml";
                }
            }
            if (flag)
            {
                return "wallpaper/weather_dynamicbackground_thunderstorm_night.xml";
            } else
            {
                return "wallpaper/weather_background_thunderstorm_night.xml";
            }

        case 1: // '\001'
            if (flag1)
            {
                if (flag)
                {
                    return "wallpaper/weather_dynamicbackground_sunny_day.xml";
                } else
                {
                    return "wallpaper/weather_background_sunny_day.xml";
                }
            }
            if (flag)
            {
                return "wallpaper/weather_dynamicbackground_sunny_night.xml";
            } else
            {
                return "wallpaper/weather_background_sunny_night.xml";
            }
        }
        if (flag)
        {
            return "wallpaper/weather_dynamicbackground_sunny_night.xml";
        } else
        {
            return "wallpaper/weather_background_sunny_night.xml";
        }
    }

    private void a(i l, boolean flag)
    {
        c = flag;
        Message message = h.obtainMessage(1);
        message.obj = l;
        h.sendMessage(message);
    }

    static boolean a(h h1)
    {
        return h1.i;
    }

    static boolean b(h h1)
    {
        return h1.c;
    }

    static int c(h h1)
    {
        return h1.a;
    }

    private void c()
    {
        h = new com.gau.go.launcherex.goweather.livewallpaper.i(this);
    }

    static com.gau.go.launcherex.goweather.livewallpaper.a d(h h1)
    {
        return h1.d;
    }

    static a e(h h1)
    {
        return h1.j;
    }

    static Context f(h h1)
    {
        return h1.g;
    }

    static Handler g(h h1)
    {
        return h1.h;
    }

    public void a()
    {
        com.gtp.a.a.b.c.a("wallpaper", (new StringBuilder()).append("setPhotoBackground:[packageName]=").append(d.a()).toString());
        Object obj = g.getResources().getDisplayMetrics();
        int i1 = ((DisplayMetrics) (obj)).widthPixels;
        int l;
        int j1;
        if (com.gtp.a.a.c.c.b(g))
        {
            l = com.gtp.a.a.c.c.a(g);
        } else
        {
            l = ((DisplayMetrics) (obj)).heightPixels;
        }
        if (i1 > l)
        {
            j1 = l;
            l = i1;
        } else
        {
            j1 = i1;
        }
        obj = k.a(j1, l);
        if (obj != null)
        {
            a(((i) (obj)), false);
        }
    }

    public void a(int l, boolean flag, boolean flag1, boolean flag2)
    {
        com.gtp.a.a.b.c.a("wallpaper", (new StringBuilder()).append("setDynamicBg:[packageName]=").append(d.a()).toString());
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(d.a()))
        {
            a();
        } else
        if (a != l || b != flag1 || c != flag || flag2)
        {
            a = l;
            b = flag1;
            c = flag;
            if (e != null)
            {
                e.a(true);
            }
            if (f != null)
            {
                String s = a(a, c, b);
                com.gau.go.launcherex.gowidget.scriptengine.parser.z z = d.a(s);
                if (z == null)
                {
                    Toast.makeText(g, 0x7f0801e8, 0).show();
                    d.c(s);
                    return;
                } else
                {
                    e = new j(this, z, d.a());
                    f.execute(e);
                    return;
                }
            }
        }
    }

    public void a(String s)
    {
        d.b(s);
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    public void b()
    {
        if (e != null)
        {
            e.a(true);
        }
        f.shutdown();
        f = null;
        d.b();
        i = true;
    }
}
