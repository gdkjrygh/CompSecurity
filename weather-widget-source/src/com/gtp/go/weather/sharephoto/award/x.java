// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import com.gau.go.launcherex.gowidget.weather.globalview.g;
import com.gau.go.launcherex.gowidget.weather.globalview.h;
import com.gtp.go.weather.sharephoto.b.a;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            MyAwardsActivity

class x
    implements h
{

    final boolean a;
    final a b;
    final long c;
    final MyAwardsActivity d;

    x(MyAwardsActivity myawardsactivity, boolean flag, a a1, long l)
    {
        d = myawardsactivity;
        a = flag;
        b = a1;
        c = l;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            if (a)
            {
                com.gtp.go.weather.sharephoto.award.MyAwardsActivity.a(d, b.c());
            } else
            {
                com.gtp.go.weather.sharephoto.award.MyAwardsActivity.a(d, c, b);
            }
        }
        MyAwardsActivity.c(d).dismiss();
    }
}
