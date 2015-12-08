// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.globalview.b;
import com.jiubang.core.b.a;

// Referenced classes of package com.go.weatherex.home:
//            w

public class v
{

    public v()
    {
    }

    private void a(Activity activity)
    {
        SharedPreferences sharedpreferences;
label0:
        {
            sharedpreferences = GoWidgetApplication.c(activity).a();
            long l = sharedpreferences.getLong("update_version_dialog_time", 0L);
            if (System.currentTimeMillis() - l >= 0xf731400L)
            {
                String s = sharedpreferences.getString("latest_version", "");
                String s1 = sharedpreferences.getString("version_update", "");
                String s2 = sharedpreferences.getString("update_url", "");
                int i = sharedpreferences.getInt("latest_version_num", 0);
                String s3 = w.c(activity.getApplicationContext());
                int j = w.e(activity.getApplicationContext());
                if (!s.equals("") && i != 0 && !s2.equals(""))
                {
                    if ((s3.equals(s) || j == i) && (!s3.equals(s) || j == i))
                    {
                        break label0;
                    }
                    a(activity, s1, s2);
                    sharedpreferences.edit().putLong("update_version_dialog_time", System.currentTimeMillis()).commit();
                    sharedpreferences.edit().putBoolean("key_has_new_version", true).commit();
                }
            }
            return;
        }
        sharedpreferences.edit().putBoolean("key_has_new_version", false).commit();
    }

    private void a(Activity activity, String s)
    {
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        try
        {
            s.setPackage("com.android.vending");
            s.addFlags(0x10000000);
            activity.getApplicationContext().startActivity(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Toast.makeText(activity, 0x7f0801df, 0).show();
        }
    }

    private void a(Activity activity, String s, String s1)
    {
        b b1 = new b(activity);
        b1.b(0x7f080267);
        b1.b(s);
        b1.d(0x7f080266);
        b1.a(new com.go.weatherex.home.w(this, activity, s1));
        b1.a();
    }

    static void a(v v1, Activity activity, String s)
    {
        v1.a(activity, s);
    }

    private void b(Activity activity, String s)
    {
        String s1;
        if (s.length() > 2)
        {
            s1 = s.substring(s.lastIndexOf("/") + 1);
        } else
        {
            s1 = s;
        }
        if (s.contains("||"))
        {
            s = s.substring(s.lastIndexOf("||") + 2);
        }
        com.gau.go.launcherex.gowidget.download.b.a(activity.getApplicationContext(), s1, s, 1L, activity.getApplicationContext().getPackageName());
    }

    static void b(v v1, Activity activity, String s)
    {
        v1.b(activity, s);
    }

    public void a(Activity activity, Bundle bundle)
    {
        a(activity);
    }
}
