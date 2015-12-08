// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.service.wallpaper.WallpaperService;
import android.util.DisplayMetrics;
import com.gau.go.launcherex.goweather.livewallpaper.b.a;
import com.gau.go.launcherex.goweather.livewallpaper.b.b;
import com.gau.go.launcherex.goweather.livewallpaper.b.c;
import com.gau.go.launcherex.goweather.livewallpaper.b.d;
import com.gau.go.launcherex.goweather.livewallpaper.b.e;
import com.gau.go.launcherex.goweather.livewallpaper.b.f;
import com.gau.go.launcherex.goweather.livewallpaper.b.g;
import com.jiubang.core.a.i;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper:
//            d, p, h, f, 
//            k

public class GOWeatherWallpaperService extends WallpaperService
    implements a, b, c, d, e, f, g
{

    private int a;
    private int b;
    private boolean c;
    private h d;
    private com.gau.go.launcherex.goweather.livewallpaper.f e;
    private p f;
    private k g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private boolean q;
    private ArrayList r;

    public GOWeatherWallpaperService()
    {
        c = false;
        h = true;
        i = true;
        l = 0.0F;
        m = 0.0F;
        n = 0.0F;
        o = 0.0F;
        p = 0.0F;
        q = false;
        r = new ArrayList();
    }

    static int a(GOWeatherWallpaperService goweatherwallpaperservice, int i1)
    {
        goweatherwallpaperservice.j = i1;
        return i1;
    }

    private void a()
    {
        int i1 = 0;
        byte byte0;
        int j1;
        if (!h)
        {
            byte0 = 20;
        } else
        {
            byte0 = 0;
        }
        for (j1 = r.size(); i1 < j1; i1++)
        {
            ((com.gau.go.launcherex.goweather.livewallpaper.d)r.get(i1)).a(byte0);
        }

    }

    private void a(float f1)
    {
        int j1 = r.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((com.gau.go.launcherex.goweather.livewallpaper.d)r.get(i1)).a(f1);
        }

    }

    private void a(int i1, int j1)
    {
        l = (float)i1 * 0.5F;
        m = (float)j1 * 0.5F;
        if (i1 > j1)
        {
            c = true;
            o = (float)(i1 - j1) * 0.5F;
            p = -o;
            n = -90F;
            a = j1;
            b = i1;
            return;
        } else
        {
            c = false;
            o = 0.0F;
            p = 0.0F;
            n = 0.0F;
            a = i1;
            b = j1;
            return;
        }
    }

    static void a(GOWeatherWallpaperService goweatherwallpaperservice, int i1, int j1)
    {
        goweatherwallpaperservice.a(i1, j1);
    }

    static boolean a(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.q;
    }

    static boolean a(GOWeatherWallpaperService goweatherwallpaperservice, boolean flag)
    {
        goweatherwallpaperservice.q = flag;
        return flag;
    }

    static int b(GOWeatherWallpaperService goweatherwallpaperservice, int i1)
    {
        goweatherwallpaperservice.k = i1;
        return i1;
    }

    static com.gau.go.launcherex.goweather.livewallpaper.f b(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.e;
    }

    private void b()
    {
        int j1 = r.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((com.gau.go.launcherex.goweather.livewallpaper.d)r.get(i1)).a();
        }

    }

    private void b(boolean flag)
    {
        int j1 = r.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((com.gau.go.launcherex.goweather.livewallpaper.d)r.get(i1)).a(flag);
        }

    }

    static boolean c(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.h;
    }

    static int d(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.a;
    }

    static int e(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.b;
    }

    static boolean f(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.c;
    }

    static float g(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.n;
    }

    static float h(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.l;
    }

    static float i(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.m;
    }

    static float j(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.o;
    }

    static float k(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.p;
    }

    static p l(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.f;
    }

    static int m(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.j;
    }

    static int n(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.k;
    }

    static ArrayList o(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.r;
    }

    static boolean p(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        return goweatherwallpaperservice.i;
    }

    static void q(GOWeatherWallpaperService goweatherwallpaperservice)
    {
        goweatherwallpaperservice.a();
    }

    public void a(int i1, boolean flag)
    {
        if (f.a(i1, flag))
        {
            b(h);
            a();
        }
    }

    public void a(int i1, boolean flag, boolean flag1)
    {
        d.a(i1, flag, flag1, false);
    }

    public void a(com.gau.go.launcherex.goweather.livewallpaper.a.e e1, com.gau.go.launcherex.goweather.livewallpaper.a.g g1, Resources resources)
    {
        if (f.a(e1, g1, resources))
        {
            a();
        }
    }

    public void a(com.gau.go.launcherex.goweather.livewallpaper.a.e e1, com.gau.go.launcherex.goweather.livewallpaper.a.g g1, com.gau.go.launcherex.goweather.livewallpaper.a.c c1, boolean flag, Resources resources)
    {
        com.gtp.a.a.b.c.a("wallpaper", "GOWeatherWallpaperService.onLoadingWeatherInfoCompleted()");
        f.a(e1, g1, c1, flag, resources);
        a();
    }

    public void a(i i1, boolean flag, int j1, String s)
    {
        float f1 = i1.a();
        if (f1 > (float)a)
        {
            i = false;
        } else
        {
            i = true;
        }
        a(f1);
        if (!h)
        {
            h = true;
            b();
        }
        e.a(i1, flag);
        f.a(j1, g.b(), s);
    }

    public void a(String s)
    {
        d.a(s);
    }

    public void a(boolean flag)
    {
        h = flag;
        a();
    }

    public void a(boolean flag, String s)
    {
        com.gtp.a.a.b.c.a("wallpaper", (new StringBuilder()).append("GOWeatherWallpaperService.onLoadingWeatherInfoCompleted(boolean, String):[isDynamic]=").append(flag).append("|[theme]=").append(s).toString());
        d.a(flag);
        d.a(s);
    }

    public void b(int i1, boolean flag, boolean flag1)
    {
        if (f.a(i1, flag, flag1))
        {
            b(h);
            a();
        }
    }

    public void b(com.gau.go.launcherex.goweather.livewallpaper.a.e e1, com.gau.go.launcherex.goweather.livewallpaper.a.g g1, Resources resources)
    {
        if (f.b(e1, g1, resources))
        {
            a();
        }
    }

    public void b(com.gau.go.launcherex.goweather.livewallpaper.a.e e1, com.gau.go.launcherex.goweather.livewallpaper.a.g g1, com.gau.go.launcherex.goweather.livewallpaper.a.c c1, boolean flag, Resources resources)
    {
        com.gtp.a.a.b.c.a("wallpaper", "GOWeatherWallpaperService.onUpdateWeatherInfo()");
        f.a(e1, g1, c1, flag, resources);
        d.a(e1.i(), c1.d(), flag, false);
        b(h);
        a();
    }

    public void b(String s)
    {
        com.gtp.a.a.b.c.a("wallpaper", (new StringBuilder()).append("onLoadingBackgroundScriptAllCompleted:[packageName]=").append(s).toString());
        g.a(s);
        d.a(g.d().i(), g.c().d(), g.b(), true);
    }

    public void c(com.gau.go.launcherex.goweather.livewallpaper.a.e e1, com.gau.go.launcherex.goweather.livewallpaper.a.g g1, Resources resources)
    {
        f.c(e1, g1, resources);
        b(h);
        a();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1)
        {
            c = false;
            return;
        } else
        {
            c = true;
            return;
        }
    }

    public android.service.wallpaper.WallpaperService.Engine onCreateEngine()
    {
        Object obj = getResources().getDisplayMetrics();
        j = ((DisplayMetrics) (obj)).widthPixels;
        k = ((DisplayMetrics) (obj)).heightPixels;
        a(j, k);
        if (e == null)
        {
            obj = getApplicationContext();
            e = new com.gau.go.launcherex.goweather.livewallpaper.f(this);
            e.a();
            d = new h(((android.content.Context) (obj)), this, this);
            f = new p(((android.content.Context) (obj)));
            g = new k(((android.content.Context) (obj)), this, this, this, this);
            g.a();
        }
        obj = new com.gau.go.launcherex.goweather.livewallpaper.d(this);
        r.add(obj);
        return ((android.service.wallpaper.WallpaperService.Engine) (obj));
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (e != null)
        {
            e.c();
        }
        if (f != null)
        {
            f.a();
        }
        if (g != null)
        {
            g.f();
        }
        if (d != null)
        {
            d.b();
        }
        r.clear();
    }
}
