// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicReference;

public final class ifr
    implements icd
{

    static final Object c = new Object();
    final idj a;
    final ica b;

    public ifr(ica ica1, idj idj)
    {
        b = ica1;
        a = idj;
    }

    private ick a(ick ick1)
    {
        ihv ihv1 = new ihv(ick1, false);
        ick1.a(ihv1);
        Object obj = new AtomicReference(c);
        ick1 = new ick(ihv1, ((AtomicReference) (obj)), ihv1) {

            final AtomicReference a;
            final ihv b;
            final ifr c;

            public final void a()
            {
                b.a();
                b.b();
            }

            public final void a(Object obj1)
            {
                Object obj2;
                obj2 = a.get();
                if (obj2 == ifr.c)
                {
                    break MISSING_BLOCK_LABEL_38;
                }
                obj1 = c.a.a(obj1, obj2);
                b.a(obj1);
                return;
                obj1;
                a(((Throwable) (obj1)));
                return;
            }

            public final void a(Throwable throwable)
            {
                b.a(throwable);
                b.b();
            }

            
            {
                c = ifr.this;
                a = atomicreference;
                b = ihv1;
                super(ick1, true);
            }
        };
        obj = new ick(((AtomicReference) (obj)), ihv1) {

            final AtomicReference a;
            final ihv b;
            final ifr c;

            public final void a()
            {
                if (a.get() == ifr.c)
                {
                    b.a();
                    b.b();
                }
            }

            public final void a(Object obj1)
            {
                a.set(obj1);
            }

            public final void a(Throwable throwable)
            {
                b.a(throwable);
                b.b();
            }

            
            {
                c = ifr.this;
                a = atomicreference;
                b = ihv1;
                super();
            }
        };
        ihv1.a(ick1);
        ihv1.a(((icl) (obj)));
        b.a(((ick) (obj)));
        return ick1;
    }

    public final volatile Object a(Object obj)
    {
        return a((ick)obj);
    }

}
