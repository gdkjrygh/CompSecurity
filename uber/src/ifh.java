// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ifh extends ihq
{

    final ica b;
    final AtomicReference c;

    private ifh(icc icc, ica ica1, AtomicReference atomicreference)
    {
        super(icc);
        b = ica1;
        c = atomicreference;
    }

    public static ihq a(ica ica1)
    {
        AtomicReference atomicreference = new AtomicReference();
        return new ifh(new icc(atomicreference) {

            final AtomicReference a;

            private void a(ick ick1)
            {
                ifj ifj1;
                Object obj;
                do
                {
                    do
                    {
                        obj = (ifj)a.get();
                        if (obj != null)
                        {
                            ifj1 = ((ifj) (obj));
                            if (!((ifj) (obj)).c())
                            {
                                break;
                            }
                        }
                        ifj1 = new ifj(a);
                        ifj1.e();
                    } while (!a.compareAndSet(obj, ifj1));
                    obj = new ifi(ifj1, ick1);
                } while (!ifj1.a(((ifi) (obj))));
                ick1.a(((icl) (obj)));
                ick1.a(((ich) (obj)));
            }

            public final void call(Object obj)
            {
                a((ick)obj);
            }

            
            {
                a = atomicreference;
                super();
            }
        }, ica1, atomicreference);
    }

    public final void d(ide ide1)
    {
        ifj ifj1;
        ifj ifj2;
        do
        {
            ifj2 = (ifj)c.get();
            if (ifj2 != null)
            {
                ifj1 = ifj2;
                if (!ifj2.c())
                {
                    break;
                }
            }
            ifj1 = new ifj(c);
            ifj1.e();
        } while (!c.compareAndSet(ifj2, ifj1));
        boolean flag;
        if (!ifj1.h.get() && ifj1.h.compareAndSet(false, true))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ide1.call(ifj1);
        if (flag)
        {
            b.a(ifj1);
        }
    }
}
