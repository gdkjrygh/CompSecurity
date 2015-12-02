// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eyh extends Enum
{

    public static final eyh a;
    public static final eyh b;
    public static final eyh c;
    private static final eyh d[];

    private eyh(String s, int i)
    {
        super(s, i);
    }

    public static eyh valueOf(String s)
    {
        return (eyh)Enum.valueOf(eyh, s);
    }

    public static eyh[] values()
    {
        return (eyh[])d.clone();
    }

    static 
    {
        a = new eyh("FINISH_ON_SAVE", 0);
        b = new eyh("GOTO_ADD_PAYMENT_ON_SAVE", 1);
        c = new eyh("GOTO_SET_DEFAULT_PAYMENT_ON_SAVE", 2);
        d = (new eyh[] {
            a, b, c
        });
    }
}
