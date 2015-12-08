// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.e;
import com.google.android.gms.dynamic.n;
import com.google.android.gms.internal.gi;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps.a:
//            aa, z

public class bn
{

    private static Context a;
    private static z b;

    public static z a(Context context)
    {
        gi.a(context);
        if (b != null)
        {
            return b;
        }
        int i = e.a(context);
        switch (i)
        {
        default:
            throw new GooglePlayServicesNotAvailableException(i);

        case 0: // '\0'
            b = aa.a((IBinder)a(b(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
            break;
        }
        try
        {
            b.a(n.a(b(context).getResources()), 0x40be38);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeRemoteException(context);
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
            throw new IllegalStateException((new StringBuilder("Unable to instantiate the dynamic class ")).append(class1.getName()).toString());
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new IllegalStateException((new StringBuilder("Unable to call the default constructor of ")).append(class1.getName()).toString());
        }
        return obj;
    }

    private static Object a(ClassLoader classloader, String s)
    {
        try
        {
            classloader = ((ClassLoader) (a(((ClassLoader)gi.a(classloader)).loadClass(s))));
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            throw new IllegalStateException((new StringBuilder("Unable to find dynamic class ")).append(s).toString());
        }
        return classloader;
    }

    private static Context b(Context context)
    {
        if (a == null)
        {
            a = e.c(context);
        }
        return a;
    }
}
