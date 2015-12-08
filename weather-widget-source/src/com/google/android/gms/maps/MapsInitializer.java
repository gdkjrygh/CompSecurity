// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdateFactory

public final class MapsInitializer
{

    private static boolean zznp = false;

    private MapsInitializer()
    {
    }

    public static int initialize(Context context)
    {
        int i = 0;
        com/google/android/gms/maps/MapsInitializer;
        JVM INSTR monitorenter ;
        boolean flag;
        zzx.zzb(context, "Context is null");
        flag = zznp;
        if (!flag) goto _L2; else goto _L1
_L1:
        com/google/android/gms/maps/MapsInitializer;
        JVM INSTR monitorexit ;
        return i;
_L2:
        context = zzy.zzaF(context);
        zza(context);
        zznp = true;
          goto _L1
        context;
        throw context;
        context;
        i = ((GooglePlayServicesNotAvailableException) (context)).errorCode;
          goto _L1
    }

    public static void zza(zzc zzc1)
    {
        try
        {
            CameraUpdateFactory.zza(zzc1.zzwX());
            BitmapDescriptorFactory.zza(zzc1.zzwY());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzc zzc1)
        {
            throw new RuntimeRemoteException(zzc1);
        }
    }

}
