// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.c.g;
import com.go.weatherex.messagecenter.n;

// Referenced classes of package com.go.weatherex.common:
//            e

class f extends BroadcastReceiver
{

    final e a;

    public void onReceive(Context context, Intent intent)
    {
        if (!intent.getAction().equals("com.go.weatherex.CHECK_WIFI_FOR_MESSAGE_CENTER")) goto _L2; else goto _L1
_L1:
        if (!g.b(e.a(a))) goto _L4; else goto _L3
_L3:
        n.a(e.a(a)).a();
        JVM INSTR tableswitch 1 2: default 60
    //                   1 61
    //                   2 75;
           goto _L2 _L5 _L6
_L2:
        return;
_L5:
        n.a(e.a(a)).b();
        return;
_L6:
        n.a(e.a(a)).c();
        return;
_L4:
        e.a(a, true);
        return;
    }
}
