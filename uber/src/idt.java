// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicBoolean;

final class idt extends AtomicBoolean
    implements icc
{

    private static final long serialVersionUID = 0xd8e555c98d8dfdb2L;
    final ids a;

    public idt(ids ids1)
    {
        a = ids1;
    }

    private void a(ick ick1)
    {
        idu idu1 = new idu(ick1, a);
        a.a(idu1);
        ick1.a(idu1);
        ick1.a(idu1);
        if (!get() && compareAndSet(false, true))
        {
            a.b();
        }
    }

    public final void call(Object obj)
    {
        a((ick)obj);
    }
}
