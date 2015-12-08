// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.a;

import com.go.weatherex.themestore.ac;
import com.go.weatherex.themestore.aj;
import com.jiubang.playsdk.a.v;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.a:
//            d, f

class g extends aj
{

    final Boolean a;
    final f b;

    g(f f1, Boolean boolean1)
    {
        b = f1;
        a = boolean1;
        super();
    }

    public void a(v v)
    {
        ac.k();
    }

    public void a(boolean flag, boolean flag1, int i)
    {
        if (d.b() != i)
        {
            d.b(i);
            if (a.booleanValue() || flag || flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d.a(b.a, flag);
        }
        ac.b(this);
        ac.l();
    }
}
