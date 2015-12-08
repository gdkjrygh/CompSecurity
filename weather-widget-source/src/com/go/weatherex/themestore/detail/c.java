// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.view.View;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.d.a;
import com.jiubang.playsdk.d.e;
import com.jiubang.playsdk.f.d;

// Referenced classes of package com.go.weatherex.themestore.detail:
//            b, d

class c
    implements android.view.View.OnClickListener
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public void onClick(View view)
    {
        view = com.go.weatherex.themestore.detail.b.a(a).f();
        if (view != null)
        {
            com.jiubang.playsdk.e.a.b(a.a, a.g.l(), view.b(), a.g.m(), view.a(), view.s());
            com.jiubang.playsdk.a.a a1 = a.f.a(a.a, view);
            if (!view.n())
            {
                boolean flag = a.g.g(a.a, a1);
                d.a("ThemeDetailPage", (new StringBuilder()).append("\u8C03\u7528\u4E3B\u7A0B\u5E8F\u4E0B\u8F7D\u7ED3\u679C=").append(flag).toString());
                if (!flag)
                {
                    d.a("ThemeDetailPage", "sdk \u4E0B\u8F7D...");
                    com.jiubang.playsdk.f.a.a(a.a, view);
                    return;
                }
            } else
            {
                a.g.a(a.a, view.r(), a1, new com.go.weatherex.themestore.detail.d(this, view));
                return;
            }
        }
    }
}
