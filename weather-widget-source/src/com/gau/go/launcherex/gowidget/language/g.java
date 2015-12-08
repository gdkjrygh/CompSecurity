// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.language;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.launcherex.gowidget.language:
//            e, f

class g extends BroadcastReceiver
{

    final e a;

    private g(e e1)
    {
        a = e1;
        super();
    }

    g(e e1, f f)
    {
        this(e1);
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SETTING_USER_LANGUAGE".endsWith(intent.getAction()))
        {
            context = intent.getStringExtra("extra_language_package");
            intent = intent.getStringExtra("extra_language_code");
            a.a(intent, context);
        }
    }
}
