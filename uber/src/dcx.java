// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dcx extends Enum
{

    public static final dcx a;
    public static final dcx b;
    public static final dcx c;
    public static final dcx d;
    private static final dcx f[];
    private String e;

    private dcx(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static dcx valueOf(String s)
    {
        return (dcx)Enum.valueOf(dcx, s);
    }

    public static dcx[] values()
    {
        return (dcx[])f.clone();
    }

    public final String a()
    {
        return e;
    }

    static 
    {
        a = new dcx("ICON", 0, "icon");
        b = new dcx("PUSH", 1, "push");
        c = new dcx("URL", 2, "url");
        d = new dcx("NONE", 3, null);
        f = (new dcx[] {
            a, b, c, d
        });
    }
}
