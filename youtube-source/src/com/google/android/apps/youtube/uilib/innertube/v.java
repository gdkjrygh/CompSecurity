// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.innertube;

import android.text.TextUtils;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.model.ar;
import com.google.android.apps.youtube.uilib.a.h;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.uilib.innertube:
//            u, w

public final class v
{

    private final h a;
    private ar b;
    private u c;
    private android.view.View.OnClickListener d;
    private boolean e;

    public v(h h1)
    {
        a = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        e = false;
        c = new u();
        d = new w(this);
    }

    private void a()
    {
        if (!e)
        {
            e = true;
            a.b();
            a.a(b);
            a.a(b.g());
            if (b.e() != null && !TextUtils.isEmpty(b.j()))
            {
                c.a(b.j());
                c.a(null);
                c.a(b.e());
                a.a(c);
                return;
            }
        }
    }

    static void a(v v1)
    {
        v1.a();
    }

    public final void a(ar ar1)
    {
        b = ar1;
        if (ar1.g().size() <= ar1.h())
        {
            a();
        } else
        {
            e = false;
            a.b();
            a.a(b);
            a.a(b.g().subList(0, b.h()));
            if (!TextUtils.isEmpty(b.i()))
            {
                c.a(b.i());
                c.a(d);
                c.a(null);
                a.a(c);
                return;
            }
        }
    }
}
