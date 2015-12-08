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
//            Setting42Activity, VerticalStretchLayout, am

class aq extends BroadcastReceiver
{

    final Setting42Activity a;

    private aq(Setting42Activity setting42activity)
    {
        a = setting42activity;
        super();
    }

    aq(Setting42Activity setting42activity, am am)
    {
        this(setting42activity);
    }

    public void onReceive(Context context, Intent intent)
    {
        int j;
        boolean flag = false;
        boolean flag2 = true;
        context = Setting42Activity.b(a).a();
        a.c = ((u) (context)).g;
        int k;
        int l;
        if (a.c == 1)
        {
            Setting42Activity.a(a).setText(Setting42Activity.l(a)[0]);
        } else
        {
            Setting42Activity.a(a).setText(Setting42Activity.l(a)[1]);
        }
        k = ((u) (context)).k;
        l = Setting42Activity.d(a).length;
        for (int i = 0; i < l; i++)
        {
            if (k == Setting42Activity.d(a)[i])
            {
                Setting42Activity.a(a, i);
            }
        }

        Setting42Activity.b(a, Setting42Activity.c(a));
        a.d = ((u) (context)).h;
        intent = Setting42Activity.m(a);
        boolean flag1;
        if (a.d == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        intent.setChecked(flag1);
        a.e = ((u) (context)).j;
        intent = Setting42Activity.n(a);
        if (a.e == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        intent.setChecked(flag1);
        a.b = ((u) (context)).a;
        intent = Setting42Activity.o(a);
        if (a.b == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        intent.setChecked(flag1);
        if (Setting42Activity.o(a).isChecked())
        {
            Setting42Activity.p(a).b();
        } else
        {
            Setting42Activity.p(a).a();
        }
        intent = a;
        if (a.b == 1)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        Setting42Activity.a(intent, flag1);
        a.a = ((u) (context)).e;
        k = com.gau.go.launcherex.gowidget.weather.view.Setting42Activity.e(a).length;
        j = 0;
_L5:
        if (j >= k) goto _L2; else goto _L1
_L1:
        if (a.a != com.gau.go.launcherex.gowidget.weather.view.Setting42Activity.e(a)[j]) goto _L4; else goto _L3
_L3:
        Setting42Activity.g(a).setText(Setting42Activity.f(a)[j]);
_L2:
        Setting42Activity.c(a, ((u) (context)).i);
        k = Setting42Activity.h(a).length;
        j = ((flag) ? 1 : 0);
_L6:
        if (j < k)
        {
            if (Setting42Activity.k(a) != Setting42Activity.h(a)[j])
            {
                break MISSING_BLOCK_LABEL_495;
            }
            Setting42Activity.j(a).setText(Setting42Activity.i(a)[j]);
        }
        return;
_L4:
        j++;
          goto _L5
        j++;
          goto _L6
    }
}
