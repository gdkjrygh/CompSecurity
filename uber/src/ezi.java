// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ezi extends Enum
{

    public static final ezi a;
    public static final ezi b;
    public static final ezi c;
    public static final ezi d;
    public static final ezi e;
    public static final ezi f;
    private static final ezi g[];

    private ezi(String s, int i)
    {
        super(s, i);
    }

    public static ezi valueOf(String s)
    {
        return (ezi)Enum.valueOf(ezi, s);
    }

    public static ezi[] values()
    {
        return (ezi[])g.clone();
    }

    static 
    {
        a = new ezi("CONCUR", 0);
        b = new ezi("DEFAULT_PAYMENT", 1);
        c = new ezi("RECEIPTS_EMAIL", 2);
        d = new ezi("WEEKLY_SUMMARY", 3);
        e = new ezi("TRAVEL_REPORTS", 4);
        f = new ezi("MONTHLY_SUMMARY", 5);
        g = (new ezi[] {
            a, b, c, d, e, f
        });
    }
}
