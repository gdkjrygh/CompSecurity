// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class t> extends ick
{

    final ick a;
    final g.Throwable b;

    private void a(iby iby1)
    {
        if (iby1.e() && ief.b(b.b))
        {
            a.a();
            return;
        }
        if (iby1.d() && ief.c(b.b))
        {
            a.a(iby1.c());
            return;
        } else
        {
            a.a(iby1);
            return;
        }
    }

    public final void a()
    {
        a.a();
    }

    public final void a(ich ich1)
    {
        ich1.a(0x7fffffffffffffffL);
    }

    public final volatile void a(Object obj)
    {
        a((iby)obj);
    }

    public final void a(Throwable throwable)
    {
        a.a(throwable);
    }

    ( , ick ick1, ick ick2)
    {
        b = ;
        a = ick2;
        super(ick1);
    }

    // Unreferenced inner class ief$3

/* anonymous class */
    final class ief._cls3
        implements icd
    {

        final ief a;

        private ick a(ick ick1)
        {
            return new ief._cls3._cls1(this, ick1, ick1);
        }

        public final volatile Object a(Object obj)
        {
            return a((ick)obj);
        }

            
            {
                a = ief1;
                super();
            }
    }

}
