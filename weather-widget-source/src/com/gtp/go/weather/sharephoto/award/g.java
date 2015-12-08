// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.widget.Toast;
import com.gtp.go.weather.sharephoto.b.b;
import com.gtp.go.weather.sharephoto.b.d;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            o, c, h

class g extends o
{

    final c a;

    g(c c1)
    {
        a = c1;
        super();
    }

    public void a(boolean flag, long l, long l1)
    {
        if (c.j(a) == null)
        {
            return;
        }
        c.k(a);
        if (flag)
        {
            Toast.makeText(c.l(a), c.a(a, 0x7f0804b1), 0).show();
            if (c.e(a).a() == l && c.j(a).b.a() == l1)
            {
                c.e(a).d(1);
                c.e(a).c(l1);
                c.e(a).a(c.j(a).b);
                c.a(a, l1);
            }
            a.dismiss();
            return;
        } else
        {
            Toast.makeText(c.m(a), c.a(a, 0x7f0804b2), 0).show();
            return;
        }
    }
}
