// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzcu, zzcw, zzct

public final class zzcv extends zzcs.zza
{

    private final MediationAdapter zzva;

    public zzcv(MediationAdapter mediationadapter)
    {
        zzva = mediationadapter;
    }

    private Bundle zza(String s, int i, String s1)
        throws RemoteException
    {
        Bundle bundle;
        zzb.zzan((new StringBuilder()).append("Server parameters: ").append(s).toString());
        Iterator iterator;
        String s2;
        try
        {
            bundle = new Bundle();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzd("Could not get Server Parameters Bundle.", s);
            throw new RemoteException();
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        s = new JSONObject(s);
        bundle = new Bundle();
        for (iterator = s.keys(); iterator.hasNext(); bundle.putString(s2, s.getString(s2)))
        {
            s2 = (String)iterator.next();
        }

        if (zzva instanceof AdMobAdapter)
        {
            bundle.putString("adJson", s1);
            bundle.putInt("tagForChildDirectedTreatment", i);
        }
        return bundle;
    }

    public void destroy()
        throws RemoteException
    {
        try
        {
            zzva.onDestroy();
            return;
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not destroy adapter.", throwable);
        }
        throw new RemoteException();
    }

    public zzd getView()
        throws RemoteException
    {
        if (!(zzva instanceof MediationBannerAdapter))
        {
            zzb.zzan((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(zzva.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzd zzd;
        try
        {
            zzd = zze.zzt(((MediationBannerAdapter)zzva).getBannerView());
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return zzd;
    }

    public void pause()
        throws RemoteException
    {
        try
        {
            zzva.onPause();
            return;
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not pause adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void resume()
        throws RemoteException
    {
        try
        {
            zzva.onResume();
            return;
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not resume adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void showInterstitial()
        throws RemoteException
    {
        if (!(zzva instanceof MediationInterstitialAdapter))
        {
            zzb.zzan((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(zzva.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaj("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)zzva).showInterstitial();
            return;
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void zza(zzd zzd, AdRequestParcel adrequestparcel, String s, zzct zzct)
        throws RemoteException
    {
        zza(zzd, adrequestparcel, s, null, zzct);
    }

    public void zza(zzd zzd, AdRequestParcel adrequestparcel, String s, String s1, zzct zzct)
        throws RemoteException
    {
        if (!(zzva instanceof MediationInterstitialAdapter))
        {
            zzb.zzan((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(zzva.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaj("Requesting interstitial ad from adapter.");
        MediationInterstitialAdapter mediationinterstitialadapter = (MediationInterstitialAdapter)zzva;
        if (adrequestparcel.zzpK == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.zzpK);
_L5:
        zzcu zzcu1 = new zzcu(new Date(adrequestparcel.zzpI), adrequestparcel.zzpJ, ((java.util.Set) (obj)), adrequestparcel.zzpQ, adrequestparcel.zzpL, adrequestparcel.zzpM);
        if (adrequestparcel.zzpS == null) goto _L4; else goto _L3
_L3:
        obj = adrequestparcel.zzpS.getBundle(mediationinterstitialadapter.getClass().getName());
_L6:
        mediationinterstitialadapter.requestInterstitialAd((Context)zze.zzg(zzd), new zzcw(zzct), zza(s, adrequestparcel.zzpM, s1), zzcu1, ((Bundle) (obj)));
        return;
_L2:
        obj = null;
          goto _L5
_L4:
        obj = null;
          goto _L6
        zzd;
        zzb.zzd("Could not request interstitial ad from adapter.", zzd);
        throw new RemoteException();
          goto _L5
    }

    public void zza(zzd zzd, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, zzct zzct)
        throws RemoteException
    {
        zza(zzd, adsizeparcel, adrequestparcel, s, null, zzct);
    }

    public void zza(zzd zzd, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, zzct zzct)
        throws RemoteException
    {
        Object obj1;
        obj1 = null;
        if (!(zzva instanceof MediationBannerAdapter))
        {
            zzb.zzan((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(zzva.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaj("Requesting banner ad from adapter.");
        Object obj;
        MediationBannerAdapter mediationbanneradapter;
        mediationbanneradapter = (MediationBannerAdapter)zzva;
        if (adrequestparcel.zzpK == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        obj = new HashSet(adrequestparcel.zzpK);
_L1:
        zzcu zzcu1 = new zzcu(new Date(adrequestparcel.zzpI), adrequestparcel.zzpJ, ((java.util.Set) (obj)), adrequestparcel.zzpQ, adrequestparcel.zzpL, adrequestparcel.zzpM);
        obj = obj1;
        try
        {
            if (adrequestparcel.zzpS != null)
            {
                obj = adrequestparcel.zzpS.getBundle(mediationbanneradapter.getClass().getName());
            }
            mediationbanneradapter.requestBannerAd((Context)zze.zzg(zzd), new zzcw(zzct), zza(s, adrequestparcel.zzpM, s1), com.google.android.gms.ads.zza.zza(adsizeparcel.width, adsizeparcel.height, adsizeparcel.zzpX), zzcu1, ((Bundle) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzd zzd)
        {
            zzb.zzd("Could not request banner ad from adapter.", zzd);
        }
        break MISSING_BLOCK_LABEL_221;
        obj = null;
          goto _L1
        throw new RemoteException();
    }
}
