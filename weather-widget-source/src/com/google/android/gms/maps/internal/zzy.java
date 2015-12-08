// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzc

public class zzy
{

    private static Context zzaGM;
    private static zzc zzaGN;

    public zzy()
    {
    }

    private static Context getRemoteContext(Context context)
    {
        if (zzaGM == null)
        {
            if (zzwZ())
            {
                zzaGM = context.getApplicationContext();
            } else
            {
                zzaGM = GooglePlayServicesUtil.getRemoteContext(context);
            }
        }
        return zzaGM;
    }

    private static Object zza(ClassLoader classloader, String s)
    {
        try
        {
            classloader = ((ClassLoader) (zzc(((ClassLoader)zzx.zzv(classloader)).loadClass(s))));
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to find dynamic class ").append(s).toString());
        }
        return classloader;
    }

    public static zzc zzaF(Context context)
        throws GooglePlayServicesNotAvailableException
    {
        zzx.zzv(context);
        if (zzaGN != null)
        {
            return zzaGN;
        }
        zzaG(context);
        zzaGN = zzaH(context);
        try
        {
            zzaGN.zzd(zze.zzx(getRemoteContext(context).getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeRemoteException(context);
        }
        return zzaGN;
    }

    private static void zzaG(Context context)
        throws GooglePlayServicesNotAvailableException
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        switch (i)
        {
        default:
            throw new GooglePlayServicesNotAvailableException(i);

        case 0: // '\0'
            return;
        }
    }

    private static zzc zzaH(Context context)
    {
        if (zzwZ())
        {
            Log.i(com/google/android/gms/maps/internal/zzy.getSimpleName(), "Making Creator statically");
            return (zzc)zzc(zzxa());
        } else
        {
            Log.i(com/google/android/gms/maps/internal/zzy.getSimpleName(), "Making Creator dynamically");
            return com.google.android.gms.maps.internal.zzc.zza.zzck((IBinder)zza(getRemoteContext(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        }
    }

    private static Object zzc(Class class1)
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

    public static boolean zzwZ()
    {
        return false;
    }

    private static Class zzxa()
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
}
