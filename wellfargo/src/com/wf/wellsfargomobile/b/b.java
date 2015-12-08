// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.b;

import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.wf.wellsfargomobile.b:
//            a

class b
    implements Runnable
{

    final String a;
    final String b;
    final String c;
    final a d;

    b(a a1, String s, String s1, String s2)
    {
        d = a1;
        a = s;
        b = s1;
        c = s2;
        super();
    }

    public void run()
    {
        d.b(a, b, c);
        com.wf.wellsfargomobile.b.a.a(d).getAndDecrement();
    }
}
