// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class emt
    implements hst
{

    static final boolean a;
    private final emq b;

    private emt(emq emq1)
    {
        if (!a && emq1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = emq1;
            return;
        }
    }

    public static hst a(emq emq1)
    {
        return new emt(emq1);
    }

    private static emu b()
    {
        return emq.a();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!emt.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
