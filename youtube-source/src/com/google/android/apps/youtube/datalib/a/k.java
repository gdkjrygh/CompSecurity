// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.a;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.v;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.datalib.a:
//            l

public final class k
    implements l, Future
{

    private final v a = v.a();

    private k()
    {
    }

    public static k a()
    {
        return new k();
    }

    public final void a(VolleyError volleyerror)
    {
        a.a(volleyerror);
    }

    public final void a(Object obj)
    {
        a.a(obj);
    }

    public final boolean cancel(boolean flag)
    {
        return a.cancel(flag);
    }

    public final Object get()
    {
        c.b();
        return a.get();
    }

    public final Object get(long l1, TimeUnit timeunit)
    {
        c.b();
        return a.get(l1, timeunit);
    }

    public final boolean isCancelled()
    {
        return a.isCancelled();
    }

    public final boolean isDone()
    {
        return a.isDone();
    }
}
