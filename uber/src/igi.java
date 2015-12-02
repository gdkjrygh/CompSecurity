// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class igi extends ica
{

    private final Object b;

    private igi(Object obj)
    {
        super(new icc(obj) {

            final Object a;

            private void a(ick ick1)
            {
                ick1.a(a);
                ick1.a();
            }

            public final void call(Object obj1)
            {
                a((ick)obj1);
            }

            
            {
                a = obj;
                super();
            }
        });
        b = obj;
    }

    public static final igi a(Object obj)
    {
        return new igi(obj);
    }

    static Object a(igi igi1)
    {
        return igi1.b;
    }

    public final Object a()
    {
        return b;
    }

    public final ica c(ici ici)
    {
        if (ici instanceof ifu)
        {
            return a(new igj((ifu)ici, b));
        } else
        {
            return a(new igk(ici, b));
        }
    }

    public final ica i(idi idi)
    {
        return a(new icc(idi) {

            final idi a;
            final igi b;

            private void a(ick ick1)
            {
                ica ica1 = (ica)a.a(igi.a(b));
                if (ica1.getClass() == igi)
                {
                    ick1.a(igi.a((igi)ica1));
                    ick1.a();
                    return;
                } else
                {
                    ica1.a(new ick(this, ick1, ick1) {

                        final ick a;
                        final _cls2 b;

                        public final void a()
                        {
                            a.a();
                        }

                        public final void a(Object obj)
                        {
                            a.a(obj);
                        }

                        public final void a(Throwable throwable)
                        {
                            a.a(throwable);
                        }

            
            {
                b = _pcls2;
                a = ick2;
                super(ick1);
            }
                    });
                    return;
                }
            }

            public final void call(Object obj)
            {
                a((ick)obj);
            }

            
            {
                b = igi.this;
                a = idi1;
                super();
            }
        });
    }
}
