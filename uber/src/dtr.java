// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dtr
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;

    private dtr(hsr hsr1, hzb hzb1)
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

    public static hsr a(hsr hsr1, hzb hzb1)
    {
        return new dtr(hsr1, hzb1);
    }

    private void a(dtp dtp1)
    {
        if (dtp1 == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(dtp1);
            dtp1.a = (gmg)c.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((dtp)obj);
    }

    static 
    {
        boolean flag;
        if (!dtr.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
