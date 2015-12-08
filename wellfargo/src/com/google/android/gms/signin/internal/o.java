// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import com.google.android.gms.common.api.s;
import com.google.android.gms.signin.g;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            e, q, p, i

class o extends e
{

    private final g a;
    private final ExecutorService b;

    public o(g g1, ExecutorService executorservice)
    {
        a = g1;
        b = executorservice;
    }

    private s a()
    {
        return a.d();
    }

    static s a(o o1)
    {
        return o1.a();
    }

    public void a(String s, String s1, i i)
    {
        b.submit(new q(this, s, s1, i));
    }

    public void a(String s, List list, i i)
    {
        b.submit(new p(this, list, s, i));
    }
}
