// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ent
    implements hst
{

    static final boolean a;
    private final ens b;
    private final hzb c;

    private ent(ens ens1, hzb hzb1)
    {
        if (!a && ens1 == null)
        {
            throw new AssertionError();
        }
        b = ens1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(ens ens1, hzb hzb1)
    {
        return new ent(ens1, hzb1);
    }

    private doa b()
    {
        return ens.a((gmg)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
