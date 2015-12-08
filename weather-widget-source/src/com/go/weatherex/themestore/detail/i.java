// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.text.TextUtils;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.d.a;
import com.jiubang.playsdk.detail.a.j;
import com.jiubang.playsdk.main.c;

// Referenced classes of package com.go.weatherex.themestore.detail:
//            f

class i
    implements j
{

    final f a;

    i(f f1)
    {
        a = f1;
        super();
    }

    public void a(a a1, int k)
    {
        k;
        JVM INSTR tableswitch 1 2: default 24
    //                   1 25
    //                   2 187;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (a1 != null)
        {
            Object obj = a1.o();
            boolean flag = com.jiubang.playsdk.f.a.a(a.a, ((String) (obj)), null);
            if (!TextUtils.isEmpty(((CharSequence) (obj))) && !flag)
            {
                com.go.weatherex.themestore.detail.f.a(a, a1.i(), ((String) (obj)));
                return;
            }
            obj = com.jiubang.playsdk.e.a.a(a.a, a.f.a(a1));
            com.jiubang.playsdk.e.a.a(a.a, a.g.l(), a1.b(), a.g.m(), a1.s(), ((String) (obj)));
            obj = a.f.a(a.a, a1);
            if (!a.g.g(a.a, ((com.jiubang.playsdk.a.a) (obj))))
            {
                com.jiubang.playsdk.f.a.a(a.a, a1);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (a1 != null)
        {
            String s = y.a().a(a1);
            if (!TextUtils.isEmpty(s))
            {
                if (!com.jiubang.playsdk.f.a.a(a.a, s, null))
                {
                    com.go.weatherex.themestore.detail.f.a(a, a1.i(), s);
                    return;
                } else
                {
                    a.g.a(a.a, s, a1.c());
                    return;
                }
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
