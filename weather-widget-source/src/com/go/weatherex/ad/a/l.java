// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.a;

import android.app.Activity;
import android.view.View;
import com.go.weatherex.f.a;
import com.go.weatherex.f.d;

// Referenced classes of package com.go.weatherex.ad.a:
//            a, m, b, i

public class l extends com.go.weatherex.ad.a.a
{

    private View c;
    private byte d;
    private a e;

    public l(Activity activity)
    {
        super(activity);
        d = 1;
        e = null;
    }

    private d a(Activity activity)
    {
        d = 1;
        activity = new d(activity);
        activity.setOnClickListener(new m(this));
        return activity;
    }

    public b a()
    {
        return com.go.weatherex.ad.a.b.a;
    }

    public void a(boolean flag)
    {
        b.e(this);
    }

    public View b()
    {
        if (c == null)
        {
            c = a(a);
        }
        return c;
    }

    public void c()
    {
        b.b(this);
        b.a(this);
    }

    public byte i()
    {
        return d;
    }

    public a j()
    {
        return e;
    }
}
