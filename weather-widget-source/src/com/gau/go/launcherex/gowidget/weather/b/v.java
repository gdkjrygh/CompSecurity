// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.service.NotifyService;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            w

public class v
{

    private Context a;
    private e b;

    public v(Context context)
    {
        a = context.getApplicationContext();
        b = c.a(a).f();
    }

    private void a(ContentValues contentvalues)
    {
        Iterator iterator = contentvalues.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if ("dynamic_bg_switch".equals(s))
            {
                int i;
                if (contentvalues.getAsBoolean(s).booleanValue())
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                b.u(i);
                b.a(WeatherContentProvider.g, "setting_key", "dynamic_bg_switch", "setting_value", i);
            }
        } while (true);
    }

    public static void a(Context context, ContentValues contentvalues)
    {
        Intent intent = new Intent(context, com/gau/go/launcherex/gowidget/weather/service/NotifyService);
        intent.putExtra("notify_request", 52);
        intent.putExtra("settings_contentvalues", contentvalues);
        context.startService(intent);
    }

    static void a(v v1, ContentValues contentvalues)
    {
        v1.a(contentvalues);
    }

    public static boolean a(Context context)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        context = context.getContentResolver().query(WeatherContentProvider.g, new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "dynamic_bg_switch"
        }, null);
        if (context == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        int i;
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        i = context.getInt(context.getColumnIndex("setting_value"));
        if (i == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L4:
        context.close();
_L2:
        return flag;
        Object obj;
        obj;
        flag = flag1;
        if (!com.gtp.a.a.b.c.a()) goto _L4; else goto _L3
_L3:
        ((SQLException) (obj)).printStackTrace();
        flag = flag1;
          goto _L4
        obj;
        context.close();
        throw obj;
    }

    public void a()
    {
    }

    public void a(Intent intent)
    {
        intent = (ContentValues)intent.getParcelableExtra("settings_contentvalues");
        c c1 = c.a(a);
        if (c1.b())
        {
            a(((ContentValues) (intent)));
            return;
        } else
        {
            c1.a(new w(this, intent, c1));
            return;
        }
    }
}
