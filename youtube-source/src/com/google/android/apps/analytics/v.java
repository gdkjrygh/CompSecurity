// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            aa, t, u, n, 
//            h

final class v
    implements aa
{

    final t a;

    private v(t t1)
    {
        a = t1;
        super();
    }

    v(t t1, byte byte0)
    {
        this(t1);
    }

    public final void a()
    {
        n n1;
        if (t.i(a) != null)
        {
            if ((n1 = t.i(a).a()) != null)
            {
                t.e(a).a(n1.b);
                return;
            }
        }
    }

    public final void a(int i)
    {
        t.b(a, i);
    }

    public final void a(boolean flag)
    {
        t.a(a, 1);
    }
}
