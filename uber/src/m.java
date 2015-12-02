// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class m extends Enum
    implements cie
{

    public static final m a;
    public static final m b;
    public static final m c;
    private static final m d[];

    private m(String s, int i)
    {
        super(s, i);
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(m, s);
    }

    public static m[] values()
    {
        return (m[])d.clone();
    }

    static 
    {
        a = new m("PERMISSION_REQUEST", 0);
        b = new m("PERMISSION_RESULT_DENIED", 1);
        c = new m("PERMISSION_RESULT_GRANTED", 2);
        d = (new m[] {
            a, b, c
        });
    }
}
