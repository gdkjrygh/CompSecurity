// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class edw
    implements hst
{

    static final boolean a;
    private final edv b;

    private edw(edv edv1)
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
        return new edw(edv1);
    }

    private static rw b()
    {
        rw rw = edv.a();
        if (rw == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return rw;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!edw.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
