// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;

// Referenced classes of package com.google.android.gms.internal:
//            zzff, zzfe

public final class zzfd extends zzg
{
    private static final class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }


    private static final zzfd zzBC = new zzfd();

    private zzfd()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static zzfe zzb(Activity activity)
    {
        try
        {
            if (zzc(activity))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Using AdOverlay from the client jar.");
                return new zzd(activity);
            }
            activity = zzBC.zzd(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE(activity.getMessage());
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

    private zzfe zzd(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.zzd zzd1 = zze.zzx(activity);
            activity = zzfe.zza.zzK(((zzff)zzar(activity)).zze(zzd1));
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

    protected zzff zzJ(IBinder ibinder)
    {
        return zzff.zza.zzL(ibinder);
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzJ(ibinder);
    }

}
