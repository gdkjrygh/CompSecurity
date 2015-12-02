// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class g.Object
    implements idd
{

    final ica a;
    final g.Thread b;

    public final void a()
    {
        Thread thread = Thread.currentThread();
        a.a(new ick(b.b, thread) {

            final Thread a;
            final ifn._cls1._cls1 b;

            public final void a()
            {
                b.b.a.a();
            }

            public final void a(ich ich)
            {
                b.b.a.a(new ich(this, ich) {

                    final ich a;
                    final _cls1 b;

                    public final void a(long l)
                    {
                        if (Thread.currentThread() == b.a)
                        {
                            a.a(l);
                            return;
                        } else
                        {
                            b.b.b.b.a(new idd(this, l) {

                                final long a;
                                final _cls1 b;

                                public final void a()
                                {
                                    b.a.a(a);
                                }

            
            {
                b = _pcls1;
                a = l;
                super();
            }
                            });
                            return;
                        }
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
                b.b.a.a(obj);
            }

            public final void a(Throwable throwable)
            {
                b.b.a.a(throwable);
            }

            
            {
                b = ifn._cls1._cls1.this;
                a = thread;
                super(ick1);
            }
        });
    }

    t>(t> t>, ica ica1)
    {
        b = t>;
        a = ica1;
        super();
    }

    // Unreferenced inner class ifn$1

/* anonymous class */
    final class ifn._cls1 extends ick
    {

        final ick a;
        final icj b;
        final ifn c;

        private void a(ica ica1)
        {
            b.a(new ifn._cls1._cls1(this, ica1));
        }

        public final void a()
        {
        }

        public final volatile void a(Object obj)
        {
            a((ica)obj);
        }

        public final void a(Throwable throwable)
        {
            a.a(throwable);
        }

            
            {
                c = ifn1;
                a = ick2;
                b = icj1;
                super(ick1);
            }
    }

}
