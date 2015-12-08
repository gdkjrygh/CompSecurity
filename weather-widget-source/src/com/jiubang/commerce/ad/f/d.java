// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.f;

import android.content.Context;
import com.jiubang.commerce.receiver.NetWorkDynamicBroadcastReceiver;
import com.jiubang.commerce.receiver.a;
import com.jiubang.commerce.utils.AdTimer;
import com.jiubang.commerce.utils.j;

// Referenced classes of package com.jiubang.commerce.ad.f:
//            e, f

public class d
    implements a, com.jiubang.commerce.utils.a
{

    public static final String a[] = {
        "0827A", "0827B", "0827C", "0827D"
    };
    private AdTimer b;
    private Context c;
    private f d;

    public d(Context context, f f)
    {
        c = context;
        d = f;
        b = (AdTimer)null;
    }

    static Context a(d d1)
    {
        return d1.c;
    }

    private void a(int i, Integer integer)
    {
        com.jiubang.commerce.c.a.a(new e(this, i, integer));
        if (b != null)
        {
            b.a(System.currentTimeMillis() + 0x5265c00L, this);
        }
    }

    static f b(d d1)
    {
        return d1.d;
    }

    public void a()
    {
        if (b != null)
        {
            b.a();
            b();
        }
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            NetWorkDynamicBroadcastReceiver.a(this);
            b();
        }
    }

    public void b()
    {
        if (j.a)
        {
            j.b("IntelligentPreloadService", "\u667A\u80FD\u9884\u52A0\u8F7DABTest\u5173\u95ED,\u4F7F\u7528\u9ED8\u8BA4\u65B9\u6848\uFF01");
        }
        a(0, null);
    }

    public void c()
    {
        if (b != null)
        {
            b.a();
            b = null;
        }
        c = null;
        d = null;
    }

}
