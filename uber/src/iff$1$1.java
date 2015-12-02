// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class t> extends ick
{

    final g.Throwable a;

    public final void a()
    {
        a.a.a();
    }

    public final void a(ich ich)
    {
        a.a.a(ich);
    }

    public final void a(Object obj)
    {
        a.a.a(obj);
    }

    public final void a(Throwable throwable)
    {
        a.a.a(throwable);
    }

    t>(t> t>)
    {
        a = t>;
        super();
    }

    // Unreferenced inner class iff$1

/* anonymous class */
    final class iff._cls1 extends ick
    {

        final ick a;
        final ifs b;
        final ijb c;
        final iff d;
        private boolean e;

        public final void a()
        {
            if (e)
            {
                return;
            } else
            {
                e = true;
                a.a();
                return;
            }
        }

        public final void a(ich ich)
        {
            b.a(ich);
        }

        public final void a(Object obj)
        {
            if (e)
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
            if (e)
            {
                icw.a(throwable);
                return;
            }
            e = true;
            try
            {
                iia.a().b();
                b();
                iff._cls1._cls1 _lcls1 = new iff._cls1._cls1(this);
                c.a(_lcls1);
                ((ica)iff.a(d).a(throwable)).a(_lcls1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                a.a(throwable);
            }
        }

            
            {
                d = iff1;
                a = ick1;
                b = ifs1;
                c = ijb1;
                super();
                e = false;
            }
    }

}
