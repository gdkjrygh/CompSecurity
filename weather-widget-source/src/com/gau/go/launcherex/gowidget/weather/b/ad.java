// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.statistics.x;
import com.jiubang.core.b.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            ab, ac

class ad extends AsyncTask
{

    String a;
    int b;
    final ab c;

    private ad(ab ab1)
    {
        c = ab1;
        super();
        a = "";
        b = 1;
    }

    ad(ab ab1, ac ac)
    {
        this(ab1);
    }

    protected transient String a(String as[])
    {
        try
        {
            as = com.gau.go.launcherex.gowidget.weather.b.ab.a(c).getPackageManager().getPackageInfo(com.gau.go.launcherex.gowidget.weather.b.ab.a(c).getPackageName(), 0);
            a = ((PackageInfo) (as)).versionName;
            if (a == null)
            {
                a = "";
            }
            b = ((PackageInfo) (as)).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            as.printStackTrace();
        }
        return c.a(3, a, b, 1);
    }

    protected void a(String s)
    {
        super.onPostExecute(s);
        if (s != null)
        {
            s = x.a(s);
            if (((x) (s)).a == 2 || ((x) (s)).a == 3 && ((x) (s)).g != w.e(com.gau.go.launcherex.gowidget.weather.b.ab.a(c)))
            {
                android.content.SharedPreferences.Editor editor = GoWidgetApplication.c(com.gau.go.launcherex.gowidget.weather.b.ab.a(c).getApplicationContext()).a().edit();
                editor.putString("version_update", ((x) (s)).b);
                editor.putString("latest_version", ((x) (s)).e);
                editor.putString("update_url", ((x) (s)).c);
                editor.putInt("latest_version_num", ((x) (s)).g);
                editor.commit();
            }
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((String)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
    }
}
