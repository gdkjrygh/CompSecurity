// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class iiz
    implements icl
{

    static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(iiz, ija, "a");
    volatile ija a;

    public iiz()
    {
        a = new ija(false, ijd.a());
    }

    public final void a(icl icl1)
    {
        if (icl1 == null)
        {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        ija ija1;
        ija ija2;
        do
        {
            ija1 = a;
            if (ija1.a)
            {
                icl1.b();
                return;
            }
            ija2 = ija1.a(icl1);
        } while (!b.compareAndSet(this, ija1, ija2));
    }

    public final void b()
    {
        ija ija1;
        ija ija2;
        do
        {
            ija1 = a;
            if (ija1.a)
            {
                return;
            }
            ija2 = ija1.a();
        } while (!b.compareAndSet(this, ija1, ija2));
        ija1.b.b();
    }

    public final boolean c()
    {
        return a.a;
    }

}
