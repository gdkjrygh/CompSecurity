// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hae extends Enum
{

    public static final hae a;
    public static final hae b;
    public static final hae c;
    public static final hae d;
    private static final hae e[];

    private hae(String s, int i)
    {
        super(s, i);
    }

    public static hae valueOf(String s)
    {
        return (hae)Enum.valueOf(hae, s);
    }

    public static hae[] values()
    {
        return (hae[])e.clone();
    }

    static 
    {
        a = new hae("CIRCLE", 0);
        b = new hae("H_RECTANGLE", 1);
        c = new hae("SQUARE", 2);
        d = new hae("V_RECTANGLE", 3);
        e = (new hae[] {
            a, b, c, d
        });
    }
}
