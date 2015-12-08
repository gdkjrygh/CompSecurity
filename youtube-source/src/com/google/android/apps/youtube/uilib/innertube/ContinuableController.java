// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.innertube;

import com.android.volley.VolleyError;
import com.google.a.a.a.a.dp;
import com.google.a.a.a.a.dq;
import com.google.a.a.a.a.li;
import com.google.a.a.a.a.pr;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.innertube.i;

// Referenced classes of package com.google.android.apps.youtube.uilib.innertube:
//            b, d, a, c

public abstract class ContinuableController
{

    private final i a;
    private final aw b;
    private final a c;
    private final Object d;
    private li e;
    private pr f;
    private String g;
    private ContinuationType h;
    private boolean i;

    public ContinuableController(i j, a a1, Object obj, aw aw1)
    {
        a = (i)com.google.android.apps.youtube.common.fromguava.c.a(j);
        c = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        b = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        d = obj;
        a(new b());
    }

    private void a(Object obj)
    {
        if (d != null)
        {
            c.b(d, obj);
            return;
        } else
        {
            c.c(obj);
            return;
        }
    }

    private void a(String s, ContinuationType continuationtype)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        if (s == g)
        {
            return;
        } else
        {
            g = s;
            h = continuationtype;
            a(new d());
            a.a(s, new com.google.android.apps.youtube.uilib.innertube.a(this, continuationtype));
            return;
        }
    }

    protected final void a(VolleyError volleyerror)
    {
        if (i)
        {
            a(new b());
            return;
        } else
        {
            a(new com.google.android.apps.youtube.uilib.innertube.c(b.a(volleyerror), true));
            i = true;
            return;
        }
    }

    protected final void a(dp dp1)
    {
        e = dp1.c;
        f = dp1.f;
    }

    protected void a(dq dq, ContinuationType continuationtype)
    {
        i = false;
        a(new b());
    }

    protected Object b()
    {
        return d;
    }

    public final boolean c()
    {
        return e != null;
    }

    public final boolean d()
    {
        return f != null;
    }

    public void e()
    {
        if (e != null)
        {
            a(e.b, ContinuationType.NEXT);
        }
    }

    public final void f()
    {
        if (f != null)
        {
            a(f.b, ContinuationType.RELOAD);
        }
    }

    protected final void g()
    {
        e = null;
        f = null;
    }

    protected final i h()
    {
        return a;
    }

    protected final void i()
    {
        String s = g;
        ContinuationType continuationtype = h;
        g = null;
        h = null;
        a(s, continuationtype);
    }

    private class ContinuationType extends Enum
    {

        private static final ContinuationType $VALUES[];
        public static final ContinuationType NEXT;
        public static final ContinuationType RELOAD;

        public static ContinuationType valueOf(String s)
        {
            return (ContinuationType)Enum.valueOf(com/google/android/apps/youtube/uilib/innertube/ContinuableController$ContinuationType, s);
        }

        public static ContinuationType[] values()
        {
            return (ContinuationType[])$VALUES.clone();
        }

        static 
        {
            NEXT = new ContinuationType("NEXT", 0);
            RELOAD = new ContinuationType("RELOAD", 1);
            $VALUES = (new ContinuationType[] {
                NEXT, RELOAD
            });
        }

        private ContinuationType(String s, int j)
        {
            super(s, j);
        }
    }

}
