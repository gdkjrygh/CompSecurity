// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class dvx
{

    public dvx()
    {
    }

    public static dvx a(String s, boolean flag)
    {
        return c().a(s).a(flag);
    }

    private static dvx c()
    {
        return new dvy();
    }

    abstract dvx a(String s);

    abstract dvx a(boolean flag);

    public abstract boolean a();

    public abstract String b();
}
