// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.e;

import android.content.Context;
import com.gau.go.a.f.e;

// Referenced classes of package com.gau.go.a.e:
//            f, h

public class g extends f
{

    private h a;

    public g(Context context, Long long1, String s, int i)
    {
        b(long1.longValue());
        a(System.currentTimeMillis() + long1.longValue() + 20000L * (long)i * 1L);
        a(context, (new StringBuilder()).append("funid:").append(s).toString());
        e.a("StatisticsManager", (new StringBuilder()).append("task construct:").append(s).toString());
    }

    public void a()
    {
        e.a("StatisticsManager", (new StringBuilder()).append("task execute:").append(d()).append("interval:").append(c()).toString());
        if (a != null)
        {
            String s = d();
            String as[] = s.substring("funid:".length(), s.length()).split(":");
            a.a(as[1]);
        }
    }

    public void a(h h1)
    {
        a = h1;
    }
}
