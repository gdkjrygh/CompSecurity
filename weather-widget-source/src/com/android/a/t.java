// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;


// Referenced classes of package com.android.a:
//            c, aa

public class t
{

    public final Object a;
    public final c b;
    public final aa c;
    public boolean d;

    private t(aa aa)
    {
        d = false;
        a = null;
        b = null;
        c = aa;
    }

    private t(Object obj, c c1)
    {
        d = false;
        a = obj;
        b = c1;
        c = null;
    }

    public static t a(aa aa)
    {
        return new t(aa);
    }

    public static t a(Object obj, c c1)
    {
        return new t(obj, c1);
    }

    public boolean a()
    {
        return c == null;
    }
}
