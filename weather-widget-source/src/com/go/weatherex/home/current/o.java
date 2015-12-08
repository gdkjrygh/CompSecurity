// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.view.View;
import com.go.weatherex.ad.c.e;
import com.go.weatherex.ad.nativead.a;

// Referenced classes of package com.go.weatherex.home.current:
//            aa

public class o extends aa
{

    private a b;

    public o(com.go.weatherex.framework.fragment.a a1, int j)
    {
        super(a1, j);
        b = new a(a1.getActivity());
        b.a(2);
    }

    public void a(String s)
    {
        if (!e.a(a.getActivity()))
        {
            b.a(a.getString(0x7f08003d));
        }
    }

    public void c()
    {
        super.c();
        if (e.a(a.getActivity()))
        {
            b.a();
        }
    }

    public View f()
    {
        return b;
    }

    public void g()
    {
    }

    public void h()
    {
    }

    public void i()
    {
        b.a();
    }
}
