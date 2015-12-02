// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ier
    implements icd
{

    private final icg a;

    public ier(icg icg)
    {
        a = icg;
    }

    static icg a(ier ier1)
    {
        return ier1.a;
    }

    private ick a(ick ick1)
    {
        return new ick(ick1, ick1) {

            final ick a;
            final ier b;
            private boolean c;

            public final void a()
            {
                if (c)
                {
                    return;
                }
                try
                {
                    ier.a(b).a();
                }
                catch (Throwable throwable)
                {
                    a(throwable);
                    return;
                }
                c = true;
                a.a();
            }

            public final void a(Object obj)
            {
                if (c)
                {
                    return;
                }
                try
                {
                    ier.a(b).a(obj);
                }
                catch (Throwable throwable)
                {
                    a(ida.a(throwable, obj));
                    return;
                }
                a.a(obj);
            }

            public final void a(Throwable throwable)
            {
                icw.a(throwable);
                if (c)
                {
                    return;
                }
                c = true;
                try
                {
                    ier.a(b).a(throwable);
                }
                // Misplaced declaration of an exception variable
                catch (Throwable throwable)
                {
                    a.a(throwable);
                    return;
                }
                a.a(throwable);
            }

            
            {
                b = ier.this;
                a = ick2;
                super(ick1);
                c = false;
            }
        };
    }

    public final volatile Object a(Object obj)
    {
        return a((ick)obj);
    }
}
