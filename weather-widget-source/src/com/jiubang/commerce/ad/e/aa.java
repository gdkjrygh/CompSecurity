// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import com.jiubang.commerce.ad.url.i;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            ad, n

final class aa
    implements i
{

    final ad a;
    final boolean b;
    final List c;
    final boolean d;
    final boolean e;

    aa(ad ad1, boolean flag, List list, boolean flag1, boolean flag2)
    {
        a = ad1;
        b = flag;
        c = list;
        d = flag1;
        e = flag2;
        super();
    }

    public void a(Context context)
    {
        if (a != null)
        {
            a.a();
        }
        if (b)
        {
            n.a(context).a(c, d, e);
            if (a != null)
            {
                a.b();
            }
        }
    }
}
