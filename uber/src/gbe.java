// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gbe
    implements gbb
{

    private final fte a;

    public gbe(fte fte1)
    {
        a = fte1;
    }

    public final String a(boolean flag)
    {
        if (flag)
        {
            return "block";
        } else
        {
            return "building";
        }
    }

    public final boolean a()
    {
        return a.g() == 2;
    }

    public final boolean b()
    {
        return false;
    }

    public final boolean b(boolean flag)
    {
        return flag;
    }

    public final boolean c()
    {
        return true;
    }

    public final boolean d()
    {
        return true;
    }
}
