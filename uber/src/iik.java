// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

final class iik extends icj
    implements icl
{

    final iix a;
    final iij b;

    private iik(iij iij1)
    {
        b = iij1;
        super();
        a = new iix();
    }

    iik(iij iij1, byte byte0)
    {
        this(iij1);
    }

    public final icl a(idd idd1)
    {
        idd1.a();
        return ijd.b();
    }

    public final icl a(idd idd1, long l, TimeUnit timeunit)
    {
        return a(((idd) (new iin(idd1, this, iij.b() + timeunit.toMillis(l)))));
    }

    public final void b()
    {
        a.b();
    }

    public final boolean c()
    {
        return a.c();
    }
}
