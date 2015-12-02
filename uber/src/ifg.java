// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class ifg
    implements icd
{

    final idi a;

    public ifg(idi idi)
    {
        a = idi;
    }

    private ick a(ick ick1)
    {
        ick ick2 = new ick(ick1) {

            final ick a;
            final ifg b;
            private boolean c;

            public final void a()
            {
                if (c)
                {
                    return;
                } else
                {
                    c = true;
                    a.a();
                    return;
                }
            }

            public final void a(ich ich)
            {
                a.a(new ich(this, ich) {

                    final ich a;
                    final _cls1 b;

                    public final void a(long l)
                    {
                        a.a(l);
                    }

            
            {
                b = _pcls1;
                a = ich1;
                super();
            }
                });
            }

            public final void a(Object obj)
            {
                if (c)
                {
                    return;
                } else
                {
                    a.a(obj);
                    return;
                }
            }

            public final void a(Throwable throwable)
            {
                if (c)
                {
                    icw.a(throwable);
                    return;
                }
                c = true;
                try
                {
                    iia.a().b();
                    b();
                    Object obj = b.a.a(throwable);
                    a.a(obj);
                }
                catch (Throwable throwable1)
                {
                    a.a(new icr(Arrays.asList(new Throwable[] {
                        throwable, throwable1
                    }), (byte)0));
                    return;
                }
                a.a();
            }

            
            {
                b = ifg.this;
                a = ick1;
                super();
                c = false;
            }
        };
        ick1.a(ick2);
        return ick2;
    }

    public final volatile Object a(Object obj)
    {
        return a((ick)obj);
    }
}
