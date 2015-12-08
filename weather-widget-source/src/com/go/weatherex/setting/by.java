// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.u;

// Referenced classes of package com.go.weatherex.setting:
//            bo

class by extends BroadcastReceiver
{

    final bo a;

    by(bo bo1)
    {
        a = bo1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        bo.c(a, bo.a(a, bo.a(a).a().C));
        bo.g(a).setText(bo.j(a)[bo.k(a)]);
        a.getActivity().unregisterReceiver(this);
        bo.a(a, null);
    }
}
