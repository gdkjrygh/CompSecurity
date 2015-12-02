// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fxm extends Enum
{

    public static final fxm a;
    public static final fxm b;
    public static final fxm c;
    public static final fxm d;
    private static final fxm e[];

    private fxm(String s, int i)
    {
        super(s, i);
    }

    public static fxm valueOf(String s)
    {
        return (fxm)Enum.valueOf(fxm, s);
    }

    public static fxm[] values()
    {
        return (fxm[])e.clone();
    }

    static 
    {
        a = new fxm("NO_CHANGE", 0);
        b = new fxm("LOGO_TO_PRODUCT_GROUPS", 1);
        c = new fxm("PRODUCT_GROUP_REPLACED", 2);
        d = new fxm("PRODUCT_GROUP_ADDED_TO_RIGHT", 3);
        e = (new fxm[] {
            a, b, c, d
        });
    }
}
