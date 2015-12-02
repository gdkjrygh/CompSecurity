// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicBoolean;

final class iea
    implements ich
{

    final AtomicBoolean a = new AtomicBoolean();
    final ica b;
    final ick c;
    final ido d;
    final ieb e;

    public iea(ick ick, ica ica1, ido ido)
    {
        b = ica1;
        c = ick;
        d = ido;
        e = new ieb(ick, ido);
    }

    public final void a(long l)
    {
        e.b(l);
        if (a.compareAndSet(false, true))
        {
            b.a(e);
        }
    }
}
