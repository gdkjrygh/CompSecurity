// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eea
    implements hst
{

    static final boolean a;
    private final edv b;

    private eea(edv edv1)
    {
        if (!a && edv1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = edv1;
            return;
        }
    }

    public static hst a(edv edv1)
    {
        return new eea(edv1);
    }

    private static eee b()
    {
        return edv.b();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!eea.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
