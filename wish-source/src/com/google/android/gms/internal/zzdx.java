// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.purchase.zze;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzg;

// Referenced classes of package com.google.android.gms.internal:
//            zzdt, zzds

public final class zzdx extends zzg
{
    private static final class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }


    private static final zzdx zzxQ = new zzdx();

    private zzdx()
    {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    private static boolean zzc(Activity activity)
        throws zza
    {
        activity = activity.getIntent();
        if (!activity.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar"))
        {
            throw new zza("InAppPurchaseManager requires the useClientJar flag in intent extras.");
        } else
        {
            return activity.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false);
        }
    }

    public static zzds zze(Activity activity)
    {
        try
        {
            if (zzc(activity))
            {
                zzb.zzaj("Using AdOverlay from the client jar.");
                return new zze(activity);
            }
            activity = zzxQ.zzf(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzb.zzan(activity.getMessage());
            return null;
        }
        return activity;
    }

    private zzds zzf(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.zzd zzd1 = com.google.android.gms.dynamic.zze.zzt(activity);
            activity = zzds.zza.zzx(((zzdt)zzX(activity)).zzd(zzd1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzb.zzd("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzb.zzd("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        return activity;
    }

    protected zzdt zzB(IBinder ibinder)
    {
        return zzdt.zza.zzy(ibinder);
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzB(ibinder);
    }

}
