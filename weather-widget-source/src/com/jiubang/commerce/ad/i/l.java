// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i;

import android.content.Context;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.e.m;
import com.jiubang.commerce.ad.i.a.a;

// Referenced classes of package com.jiubang.commerce.ad.i:
//            c

class l
    implements Runnable
{

    final Context a;
    final String b[];
    final f c;
    final String d;
    final m e;
    final c f;

    l(c c1, Context context, String as[], f f1, String s, m m)
    {
        f = c1;
        a = context;
        b = as;
        c = f1;
        d = s;
        e = m;
        super();
    }

    public void run()
    {
        com.jiubang.commerce.ad.i.c.a(f, a, b, -1, c, new a(), d, e);
    }
}
