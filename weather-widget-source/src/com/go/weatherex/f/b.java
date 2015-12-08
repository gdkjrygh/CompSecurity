// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.f;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.d.f;

// Referenced classes of package com.go.weatherex.f:
//            c, a

public class b
{

    private static void a(Context context, int i)
    {
        Toast.makeText(context, i, 1).show();
    }

    public static void a(Context context, String s)
    {
        SharedPreferences sharedpreferences;
        String as[];
        long l;
        sharedpreferences = context.getSharedPreferences("go_ad_statistics_share_prefs", 0);
        String s1 = sharedpreferences.getString(s, null);
        if (TextUtils.isEmpty(s1))
        {
            return;
        }
        as = s1.split("#");
        l = 0L;
        long l1 = Long.parseLong(as[0]);
        l = l1;
_L2:
        String s2 = as[1];
        String s3 = as[2];
        if (System.currentTimeMillis() - l < 0x1b7740L)
        {
            a a1 = new a(183);
            a1.a(s2);
            a1.b("b000");
            a1.f(s3);
            q.a(context.getApplicationContext()).a(a1);
        }
        sharedpreferences.edit().remove(s).commit();
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            (new c(s)).execute(new Void[0]);
            return;
        }
    }

    public static boolean a(Context context)
    {
        boolean flag = true;
        if (!g.a(context))
        {
            a(context, 0x7f0804c4);
            return false;
        }
        if (w.s(context))
        {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.jb.zcamera&referrer=utm_source%3Dgoweather%26utm_medium%3DHyperlink%26utm_campaign%3Dtraffic"));
            try
            {
                intent.setPackage("com.android.vending");
                intent.setFlags(0x10000000);
                context.startActivity(intent);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                flag = false;
            }
        } else
        {
            a(context, 0x7f0804d4);
        }
        return flag;
    }

    public static boolean a(Context context, com.go.weatherex.f.a a1)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = true;
        if (g.a(context)) goto _L2; else goto _L1
_L1:
        a(context, 0x7f0804c4);
_L4:
        return false;
_L2:
        if (a1 == null) goto _L4; else goto _L3
_L3:
        a1.g();
        JVM INSTR tableswitch 1 3: default 56
    //                   1 78
    //                   2 168
    //                   3 239;
           goto _L5 _L6 _L7 _L8
_L5:
        a(context, 0x7f0804c5);
        flag = false;
_L10:
        a(a1.a());
        b(context, a1);
        return flag;
_L6:
        String s;
        if (TextUtils.isEmpty(a1.c()))
        {
            s = (new StringBuilder()).append(context.getText(0x7f0801db).toString()).append(a1.b()).toString();
        } else
        {
            s = a1.c();
        }
        com.gau.go.launcherex.gowidget.download.b.a(context, (new StringBuilder()).append(s).append(".apk").toString(), a1.f(), a1.b(), a1.d());
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L7:
        if (w.s(context))
        {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(a1.f()));
            try
            {
                intent.setPackage("com.android.vending");
                intent.setFlags(0x10000000);
                context.startActivity(intent);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                continue; /* Loop/switch isn't completed */
            }
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        com.gau.go.launcherex.gowidget.weather.globaltheme.a.d(context, a1.f());
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L8:
        com.gau.go.launcherex.gowidget.weather.globaltheme.a.d(context, a1.f());
        flag = flag1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private static void b(Context context, com.go.weatherex.f.a a1)
    {
        a a2 = new a(183);
        a2.a((new StringBuilder()).append(a1.b()).append("").toString());
        a2.b("a000");
        a2.f(a1.e());
        q.a(context.getApplicationContext()).a(a2);
        context = context.getSharedPreferences("go_ad_statistics_share_prefs", 0).edit();
        context.putString(a1.d(), (new StringBuilder()).append(System.currentTimeMillis()).append("#").append(a1.b()).append("#").append(a1.e()).toString());
        context.commit();
    }

    public static boolean b(Context context)
    {
        return GoWidgetApplication.b(context.getApplicationContext()).b();
    }
}
