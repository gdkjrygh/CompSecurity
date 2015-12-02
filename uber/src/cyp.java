// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cyp
    implements hst
{

    static final boolean a;
    private final hsr b;
    private final hzb c;

    private cyp(hsr hsr1, hzb hzb1)
    {
        if (!a && hsr1 == null)
        {
            throw new AssertionError();
        }
        b = hsr1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(hsr hsr1, hzb hzb1)
    {
        return new cyp(hsr1, hzb1);
    }

    private cyo b()
    {
        cyo cyo1 = new cyo((gmc)c.a());
        b.injectMembers(cyo1);
        return cyo1;
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!cyp.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
