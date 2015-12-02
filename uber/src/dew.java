// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dew
    implements hst
{

    static final boolean a;
    private final dei b;

    private dew(dei dei1)
    {
        if (!a && dei1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = dei1;
            return;
        }
    }

    public static hst a(dei dei1)
    {
        return new dew(dei1);
    }

    private static grb b()
    {
        return dei.a();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dew.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
