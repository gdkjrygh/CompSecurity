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
//            Setting41Activity, VerticalStretchLayout, ai

class al extends BroadcastReceiver
{

    final Setting41Activity a;

    private al(Setting41Activity setting41activity)
    {
        a = setting41activity;
        super();
    }

    al(Setting41Activity setting41activity, ai ai)
    {
        this(setting41activity);
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = false;
        boolean flag2 = true;
        context = Setting41Activity.b(a).a();
        a.d = ((u) (context)).g;
        int k;
        int l;
        if (a.d == 1)
        {
            Setting41Activity.a(a).setText(Setting41Activity.h(a)[0]);
        } else
        {
            Setting41Activity.a(a).setText(Setting41Activity.h(a)[1]);
        }
        k = ((u) (context)).k;
        l = Setting41Activity.d(a).length;
        for (int i = 0; i < l; i++)
        {
            if (k == Setting41Activity.d(a)[i])
            {
                Setting41Activity.a(a, i);
            }
        }

        Setting41Activity.b(a, Setting41Activity.c(a));
        a.a = ((u) (context)).j;
        intent = Setting41Activity.i(a);
        int j;
        boolean flag1;
        if (a.a == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        intent.setChecked(flag1);
        a.c = ((u) (context)).a;
        intent = Setting41Activity.j(a);
        if (a.c == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        intent.setChecked(flag1);
        if (Setting41Activity.j(a).isChecked())
        {
            Setting41Activity.k(a).b();
        } else
        {
            Setting41Activity.k(a).a();
        }
        intent = a;
        if (a.c == 1)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        Setting41Activity.a(intent, flag1);
        a.b = ((u) (context)).e;
        k = com.gau.go.launcherex.gowidget.weather.view.Setting41Activity.e(a).length;
        j = ((flag) ? 1 : 0);
        do
        {
label0:
            {
                if (j < k)
                {
                    if (a.b != com.gau.go.launcherex.gowidget.weather.view.Setting41Activity.e(a)[j])
                    {
                        break label0;
                    }
                    Setting41Activity.g(a).setText(Setting41Activity.f(a)[j]);
                }
                return;
            }
            j++;
        } while (true);
    }
}
