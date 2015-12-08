// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.gcm;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gtp.a.a.a.a;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.gcm:
//            e, a, b

class d extends AsyncTask
{

    final b a;
    private e b;

    d(b b1)
    {
        a = b1;
        super();
    }

    protected transient Integer a(e ae[])
    {
        b = ae[0];
        ae = b.a;
        if (ae != null && ae.length() > 0)
        {
            int i = (new com.gau.go.launcherex.gowidget.gcm.a(ae)).a();
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("Url : ").append(ae).append("--- Result : ").append(i).toString(), "gcm_log.txt");
            if (i == 200 || i == 401)
            {
                return Integer.valueOf(1);
            }
        }
        return Integer.valueOf(0);
    }

    protected void a(Integer integer)
    {
        if (integer.intValue() == 1)
        {
            if (b.b == 1)
            {
                integer = GoWidgetApplication.c(com.gau.go.launcherex.gowidget.gcm.b.a(a).getApplicationContext()).a().edit();
                integer.putString("gcm_cur_reg_id", b.c);
                integer.commit();
                com.gau.go.launcherex.gowidget.gcm.b.b(a).remove(b);
                com.gau.go.launcherex.gowidget.gcm.b.a(a, false);
                if (f.a(com.gau.go.launcherex.gowidget.gcm.b.a(a)).e() > 0)
                {
                    a.b();
                }
            } else
            if (b.b == 2)
            {
                integer = GoWidgetApplication.c(com.gau.go.launcherex.gowidget.gcm.b.a(a).getApplicationContext()).a().edit();
                integer.putString("gcm_cur_reg_id", b.c);
                integer.commit();
                com.gau.go.launcherex.gowidget.gcm.b.a(a, false);
                if (b.d)
                {
                    com.gau.go.launcherex.gowidget.gcm.b.b(a).remove(b);
                    if (f.a(com.gau.go.launcherex.gowidget.gcm.b.a(a)).e() > 0)
                    {
                        a.b();
                        return;
                    }
                } else
                {
                    com.gau.go.launcherex.gowidget.gcm.b.a(a, b);
                    return;
                }
            } else
            {
                com.gau.go.launcherex.gowidget.gcm.b.a(a, b);
                return;
            }
            return;
        } else
        if (b.b == 2)
        {
            integer = GoWidgetApplication.c(com.gau.go.launcherex.gowidget.gcm.b.a(a).getApplicationContext()).a().edit();
            integer.remove("gcm_cur_reg_id");
            integer.commit();
            com.gau.go.launcherex.gowidget.gcm.b.a(a, false);
            a.c();
            return;
        } else
        {
            com.gau.go.launcherex.gowidget.gcm.b.a(a, false);
            com.gau.go.launcherex.gowidget.gcm.b.c(a);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((e[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Integer)obj);
    }
}
