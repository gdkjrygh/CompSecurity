// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.jiubang.goweather.a.a;
import com.jiubang.goweather.a.h;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import com.jiubang.goweather.b.g;
import com.jiubang.goweather.c.j;
import com.jiubang.goweather.c.l;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            n, o, q, p

public class m
{

    private static m a;
    private j b;
    private com.gau.go.launcherex.gowidget.weather.util.f c;
    private q d;
    private p e;
    private Context f;
    private long g;
    private final l h = new n(this);
    private final BroadcastReceiver i = new o(this);

    private m(Context context)
    {
        f = context.getApplicationContext();
        b = new j(f);
        b.a(h);
        c = com.gau.go.launcherex.gowidget.weather.c.c.a(f).h();
        d = new q();
        context = new IntentFilter();
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED");
        f.registerReceiver(i, context);
    }

    static long a(m m1, long l)
    {
        m1.g = l;
        return l;
    }

    static q a(m m1)
    {
        return m1.d;
    }

    static q a(m m1, q q1)
    {
        m1.d = q1;
        return q1;
    }

    private String a(Context context, Location location, String s)
    {
        e e1;
        double d1 = location.getLongitude();
        double d2 = location.getLatitude();
        if (w.p(context))
        {
            location = "http://ditu.google.com/maps/api/geocode/json";
        } else
        {
            location = "http://maps.google.com/maps/api/geocode/json";
        }
        e1 = new e(location, 7000, 7000);
        e1.a("latlng", (new StringBuilder()).append(String.valueOf(d2)).append(",").append(String.valueOf(d1)).toString());
        e1.a("sensor", "false");
        e1.a("language", s);
        e1.a(true);
        s = new f();
        try
        {
            location = e1.i();
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            if (com.gtp.a.a.b.c.a())
            {
                location.printStackTrace();
            }
            location = null;
        }
        if (!TextUtils.isEmpty(location)) goto _L2; else goto _L1
_L1:
        com.jiubang.goweather.b.c c1;
        return null;
_L2:
        if (!(c1 = com.jiubang.goweather.b.d.a()).a(s, context) || TextUtils.isEmpty(context = c1.b(location, e1, s)))
        {
            continue; /* Loop/switch isn't completed */
        }
        context = a(((String) (context)));
        return context;
        context;
        if (com.gtp.a.a.b.c.a())
        {
            context.printStackTrace();
            return null;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static String a(m m1, Context context, Location location, String s)
    {
        return m1.a(context, location, s);
    }

    private String a(String s)
    {
        HashMap hashmap = new HashMap();
        s = new JSONObject(s);
        if ("OK".equalsIgnoreCase(s.getString("status")))
        {
            s = s.getJSONArray("results");
            int i1 = s.length();
            int k = 0;
            do
            {
                if (k >= i1)
                {
                    break;
                }
                JSONObject jsonobject = s.getJSONObject(k);
                JSONArray jsonarray = jsonobject.getJSONArray("types");
                int l = 0;
                while (l < jsonarray.length()) 
                {
                    String s3 = jsonarray.getString(l);
                    if ("sublocality".equalsIgnoreCase(s3))
                    {
                        hashmap.put("sublocality", jsonobject.optString("formatted_address", ""));
                    } else
                    if ("locality".equalsIgnoreCase(s3))
                    {
                        hashmap.put("locality", jsonobject.optString("formatted_address", ""));
                    } else
                    if ("street_address".equalsIgnoreCase(s3))
                    {
                        hashmap.put("street_address", jsonobject.optString("formatted_address", ""));
                    }
                    l++;
                }
                k++;
            } while (true);
        }
        s = (String)hashmap.get("street_address");
        if (TextUtils.isEmpty(s))
        {
            String s1 = (String)hashmap.get("sublocality");
            s = s1;
            if (TextUtils.isEmpty(s1))
            {
                String s2 = (String)hashmap.get("locality");
                s = s2;
                if (TextUtils.isEmpty(s2))
                {
                    return null;
                }
            }
        }
        return s;
    }

    public static void a()
    {
        c().e();
    }

    public static void a(Context context)
    {
        if (a == null)
        {
            a = new m(context);
        }
    }

    private void a(Location location)
    {
        com.gtp.go.weather.sharephoto.takephoto.q.a(d, location);
        if (e != null)
        {
            e.cancel(true);
        }
        e = new p(this, null);
        e.execute(new Location[] {
            location
        });
    }

    static void a(m m1, Location location)
    {
        m1.a(location);
    }

    private WeatherBean b(Location location)
    {
        Object obj = new e("http://goweatherex.3g.cn/goweatherex/weather/getNearestWeather");
        com.jiubang.goweather.b.g.a(f, ((e) (obj)));
        ((e) (obj)).a("latlng", (new StringBuilder()).append(location.getLatitude()).append(",").append(location.getLongitude()).toString());
        ((e) (obj)).a("h", "24");
        try
        {
            location = ((e) (obj)).i();
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            if (com.gtp.a.a.b.c.a())
            {
                location.printStackTrace();
            }
            location = null;
        }
        if (location == null)
        {
            return null;
        }
        f f1 = new f();
        com.jiubang.goweather.b.c c1 = com.jiubang.goweather.b.d.a(true);
        if (c1.a(f1, f))
        {
            f1.d(1);
            f1.b(c1.b(location, ((e) (obj)), f1));
        } else
        {
            f1.b(11);
            f1.c(3);
        }
        obj = new ArrayList();
        if (!TextUtils.isEmpty(f1.l()))
        {
            ((ArrayList) (obj)).add(new a("", "", 0L));
            (new h(((ArrayList) (obj)))).a(f1.l(), f1, location, f);
        }
        if (f1.c() == 1)
        {
            obj = (a)((ArrayList) (obj)).get(0);
            location = new WeatherBean();
            location.j();
            location.g();
            location.h();
            location.a(((a) (obj)), "");
        } else
        {
            location = null;
        }
        return location;
    }

    static WeatherBean b(m m1, Location location)
    {
        return m1.b(location);
    }

    public static q b()
    {
        return c().d();
    }

    static void b(m m1)
    {
        m1.e();
    }

    static Context c(m m1)
    {
        return m1.f;
    }

    private static m c()
    {
        if (a == null)
        {
            throw new IllegalStateException("Did you forget to call PhotoLocationHandler.initSingleton(Context)?");
        } else
        {
            return a;
        }
    }

    private q d()
    {
        if (com.gtp.go.weather.sharephoto.takephoto.q.a(d) == null)
        {
            ArrayList arraylist = c.d();
            if (arraylist.size() > 0)
            {
                com.gtp.go.weather.sharephoto.takephoto.q.a(d, (WeatherBean)arraylist.get(0));
            }
        }
        return d;
    }

    private void e()
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (SystemClock.elapsedRealtime() - g > 0x1b7740L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                flag = flag1;
                if (com.gtp.go.weather.sharephoto.takephoto.q.a(d) != null)
                {
                    break label0;
                }
            }
            flag = true;
        }
        if (flag)
        {
            b.a();
        }
    }
}
