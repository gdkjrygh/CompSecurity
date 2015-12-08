// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.language;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.launcherex.gowidget.language:
//            GoWeatherExFragmentActivity

class c extends BroadcastReceiver
{

    final GoWeatherExFragmentActivity a;

    c(GoWeatherExFragmentActivity goweatherexfragmentactivity)
    {
        a = goweatherexfragmentactivity;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        a.onLanguageChanged(a.b_());
    }
}
