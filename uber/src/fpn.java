// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fpn
    implements hst
{

    static final boolean a;
    private final fpl b;
    private final hzb c;

    private fpn(fpl fpl1, hzb hzb1)
    {
        if (!a && fpl1 == null)
        {
            throw new AssertionError();
        }
        b = fpl1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(fpl fpl1, hzb hzb1)
    {
        return new fpn(fpl1, hzb1);
    }

    private fpj b()
    {
        return fpl.b((cyz)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fpn.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
