// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;


// Referenced classes of package com.miteksystems.misnap:
//            t, b

final class af
    implements Runnable
{

    final t a;

    af(t t1)
    {
        a = t1;
        super();
    }

    public final void run()
    {
        t.f(a);
        if (t.g(a) != null && t.g(a).a())
        {
            t.g(a).c();
        }
    }
}
