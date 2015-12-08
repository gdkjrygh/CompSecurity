// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

// Referenced classes of package com.go.weatherex.g:
//            af, ag

public class ae
{

    private Context a;
    private ag b;
    private BroadcastReceiver c;

    public ae(Context context)
    {
        c = new af(this);
        a = context;
        context = new IntentFilter();
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION");
        a.registerReceiver(c, context);
    }

    static ag a(ae ae1)
    {
        return ae1.b;
    }

    public void a()
    {
        a.unregisterReceiver(c);
    }

    public void a(ag ag)
    {
        b = ag;
    }
}
