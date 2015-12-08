// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.b;


public final class d extends Enum
{

    public static final d a;
    public static final d b;
    private static final d c[];

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(a/a/a/b/d, s);
    }

    public static d[] values()
    {
        d ad[] = c;
        int i = ad.length;
        d ad1[] = new d[i];
        System.arraycopy(ad, 0, ad1, 0, i);
        return ad1;
    }

    static 
    {
        a = new d("Session", 0);
        b = new d("None", 1);
        c = (new d[] {
            a, b
        });
    }
}
