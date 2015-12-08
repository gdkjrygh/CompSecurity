// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;


// Referenced classes of package com.android.a:
//            p, ac

class q
    implements Runnable
{

    final p a;
    private final String b;
    private final long c;

    q(p p1, String s, long l)
    {
        a = p1;
        b = s;
        c = l;
        super();
    }

    public void run()
    {
        p.b(a).a(b, c);
        p.b(a).a(toString());
    }
}
