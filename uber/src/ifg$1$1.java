// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

final class g.Object
    implements ich
{

    final ich a;
    final a b;

    public final void a(long l)
    {
        a.a(l);
    }

    t>(t> t>, ich ich1)
    {
        b = t>;
        a = ich1;
        super();
    }

    // Unreferenced inner class ifg$1

/* anonymous class */
    final class ifg._cls1 extends ick
    {

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

        public final void a(ich ich1)
        {
            a.a(new ifg._cls1._cls1(this, ich1));
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
                b = ifg1;
                a = ick1;
                super();
                c = false;
            }
    }

}
