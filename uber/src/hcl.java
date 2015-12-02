// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hcl extends Enum
    implements gmv
{

    public static final hcl a;
    public static final hcl b;
    public static final hcl c;
    public static final hcl d;
    private static final hcl e[];

    private hcl(String s, int i)
    {
        super(s, i);
    }

    public static hcl valueOf(String s)
    {
        return (hcl)Enum.valueOf(hcl, s);
    }

    public static hcl[] values()
    {
        return (hcl[])e.clone();
    }

    static 
    {
        a = new hcl("CO_IAS_V2", 0);
        b = new hcl("RDS_ANDROID_CASH", 1);
        c = new hcl("RDS_ANDROID_DRIVER_FARE", 2);
        d = new hcl("RDS_PHONE_SUPPORT", 3);
        e = (new hcl[] {
            a, b, c, d
        });
    }
}
