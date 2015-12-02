// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ewe
    implements hst
{

    static final boolean a;
    private final evx b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;
    private final hzb g;

    private ewe(evx evx1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5)
    {
        if (!a && evx1 == null)
        {
            throw new AssertionError();
        }
        b = evx1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        }
        e = hzb3;
        if (!a && hzb4 == null)
        {
            throw new AssertionError();
        }
        f = hzb4;
        if (!a && hzb5 == null)
        {
            throw new AssertionError();
        } else
        {
            g = hzb5;
            return;
        }
    }

    public static hst a(evx evx1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5)
    {
        return new ewe(evx1, hzb1, hzb2, hzb3, hzb4, hzb5);
    }

    private ewh b()
    {
        return evx.a((cev)c.a(), (evn)d.a(), (evt)e.a(), (ewg)f.a(), (dak)g.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ewe.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
