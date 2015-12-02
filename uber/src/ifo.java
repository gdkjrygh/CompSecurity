// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicLong;

public final class ifo
    implements icd
{

    final int a = 1;

    public ifo()
    {
    }

    private ick a(ick ick1)
    {
        ick ick2 = new ick(ick1) {

            int a;
            boolean b;
            final ick c;
            final ifo d;

            public final void a()
            {
                if (!b)
                {
                    b = true;
                    c.a();
                }
            }

            public final void a(ich ich)
            {
                c.a(new ich(this, ich) {

                    final AtomicLong a = new AtomicLong(0L);
                    final ich b;
                    final _cls1 c;

                    public final void a(long l)
                    {
                        long l1;
                        long l2;
                        if (l > 0L && !c.b)
                        {
                            do
                            {
                                l1 = a.get();
                                l2 = Math.min(l, (long)c.d.a - l1);
                                if (l2 == 0L)
                                {
                                    break;
                                }
                                if (!a.compareAndSet(l1, l1 + l2))
                                {
                                    continue;
                                }
                                b.a(l2);
                                break;
                            } while (true);
                        }
                    }

            
            {
                c = _pcls1;
                b = ich1;
                super();
            }
                });
            }

            public final void a(Object obj)
            {
                if (c())
                {
                    break MISSING_BLOCK_LABEL_67;
                }
                int i = a + 1;
                a = i;
                if (i >= d.a)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                c.a(obj);
                if (!i || b)
                {
                    break MISSING_BLOCK_LABEL_67;
                }
                b = true;
                c.a();
                b();
                return;
                obj;
                b();
                throw obj;
            }

            public final void a(Throwable throwable)
            {
                if (b)
                {
                    break MISSING_BLOCK_LABEL_24;
                }
                b = true;
                c.a(throwable);
                b();
                return;
                throwable;
                b();
                throw throwable;
            }

            
            {
                d = ifo.this;
                c = ick1;
                super();
            }
        };
        if (a == 0)
        {
            ick1.a();
            ick2.b();
        }
        ick1.a(ick2);
        return ick2;
    }

    public final volatile Object a(Object obj)
    {
        return a((ick)obj);
    }
}
