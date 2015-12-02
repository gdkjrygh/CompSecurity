// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class evy
    implements hst
{

    static final boolean a;
    private final evx b;
    private final hzb c;

    private evy(evx evx1, hzb hzb1)
    {
        if (!a && evx1 == null)
        {
            throw new AssertionError();
        }
        b = evx1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(evx evx1, hzb hzb1)
    {
        return new evy(evx1, hzb1);
    }

    private evk b()
    {
        return evx.a((cev)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!evy.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
