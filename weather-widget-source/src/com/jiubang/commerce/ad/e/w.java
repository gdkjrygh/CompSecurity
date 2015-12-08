// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.utils.j;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            k, v, ac, af, 
//            a

class w
    implements k
{

    final a a;
    final v b;

    w(v v1, a a1)
    {
        b = v1;
        a = a1;
        super();
    }

    public void a(int i, f f1, List list)
    {
        if (b.b == null)
        {
            return;
        }
        if (j.a && f1 != null)
        {
            j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(b.c).append("]loadAdBean(Adfirst:").append(f1.j()).append(" Adsplit:").append(f1.k()).append(" AdCloseType:").append(f1.l()).append(" Adfrequency:").append(f1.i()).append(")").toString());
        }
        if (b.e != null && f1 != null && !b.e.a(f1))
        {
            j.d("Ad_SDK", (new StringBuilder()).append("loadAdBean(Fail, Client cancel, virtualModuleId:").append(b.c).append(")").toString());
            b.b.a(22);
            return;
        }
        if (i != 16)
        {
            b.b.a(i);
            j.d("Ad_SDK", (new StringBuilder()).append("requestAdControlInfo(end--fail, ").append(i).append(")").toString());
            return;
        }
        if (list != null && !list.isEmpty() && b.f >= 0)
        {
            f1 = (f)list.get(0);
            if (f1 != null)
            {
                i = f1.i();
            } else
            {
                i = 0;
            }
            if (i > 0 && b.f >= i)
            {
                list = new b();
                list.a(f1);
                b.b.a(false, list);
                return;
            }
        }
        a.a(b.g, true, 0, true, list);
    }
}
