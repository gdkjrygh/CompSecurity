// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.a.m;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.maps.model.f;

// Referenced classes of package com.google.android.gms.maps.a:
//            aj, ak

public class cv
{

    private static Context a;
    private static aj b;

    public cv()
    {
    }

    public static aj a(Context context)
    {
        au.a(context);
        if (b != null)
        {
            return b;
        }
        b(context);
        b = c(context);
        try
        {
            b.a(m.a(d(context).getResources()), d.a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new f(context);
        }
        return b;
    }

    private static Object a(Class class1)
    {
        Object obj;
        try
        {
            obj = class1.newInstance();
        }
        catch (InstantiationException instantiationexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to instantiate the dynamic class ").append(class1.getName()).toString());
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to call the default constructor of ").append(class1.getName()).toString());
        }
        return obj;
    }

    private static Object a(ClassLoader classloader, String s)
    {
        try
        {
            classloader = ((ClassLoader) (a(((ClassLoader)au.a(classloader)).loadClass(s))));
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to find dynamic class ").append(s).toString());
        }
        return classloader;
    }

    public static boolean a()
    {
        return false;
    }

    private static Class b()
    {
        Class class1;
        try
        {
            class1 = Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new RuntimeException(classnotfoundexception);
        }
        return class1;
    }

    private static void b(Context context)
    {
        int i = com.google.android.gms.common.d.a(context);
        switch (i)
        {
        default:
            throw new c(i);

        case 0: // '\0'
            return;
        }
    }

    private static aj c(Context context)
    {
        if (a())
        {
            Log.i(com/google/android/gms/maps/a/cv.getSimpleName(), "Making Creator statically");
            return (aj)a(b());
        } else
        {
            Log.i(com/google/android/gms/maps/a/cv.getSimpleName(), "Making Creator dynamically");
            return ak.a((IBinder)a(d(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        }
    }

    private static Context d(Context context)
    {
        if (a == null)
        {
            if (a())
            {
                a = context.getApplicationContext();
            } else
            {
                a = com.google.android.gms.common.d.d(context);
            }
        }
        return a;
    }
}
