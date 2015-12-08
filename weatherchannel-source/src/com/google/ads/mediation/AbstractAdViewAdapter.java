// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.internal.client.zzk;
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

    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzaL;
    private InterstitialAd zzaM;

    public AbstractAdViewAdapter()
    {
    }

    public View getBannerView()
    {
        return zzaL;
    }

    public void onDestroy()
    {
        if (zzaL != null)
        {
            zzaL.destroy();
            zzaL = null;
        }
        if (zzaM != null)
        {
            zzaM = null;
        }
    }

    public void onPause()
    {
        if (zzaL != null)
        {
            zzaL.pause();
        }
    }

    public void onResume()
    {
        if (zzaL != null)
        {
            zzaL.resume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzaL = new AdView(context);
        zzaL.setAdSize(new AdSize(adsize.getWidth(), adsize.getHeight()));
        zzaL.setAdUnitId(bundle.getString("pubid"));
    /* block-local class not found */
    class zza {}

        zzaL.setAdListener(new zza(mediationbannerlistener));
        zzaL.loadAd(zza(context, mediationadrequest, bundle1, bundle));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzaM = new InterstitialAd(context);
        zzaM.setAdUnitId(bundle.getString("pubid"));
    /* block-local class not found */
    class zzb {}

        zzaM.setAdListener(new zzb(mediationinterstitiallistener));
        zzaM.loadAd(zza(context, mediationadrequest, bundle1, bundle));
    }

    public void showInterstitial()
    {
        zzaM.show();
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
            builder.addTestDevice(zzk.zzcA().zzO(context));
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
