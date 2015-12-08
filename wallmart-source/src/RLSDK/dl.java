// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


public final class dl
{

    public static final dl a;
    public static final dl b;
    public static final dl c;
    public static final dl d;
    private static final dl e[];
    private final int f;
    private final int g;
    private final String h;

    private dl(int i, int j, String s)
    {
        f = i;
        g = j;
        h = s;
    }

    public static dl a(int i)
    {
        if (i < 0 || i >= e.length)
        {
            throw new IllegalArgumentException();
        } else
        {
            return e[i];
        }
    }

    public final int a()
    {
        return f;
    }

    public final String toString()
    {
        return h;
    }

    static 
    {
        a = new dl(0, 1, "L");
        b = new dl(1, 0, "M");
        c = new dl(2, 3, "Q");
        d = new dl(3, 2, "H");
        e = (new dl[] {
            b, a, d, c
        });
    }
}
