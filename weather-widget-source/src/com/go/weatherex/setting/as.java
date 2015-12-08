// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.CheckBox;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.d.f;

// Referenced classes of package com.go.weatherex.setting:
//            am, an

class as extends BroadcastReceiver
{

    final am a;

    private as(am am1)
    {
        a = am1;
        super();
    }

    as(am am1, an an)
    {
        this(am1);
    }

    public void onReceive(Context context, Intent intent)
    {
        for (context = intent.getAction(); context == null || !context.equals("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE") || !GoWidgetApplication.b(a.getActivity().getApplicationContext()).b() || am.g(a) == null || am.h(a) == null;)
        {
            return;
        }

        if (!am.h(a).isChecked())
        {
            am.h(a).setEnabled(true);
            am.h(a).setClickable(true);
            am.h(a).setChecked(true);
        }
        am.i(a).setVisibility(8);
        am.h(a).setVisibility(0);
    }
}
