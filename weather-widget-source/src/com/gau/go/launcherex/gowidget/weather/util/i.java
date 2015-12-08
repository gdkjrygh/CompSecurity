// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.e.b;
import com.gau.go.launcherex.gowidget.weather.e.f;
import com.gau.go.launcherex.gowidget.weather.e.g;
import com.gau.go.launcherex.gowidget.weather.e.o;
import com.gau.go.launcherex.gowidget.weather.e.p;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.jiubang.core.b.a;
import com.jiubang.core.c.j;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.util:
//            f

class i extends j
{

    final com.gau.go.launcherex.gowidget.weather.util.f a;

    public i(com.gau.go.launcherex.gowidget.weather.util.f f1, ContentResolver contentresolver)
    {
        a = f1;
        super(contentresolver);
    }

    protected void a(int k, Object obj, Cursor cursor)
    {
        k;
        JVM INSTR tableswitch 2 9: default 48
    //                   2 49
    //                   3 179
    //                   4 214
    //                   5 249
    //                   6 285
    //                   7 48
    //                   8 48
    //                   9 321;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L1 _L7
_L1:
        return;
_L2:
        if (cursor != null)
        {
            obj = com.gau.go.launcherex.gowidget.weather.util.f.a(a, cursor);
        } else
        {
            obj = null;
        }
        if (!com.gau.go.launcherex.gowidget.weather.util.f.a(a).isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = GoWidgetApplication.c(com.gau.go.launcherex.gowidget.weather.util.f.b(a)).a();
        if (cursor.getBoolean("key_sync_with_golauncher", false))
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = cursor.edit();
        cursor.putBoolean("key_sync_with_golauncher", true);
        cursor.commit();
        k = 1;
_L9:
        if (k == 0 || !f.c(a))
        {
            if (obj != null && !((ArrayList) (obj)).isEmpty())
            {
                f.d(a).a(12, null, "com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", ((ArrayList) (obj)));
                return;
            } else
            {
                com.gau.go.launcherex.gowidget.weather.util.f.e(a);
                return;
            }
        }
        if (true) goto _L1; else goto _L8
_L3:
        if (cursor != null)
        {
            com.gau.go.launcherex.gowidget.weather.util.f.b(a, cursor);
        }
        f.d(a).a(4, null, WeatherContentProvider.b, g.a(), null, null, "cityId");
        return;
_L4:
        if (cursor != null)
        {
            f.c(a, cursor);
        }
        f.d(a).a(5, null, WeatherContentProvider.H, o.a(), null, null, "cityId");
        return;
_L5:
        if (cursor != null)
        {
            a.b(cursor);
        }
        f.d(a).a(6, null, WeatherContentProvider.I, p.a(), null, null, "cityId");
        return;
_L6:
        if (cursor != null)
        {
            a.a(cursor);
        }
        f.d(a).a(9, null, WeatherContentProvider.k, f.a(), null, null, "cityId");
        return;
_L7:
        if (cursor != null)
        {
            f.d(a, cursor);
        }
        com.gau.go.launcherex.gowidget.weather.util.f.a(a, 4);
        return;
_L8:
        k = 0;
          goto _L9
    }

    protected void a(int k, Object obj, Uri uri)
    {
        if (k == 13)
        {
            uri = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_RELOAD_DATA");
            com.gau.go.launcherex.gowidget.weather.util.f.b(a).sendBroadcast(uri);
            uri = com.gau.go.launcherex.gowidget.weather.c.a.c(com.gau.go.launcherex.gowidget.weather.util.f.b(a));
            if (uri[0] != -1)
            {
                k = uri[0] + 1;
                if (com.gau.go.launcherex.gowidget.weather.util.f.f(a).g != k)
                {
                    com.gau.go.launcherex.gowidget.weather.util.f.g(a).a("tempUnit", String.valueOf(k));
                }
            }
            if (uri[1] != -1)
            {
                k = uri[1] + 1;
                if (com.gau.go.launcherex.gowidget.weather.util.f.f(a).k != k)
                {
                    com.gau.go.launcherex.gowidget.weather.util.f.g(a).a("dateStyle", String.valueOf(k));
                }
            }
            if (obj != null)
            {
                obj = (com.jiubang.goweather.a.a)obj;
                a.a(((com.jiubang.goweather.a.a) (obj)).e(), ((com.jiubang.goweather.a.a) (obj)).d(), 0L);
            }
            f.d(a).a(2, null, WeatherContentProvider.a, b.a(), null, null, null);
        }
    }

    protected void a(int k, Object obj, ContentProviderResult acontentproviderresult[])
    {
        if (k == 12)
        {
            obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_RELOAD_DATA");
            com.gau.go.launcherex.gowidget.weather.util.f.b(a).sendBroadcast(((Intent) (obj)));
            com.gau.go.launcherex.gowidget.weather.util.f.e(a);
        } else
        if (k == 11 && obj != null)
        {
            ((com.gtp.go.weather.sharephoto.photo.a)obj).a(null, null);
            return;
        }
    }
}
