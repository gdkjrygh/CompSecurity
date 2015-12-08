// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.innertube;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.e.g;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.innertube.i;
import com.google.android.apps.youtube.uilib.a.h;
import java.util.Collection;

// Referenced classes of package com.google.android.apps.youtube.uilib.innertube:
//            ContinuableController, o, f, g, 
//            b, c, d

public abstract class e extends ContinuableController
{

    private final h a;
    private final o b = new o(b(), new f(this), new com.google.android.apps.youtube.uilib.innertube.g(this));
    private d c;
    private boolean d;
    private boolean e;

    e(i i, h h1, a a1, aw aw)
    {
        super(i, a1, com.google.android.apps.youtube.common.c.a.a(), aw);
        c = g.a();
        a = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        d = false;
        e = true;
        a1.a(this, com/google/android/apps/youtube/uilib/innertube/e, b());
    }

    private void j()
    {
        if (e && !d)
        {
            k();
            return;
        } else
        {
            l();
            return;
        }
    }

    private void k()
    {
        if (m())
        {
            a.a(n());
        }
    }

    private void l()
    {
        if (!m())
        {
            a.a(b);
        }
    }

    private boolean m()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a.getCount() > 0)
        {
            flag = flag1;
            if (a.getItem(n()) == b)
            {
                flag = true;
            }
        }
        return flag;
    }

    private int n()
    {
        return a.getCount() - 1;
    }

    protected final void a()
    {
        a.b();
        g();
    }

    protected final void a(android.view.View.OnClickListener onclicklistener)
    {
        b.a(onclicklistener);
    }

    protected final void a(CharSequence charsequence)
    {
        b.a(charsequence);
        a.notifyDataSetChanged();
    }

    protected final void a(Object obj)
    {
        k();
        a.a(obj, c);
        j();
    }

    protected final void a(Collection collection)
    {
        k();
        a.a(collection, c);
        j();
    }

    protected final void a(boolean flag)
    {
        if (d != flag)
        {
            d = flag;
            j();
        }
    }

    public void onContentEvent(b b1)
    {
        b.a(b1);
        e = true;
        if (!d)
        {
            k();
        }
    }

    public void onErrorEvent(com.google.android.apps.youtube.uilib.innertube.c c1)
    {
        b.a(c1);
        e = false;
        l();
    }

    public void onLoadingEvent(com.google.android.apps.youtube.uilib.innertube.d d1)
    {
        b.a(d1);
        e = false;
        l();
    }
}
