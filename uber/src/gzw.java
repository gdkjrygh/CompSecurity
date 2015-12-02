// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class gzw extends Enum
{

    public static final gzw a;
    public static final gzw b;
    public static final gzw c;
    public static final gzw d;
    private static final gzw e[];

    private gzw(String s, int i)
    {
        super(s, i);
    }

    gzw(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static gzw valueOf(String s)
    {
        return (gzw)Enum.valueOf(gzw, s);
    }

    public static gzw[] values()
    {
        return (gzw[])e.clone();
    }

    public abstract gzw a();

    public abstract int b();

    static 
    {
        a = new _cls1("AUTO");
        b = new _cls2("OFF");
        c = new _cls3("ON");
        d = new _cls4("UNAVAILABLE");
        e = (new gzw[] {
            a, b, c, d
        });
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}

}
