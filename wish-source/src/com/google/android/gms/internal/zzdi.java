// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;

// Referenced classes of package com.google.android.gms.internal:
//            zzdk, zzdj

public final class zzdi extends zzg
{
    private static final class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }


    private static final zzdi zzxf = new zzdi();

    private zzdi()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static zzdj zzb(Activity activity)
    {
        try
        {
            if (zzc(activity))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaj("Using AdOverlay from the client jar.");
                return new zzc(activity);
            }
            activity = zzxf.zzd(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan(activity.getMessage());
            return null;
        }
        return activity;
    }

    private static boolean zzc(Activity activity)
        throws zza
    {
        activity = activity.getIntent();
        if (!activity.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar"))
        {
            throw new zza("Ad overlay requires the useClientJar flag in intent extras.");
        } else
        {
            return activity.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
    }

    private zzdj zzd(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.zzd zzd1 = zze.zzt(activity);
            activity = zzdj.zza.zzs(((zzdk)zzX(activity)).zzc(zzd1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzr(ibinder);
    }

    protected zzdk zzr(IBinder ibinder)
    {
        return zzdk.zza.zzt(ibinder);
    }

}
