// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i;

import android.content.Context;
import android.os.Handler;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.i.a.a;
import com.jiubang.commerce.utils.s;

// Referenced classes of package com.jiubang.commerce.ad.i:
//            b, n, o, c

class m
    implements Runnable
{

    final b a;
    final Context b;
    final String c;
    final String d;
    final f e;
    final String f[];
    final int g;
    final a h;
    final Handler i;
    final s j;
    final com.jiubang.commerce.ad.e.m k;
    final c l;

    m(c c1, b b1, Context context, String s, String s1, f f1, String as[], 
            int i1, a a1, Handler handler, s s2, com.jiubang.commerce.ad.e.m m1)
    {
        l = c1;
        a = b1;
        b = context;
        c = s;
        d = s1;
        e = f1;
        f = as;
        g = i1;
        h = a1;
        i = handler;
        j = s2;
        k = m1;
        super();
    }

    public void run()
    {
        AdSize adsize = AdSize.BANNER_HEIGHT_90;
        Object obj = adsize;
        if (a != null)
        {
            obj = adsize;
            if (a.a != null)
            {
                obj = a.a;
            }
        }
        obj = new AdView(b, c, ((AdSize) (obj)));
        ((AdView) (obj)).setAdListener(new n(this, ((AdView) (obj))));
        (new Thread(new o(this, ((AdView) (obj))))).start();
    }
}
