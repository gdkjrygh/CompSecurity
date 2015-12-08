// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.zzc;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

// Referenced classes of package com.google.android.gms.internal:
//            zzqt, zzqr, zzqq

public class zzqy extends zzg
{

    private static zzqy zzaSv;

    protected zzqy()
    {
        super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
    }

    private static zzqy zzAM()
    {
        if (zzaSv == null)
        {
            zzaSv = new zzqy();
        }
        return zzaSv;
    }

    public static zzqq zza(Activity activity, zzc zzc, WalletFragmentOptions walletfragmentoptions, zzqr zzqr)
        throws GooglePlayServicesNotAvailableException
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity);
        if (i != 0)
        {
            throw new GooglePlayServicesNotAvailableException(i);
        }
        try
        {
            activity = ((zzqt)zzAM().zzak(activity)).zza(zze.zzw(activity), zzc, walletfragmentoptions, zzqr);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeException(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeException(activity);
        }
        return activity;
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzdM(ibinder);
    }

    protected zzqt zzdM(IBinder ibinder)
    {
        return zzqt.zza.zzdI(ibinder);
    }
}
