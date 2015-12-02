// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class dvf
    implements idi
{

    private final long a;
    private final int b;
    private final ici c;
    private final TimeUnit d;
    private int e;

    private dvf(long l, int i, ici ici, TimeUnit timeunit)
    {
        a = l;
        b = i;
        c = ici;
        d = timeunit;
    }

    static int a(dvf dvf1)
    {
        return dvf1.b;
    }

    public static dvf a(TimeUnit timeunit, ici ici)
    {
        return new dvf(4L, -1, ici, timeunit);
    }

    private ica a(ica ica1)
    {
        return ica1.b(new idi() {

            final dvf a;

            private ica a(Throwable throwable)
            {
                if (dvf.a(a) == -1 || dvf.b(a) < dvf.a(a))
                {
                    return ica.a(dvf.c(a), dvf.d(a), dvf.e(a));
                } else
                {
                    return ica.b(throwable);
                }
            }

            public final volatile Object a(Object obj)
            {
                return a((Throwable)obj);
            }

            
            {
                a = dvf.this;
                super();
            }
        });
    }

    static int b(dvf dvf1)
    {
        int i = dvf1.e + 1;
        dvf1.e = i;
        return i;
    }

    public static dvf b(TimeUnit timeunit, ici ici)
    {
        return new dvf(5L, 5, ici, timeunit);
    }

    static long c(dvf dvf1)
    {
        return dvf1.a;
    }

    static TimeUnit d(dvf dvf1)
    {
        return dvf1.d;
    }

    static ici e(dvf dvf1)
    {
        return dvf1.c;
    }

    public final volatile Object a(Object obj)
    {
        return a((ica)obj);
    }
}
