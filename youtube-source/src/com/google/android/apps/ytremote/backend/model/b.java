// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.model;

import com.google.android.apps.ytremote.model.LoungeToken;

// Referenced classes of package com.google.android.apps.ytremote.backend.model:
//            a, Method, Params

public final class b
{

    private String a;
    private Method b;
    private Params c;
    private LoungeToken d;
    private boolean e;

    public b()
    {
    }

    static LoungeToken a(b b1)
    {
        return b1.d;
    }

    static String b(b b1)
    {
        return b1.a;
    }

    static Method c(b b1)
    {
        return b1.b;
    }

    static Params d(b b1)
    {
        return b1.c;
    }

    static boolean e(b b1)
    {
        return b1.e;
    }

    public final a a()
    {
        return new a(this);
    }

    public final b a(Method method)
    {
        b = method;
        return this;
    }

    public final b a(Params params)
    {
        c = params;
        return this;
    }

    public final b a(LoungeToken loungetoken)
    {
        d = loungetoken;
        return this;
    }

    public final b a(String s)
    {
        a = s;
        return this;
    }

    public final void a(boolean flag)
    {
        e = true;
    }
}
