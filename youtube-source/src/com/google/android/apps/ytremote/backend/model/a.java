// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.model;

import com.google.android.apps.ytremote.model.LoungeToken;

// Referenced classes of package com.google.android.apps.ytremote.backend.model:
//            b, Method, Params

public final class a
{

    private final String a;
    private final Method b;
    private final Params c;
    private final LoungeToken d;
    private final boolean e;

    public a(b b1)
    {
        d = com.google.android.apps.ytremote.backend.model.b.a(b1);
        a = com.google.android.apps.ytremote.backend.model.b.b(b1);
        b = com.google.android.apps.ytremote.backend.model.b.c(b1);
        c = com.google.android.apps.ytremote.backend.model.b.d(b1);
        e = com.google.android.apps.ytremote.backend.model.b.e(b1);
    }

    public final String a()
    {
        return a;
    }

    public final Method b()
    {
        return b;
    }

    public final Params c()
    {
        return c;
    }

    public final LoungeToken d()
    {
        return d;
    }

    public final boolean e()
    {
        return a != null;
    }

    public final boolean f()
    {
        return b != null;
    }

    public final boolean g()
    {
        return c != null;
    }

    public final boolean h()
    {
        return d != null;
    }

    public final boolean i()
    {
        return e;
    }
}
