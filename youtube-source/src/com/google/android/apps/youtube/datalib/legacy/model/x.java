// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.model.v;
import com.google.android.apps.youtube.datalib.innertube.model.w;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            v, OfflineMediaStatus

public final class x
{

    private final String a;
    private final String b;
    private final Uri c;
    private final boolean d;
    private final long e;
    private final com.google.android.apps.youtube.datalib.legacy.model.v f;
    private final w g;
    private final OfflineMediaStatus h;
    private final com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status i;
    private final long j;
    private final long k;
    private final boolean l;

    public x(String s1, String s2, Uri uri, boolean flag, long l1, com.google.android.apps.youtube.datalib.legacy.model.v v1, 
            w w1, OfflineMediaStatus offlinemediastatus, com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status status, long l2, long l3, 
            boolean flag1)
    {
        a = (String)com.google.android.apps.youtube.common.fromguava.c.a(s1);
        b = (String)com.google.android.apps.youtube.common.fromguava.c.a(s2);
        c = uri;
        d = flag;
        e = l1;
        f = v1;
        g = w1;
        h = offlinemediastatus;
        i = status;
        j = l2;
        k = l3;
        l = flag1;
    }

    public final String a()
    {
        return a;
    }

    public final String a(Context context)
    {
        String s1 = null;
        if (q())
        {
            String s2 = g.b();
            s1 = s2;
            if (s2 == null)
            {
                s1 = context.getString(p.dt);
            }
        } else
        if (r())
        {
            if (f.f())
            {
                return context.getString(p.dh);
            }
            if (!f.b().c())
            {
                return f.b().i();
            }
        } else
        {
            if (s())
            {
                return context.getString(p.dj);
            }
            boolean flag;
            if (h == OfflineMediaStatus.NETWORK_READ_ERROR)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return context.getString(p.dl);
            }
            if (!l)
            {
                return context.getString(p.dk);
            } else
            {
                return context.getString(p.di);
            }
        }
        return s1;
    }

    public final String b()
    {
        return b;
    }

    public final Uri c()
    {
        return c;
    }

    public final boolean d()
    {
        return d;
    }

    public final long e()
    {
        return e;
    }

    public final com.google.android.apps.youtube.datalib.legacy.model.v f()
    {
        return f;
    }

    public final w g()
    {
        return g;
    }

    public final OfflineMediaStatus h()
    {
        return h;
    }

    public final long i()
    {
        return j;
    }

    public final long j()
    {
        return k;
    }

    public final boolean k()
    {
        return h == OfflineMediaStatus.ACTIVE;
    }

    public final boolean l()
    {
        return k() && i == com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.PENDING;
    }

    public final boolean m()
    {
        return h == OfflineMediaStatus.PAUSED;
    }

    public final boolean n()
    {
        return h == OfflineMediaStatus.COMPLETE;
    }

    public final int o()
    {
        if (k > 0L)
        {
            return (int)((j * 100L) / k);
        } else
        {
            return 0;
        }
    }

    public final boolean p()
    {
        return g != null && !g.c();
    }

    public final boolean q()
    {
        return p() && g.d();
    }

    public final boolean r()
    {
        return f != null && !f.e();
    }

    public final boolean s()
    {
        return h == OfflineMediaStatus.DISK_WRITE_ERROR;
    }

    public final boolean t()
    {
        return !k() && !m() && (r() || q() || !n() || !l);
    }

    public final boolean u()
    {
        while (k() || r() || m() || h == OfflineMediaStatus.CANNOT_OFFLINE || n()) 
        {
            return false;
        }
        return true;
    }

    public final boolean v()
    {
        return n() && !r();
    }

    public final boolean w()
    {
        return f != null && f.g() != null;
    }
}
