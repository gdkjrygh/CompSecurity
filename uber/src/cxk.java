// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class cxk extends Enum
{

    public static final cxk a;
    public static final cxk b;
    public static final cxk c;
    private static final cxk d[];

    private cxk(String s, int i)
    {
        super(s, i);
    }

    cxk(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static cxk valueOf(String s)
    {
        return (cxk)Enum.valueOf(cxk, s);
    }

    public static cxk[] values()
    {
        return (cxk[])d.clone();
    }

    public abstract int a();

    public abstract String b();

    static 
    {
        a = new _cls1("Session");
        b = new _cls2("Timeline");
        c = new _cls3("Favorite");
        d = (new cxk[] {
            a, b, c
        });
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
