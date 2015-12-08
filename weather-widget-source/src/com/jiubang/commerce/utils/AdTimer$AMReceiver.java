// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.jiubang.commerce.utils:
//            j, AdTimer, a

public class a extends BroadcastReceiver
{

    final AdTimer a;

    public void onReceive(Context context, Intent intent)
    {
        j.a("wbq", (new StringBuilder()).append("Time is up!action:").append(intent.getAction()).toString());
        AdTimer.a(a);
        if (AdTimer.b(a) != null)
        {
            AdTimer.b(a).a();
        }
    }

    public (AdTimer adtimer)
    {
        a = adtimer;
        super();
    }
}
