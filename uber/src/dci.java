// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dci extends Enum
{

    public static final dci a;
    public static final dci b;
    public static final dci c;
    private static final dci d[];

    private dci(String s, int i)
    {
        super(s, i);
    }

    public static dci valueOf(String s)
    {
        return (dci)Enum.valueOf(dci, s);
    }

    public static dci[] values()
    {
        return (dci[])d.clone();
    }

    static 
    {
        a = new dci("HISTORIC", 0);
        b = new dci("HOME", 1);
        c = new dci("WORK", 2);
        d = (new dci[] {
            a, b, c
        });
    }
}
