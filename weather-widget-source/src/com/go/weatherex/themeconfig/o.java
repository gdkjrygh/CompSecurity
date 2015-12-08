// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themeconfig;

import com.go.weatherex.themestore.aj;
import com.jiubang.playsdk.a.v;
import com.jiubang.playsdk.f.e;

// Referenced classes of package com.go.weatherex.themeconfig:
//            n

class o extends aj
{

    final n a;

    o(n n1)
    {
        a = n1;
        super();
    }

    public void a(v v)
    {
        if (v != null)
        {
            n.a(a, 3);
            n.a(a);
            return;
        }
        if (e.j(a.getActivity()))
        {
            n.a(a, 4);
            return;
        } else
        {
            n.a(a, 2);
            return;
        }
    }

    public void a(String s)
    {
        n.b(a);
    }

    public void b(String s)
    {
        n.b(a);
    }

    public void c(String s)
    {
        n.b(a);
    }
}
