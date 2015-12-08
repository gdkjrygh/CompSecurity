// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.gcm;

import android.app.AlarmManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.jiubang.core.b.a;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.gcm:
//            b, e, d

class c extends BroadcastReceiver
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY")) goto _L2; else goto _L1
_L1:
        context = GoWidgetApplication.c(com.gau.go.launcherex.gowidget.gcm.b.a(a).getApplicationContext()).a();
        intent = context.getString("gcm_cur_reg_id", null);
        if (intent == null || intent.length() <= 0) goto _L4; else goto _L3
_L3:
        boolean flag;
        boolean flag1;
        flag = context.getBoolean("language_changed", true);
        flag1 = context.getBoolean("city_list_changed", false);
        if (!flag) goto _L6; else goto _L5
_L5:
        context.edit().putBoolean("language_changed", false).commit();
        a.a(intent, intent, flag1);
        if (flag1)
        {
            context.edit().putBoolean("city_list_changed", false).commit();
        }
_L8:
        return;
_L6:
        if (flag1)
        {
            context.edit().putBoolean("city_list_changed", false).commit();
            if (f.a(com.gau.go.launcherex.gowidget.gcm.b.a(a)).e() > 0)
            {
                a.b();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        a.c();
        return;
_L2:
        if (!context.equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!intent.getBooleanExtra("noConnectivity", false))
        {
            b.e(a).cancel(b.d(a));
            a.a();
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_GCM_OPERATION"))
        {
            intent = intent.getStringExtra("extra_gcm_id");
            if (intent != null && !intent.equals(""))
            {
                int i;
                if (b.b(a).size() > 0)
                {
                    context = (e)b.b(a).get(0);
                } else
                {
                    context = new e(a, 1);
                    b.b(a).add(context);
                }
                context.c = intent;
                intent = (new StringBuilder()).append("http://goweathergcm.goforandroid.com:8099/gcmServer/alarm/registry?regId=").append(intent).append("&").append("lang").append("=").append(w.k(com.gau.go.launcherex.gowidget.gcm.b.a(a))).append("&").append("region").append("=").append(com.gau.go.launcherex.gowidget.gcm.b.f(a)).append("&").append("is_paid_user").append("=");
                if (GoWidgetApplication.b(com.gau.go.launcherex.gowidget.gcm.b.a(a)).b())
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                context.a = intent.append(i).toString();
                (new d(a)).execute(new e[] {
                    context
                });
                return;
            } else
            {
                com.gau.go.launcherex.gowidget.gcm.b.a(a, false);
                b.c(a);
                return;
            }
        }
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_GCM_UPDATE_REG_ID"))
        {
            break; /* Loop/switch isn't completed */
        }
        context = intent.getStringExtra("extra_old_reg_id");
        intent = intent.getStringExtra("extra_cur_reg_id");
        if (context != null && context.length() > 0 && intent != null && intent.length() > 0)
        {
            b.e(a).cancel(b.d(a));
            a.a(intent, context, false);
            return;
        }
        if (true) goto _L8; else goto _L9
_L9:
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LAUNCH_GCM_TASKS"))
        {
            continue; /* Loop/switch isn't completed */
        }
        b.e(a).cancel(b.d(a));
        if (g.a(com.gau.go.launcherex.gowidget.gcm.b.a(a)))
        {
            a.a();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!context.equals("android.intent.action.LOCALE_CHANGED")) goto _L8; else goto _L10
_L10:
        context = GoWidgetApplication.c(com.gau.go.launcherex.gowidget.gcm.b.a(a).getApplicationContext()).a();
        context.edit().putBoolean("language_changed", true).commit();
        context = context.getString("gcm_cur_reg_id", null);
        if (!TextUtils.isEmpty(context))
        {
            a.a(context, context, false);
            return;
        }
        if (true) goto _L8; else goto _L11
_L11:
    }
}
