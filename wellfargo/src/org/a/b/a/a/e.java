// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.b.a.a;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    private static final e c[];

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(org/a/b/a/a/e, s);
    }

    public static final e[] values()
    {
        return (e[])c.clone();
    }

    static 
    {
        a = new e("STRICT", 0);
        b = new e("BROWSER_COMPATIBLE", 1);
        c = (new e[] {
            a, b
        });
    }
}
