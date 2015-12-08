// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.language.e;

// Referenced classes of package com.go.weatherex.setting:
//            at, ax

class au extends BroadcastReceiver
{

    final at a;

    au(at at1)
    {
        a = at1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context.equals("android.intent.action.PACKAGE_ADDED") || context.equals("android.intent.action.PACKAGE_REMOVED") || context.equals("android.intent.action.PACKAGE_REPLACED"))
        {
            context = intent.getDataString();
            if (context != null && context.startsWith("package:com.gau.go.weatherex.language."))
            {
                e.c(at.a(a), a.getActivity());
                at.b(a).notifyDataSetChanged();
            }
        }
    }
}
