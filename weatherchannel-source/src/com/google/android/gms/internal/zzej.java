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
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzei, zzek, zzeh

public final class zzej extends zzeg.zza
{

    private final MediationAdapter zzyf;

    public zzej(MediationAdapter mediationadapter)
    {
        zzyf = mediationadapter;
    }

    private Bundle zza(String s, int i, String s1)
        throws RemoteException
    {
        Bundle bundle;
        zzb.zzaC((new StringBuilder()).append("Server parameters: ").append(s).toString());
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

        if (zzyf instanceof AdMobAdapter)
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
            zzyf.onDestroy();
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
        if (!(zzyf instanceof MediationBannerAdapter))
        {
            zzb.zzaC((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(zzyf.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzd zzd;
        try
        {
            zzd = zze.zzw(((MediationBannerAdapter)zzyf).getBannerView());
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return zzd;
    }

    public boolean isInitialized()
        throws RemoteException
    {
        if (!(zzyf instanceof MediationRewardedVideoAdAdapter))
        {
            zzb.zzaC((new StringBuilder()).append("MediationAdapter is not a MediationRewardedVideoAdAdapter: ").append(zzyf.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzay("Check if adapter is initialized.");
        boolean flag;
        try
        {
            flag = ((MediationRewardedVideoAdAdapter)zzyf).isInitialized();
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not check if adapter is initialized.", throwable);
            throw new RemoteException();
        }
        return flag;
    }

    public void pause()
        throws RemoteException
    {
        try
        {
            zzyf.onPause();
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
            zzyf.onResume();
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
        if (!(zzyf instanceof MediationInterstitialAdapter))
        {
            zzb.zzaC((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(zzyf.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzay("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)zzyf).showInterstitial();
            return;
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void showVideo()
        throws RemoteException
    {
        if (!(zzyf instanceof MediationRewardedVideoAdAdapter))
        {
            zzb.zzaC((new StringBuilder()).append("MediationAdapter is not a MediationRewardedVideoAdAdapter: ").append(zzyf.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzay("Show rewarded video ad from adapter.");
        try
        {
            ((MediationRewardedVideoAdAdapter)zzyf).showVideo();
            return;
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not show rewarded video ad from adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void zza(AdRequestParcel adrequestparcel, String s)
        throws RemoteException
    {
        if (!(zzyf instanceof MediationRewardedVideoAdAdapter))
        {
            zzb.zzaC((new StringBuilder()).append("MediationAdapter is not a MediationRewardedVideoAdAdapter: ").append(zzyf.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzay("Requesting rewarded video ad from adapter.");
        MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter = (MediationRewardedVideoAdAdapter)zzyf;
        if (adrequestparcel.zzrZ == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.zzrZ);
_L5:
        Object obj1;
        if (adrequestparcel.zzrX == -1L)
        {
            obj1 = null;
        } else
        {
            try
            {
                obj1 = new Date(adrequestparcel.zzrX);
            }
            // Misplaced declaration of an exception variable
            catch (AdRequestParcel adrequestparcel)
            {
                zzb.zzd("Could not load rewarded video ad from adapter.", adrequestparcel);
                throw new RemoteException();
            }
        }
        obj1 = new zzei(((Date) (obj1)), adrequestparcel.zzrY, ((java.util.Set) (obj)), adrequestparcel.zzsf, adrequestparcel.zzsa, adrequestparcel.zzsb);
        if (adrequestparcel.zzsh == null)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        obj = adrequestparcel.zzsh.getBundle(mediationrewardedvideoadadapter.getClass().getName());
_L3:
        mediationrewardedvideoadadapter.loadAd(((com.google.android.gms.ads.mediation.MediationAdRequest) (obj1)), zza(s, adrequestparcel.zzsb, null), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void zza(zzd zzd, AdRequestParcel adrequestparcel, String s, com.google.android.gms.ads.internal.reward.mediation.client.zza zza1, String s1)
        throws RemoteException
    {
        if (!(zzyf instanceof MediationRewardedVideoAdAdapter))
        {
            zzb.zzaC((new StringBuilder()).append("MediationAdapter is not a MediationRewardedVideoAdAdapter: ").append(zzyf.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzay("Initialize rewarded video adapter.");
        MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter = (MediationRewardedVideoAdAdapter)zzyf;
        if (adrequestparcel.zzrZ == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.zzrZ);
_L5:
        Object obj1;
        if (adrequestparcel.zzrX == -1L)
        {
            obj1 = null;
        } else
        {
            try
            {
                obj1 = new Date(adrequestparcel.zzrX);
            }
            // Misplaced declaration of an exception variable
            catch (zzd zzd)
            {
                zzb.zzd("Could not initialize rewarded video adapter.", zzd);
                throw new RemoteException();
            }
        }
        obj1 = new zzei(((Date) (obj1)), adrequestparcel.zzrY, ((java.util.Set) (obj)), adrequestparcel.zzsf, adrequestparcel.zzsa, adrequestparcel.zzsb);
        if (adrequestparcel.zzsh == null)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        obj = adrequestparcel.zzsh.getBundle(mediationrewardedvideoadadapter.getClass().getName());
_L3:
        mediationrewardedvideoadadapter.initialize((Context)zze.zzn(zzd), ((com.google.android.gms.ads.mediation.MediationAdRequest) (obj1)), s, new com.google.android.gms.ads.internal.reward.mediation.client.zzb(zza1), zza(s1, adrequestparcel.zzsb, null), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void zza(zzd zzd, AdRequestParcel adrequestparcel, String s, zzeh zzeh)
        throws RemoteException
    {
        zza(zzd, adrequestparcel, s, ((String) (null)), zzeh);
    }

    public void zza(zzd zzd, AdRequestParcel adrequestparcel, String s, String s1, zzeh zzeh)
        throws RemoteException
    {
        if (!(zzyf instanceof MediationInterstitialAdapter))
        {
            zzb.zzaC((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(zzyf.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzay("Requesting interstitial ad from adapter.");
        MediationInterstitialAdapter mediationinterstitialadapter = (MediationInterstitialAdapter)zzyf;
        if (adrequestparcel.zzrZ == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.zzrZ);
_L5:
        Object obj1;
        if (adrequestparcel.zzrX == -1L)
        {
            obj1 = null;
        } else
        {
            try
            {
                obj1 = new Date(adrequestparcel.zzrX);
            }
            // Misplaced declaration of an exception variable
            catch (zzd zzd)
            {
                zzb.zzd("Could not request interstitial ad from adapter.", zzd);
                throw new RemoteException();
            }
        }
        obj1 = new zzei(((Date) (obj1)), adrequestparcel.zzrY, ((java.util.Set) (obj)), adrequestparcel.zzsf, adrequestparcel.zzsa, adrequestparcel.zzsb);
        if (adrequestparcel.zzsh == null)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        obj = adrequestparcel.zzsh.getBundle(mediationinterstitialadapter.getClass().getName());
_L3:
        mediationinterstitialadapter.requestInterstitialAd((Context)zze.zzn(zzd), new zzek(zzeh), zza(s, adrequestparcel.zzsb, s1), ((com.google.android.gms.ads.mediation.MediationAdRequest) (obj1)), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void zza(zzd zzd, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, zzeh zzeh)
        throws RemoteException
    {
        zza(zzd, adsizeparcel, adrequestparcel, s, null, zzeh);
    }

    public void zza(zzd zzd, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, zzeh zzeh)
        throws RemoteException
    {
        if (!(zzyf instanceof MediationBannerAdapter))
        {
            zzb.zzaC((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(zzyf.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzay("Requesting banner ad from adapter.");
        MediationBannerAdapter mediationbanneradapter = (MediationBannerAdapter)zzyf;
        if (adrequestparcel.zzrZ == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.zzrZ);
_L5:
        Object obj1;
        if (adrequestparcel.zzrX == -1L)
        {
            obj1 = null;
        } else
        {
            try
            {
                obj1 = new Date(adrequestparcel.zzrX);
            }
            // Misplaced declaration of an exception variable
            catch (zzd zzd)
            {
                zzb.zzd("Could not request banner ad from adapter.", zzd);
                throw new RemoteException();
            }
        }
        obj1 = new zzei(((Date) (obj1)), adrequestparcel.zzrY, ((java.util.Set) (obj)), adrequestparcel.zzsf, adrequestparcel.zzsa, adrequestparcel.zzsb);
        if (adrequestparcel.zzsh == null)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        obj = adrequestparcel.zzsh.getBundle(mediationbanneradapter.getClass().getName());
_L3:
        mediationbanneradapter.requestBannerAd((Context)zze.zzn(zzd), new zzek(zzeh), zza(s, adrequestparcel.zzsb, s1), com.google.android.gms.ads.zza.zza(adsizeparcel.width, adsizeparcel.height, adsizeparcel.zzsm), ((com.google.android.gms.ads.mediation.MediationAdRequest) (obj1)), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
