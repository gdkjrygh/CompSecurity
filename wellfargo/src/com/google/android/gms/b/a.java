// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;


// Referenced classes of package com.google.android.gms.b:
//            c, b, d, e

public abstract class a
{

    private static final Object c = new Object();
    private static e d = null;
    private static int e = 0;
    private static String f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    protected final String a;
    protected final Object b;
    private Object g;

    protected a(String s, Object obj)
    {
        g = null;
        a = s;
        b = obj;
    }

    public static int a()
    {
        return e;
    }

    public static a a(String s, Integer integer)
    {
        return new c(s, integer);
    }

    public static a a(String s, Long long1)
    {
        return new b(s, long1);
    }

    public static a a(String s, String s1)
    {
        return new d(s, s1);
    }

    public static boolean b()
    {
        return d != null;
    }

    static e d()
    {
        return d;
    }

    protected abstract Object a(String s);

    public final Object c()
    {
        if (g != null)
        {
            return g;
        } else
        {
            return a(a);
        }
    }

}
