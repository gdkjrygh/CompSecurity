// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class ijb
    implements icl
{

    static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ijb, ijc, "a");
    volatile ijc a;

    public ijb()
    {
        a = new ijc(false, ijd.a());
    }

    public final void a(icl icl1)
    {
        if (icl1 == null)
        {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        ijc ijc1;
        ijc ijc2;
        do
        {
            ijc1 = a;
            if (ijc1.a)
            {
                icl1.b();
                return;
            }
            ijc2 = ijc1.a(icl1);
        } while (!b.compareAndSet(this, ijc1, ijc2));
        ijc1.b.b();
    }

    public final void b()
    {
        ijc ijc1;
        ijc ijc2;
        do
        {
            ijc1 = a;
            if (ijc1.a)
            {
                return;
            }
            ijc2 = ijc1.a();
        } while (!b.compareAndSet(this, ijc1, ijc2));
        ijc1.b.b();
    }

    public final boolean c()
    {
        return a.a;
    }

}
