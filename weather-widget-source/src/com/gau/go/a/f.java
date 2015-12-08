// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.util.Log;
import com.gau.go.a.e.a;
import com.gau.go.a.e.d;
import com.gau.go.a.f.e;

// Referenced classes of package com.gau.go.a:
//            e

class f
    implements Runnable
{

    final com.gau.go.a.e a;

    f(com.gau.go.a.e e1)
    {
        a = e1;
        super();
    }

    public void run()
    {
        long l1 = a(a).getLong("first_run_time", 0L);
        long l = l1;
        if (l1 == 0L)
        {
            e.a(e.b(a), a(a));
            l = a(a).getLong("first_run_time", 0L);
        }
        if (System.currentTimeMillis() - l > 0x6ddd000L)
        {
            e.l = false;
        }
        a(a, e.l);
        a(a, d.a(e.b(a)));
        Object obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction("android.net.conn.CONNECTIVITY_CHANGE");
        ((IntentFilter) (obj)).addAction("android.intent.action.PACKAGE_ADDED");
        ((IntentFilter) (obj)).addAction("com.android.broadcast.uploaddata");
        e.b(a).registerReceiver(e.c(a), ((IntentFilter) (obj)));
        e.b(a, false);
        a(a, System.currentTimeMillis() - a(a).getLong("ctrl_last_get_time", 0L));
        Log.i("zhiping", "\u7EDF\u8BA1sdk\u521D\u59CB\u5316\u51C6\u5907\u5F00\u59CB\u83B7\u53D6\u5F00\u5173");
        if (d(a) == 0L || d(a) >= 0x1bc07e0L)
        {
            obj = new a(e.b(a), 0L, 0x1bc07e0L);
        } else
        {
            obj = new a(e.b(a), 0x1bc07e0L - d(a), 0x1bc07e0L);
            com.gau.go.a.e.e(a);
        }
        a(a, ((a) (obj)));
    }
}
