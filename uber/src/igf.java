// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;

public final class igf
{

    private static final int a;
    private static final boolean b;

    public static boolean a()
    {
        return b;
    }

    public static int b()
    {
        return a;
    }

    private static int c()
    {
        int i;
        try
        {
            i = ((Integer)Class.forName("android.os.Build$VERSION", true, d()).getField("SDK_INT").get(null)).intValue();
        }
        catch (Exception exception)
        {
            return 0;
        }
        return i;
    }

    private static ClassLoader d()
    {
        if (System.getSecurityManager() == null)
        {
            return ClassLoader.getSystemClassLoader();
        } else
        {
            return (ClassLoader)AccessController.doPrivileged(new PrivilegedAction() {

                private static ClassLoader a()
                {
                    return ClassLoader.getSystemClassLoader();
                }

                public final Object run()
                {
                    return a();
                }

            });
        }
    }

    static 
    {
        int i = c();
        a = i;
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
