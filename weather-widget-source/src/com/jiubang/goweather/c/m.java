// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.content.Context;
import android.location.LocationManager;
import android.os.Handler;
import com.gtp.a.a.b.c;
import com.jiubang.goweather.e.a;

// Referenced classes of package com.jiubang.goweather.c:
//            w, n, i, p, 
//            s, o

public class m extends w
{

    private LocationManager d;
    private o e;
    private Handler f;

    public m(Context context, p p1)
    {
        super(context, p1);
        d = (LocationManager)a.getSystemService("location");
        b();
    }

    static void a(m m1)
    {
        m1.c();
    }

    static Handler b(m m1)
    {
        return m1.f;
    }

    private void b()
    {
        f = new n(this);
    }

    private void c()
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
        c();
    }

    public boolean a(int j, s s1)
    {
        int k;
        b = s1;
        k = com.jiubang.goweather.c.i.a(d, "network");
        if (com.jiubang.goweather.e.a.b(a)) goto _L2; else goto _L1
_L1:
        boolean flag;
        com.gtp.a.a.a.a.a().a("\u7F51\u7EDC\u4E0D\u901A\uFF0C\u653E\u5F03Google\u5B9A\u4F4D", "location.txt");
        c.a();
        b.c(7);
        flag = false;
_L8:
        if (flag)
        {
            com.gtp.a.a.a.a.a().a("Google\u7F51\u7EDC\u5B9A\u4F4D\u5F00\u59CB", "location.txt");
            com.gtp.a.a.b.c.a("Location", "Google\u7F51\u7EDC\u5B9A\u4F4D\u5F00\u59CB");
        }
        return flag;
_L2:
        if (k != 1)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        e = new o(this);
        if (j != 1) goto _L4; else goto _L3
_L3:
        b.b(1);
_L6:
        try
        {
            d.requestLocationUpdates("network", 0L, 0.0F, e);
        }
        // Misplaced declaration of an exception variable
        catch (s s1)
        {
            if (com.gtp.a.a.b.c.a())
            {
                s1.printStackTrace();
            }
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        continue; /* Loop/switch isn't completed */
_L4:
        if (j == 3)
        {
            b.b(4);
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (k == 2)
        {
            com.gtp.a.a.a.a.a().a("Google\u5B9A\u4F4D\u529F\u80FD\u5173\u95ED", "location.txt");
            c.a();
            b.c(2);
            flag = false;
        } else
        {
            com.gtp.a.a.a.a.a().a("\u7CFB\u7EDF\u4E0D\u652F\u6301Google\u5B9A\u4F4D\u529F\u80FD", "location.txt");
            c.a();
            b.c(1);
            flag = false;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }
}
