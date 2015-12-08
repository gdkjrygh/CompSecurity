// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.common;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.go.weatherex.messagecenter.n;
import com.jiubang.core.b.a;

// Referenced classes of package com.go.weatherex.common:
//            f

public class e
{

    private static e a;
    private Context b;
    private AlarmManager c;
    private f d;

    private e(Context context)
    {
        b = context;
        c = (AlarmManager)context.getSystemService("alarm");
        b();
    }

    private long a(String s)
    {
        long l = 0L;
        SharedPreferences sharedpreferences = GoWidgetApplication.c(b).a();
        if (sharedpreferences != null)
        {
            l = sharedpreferences.getLong(s, 0L);
        }
        return l;
    }

    static Context a(e e1)
    {
        return e1.b;
    }

    public static e a(Context context)
    {
        com/go/weatherex/common/e;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new e(context);
        }
        context = a;
        com/go/weatherex/common/e;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static void a(e e1, boolean flag)
    {
        e1.a(flag);
    }

    private void a(String s, long l)
    {
        SharedPreferences sharedpreferences = GoWidgetApplication.c(b).a();
        if (sharedpreferences != null)
        {
            sharedpreferences.edit().putLong(s, l).commit();
        }
    }

    private void a(boolean flag)
    {
        String s = "key_photo_notification_check_wifi_time";
        n.a(b).a();
        JVM INSTR tableswitch 1 2: default 36
    //                   1 48
    //                   2 54;
           goto _L1 _L2 _L3
_L1:
        a(flag, 0x1b7740L, s, "com.go.weatherex.CHECK_WIFI_FOR_MESSAGE_CENTER");
        return;
_L2:
        s = "key_photo_notification_check_wifi_time";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "key_handle_message_check_wifi_time";
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(boolean flag, long l, String s, String s1)
    {
        long l1 = System.currentTimeMillis();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        a(s, l1);
        long l2 = a(s);
        if (l2 == 0L)
        {
            l = 0L;
        } else
        if (l1 - l2 >= l)
        {
            l = 0L;
        } else
        {
            l -= l1 - l2;
        }
        s = new Intent(s1);
        if (l == 0L)
        {
            try
            {
                b.sendBroadcast(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_101;
        }
        l1 = System.currentTimeMillis();
        s = PendingIntent.getBroadcast(b, 0, s, 0);
        c.set(0, l + l1, s);
        return;
    }

    private void b()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.go.weatherex.CHECK_WIFI_FOR_MESSAGE_CENTER");
        b.registerReceiver(d, intentfilter);
    }

    public void a()
    {
        if (d != null)
        {
            b.unregisterReceiver(d);
            d = null;
        }
    }
}
