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
//            zzfo, zzfn

public final class zzfs extends zzg
{
    private static final class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }


    private static final zzfs zzCo = new zzfs();

    private zzfs()
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

    public static zzfn zze(Activity activity)
    {
        try
        {
            if (zzc(activity))
            {
                zzb.zzaC("Using AdOverlay from the client jar.");
                return new zze(activity);
            }
            activity = zzCo.zzf(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzb.zzaE(activity.getMessage());
            return null;
        }
        return activity;
    }

    private zzfn zzf(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.zzd zzd1 = com.google.android.gms.dynamic.zze.zzx(activity);
            activity = zzfn.zza.zzP(((zzfo)zzar(activity)).zzf(zzd1));
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

    protected zzfo zzT(IBinder ibinder)
    {
        return zzfo.zza.zzQ(ibinder);
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzT(ibinder);
    }

}
