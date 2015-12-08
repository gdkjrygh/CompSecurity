// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.a.d;
import com.jiubang.commerce.ad.b.a;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.k;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            af, a, ac, w, 
//            t

class v
    implements Runnable
{

    final Context a;
    final af b;
    final int c;
    final boolean d;
    final ac e;
    final int f;
    final com.jiubang.commerce.ad.h.a g;
    final boolean h;
    final String i;
    final Integer j;
    final t k;

    v(t t, Context context, af af1, int l, boolean flag, ac ac1, int i1, 
            com.jiubang.commerce.ad.h.a a1, boolean flag1, String s, Integer integer)
    {
        k = t;
        a = context;
        b = af1;
        c = l;
        d = flag;
        e = ac1;
        f = i1;
        g = a1;
        h = flag1;
        i = s;
        j = integer;
        super();
    }

    public void run()
    {
        if (!com.jiubang.commerce.utils.k.a(a))
        {
            b.a(17);
            com.jiubang.commerce.utils.j.d("Ad_SDK", (new StringBuilder()).append("loadAdBean(Fail, Network unavailable, virtualModuleId:").append(c).append(")").toString());
            return;
        }
        Object obj = com.jiubang.commerce.ad.e.a.a(a);
        if (!d)
        {
            d d1 = new d();
            List list = ((com.jiubang.commerce.ad.e.a) (obj)).a(a, c, d1);
            if (j.a && d1.a() != null)
            {
                f f2 = d1.a();
                com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(c).append("]loadAdBean(Adfirst:").append(f2.j()).append(" Adsplit:").append(f2.k()).append(" AdCloseType:").append(f2.l()).append(" Adfrequency:").append(f2.i()).append(")").toString());
            }
            if (e != null && d1.a() != null && !e.a(d1.a()))
            {
                com.jiubang.commerce.utils.j.d("Ad_SDK", (new StringBuilder()).append("loadAdBean(Fail, Client cancel, virtualModuleId:").append(c).append(")").toString());
                b.a(22);
                return;
            }
            if (list != null && !list.isEmpty())
            {
                if (f >= 0)
                {
                    f f1 = (f)list.get(0);
                    int l;
                    if (f1 != null)
                    {
                        l = f1.i();
                    } else
                    {
                        l = 0;
                    }
                    if (l > 0 && f >= l)
                    {
                        obj = new b();
                        ((b) (obj)).a(f1);
                        b.a(true, ((b) (obj)));
                        return;
                    }
                }
                ((com.jiubang.commerce.ad.e.a) (obj)).a(g, true, 0, true, list);
                return;
            }
        }
        if (!com.jiubang.commerce.ad.b.a.a(a, c))
        {
            com.jiubang.commerce.utils.j.d("Ad_SDK", (new StringBuilder()).append("ad module(").append(c).append(")removed-loadAdBean").toString());
            b.a(19);
            return;
        } else
        {
            ((com.jiubang.commerce.ad.e.a) (obj)).a(a, c, 0, h, i, j, new w(this, ((com.jiubang.commerce.ad.e.a) (obj))));
            return;
        }
    }
}
