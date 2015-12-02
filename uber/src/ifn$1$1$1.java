// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class  extends ick
{

    final Thread a;
    final Thread b;

    public final void a()
    {
        b.b.b.a();
    }

    public final void a(ich ich)
    {
        b.b.b.a(new ich(ich) {

            final ich a;
            final ifn._cls1._cls1._cls1 b;

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
                b = ifn._cls1._cls1._cls1.this;
                a = ich1;
                super();
            }
        });
    }

    public final void a(Object obj)
    {
        b.b.b.a(obj);
    }

    public final void a(Throwable throwable)
    {
        b.b.b.a(throwable);
    }

    Thread(Thread thread, ick ick1, Thread thread1)
    {
        b = thread;
        a = thread1;
        super(ick1);
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


    // Unreferenced inner class ifn$1$1

/* anonymous class */
    final class ifn._cls1._cls1
        implements idd
    {

        final ica a;
        final ifn._cls1 b;

        public final void a()
        {
            Thread thread = Thread.currentThread();
            a.a(new ifn._cls1._cls1._cls1(this, b.a, thread));
        }

            
            {
                b = _pcls1;
                a = ica1;
                super();
            }
    }

}
