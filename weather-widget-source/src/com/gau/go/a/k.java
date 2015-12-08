// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.a.c.h;
import com.gau.go.a.f.d;
import com.gau.go.a.f.e;

// Referenced classes of package com.gau.go.a:
//            l, e

class k extends BroadcastReceiver
{

    final com.gau.go.a.e a;

    k(com.gau.go.a.e e1)
    {
        a = e1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if (!s.equals("android.net.conn.CONNECTIVITY_CHANGE")) goto _L2; else goto _L1
_L1:
        if (d.d(context) == -1) goto _L4; else goto _L3
_L3:
        e.a("StatisticsManager", "net connection ok , check post queue!");
        e.a(a, new l(this));
_L6:
        return;
_L4:
        e.a("StatisticsManager", "lost network,quit!");
        e.f(a, true);
        return;
_L2:
        if (intent.getStringExtra("pkg_name") != null && intent.getStringExtra("pkg_name").equals(e.b(a).getPackageName()))
        {
            if (s.equals("com.android.broadcast.ctrlinfo"))
            {
                e.b(a, true);
                return;
            }
            if (s.equals("com.android.broadcast.uploaddata"))
            {
                context = e.f(a).b(intent.getStringExtra("id"));
                if (context != null)
                {
                    e.a(a, context);
                    com.gau.go.a.e.e(a, true);
                    return;
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
