// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class iiu
    implements icc
{

    static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(iiu, iiv, "a");
    static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(iiu, java/lang/Object, "c");
    volatile iiv a;
    volatile Object c;
    boolean e;
    ide f;
    ide g;
    ide h;
    public final idv i = idv.a();

    iiu()
    {
        a = iiv.e;
        e = true;
        f = idf.a();
        g = idf.a();
        h = idf.a();
    }

    private void a(ick ick1)
    {
        iiw iiw1 = new iiw(ick1);
        a(ick1, iiw1);
        f.call(iiw1);
        if (!ick1.c() && b(iiw1) && ick1.c())
        {
            a(iiw1);
        }
    }

    private void a(ick ick1, iiw iiw1)
    {
        ick1.a(ijd.a(new idd(iiw1) {

            final iiw a;
            final iiu b;

            public final void a()
            {
                b.a(a);
            }

            
            {
                b = iiu.this;
                a = iiw1;
                super();
            }
        }));
    }

    private boolean b(iiw iiw1)
    {
        iiv iiv1;
        iiv iiv2;
        do
        {
            iiv1 = a;
            if (iiv1.a)
            {
                h.call(iiw1);
                return false;
            }
            iiv2 = iiv1.a(iiw1);
        } while (!b.compareAndSet(this, iiv1, iiv2));
        g.call(iiw1);
        return true;
    }

    private void c(Object obj)
    {
        c = obj;
    }

    final Object a()
    {
        return c;
    }

    final void a(iiw iiw1)
    {
        iiv iiv1;
        iiv iiv2;
        do
        {
            iiv1 = a;
            if (iiv1.a)
            {
                return;
            }
        } while ((iiv2 = iiv1.b(iiw1)) != iiv1 && !b.compareAndSet(this, iiv1, iiv2));
    }

    final iiw[] a(Object obj)
    {
        c(obj);
        return a.b;
    }

    final iiw[] b()
    {
        return a.b;
    }

    final iiw[] b(Object obj)
    {
        c(obj);
        e = false;
        if (a.a)
        {
            return iiv.c;
        } else
        {
            return ((iiv)b.getAndSet(this, iiv.d)).b;
        }
    }

    public final void call(Object obj)
    {
        a((ick)obj);
    }

}
