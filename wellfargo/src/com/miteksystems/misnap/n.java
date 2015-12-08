// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;


// Referenced classes of package com.miteksystems.misnap:
//            k, t, MiSnap, MiSnapAPI, 
//            MitekAnalyzer

final class n
    implements Runnable
{

    final k a;

    n(k k1)
    {
        a = k1;
        super();
    }

    public final void run()
    {
        if (k.b(a) == null || k.c(a) == null || k.d(a) == null || k.d(a).f() || k.e(a))
        {
            k.f(a);
            return;
        }
        byte abyte0[];
        if (k.g(a).a.b())
        {
            abyte0 = (byte[])k.h(a).clone();
        } else
        {
            abyte0 = k.h(a);
        }
        k.c(a).a(abyte0, a.c, a.d);
        k.i(a);
        k.f(a);
    }
}
