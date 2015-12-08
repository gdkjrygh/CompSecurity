// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.jiubang.core.b.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            m, n

class p extends AsyncTask
{

    final m a;

    private p(m m1)
    {
        a = m1;
        super();
    }

    p(m m1, n n)
    {
        this(m1);
    }

    protected transient Boolean a(Void avoid[])
    {
        m.c(a);
        return Boolean.valueOf(m.d(a));
    }

    protected void a(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            boolean1 = GoWidgetApplication.c(m.e(a).getApplicationContext()).a().edit();
            boolean1.putLong("key_camera_plugin_syn_time", System.currentTimeMillis() + 0x5265c00L);
            boolean1.putBoolean("key_camera_plugin_update_have_show", false);
            boolean1.commit();
        }
        com.gau.go.launcherex.gowidget.weather.b.m.a(a, null);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }
}
