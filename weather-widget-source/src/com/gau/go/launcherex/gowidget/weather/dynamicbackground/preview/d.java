// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview;

import android.content.Context;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.scriptengine.parser.i;
import com.gau.go.launcherex.gowidget.scriptengine.parser.z;
import com.gau.go.launcherex.gowidget.weather.dynamicbackground.DynamicBackgroundView;
import com.go.weatherex.home.a.f;
import com.go.weatherex.home.a.h;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview:
//            a

public class d
    implements h
{

    private DynamicBackgroundView a;
    private int b;
    private int c;
    private boolean d;
    private Context e;
    private a f;
    private f g;

    public d(Context context)
    {
        a = null;
        e = context;
        g = new f(e);
        g.a(this);
    }

    private String a(int j, boolean flag, int k)
    {
        boolean flag2 = true;
        boolean flag1 = flag2;
        if (k != 1)
        {
            if (k == 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
        }
        return i.a(j, flag, flag1);
    }

    private void a(com.jiubang.core.a.i j)
    {
        if (j != null)
        {
            a.c();
            a.a(j, true);
        }
    }

    public void a()
    {
        a.a();
    }

    public void a(int j)
    {
        a.setBackgroundColor(j);
    }

    public void a(int j, int k, boolean flag)
    {
        while (a.getWidth() == 0 || a.getHeight() == 0 || b == j && c == k && d == flag) 
        {
            return;
        }
        b = j;
        c = k;
        d = flag;
        String s = a(b, d, k);
        z z = f.a(s);
        if (z == null)
        {
            Toast.makeText(e, 0x7f0801e8, 0).show();
            f.b(s);
            return;
        } else
        {
            g.a(z, a.getWidth(), a.getHeight());
            return;
        }
    }

    public void a(DynamicBackgroundView dynamicbackgroundview)
    {
        a = dynamicbackgroundview;
    }

    public void a(a a1)
    {
        f = a1;
    }

    public void a(com.jiubang.core.a.i j, z z, int k, int l)
    {
        a(j);
    }
}
