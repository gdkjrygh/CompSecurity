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
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzem, zzeo, zzer, zzep, 
//            zzeq, zzej, zzek, zzel

public final class zzen extends zzei.zza
{

    private final MediationAdapter zzyW;
    private zzeo zzyX;

    public zzen(MediationAdapter mediationadapter)
    {
        zzyW = mediationadapter;
    }

    private Bundle zza(String s, int i, String s1)
        throws RemoteException
    {
        Bundle bundle;
        zzb.zzaE((new StringBuilder()).append("Server parameters: ").append(s).toString());
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

        if (zzyW instanceof AdMobAdapter)
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
            zzyW.onDestroy();
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
        if (!(zzyW instanceof MediationBannerAdapter))
        {
            zzb.zzaE((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(zzyW.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzd zzd;
        try
        {
            zzd = zze.zzx(((MediationBannerAdapter)zzyW).getBannerView());
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
        if (!(zzyW instanceof MediationRewardedVideoAdAdapter))
        {
            zzb.zzaE((new StringBuilder()).append("MediationAdapter is not a MediationRewardedVideoAdAdapter: ").append(zzyW.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaC("Check if adapter is initialized.");
        boolean flag;
        try
        {
            flag = ((MediationRewardedVideoAdAdapter)zzyW).isInitialized();
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
            zzyW.onPause();
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
            zzyW.onResume();
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
        if (!(zzyW instanceof MediationInterstitialAdapter))
        {
            zzb.zzaE((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(zzyW.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaC("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)zzyW).showInterstitial();
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
        if (!(zzyW instanceof MediationRewardedVideoAdAdapter))
        {
            zzb.zzaE((new StringBuilder()).append("MediationAdapter is not a MediationRewardedVideoAdAdapter: ").append(zzyW.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaC("Show rewarded video ad from adapter.");
        try
        {
            ((MediationRewardedVideoAdAdapter)zzyW).showVideo();
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
        if (!(zzyW instanceof MediationRewardedVideoAdAdapter))
        {
            zzb.zzaE((new StringBuilder()).append("MediationAdapter is not a MediationRewardedVideoAdAdapter: ").append(zzyW.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaC("Requesting rewarded video ad from adapter.");
        MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter = (MediationRewardedVideoAdAdapter)zzyW;
        if (adrequestparcel.zzss == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.zzss);
_L5:
        Object obj1;
        if (adrequestparcel.zzsq == -1L)
        {
            obj1 = null;
        } else
        {
            try
            {
                obj1 = new Date(adrequestparcel.zzsq);
            }
            // Misplaced declaration of an exception variable
            catch (AdRequestParcel adrequestparcel)
            {
                zzb.zzd("Could not load rewarded video ad from adapter.", adrequestparcel);
                throw new RemoteException();
            }
        }
        obj1 = new zzem(((Date) (obj1)), adrequestparcel.zzsr, ((java.util.Set) (obj)), adrequestparcel.zzsy, adrequestparcel.zzst, adrequestparcel.zzsu);
        if (adrequestparcel.zzsA == null)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        obj = adrequestparcel.zzsA.getBundle(mediationrewardedvideoadadapter.getClass().getName());
_L3:
        mediationrewardedvideoadadapter.loadAd(((com.google.android.gms.ads.mediation.MediationAdRequest) (obj1)), zza(s, adrequestparcel.zzsu, null), ((Bundle) (obj)));
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
        if (!(zzyW instanceof MediationRewardedVideoAdAdapter))
        {
            zzb.zzaE((new StringBuilder()).append("MediationAdapter is not a MediationRewardedVideoAdAdapter: ").append(zzyW.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaC("Initialize rewarded video adapter.");
        MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter = (MediationRewardedVideoAdAdapter)zzyW;
        if (adrequestparcel.zzss == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.zzss);
_L5:
        Object obj1;
        if (adrequestparcel.zzsq == -1L)
        {
            obj1 = null;
        } else
        {
            try
            {
                obj1 = new Date(adrequestparcel.zzsq);
            }
            // Misplaced declaration of an exception variable
            catch (zzd zzd)
            {
                zzb.zzd("Could not initialize rewarded video adapter.", zzd);
                throw new RemoteException();
            }
        }
        obj1 = new zzem(((Date) (obj1)), adrequestparcel.zzsr, ((java.util.Set) (obj)), adrequestparcel.zzsy, adrequestparcel.zzst, adrequestparcel.zzsu);
        if (adrequestparcel.zzsA == null)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        obj = adrequestparcel.zzsA.getBundle(mediationrewardedvideoadadapter.getClass().getName());
_L3:
        mediationrewardedvideoadadapter.initialize((Context)zze.zzp(zzd), ((com.google.android.gms.ads.mediation.MediationAdRequest) (obj1)), s, new com.google.android.gms.ads.internal.reward.mediation.client.zzb(zza1), zza(s1, adrequestparcel.zzsu, null), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void zza(zzd zzd, AdRequestParcel adrequestparcel, String s, zzej zzej)
        throws RemoteException
    {
        zza(zzd, adrequestparcel, s, ((String) (null)), zzej);
    }

    public void zza(zzd zzd, AdRequestParcel adrequestparcel, String s, String s1, zzej zzej)
        throws RemoteException
    {
        if (!(zzyW instanceof MediationInterstitialAdapter))
        {
            zzb.zzaE((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(zzyW.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaC("Requesting interstitial ad from adapter.");
        MediationInterstitialAdapter mediationinterstitialadapter = (MediationInterstitialAdapter)zzyW;
        if (adrequestparcel.zzss == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.zzss);
_L5:
        Object obj1;
        if (adrequestparcel.zzsq == -1L)
        {
            obj1 = null;
        } else
        {
            try
            {
                obj1 = new Date(adrequestparcel.zzsq);
            }
            // Misplaced declaration of an exception variable
            catch (zzd zzd)
            {
                zzb.zzd("Could not request interstitial ad from adapter.", zzd);
                throw new RemoteException();
            }
        }
        obj1 = new zzem(((Date) (obj1)), adrequestparcel.zzsr, ((java.util.Set) (obj)), adrequestparcel.zzsy, adrequestparcel.zzst, adrequestparcel.zzsu);
        if (adrequestparcel.zzsA == null)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        obj = adrequestparcel.zzsA.getBundle(mediationinterstitialadapter.getClass().getName());
_L3:
        mediationinterstitialadapter.requestInterstitialAd((Context)zze.zzp(zzd), new zzeo(zzej), zza(s, adrequestparcel.zzsu, s1), ((com.google.android.gms.ads.mediation.MediationAdRequest) (obj1)), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void zza(zzd zzd, AdRequestParcel adrequestparcel, String s, String s1, zzej zzej, NativeAdOptionsParcel nativeadoptionsparcel, List list)
        throws RemoteException
    {
        if (!(zzyW instanceof zza))
        {
            zzb.zzaE((new StringBuilder()).append("MediationAdapter is not a MediationNativeAdapter: ").append(zzyW.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zza zza1 = (zza)zzyW;
        if (adrequestparcel.zzss == null) goto _L2; else goto _L1
_L1:
        HashSet hashset = new HashSet(adrequestparcel.zzss);
_L5:
        Date date;
        if (adrequestparcel.zzsq == -1L)
        {
            date = null;
        } else
        {
            try
            {
                date = new Date(adrequestparcel.zzsq);
            }
            // Misplaced declaration of an exception variable
            catch (zzd zzd)
            {
                zzb.zzd("Could not request interstitial ad from adapter.", zzd);
                throw new RemoteException();
            }
        }
        list = new zzer(date, adrequestparcel.zzsr, hashset, adrequestparcel.zzsy, adrequestparcel.zzst, adrequestparcel.zzsu, nativeadoptionsparcel, list);
        if (adrequestparcel.zzsA == null)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        nativeadoptionsparcel = adrequestparcel.zzsA.getBundle(zza1.getClass().getName());
_L3:
        zzyX = new zzeo(zzej);
        zza1.requestNativeAd((Context)zze.zzp(zzd), zzyX, zza(s, adrequestparcel.zzsu, s1), list, nativeadoptionsparcel);
        return;
        nativeadoptionsparcel = null;
          goto _L3
_L2:
        hashset = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void zza(zzd zzd, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, zzej zzej)
        throws RemoteException
    {
        zza(zzd, adsizeparcel, adrequestparcel, s, null, zzej);
    }

    public void zza(zzd zzd, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, zzej zzej)
        throws RemoteException
    {
        if (!(zzyW instanceof MediationBannerAdapter))
        {
            zzb.zzaE((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(zzyW.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaC("Requesting banner ad from adapter.");
        MediationBannerAdapter mediationbanneradapter = (MediationBannerAdapter)zzyW;
        if (adrequestparcel.zzss == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.zzss);
_L5:
        Object obj1;
        if (adrequestparcel.zzsq == -1L)
        {
            obj1 = null;
        } else
        {
            try
            {
                obj1 = new Date(adrequestparcel.zzsq);
            }
            // Misplaced declaration of an exception variable
            catch (zzd zzd)
            {
                zzb.zzd("Could not request banner ad from adapter.", zzd);
                throw new RemoteException();
            }
        }
        obj1 = new zzem(((Date) (obj1)), adrequestparcel.zzsr, ((java.util.Set) (obj)), adrequestparcel.zzsy, adrequestparcel.zzst, adrequestparcel.zzsu);
        if (adrequestparcel.zzsA == null)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        obj = adrequestparcel.zzsA.getBundle(mediationbanneradapter.getClass().getName());
_L3:
        mediationbanneradapter.requestBannerAd((Context)zze.zzp(zzd), new zzeo(zzej), zza(s, adrequestparcel.zzsu, s1), com.google.android.gms.ads.zza.zza(adsizeparcel.width, adsizeparcel.height, adsizeparcel.zzsG), ((com.google.android.gms.ads.mediation.MediationAdRequest) (obj1)), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public zzek zzdS()
    {
        com.google.android.gms.ads.mediation.NativeAdMapper nativeadmapper = zzyX.zzdU();
        if (nativeadmapper instanceof NativeAppInstallAdMapper)
        {
            return new zzep((NativeAppInstallAdMapper)nativeadmapper);
        } else
        {
            return null;
        }
    }

    public zzel zzdT()
    {
        com.google.android.gms.ads.mediation.NativeAdMapper nativeadmapper = zzyX.zzdU();
        if (nativeadmapper instanceof NativeContentAdMapper)
        {
            return new zzeq((NativeContentAdMapper)nativeadmapper);
        } else
        {
            return null;
        }
    }
}
