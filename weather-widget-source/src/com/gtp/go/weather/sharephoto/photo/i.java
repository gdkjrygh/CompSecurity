// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.app.Activity;
import android.view.View;
import com.gtp.go.weather.sharephoto.b.e;
import com.gtp.go.weather.sharephoto.c.a;
import com.gtp.go.weather.sharephoto.c.l;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            k

public class i
    implements a
{

    private Activity a;
    private View b;
    private k c;

    public i(Activity activity, View view)
    {
        c = null;
        a = activity;
        b = view;
        b.setVisibility(4);
        l.a(this);
    }

    static Activity a(i j)
    {
        return j.a;
    }

    static k a(i j, k k1)
    {
        j.c = k1;
        return k1;
    }

    static View b(i j)
    {
        return j.b;
    }

    public void a()
    {
        if (c != null)
        {
            c.cancel(true);
        }
    }

    public void a(e e)
    {
    }

    public void b()
    {
        if (c == null)
        {
            c = new k(this, null);
            c.execute(new Void[0]);
        }
    }

    public void b(e e)
    {
        b();
    }
}
