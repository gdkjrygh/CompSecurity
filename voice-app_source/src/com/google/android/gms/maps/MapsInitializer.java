// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdateFactory

public final class MapsInitializer
{

    private MapsInitializer()
    {
    }

    public static int initialize(Context context)
    {
        zzu.zzu(context);
        try
        {
            context = zzy.zzay(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return ((GooglePlayServicesNotAvailableException) (context)).errorCode;
        }
        zza(context);
        return 0;
    }

    public static void zza(zzc zzc1)
    {
        try
        {
            CameraUpdateFactory.zza(zzc1.zzvC());
            BitmapDescriptorFactory.zza(zzc1.zzvD());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzc zzc1)
        {
            throw new RuntimeRemoteException(zzc1);
        }
    }
}
