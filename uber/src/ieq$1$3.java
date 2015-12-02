// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class g.Object
    implements idd
{

    final Object a;
    final g.Object b;

    public final void a()
    {
        if (!b.b)
        {
            b.b.a(a);
        }
    }

    g.Object( , Object obj)
    {
        b = ;
        a = obj;
        super();
    }

    // Unreferenced inner class ieq$1

/* anonymous class */
    final class ieq._cls1 extends ick
    {

        boolean a;
        final icj b;
        final ick c;
        final ieq d;

        public final void a()
        {
            b.a(new ieq._cls1._cls1(), d.b, d.c);
        }

        public final void a(Object obj)
        {
            b.a(new ieq._cls1._cls3(this, obj), d.b, d.c);
        }

        public final void a(Throwable throwable)
        {
            b.a(new ieq._cls1._cls2(throwable));
        }

            
            {
                d = ieq1;
                b = icj1;
                c = ick2;
                super(ick1);
            }

        // Unreferenced inner class ieq$1$1

/* anonymous class */
        final class ieq._cls1._cls1
            implements idd
        {

            final ieq._cls1 a;

            public final void a()
            {
                if (!a.a)
                {
                    a.a = true;
                    a.c.a();
                }
            }

                    
                    {
                        a = ieq._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class ieq$1$2

/* anonymous class */
        final class ieq._cls1._cls2
            implements idd
        {

            final Throwable a;
            final ieq._cls1 b;

            public final void a()
            {
                if (!b.a)
                {
                    b.a = true;
                    b.c.a(a);
                    b.b.b();
                }
            }

                    
                    {
                        b = ieq._cls1.this;
                        a = throwable;
                        super();
                    }
        }

    }

}
