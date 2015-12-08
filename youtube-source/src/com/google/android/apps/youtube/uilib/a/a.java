// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.a;

import android.view.View;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.model.u;

// Referenced classes of package com.google.android.apps.youtube.uilib.a:
//            g, i, f

public abstract class a
    implements android.view.View.OnClickListener, g
{

    private final com.google.android.apps.youtube.datalib.d.a a;
    private kz b;

    public a(com.google.android.apps.youtube.datalib.d.a a1)
    {
        a = (com.google.android.apps.youtube.datalib.d.a)c.a(a1);
    }

    public a(com.google.android.apps.youtube.datalib.d.a a1, i j)
    {
        this(a1);
        c.a(j);
        j.a(this);
    }

    public View a(f f, u u1)
    {
        b = u1.e();
        return null;
    }

    public volatile View a(f f, Object obj)
    {
        return a(f, (u)obj);
    }

    protected final void b()
    {
        if (b != null)
        {
            a.a(b);
        }
    }

    public void onClick(View view)
    {
        b();
    }
}
