// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class doz
    implements icf
{

    private final dox a;
    private final gmg b;

    private doz(dox dox1, gmg gmg1)
    {
        a = dox1;
        b = gmg1;
    }

    doz(dox dox1, gmg gmg1, byte byte0)
    {
        this(dox1, gmg1);
    }

    private ica a(ica ica1)
    {
        ica ica2 = ica1;
        if (b.a(dbf.bn))
        {
            ica2 = ica1;
            if (a.a() != null)
            {
                ica2 = ica1.c(a.a());
            }
        }
        return ica2;
    }

    public final volatile Object a(Object obj)
    {
        return a((ica)obj);
    }
}
