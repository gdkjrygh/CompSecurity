// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ddu
    implements hst
{

    static final boolean a;
    private final ddn b;

    private ddu(ddn ddn1)
    {
        if (!a && ddn1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = ddn1;
            return;
        }
    }

    public static hst a(ddn ddn1)
    {
        return new ddu(ddn1);
    }

    private static glg b()
    {
        return ddn.b();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ddu.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
