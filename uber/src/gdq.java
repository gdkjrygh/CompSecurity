// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gdq extends Enum
{

    public static final gdq a;
    public static final gdq b;
    public static final gdq c;
    private static final gdq d[];

    private gdq(String s, int i)
    {
        super(s, i);
    }

    public static gdq valueOf(String s)
    {
        return (gdq)Enum.valueOf(gdq, s);
    }

    public static gdq[] values()
    {
        return (gdq[])d.clone();
    }

    static 
    {
        a = new gdq("OPEN", 0);
        b = new gdq("CLOSED", 1);
        c = new gdq("SLIDING", 2);
        d = (new gdq[] {
            a, b, c
        });
    }
}
