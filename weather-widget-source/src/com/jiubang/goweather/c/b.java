// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.content.Context;
import android.location.LocationManager;
import android.os.Handler;
import com.gtp.a.a.a.a;
import com.gtp.a.a.b.c;

// Referenced classes of package com.jiubang.goweather.c:
//            w, c, i, d, 
//            s, p

public class b extends w
{

    private LocationManager d;
    private d e;
    private Handler f;

    public b(Context context, p p1)
    {
        super(context, p1);
        f = new com.jiubang.goweather.c.c(this);
        d = (LocationManager)a.getSystemService("location");
    }

    static void a(b b1)
    {
        b1.b();
    }

    static Handler b(b b1)
    {
        return b1.f;
    }

    private void b()
    {
        if (e == null)
        {
            return;
        } else
        {
            d.removeUpdates(e);
            e = null;
            return;
        }
    }

    public void a()
    {
        b();
    }

    public boolean a(int j, s s1)
    {
        b = s1;
        boolean flag = false;
        int k = com.jiubang.goweather.c.i.a(d, "gps");
        if (k == 1)
        {
            e = new d(this);
            if (j == 1)
            {
                b.b(3);
            } else
            if (j == 2)
            {
                b.b(2);
            }
            d.requestLocationUpdates("gps", 0L, 0.0F, e);
            flag = true;
        } else
        if (k == 2)
        {
            com.gtp.a.a.a.a.a().a("GPS\u5B9A\u4F4D\u529F\u80FD\u5173\u95ED", "location.txt");
            c.a();
            b.c(2);
        } else
        {
            com.gtp.a.a.a.a.a().a("\u7CFB\u7EDF\u4E0D\u652F\u6301GPS\u5B9A\u4F4D\u529F\u80FD", "location.txt");
            c.a();
            b.c(1);
        }
        if (flag)
        {
            com.gtp.a.a.a.a.a().a("GPS\u5B9A\u4F4D\u5F00\u59CB", "location.txt");
            c.a("Location", "GPS\u5B9A\u4F4D\u5F00\u59CB");
        }
        return flag;
    }
}
