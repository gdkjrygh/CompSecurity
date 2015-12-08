// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.c.b;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.theme.d;
import com.gau.go.launcherex.gowidget.weather.util.o;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            k, m, l, z, 
//            e, w, n, ac

public class i extends b
{

    public static final int d[] = {
        0x7f020095, 0x7f020099, 0x7f02009a, 0x7f020092, 0x7f020093, 0x7f020096, 0x7f020098, 0x7f020094, 0x7f020097, 0x7f02009b
    };
    public static final int e[] = {
        0x7f020224, 0x7f020228, 0x7f020229, 0x7f020221, 0x7f020222, 0x7f020225, 0x7f020227, 0x7f020223, 0x7f020226, 0x7f02022a
    };
    public static final int f[] = {
        0x7f0205e2, 0x7f0205df, 0x7f0205e0, 0x7f0205d9, 0x7f0205da, 0x7f0205db, 0x7f0205de, 0x7f0205dc, 0x7f0205dd, 0x7f0205e1
    };
    public static int g[] = new int[10];
    ConcurrentHashMap a;
    ConcurrentHashMap b;
    public String c[];
    private String h;
    private Context i;
    private Handler j;
    private ExecutorService k;
    private int l;
    private Resources m;
    private k n;
    private BroadcastReceiver o;
    private boolean p;
    private int q;
    private boolean r;
    private u s;
    private HashMap t;

    public i()
    {
        q = -1;
        r = true;
        c = new String[10];
        t = new HashMap();
    }

    public i(Context context)
    {
        q = -1;
        r = true;
        c = new String[10];
        i = context;
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        h = i.getPackageName();
        c();
        k = Executors.newCachedThreadPool();
        t = new HashMap();
        n = new k(this, null);
        context = new IntentFilter();
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_APP_THEME_CHANGE");
        i.registerReceiver(n, context);
        o = new m(this, null);
        context = new IntentFilter();
        context.addAction("android.intent.action.PACKAGE_REMOVED");
        context.addAction("android.intent.action.PACKAGE_REPLACED");
        context.addDataScheme("package");
        i.registerReceiver(o, context);
    }

    static int a(i i1)
    {
        return i1.q;
    }

    public static String a(int i1, boolean flag, boolean flag1)
    {
        switch (i1)
        {
        default:
            if (flag1)
            {
                if (flag)
                {
                    return "background/weather_dynamicbackground_sunny_day.xml";
                } else
                {
                    return "background/weather_background_sunny_day.xml";
                }
            }
            break;

        case 2: // '\002'
            if (flag1)
            {
                if (flag)
                {
                    return "background/weather_dynamicbackground_sunny_day.xml";
                } else
                {
                    return "background/weather_background_sunny_day.xml";
                }
            }
            if (flag)
            {
                return "background/weather_dynamicbackground_sunny_night.xml";
            } else
            {
                return "background/weather_background_sunny_night.xml";
            }

        case 3: // '\003'
            if (flag1)
            {
                if (flag)
                {
                    return "background/weather_dynamicbackground_cloudy_day.xml";
                } else
                {
                    return "background/weather_background_cloudy_day.xml";
                }
            }
            if (flag)
            {
                return "background/weather_dynamicbackground_cloudy_night.xml";
            } else
            {
                return "background/weather_background_cloudy_night.xml";
            }

        case 4: // '\004'
            if (flag1)
            {
                if (flag)
                {
                    return "background/weather_dynamicbackground_overcast_day.xml";
                } else
                {
                    return "background/weather_background_overcast_day.xml";
                }
            }
            if (flag)
            {
                return "background/weather_dynamicbackground_overcast_night.xml";
            } else
            {
                return "background/weather_background_overcast_night.xml";
            }

        case 5: // '\005'
            if (flag1)
            {
                if (flag)
                {
                    return "background/weather_dynamicbackground_snowy_day.xml";
                } else
                {
                    return "background/weather_background_snowy_day.xml";
                }
            }
            if (flag)
            {
                return "background/weather_dynamicbackground_snowy_night.xml";
            } else
            {
                return "background/weather_background_snowy_night.xml";
            }

        case 6: // '\006'
            if (flag1)
            {
                if (flag)
                {
                    return "background/weather_dynamicbackground_foggy_day.xml";
                } else
                {
                    return "background/weather_background_foggy_day.xml";
                }
            }
            if (flag)
            {
                return "background/weather_dynamicbackground_foggy_night.xml";
            } else
            {
                return "background/weather_background_foggy_night.xml";
            }

        case 7: // '\007'
            if (flag1)
            {
                if (flag)
                {
                    return "background/weather_dynamicbackground_rainy_day.xml";
                } else
                {
                    return "background/weather_background_rainy_day.xml";
                }
            }
            if (flag)
            {
                return "background/weather_dynamicbackground_rainy_night.xml";
            } else
            {
                return "background/weather_background_rainy_night.xml";
            }

        case 8: // '\b'
            if (flag1)
            {
                if (flag)
                {
                    return "background/weather_dynamicbackground_thunderstorm_day.xml";
                } else
                {
                    return "background/weather_background_thunderstorm_day.xml";
                }
            }
            if (flag)
            {
                return "background/weather_dynamicbackground_thunderstorm_night.xml";
            } else
            {
                return "background/weather_background_thunderstorm_night.xml";
            }

        case 1: // '\001'
            if (flag1)
            {
                if (flag)
                {
                    return "background/weather_dynamicbackground_sunny_day.xml";
                } else
                {
                    return "background/weather_background_sunny_day.xml";
                }
            }
            if (flag)
            {
                return "background/weather_dynamicbackground_sunny_night.xml";
            } else
            {
                return "background/weather_background_sunny_night.xml";
            }
        }
        if (flag)
        {
            return "background/weather_dynamicbackground_sunny_night.xml";
        } else
        {
            return "background/weather_background_sunny_night.xml";
        }
    }

    static void a(i i1, int j1)
    {
        i1.a(j1);
    }

    static void a(i i1, String s1)
    {
        i1.e(s1);
    }

    static boolean a(i i1, boolean flag)
    {
        i1.r = flag;
        return flag;
    }

    static int b(i i1)
    {
        return i1.l;
    }

    static int b(i i1, int j1)
    {
        i1.l = j1;
        return j1;
    }

    static ArrayList b(i i1, boolean flag)
    {
        return i1.c(flag);
    }

    static int c(i i1, int j1)
    {
        i1.q = j1;
        return j1;
    }

    private ArrayList c(boolean flag)
    {
        ArrayList arraylist = new ArrayList(28);
        arraylist.add("background/weather_dynamicbackground_sunny_day.xml");
        arraylist.add("background/weather_dynamicbackground_sunny_night.xml");
        arraylist.add("background/weather_dynamicbackground_cloudy_day.xml");
        arraylist.add("background/weather_dynamicbackground_cloudy_night.xml");
        arraylist.add("background/weather_dynamicbackground_overcast_day.xml");
        arraylist.add("background/weather_dynamicbackground_overcast_night.xml");
        arraylist.add("background/weather_dynamicbackground_rainy_day.xml");
        arraylist.add("background/weather_dynamicbackground_rainy_night.xml");
        arraylist.add("background/weather_dynamicbackground_snowy_day.xml");
        arraylist.add("background/weather_dynamicbackground_snowy_night.xml");
        arraylist.add("background/weather_dynamicbackground_foggy_day.xml");
        arraylist.add("background/weather_dynamicbackground_foggy_night.xml");
        arraylist.add("background/weather_dynamicbackground_thunderstorm_day.xml");
        arraylist.add("background/weather_dynamicbackground_thunderstorm_night.xml");
        arraylist.add("background/weather_background_sunny_day.xml");
        arraylist.add("background/weather_background_sunny_night.xml");
        arraylist.add("background/weather_background_cloudy_day.xml");
        arraylist.add("background/weather_background_cloudy_night.xml");
        arraylist.add("background/weather_background_overcast_day.xml");
        arraylist.add("background/weather_background_overcast_night.xml");
        arraylist.add("background/weather_background_rainy_day.xml");
        arraylist.add("background/weather_background_rainy_night.xml");
        arraylist.add("background/weather_background_snowy_day.xml");
        arraylist.add("background/weather_background_snowy_night.xml");
        arraylist.add("background/weather_background_foggy_day.xml");
        arraylist.add("background/weather_background_foggy_night.xml");
        arraylist.add("background/weather_background_thunderstorm_day.xml");
        arraylist.add("background/weather_background_thunderstorm_night.xml");
        return arraylist;
    }

    private void c()
    {
        j = new l(this);
    }

    static boolean c(i i1)
    {
        return i1.r;
    }

    static Context d(i i1)
    {
        return i1.i;
    }

    private void d()
    {
        Message message = Message.obtain();
        message.what = 3;
        j.sendMessageDelayed(message, 100L);
    }

    private void e(String s1)
    {
        h = s1;
    }

    static boolean e(i i1)
    {
        return i1.p;
    }

    static ExecutorService f(i i1)
    {
        return i1.k;
    }

    static String g(i i1)
    {
        return i1.h;
    }

    static Handler h(i i1)
    {
        return i1.j;
    }

    static void i(i i1)
    {
        i1.d();
    }

    public z a(String s1)
    {
        z z2 = (z)a.get(s1);
        z z1 = z2;
        if (z2 == null)
        {
            z1 = z2;
            if (b != null)
            {
                z1 = (z)b.get(s1);
            }
        }
        return z1;
    }

    public String a()
    {
        return h;
    }

    public void a(Context context)
    {
        try
        {
            i = context.getApplicationContext().createPackageContext(h, 2);
            m = i.getResources();
        }
        catch (Exception exception) { }
        if (m == null)
        {
            m = context.getApplicationContext().getResources();
        }
    }

    public void a(o o1)
    {
        boolean flag = true;
        super.a(o1);
        s = com.gau.go.launcherex.gowidget.weather.c.c.a(i).f().a();
        if (s.l != 1)
        {
            flag = false;
        }
        a(flag);
        d(s.d);
        b(i);
    }

    public void a(String s1, ac ac)
    {
        t.put(s1, ac);
    }

    public void a(boolean flag)
    {
        p = flag;
    }

    public void b(Context context)
    {
        a(context);
        Object obj = "main_interface_theme.xml".replace(".xml", "");
        InputStream inputstream = com.gau.go.launcherex.gowidget.weather.theme.d.b(context, h, ((String) (obj)));
        obj = inputstream;
        if (inputstream == null)
        {
            obj = com.gau.go.launcherex.gowidget.weather.theme.d.a(context, h, "main_interface_theme.xml");
        }
        if (obj != null)
        {
            org.xmlpull.v1.XmlPullParser xmlpullparser = com.gau.go.launcherex.gowidget.weather.theme.d.a(((InputStream) (obj)));
            t.clear();
            com.gau.go.launcherex.gowidget.scriptengine.parser.e.a();
            if (xmlpullparser != null)
            {
                (new w()).a(xmlpullparser, com.gau.go.launcherex.gowidget.weather.c.c.a(context).d());
            }
            int i1;
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
            i1 = 0;
            while (i1 < 10) 
            {
                g[i1] = c(c[i1]);
                i1++;
            }
        }
    }

    public void b(String s1)
    {
        q = 5;
        k.execute(new n(this, i, s1, q, false, false));
    }

    public void b(boolean flag)
    {
        p = flag;
        j.sendEmptyMessageDelayed(0, 100L);
    }

    public int c(String s1)
    {
        int i1 = 0;
        if (!TextUtils.isEmpty(s1))
        {
            try
            {
                i1 = m.getIdentifier(s1, "drawable", h);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return 0;
            }
        }
        return i1;
    }

    public void d(String s1)
    {
        h = s1;
        j.sendEmptyMessageDelayed(0, 100L);
    }

}
