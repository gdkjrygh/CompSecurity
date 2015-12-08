// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import java.util.Iterator;
import java.util.Set;

public abstract class AbstractAdViewAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    static final class zza extends AdListener
        implements com.google.android.gms.ads.internal.client.zza
    {

        final AbstractAdViewAdapter zzf;
        final MediationBannerListener zzg;

        public void onAdClicked()
        {
            zzg.onAdClicked(zzf);
        }

        public void onAdClosed()
        {
            zzg.onAdClosed(zzf);
        }

        public void onAdFailedToLoad(int i)
        {
            zzg.onAdFailedToLoad(zzf, i);
        }

        public void onAdLeftApplication()
        {
            zzg.onAdLeftApplication(zzf);
        }

        public void onAdLoaded()
        {
            zzg.onAdLoaded(zzf);
        }

        public void onAdOpened()
        {
            zzg.onAdOpened(zzf);
        }

        public zza(AbstractAdViewAdapter abstractadviewadapter, MediationBannerListener mediationbannerlistener)
        {
            zzf = abstractadviewadapter;
            zzg = mediationbannerlistener;
        }
    }

    static final class zzb extends AdListener
        implements com.google.android.gms.ads.internal.client.zza
    {

        final AbstractAdViewAdapter zzf;
        final MediationInterstitialListener zzh;

        public void onAdClicked()
        {
            zzh.onAdClicked(zzf);
        }

        public void onAdClosed()
        {
            zzh.onAdClosed(zzf);
        }

        public void onAdFailedToLoad(int i)
        {
            zzh.onAdFailedToLoad(zzf, i);
        }

        public void onAdLeftApplication()
        {
            zzh.onAdLeftApplication(zzf);
        }

        public void onAdLoaded()
        {
            zzh.onAdLoaded(zzf);
        }

        public void onAdOpened()
        {
            zzh.onAdOpened(zzf);
        }

        public zzb(AbstractAdViewAdapter abstractadviewadapter, MediationInterstitialListener mediationinterstitiallistener)
        {
            zzf = abstractadviewadapter;
            zzh = mediationinterstitiallistener;
        }
    }


    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzd;
    private InterstitialAd zze;

    public AbstractAdViewAdapter()
    {
    }

    public View getBannerView()
    {
        return zzd;
    }

    public void onDestroy()
    {
        if (zzd != null)
        {
            zzd.destroy();
            zzd = null;
        }
        if (zze != null)
        {
            zze = null;
        }
    }

    public void onPause()
    {
        if (zzd != null)
        {
            zzd.pause();
        }
    }

    public void onResume()
    {
        if (zzd != null)
        {
            zzd.resume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzd = new AdView(context);
        zzd.setAdSize(new AdSize(adsize.getWidth(), adsize.getHeight()));
        zzd.setAdUnitId(bundle.getString("pubid"));
        zzd.setAdListener(new zza(this, mediationbannerlistener));
        zzd.loadAd(zza(context, mediationadrequest, bundle1, bundle));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zze = new InterstitialAd(context);
        zze.setAdUnitId(bundle.getString("pubid"));
        zze.setAdListener(new zzb(this, mediationinterstitiallistener));
        zze.loadAd(zza(context, mediationadrequest, bundle1, bundle));
    }

    public void showInterstitial()
    {
        zze.show();
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle1);

    AdRequest zza(Context context, MediationAdRequest mediationadrequest, Bundle bundle, Bundle bundle1)
    {
        com.google.android.gms.ads.AdRequest.Builder builder = new com.google.android.gms.ads.AdRequest.Builder();
        Object obj = mediationadrequest.getBirthday();
        if (obj != null)
        {
            builder.setBirthday(((java.util.Date) (obj)));
        }
        int i = mediationadrequest.getGender();
        if (i != 0)
        {
            builder.setGender(i);
        }
        obj = mediationadrequest.getKeywords();
        if (obj != null)
        {
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); builder.addKeyword((String)((Iterator) (obj)).next())) { }
        }
        obj = mediationadrequest.getLocation();
        if (obj != null)
        {
            builder.setLocation(((android.location.Location) (obj)));
        }
        if (mediationadrequest.isTesting())
        {
            builder.addTestDevice(zzj.zzbJ().zzC(context));
        }
        if (mediationadrequest.taggedForChildDirectedTreatment() != -1)
        {
            boolean flag;
            if (mediationadrequest.taggedForChildDirectedTreatment() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            builder.tagForChildDirectedTreatment(flag);
        }
        builder.addNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter, zza(bundle, bundle1));
        return builder.build();
    }
}
