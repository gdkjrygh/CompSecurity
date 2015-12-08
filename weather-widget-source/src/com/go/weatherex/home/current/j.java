// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.view.View;
import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.framework.fragment.a;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.current:
//            aa, l, k

public class j extends aa
{

    private aa b;

    public j(a a1, int i1)
    {
        super(a1, i1);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            b = new l(a1, i1);
            return;
        } else
        {
            b = new k(a1, i1);
            return;
        }
    }

    public void a(String s)
    {
        b.a(s);
    }

    public void a(List list, w w)
    {
        b.a(list, w);
    }

    public void c()
    {
        b.c();
    }

    public View f()
    {
        return b.f();
    }

    public void g()
    {
        b.g();
    }

    public void h()
    {
        b.h();
    }

    public void i()
    {
        b.i();
    }

    public void j()
    {
        super.j();
        b.j();
    }

    public void k()
    {
        super.k();
        b.k();
    }
}
