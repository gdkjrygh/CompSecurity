// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.b;

import android.content.Context;
import com.jiubang.commerce.ad.h.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.go.weatherex.ad.b:
//            b, d

public class a
{

    private Context a;
    private d b;

    public a(Context context)
    {
        a = context;
    }

    static d a(a a1)
    {
        return a1.b;
    }

    public void a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(Integer.valueOf(640));
        com.jiubang.commerce.ad.a.a(a, arraylist, null, null);
    }

    public void a(d d)
    {
        b = d;
    }

    public boolean b()
    {
        return com.jiubang.commerce.ad.a.a(a, 640);
    }

    public void c()
    {
        long l = System.currentTimeMillis();
        c c1 = new c(a, 640, "", new b(this, l));
        c1.a(false);
        c1.b(true);
        c1.c(true);
        c1.d(false);
        c1.e(false);
        c1.a(20);
        com.jiubang.commerce.ad.a.a(c1.a());
    }
}
