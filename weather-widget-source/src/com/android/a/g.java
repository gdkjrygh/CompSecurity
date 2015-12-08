// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.a:
//            w, h, p, t, 
//            i, aa

public class g
    implements w
{

    private final Executor a;

    public g(Handler handler)
    {
        a = new h(this, handler);
    }

    public void a(p p1, aa aa)
    {
        p1.a("post-error");
        aa = t.a(aa);
        a.execute(new i(this, p1, aa, null));
    }

    public void a(p p1, t t1)
    {
        a(p1, t1, null);
    }

    public void a(p p1, t t1, Runnable runnable)
    {
        p1.v();
        p1.a("post-response");
        a.execute(new i(this, p1, t1, runnable));
    }
}
