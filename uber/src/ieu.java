// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ieu
    implements icd
{

    private final idi a;

    public ieu(idi idi)
    {
        a = idi;
    }

    private ick a(ick ick1)
    {
        return new ick(ick1, ick1) {

            final ick a;
            final ieu b;

            public final void a()
            {
                a.a();
            }

            public final void a(Object obj)
            {
                try
                {
                    a.a(ieu.a(b).a(obj));
                    return;
                }
                catch (Throwable throwable)
                {
                    icw.a(throwable);
                    a(ida.a(throwable, obj));
                    return;
                }
            }

            public final void a(Throwable throwable)
            {
                a.a(throwable);
            }

            
            {
                b = ieu.this;
                a = ick2;
                super(ick1);
            }
        };
    }

    static idi a(ieu ieu1)
    {
        return ieu1.a;
    }

    public final volatile Object a(Object obj)
    {
        return a((ick)obj);
    }
}
