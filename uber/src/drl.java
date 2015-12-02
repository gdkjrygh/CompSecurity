// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class drl
    implements hst
{

    static final boolean a;
    private final drj b;
    private final hzb c;
    private final hzb d;

    private drl(drj drj1, hzb hzb1, hzb hzb2)
    {
        if (!a && drj1 == null)
        {
            throw new AssertionError();
        }
        b = drj1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        } else
        {
            d = hzb2;
            return;
        }
    }

    public static hst a(drj drj1, hzb hzb1, hzb hzb2)
    {
        return new drl(drj1, hzb1, hzb2);
    }

    private dri b()
    {
        return b.a((gju)c.a(), (cys)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!drl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
