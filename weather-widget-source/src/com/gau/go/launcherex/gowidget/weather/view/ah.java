// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.u;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            Setting21Activity, VerticalStretchLayout, af

class ah extends BroadcastReceiver
{

    final Setting21Activity a;

    private ah(Setting21Activity setting21activity)
    {
        a = setting21activity;
        super();
    }

    ah(Setting21Activity setting21activity, af af)
    {
        this(setting21activity);
    }

    public void onReceive(Context context, Intent intent)
    {
        int i = 0;
        boolean flag1 = true;
        context = Setting21Activity.b(a).a();
        a.d = ((u) (context)).g;
        int j;
        boolean flag;
        if (a.d == 1)
        {
            Setting21Activity.a(a).setText(Setting21Activity.f(a)[0]);
        } else
        {
            Setting21Activity.a(a).setText(Setting21Activity.f(a)[1]);
        }
        a.a = ((u) (context)).j;
        intent = Setting21Activity.g(a);
        if (a.a == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent.setChecked(flag);
        a.c = ((u) (context)).a;
        intent = Setting21Activity.h(a);
        if (a.c == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent.setChecked(flag);
        if (Setting21Activity.h(a).isChecked())
        {
            Setting21Activity.i(a).b();
        } else
        {
            Setting21Activity.i(a).a();
        }
        intent = a;
        if (a.c == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Setting21Activity.a(intent, flag);
        a.b = ((u) (context)).e;
        j = Setting21Activity.c(a).length;
        do
        {
label0:
            {
                if (i < j)
                {
                    if (a.b != Setting21Activity.c(a)[i])
                    {
                        break label0;
                    }
                    com.gau.go.launcherex.gowidget.weather.view.Setting21Activity.e(a).setText(Setting21Activity.d(a)[i]);
                }
                return;
            }
            i++;
        } while (true);
    }
}
