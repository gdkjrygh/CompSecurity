// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.jiubang.core.b.a;

// Referenced classes of package com.go.weatherex.home:
//            y

public class x
{

    public x()
    {
    }

    private void a(Activity activity)
    {
        SharedPreferences sharedpreferences = GoWidgetApplication.c(activity.getApplicationContext()).a();
        long l = sharedpreferences.getLong("key_check_extreme_expired_time", 0L);
        l = System.currentTimeMillis() - l;
        if (l < 0L || l > 0xdbba00L)
        {
            activity = f.a(activity.getApplicationContext());
            activity.l();
            activity.k();
            activity = sharedpreferences.edit();
            activity.putLong("key_check_extreme_expired_time", System.currentTimeMillis());
            activity.commit();
        }
    }

    static void a(x x1, Activity activity)
    {
        x1.a(activity);
    }

    public void a(Activity activity, Bundle bundle)
    {
        bundle = c.a(activity.getApplicationContext());
        if (bundle.b())
        {
            a(activity);
            return;
        } else
        {
            bundle.a(new y(this, activity, bundle));
            return;
        }
    }
}
