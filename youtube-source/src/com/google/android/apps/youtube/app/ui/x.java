// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            y, aa, w, ab

final class x
{

    final w a;
    private final Integer b;
    private final ab c;
    private final aa d;
    private boolean e;

    public x(w w, Integer integer, aa aa1, ab ab)
    {
        a = w;
        super();
        b = integer;
        c = ab;
        d = aa1;
    }

    public x(w w, Integer integer, String s, int i, ab ab)
    {
        a = w;
        super();
        b = integer;
        c = ab;
        e = true;
        d = new y(this, w, s, i);
    }

    static boolean a(x x1)
    {
        return x1.e;
    }

    public final Integer a()
    {
        return b;
    }

    public final void a(boolean flag)
    {
        e = flag;
    }

    public final String b()
    {
        return d.b();
    }

    public final int c()
    {
        return d.c();
    }

    public final boolean d()
    {
        return d.a();
    }

    public final ab e()
    {
        return c;
    }
}
