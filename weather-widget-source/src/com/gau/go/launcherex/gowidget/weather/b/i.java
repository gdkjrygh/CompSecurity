// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.go.weatherex.wear.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            j

public class i
{

    private Context a;
    private NotificationManager b;
    private HashMap c;
    private j d;
    private com.gau.go.launcherex.gowidget.weather.util.f e;
    private e f;
    private u g;
    private HashMap h;

    public i(Context context)
    {
        h = new HashMap();
        a = context;
        b = (NotificationManager)a.getSystemService("notification");
        Object obj = com.gau.go.launcherex.gowidget.weather.c.c.a(a.getApplicationContext());
        e = ((c) (obj)).h();
        f = ((c) (obj)).f();
        g = f.a();
        c = new HashMap();
        d = new j(this);
        obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_UPDATE_EXTREME_WEATHER");
        ((IntentFilter) (obj)).addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_EXPIRED_EXTREME_WEATHER");
        ((IntentFilter) (obj)).addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CLEAR_EXTREME_WEATHER");
        ((IntentFilter) (obj)).addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION");
        context.registerReceiver(d, ((IntentFilter) (obj)));
    }

    private PendingIntent a(long l, String s)
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
        intent.putExtra("notify_request", 3);
        intent.putExtra("notify_extra_warn_type", "notify_extra_warn_touch");
        intent.putExtra("cityId", s);
        intent.putExtra("notify_extra_warn_notifyid", l);
        return PendingIntent.getService(a, (int)(17L + l), intent, 0x8000000);
    }

    private RemoteViews a(String s, String s1, String s2)
    {
        RemoteViews remoteviews = new RemoteViews(a.getPackageName(), 0x7f0300d9);
        remoteviews.setTextViewText(0x7f090478, s);
        remoteviews.setImageViewResource(0x7f090473, 0x7f020390);
        remoteviews.setViewVisibility(0x7f090477, 0);
        remoteviews.setTextViewText(0x7f090477, a(s1, s2));
        if (g.C.equals("notification_style_default"))
        {
            d();
        }
        s = a.getResources();
        if (g.C.equals("notification_style_default_black"))
        {
            remoteviews.setTextColor(0x7f090477, s.getColor(0x7f0a005e));
            remoteviews.setTextColor(0x7f090478, s.getColor(0x7f0a005f));
        } else
        if (g.C.equals("notification_style_default_white"))
        {
            remoteviews.setTextColor(0x7f090477, s.getColor(0x7f0a0061));
            remoteviews.setTextColor(0x7f090478, s.getColor(0x7f0a0062));
            return remoteviews;
        }
        return remoteviews;
    }

    static u a(i k)
    {
        return k.g;
    }

    private String a(String s, String s1)
    {
        if (com.go.weatherex.wear.f.a(a))
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s).append(" \u2014 ").append(s1).toString();
        }
    }

    private void a(long l, String s, String s1, String s2, boolean flag)
    {
        if (!TextUtils.isEmpty(s) && l != 0L && !TextUtils.isEmpty(s1))
        {
            String s3 = "";
            WeatherBean weatherbean = e.a(s);
            String s4 = s1;
            if (weatherbean != null)
            {
                String s5 = weatherbean.d();
                Map map = weatherbean.n();
                s3 = s5;
                s4 = s1;
                if (map != null)
                {
                    s3 = s5;
                    s4 = s1;
                    if (map.size() > 1)
                    {
                        s4 = (new StringBuilder()).append(s1).append(" (").append(weatherbean.n().size()).append(")").toString();
                        s3 = s5;
                    }
                }
            }
            if (g.t != 0)
            {
                s1 = (new android.support.v4.app.NotificationCompat.Builder(a)).setAutoCancel(true).setOnlyAlertOnce(true);
                byte byte0;
                if (flag)
                {
                    byte0 = -1;
                } else
                {
                    byte0 = 6;
                }
                s = s1.setDefaults(byte0).setSmallIcon(0x7f020391).setContent(a(s4, s3, s2)).setContentIntent(a(l, s)).setDeleteIntent(c(l));
                s1 = new android.support.v4.app.NotificationCompat.WearableExtender();
                s1.setBackground(BitmapFactory.decodeResource(a.getResources(), 0x7f020612));
                s.extend(s1);
                b.notify("com.gau.go.launcherex.gowidget.weather.handler.NotifyWarnHandler", (int)l, s.build());
                return;
            }
        }
    }

    static void a(i k, long l)
    {
        k.b(l);
    }

    static void a(i k, HashMap hashmap, boolean flag)
    {
        k.a(hashmap, flag);
    }

    private void a(HashMap hashmap, boolean flag)
    {
        if (hashmap == null || hashmap.isEmpty()) goto _L2; else goto _L1
_L1:
        Iterator iterator = hashmap.entrySet().iterator();
_L3:
        Object obj;
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (java.util.Map.Entry)iterator.next();
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = (String)((java.util.Map.Entry) (obj)).getKey();
        if (TextUtils.isEmpty(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        Iterator iterator1 = ((ArrayList)hashmap.get(s)).iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_201;
            }
            obj = (com.gau.go.launcherex.gowidget.weather.model.c)iterator1.next();
        } while (obj == null || !((com.gau.go.launcherex.gowidget.weather.model.c) (obj)).l());
_L4:
        if (obj != null)
        {
            String s1 = ((com.gau.go.launcherex.gowidget.weather.model.c) (obj)).f();
            obj = ((com.gau.go.launcherex.gowidget.weather.model.c) (obj)).i();
            long l;
            if (h.containsKey(s))
            {
                l = ((Long)h.get(s)).longValue();
            } else
            {
                l = System.currentTimeMillis();
                h.put(s, Long.valueOf(l));
            }
            b(l);
            a(l, s, s1, ((String) (obj)), flag);
        }
        if (true) goto _L3; else goto _L2
_L2:
        return;
        obj = null;
          goto _L4
    }

    static com.gau.go.launcherex.gowidget.weather.util.f b(i k)
    {
        return k.e;
    }

    private void b(long l)
    {
        if (b != null)
        {
            b.cancel("com.gau.go.launcherex.gowidget.weather.handler.NotifyWarnHandler", (int)l);
        }
    }

    private PendingIntent c(long l)
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
        intent.putExtra("notify_request", 3);
        intent.putExtra("notify_extra_warn_type", "notify_extra_warn_delete");
        return PendingIntent.getService(a, (int)(34L + l), intent, 0x8000000);
    }

    static HashMap c(i k)
    {
        return k.c;
    }

    static Context d(i k)
    {
        return k.a;
    }

    private void d()
    {
        TypedArray typedarray = a.obtainStyledAttributes(0x1030068, new int[] {
            0x1010098
        });
        int k = typedarray.getColor(0, 0);
        typedarray.recycle();
        if ((0xffffff & k) < 0x7fffff)
        {
            g.C = "notification_style_default_white";
        } else
        {
            g.C = "notification_style_default_black";
        }
        f.a("notification_style", g.C);
    }

    static HashMap e(i k)
    {
        return k.h;
    }

    public void a()
    {
        if (h != null && !h.isEmpty())
        {
            Iterator iterator = h.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (entry != null)
                {
                    long l = ((Long)entry.getValue()).longValue();
                    if (l != 0L)
                    {
                        b(l);
                    }
                }
            } while (true);
        }
    }

    public void a(long l)
    {
        if (l == 0L) goto _L2; else goto _L1
_L1:
        if (h.isEmpty()) goto _L4; else goto _L3
_L3:
        Object obj = h.entrySet().iterator();
_L7:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L5
_L5:
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        if (entry == null || ((Long)entry.getValue()).longValue() != l) goto _L7; else goto _L6
_L6:
        obj = (String)entry.getKey();
_L9:
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            if (!h.isEmpty())
            {
                h.remove(obj);
            }
            if (!c.isEmpty())
            {
                c.remove(obj);
            }
        }
_L2:
        return;
_L4:
        obj = "";
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void b()
    {
        if (!c.isEmpty())
        {
            c.clear();
        }
        if (!h.isEmpty())
        {
            h.clear();
        }
    }

    public void c()
    {
        a.unregisterReceiver(d);
        a();
        b();
        if (b != null)
        {
            b = null;
        }
    }
}
