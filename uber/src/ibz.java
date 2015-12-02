// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ibz extends Enum
{

    public static final ibz a;
    public static final ibz b;
    public static final ibz c;
    private static final ibz d[];

    private ibz(String s, int i)
    {
        super(s, i);
    }

    public static ibz valueOf(String s)
    {
        return (ibz)Enum.valueOf(ibz, s);
    }

    public static ibz[] values()
    {
        return (ibz[])d.clone();
    }

    static 
    {
        a = new ibz("OnNext", 0);
        b = new ibz("OnError", 1);
        c = new ibz("OnCompleted", 2);
        d = (new ibz[] {
            a, b, c
        });
    }
}
