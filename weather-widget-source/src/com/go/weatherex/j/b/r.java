// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.go.weatherex.j.n;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.j.b:
//            d, s

public class r extends d
{

    d b;
    d c;
    private s d;

    public r(Context context, int j)
    {
        super(context, j);
        b = new d(context, j);
        c = new d(context, j);
        d = new s(b, c);
    }

    public void a(int j)
    {
        super.a(j);
        b.a(j);
        c.a(j);
    }

    public void a(Resources resources)
    {
        super.a(resources);
        b.a(resources);
        c.a(resources);
    }

    public void a(g g)
    {
        super.a(g);
        b.a(g);
        c.a(g);
    }

    public void a(u u)
    {
        super.a(u);
        b.a(u);
        c.a(u);
    }

    public void a(ArrayList arraylist)
    {
        super.a(arraylist);
        b.a(arraylist);
        c.a(arraylist);
    }

    public void a(boolean flag)
    {
        super.a(flag);
        b.a(flag);
        c.a(flag);
    }

    public void b(boolean flag)
    {
        super.b(flag);
        b.b(flag);
        c.b(flag);
    }

    public void c(boolean flag)
    {
        super.c(flag);
        b.c(flag);
        c.c(flag);
    }

    public void d(String s1)
    {
        if (!TextUtils.isEmpty(s1) && s1.contains("#"))
        {
            s1 = s1.split("#");
            if (s1 != null && s1.length == 2)
            {
                b.d(s1[0]);
                c.d(s1[1]);
            }
        }
    }

    public void d(boolean flag)
    {
        super.d(flag);
        b.d(flag);
        c.d(flag);
    }

    public n i()
    {
        return d;
    }
}
