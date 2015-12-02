// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fvt extends Enum
{

    public static final fvt a;
    public static final fvt b;
    private static final fvt c[];

    private fvt(String s, int i)
    {
        super(s, i);
    }

    public static fvt valueOf(String s)
    {
        return (fvt)Enum.valueOf(fvt, s);
    }

    public static fvt[] values()
    {
        return (fvt[])c.clone();
    }

    static 
    {
        a = new fvt("HOTSPOT", 0);
        b = new fvt("WALKING_ESTIMATOR", 1);
        c = (new fvt[] {
            a, b
        });
    }
}
