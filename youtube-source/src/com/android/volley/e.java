// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.volley:
//            p, f, Request, m, 
//            g, VolleyError

public final class e
    implements p
{

    private final Executor a;

    public e(Handler handler)
    {
        a = new f(this, handler);
    }

    public final void a(Request request, VolleyError volleyerror)
    {
        request.a("post-error");
        volleyerror = m.a(volleyerror);
        a.execute(new g(this, request, volleyerror, null));
    }

    public final void a(Request request, m m1)
    {
        request.q();
        request.a("post-response");
        a.execute(new g(this, request, m1, null));
    }
}
