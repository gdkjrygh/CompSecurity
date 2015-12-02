// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dcz extends Enum
    implements cid
{

    public static final dcz a;
    public static final dcz b;
    public static final dcz c;
    private static final dcz d[];

    private dcz(String s, int i)
    {
        super(s, i);
    }

    public static dcz valueOf(String s)
    {
        return (dcz)Enum.valueOf(dcz, s);
    }

    public static dcz[] values()
    {
        return (dcz[])d.clone();
    }

    static 
    {
        a = new dcz("BACKGROUND", 0);
        b = new dcz("CRASH", 1);
        c = new dcz("FOREGROUND", 2);
        d = (new dcz[] {
            a, b, c
        });
    }
}
