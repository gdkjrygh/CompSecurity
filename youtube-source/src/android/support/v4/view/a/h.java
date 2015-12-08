// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import java.util.List;

// Referenced classes of package android.support.v4.view.a:
//            l, j, n, i, 
//            a

public final class h
{

    private static final i a;
    private final Object b;

    public h()
    {
        b = a.a(this);
    }

    public h(Object obj)
    {
        b = obj;
    }

    public static a b()
    {
        return null;
    }

    public static boolean c()
    {
        return false;
    }

    public static List d()
    {
        return null;
    }

    public static a e()
    {
        return null;
    }

    public final Object a()
    {
        return b;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new l();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new j();
        } else
        {
            a = new n();
        }
    }
}
