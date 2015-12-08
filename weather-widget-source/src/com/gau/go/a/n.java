// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.gau.go.a.c.h;
import com.gau.go.a.e.a;
import com.gau.go.a.e.c;
import com.gau.go.a.f.d;
import java.util.Map;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.gau.go.a:
//            e

class n
    implements c
{

    final a a;
    final e b;

    n(e e1, a a1)
    {
        b = e1;
        a = a1;
        super();
    }

    public void a()
    {
        if (e.l)
        {
            long l = a(b).getLong("first_run_time", 0L);
            if (System.currentTimeMillis() - l > 0x6ddd000L)
            {
                e.l = false;
            }
        }
        a(b, e.l);
        com.gau.go.a.e.d(b, true);
        if (d.d(e.b(b)) != -1)
        {
            a.a = true;
            return;
        } else
        {
            a.a = false;
            c(b, true);
            return;
        }
    }

    public void a(Map map, boolean flag)
    {
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        a(b, System.currentTimeMillis());
        e.f(b).e();
        e.g(b).putLong("ctrl_last_get_time", com.gau.go.a.e.d(b));
        e.g(b).commit();
        com.gau.go.a.e.h(b).lock();
        e.i(b).clear();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        if (map.size() != 0)
        {
            e.i(b).putAll(map);
            a(b, map);
        }
        com.gau.go.a.e.h(b).unlock();
        e.f(b).d();
        a(b, e.f(b).c());
        b.();
        map = new Intent("com.android.broadcast.ctrlinfo");
        map.putExtra("pkg_name", e.b(b).getPackageName());
        e.b(b).sendBroadcast(map);
        c(b, false);
        com.gau.go.a.e.d(b, false);
        return;
        map;
        com.gau.go.a.e.h(b).unlock();
        throw map;
        e.e(b);
        e.f(b).d();
        c(b, true);
        com.gau.go.a.e.d(b, false);
        return;
    }
}
