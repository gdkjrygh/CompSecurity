// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iet
    implements icd
{

    private final idi a;

    public iet(idi idi)
    {
        a = idi;
    }

    private ick a(ick ick1)
    {
        return new ick(ick1, ick1) {

            final ick a;
            final iet b;

            public final void a()
            {
                a.a();
            }

            public final void a(Object obj)
            {
                if (((Boolean)iet.a(b).a(obj)).booleanValue())
                {
                    a.a(obj);
                    return;
                }
                try
                {
                    a(1L);
                    return;
                }
                catch (Throwable throwable)
                {
                    a.a(ida.a(throwable, obj));
                }
                return;
            }

            public final void a(Throwable throwable)
            {
                a.a(throwable);
            }

            
            {
                b = iet.this;
                a = ick2;
                super(ick1);
            }
        };
    }

    static idi a(iet iet1)
    {
        return iet1.a;
    }

    public final volatile Object a(Object obj)
    {
        return a((ick)obj);
    }
}
