// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.framework.fragment.a;

// Referenced classes of package com.go.weatherex.g:
//            s, a

public class g extends a
{

    public g()
    {
    }

    protected boolean a()
    {
        long l = SystemClock.elapsedRealtime();
        SharedPreferences sharedpreferences = GoWidgetApplication.c(GoWidgetApplication.b()).a();
        if (sharedpreferences != null)
        {
            sharedpreferences.edit().putLong("key_city_fragment_backkey_click_time", l).commit();
        }
        return super.a();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (r.a(getActivity()) == 1)
        {
            a(com/go/weatherex/g/s, null);
            return;
        } else
        {
            a(com/go/weatherex/g/a, null);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030077, viewgroup, false);
    }
}
