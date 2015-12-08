// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.mediation.zzb;
import java.util.Iterator;
import java.util.Set;

public abstract class AbstractAdViewAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter, com.google.android.gms.ads.mediation.zza
{
    static class zza extends NativeAppInstallAdMapper
    {

        private final NativeAppInstallAd zzaN;

        public void trackView(View view)
        {
            if (view instanceof NativeAdView)
            {
                ((NativeAdView)view).setNativeAd(zzaN);
            }
        }

        public zza(NativeAppInstallAd nativeappinstallad)
        {
            zzaN = nativeappinstallad;
            setHeadline(nativeappinstallad.getHeadline().toString());
            setImages(nativeappinstallad.getImages());
            setBody(nativeappinstallad.getBody().toString());
            setIcon(nativeappinstallad.getIcon());
            setCallToAction(nativeappinstallad.getCallToAction().toString());
            setStarRating(nativeappinstallad.getStarRating().doubleValue());
            setStore(nativeappinstallad.getStore().toString());
            setPrice(nativeappinstallad.getPrice().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
        }
    }

    static class zzb extends NativeContentAdMapper
    {

        private final NativeContentAd zzaO;

        public void trackView(View view)
        {
            if (view instanceof NativeAdView)
            {
                ((NativeAdView)view).setNativeAd(zzaO);
            }
        }

        public zzb(NativeContentAd nativecontentad)
        {
            zzaO = nativecontentad;
            setHeadline(nativecontentad.getHeadline().toString());
            setImages(nativecontentad.getImages());
            setBody(nativecontentad.getBody().toString());
            setLogo(nativecontentad.getLogo());
            setCallToAction(nativecontentad.getCallToAction().toString());
            setAdvertiser(nativecontentad.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
        }
    }

    static final class zzc extends AdListener
        implements com.google.android.gms.ads.internal.client.zza
    {

        final AbstractAdViewAdapter zzaP;
        final MediationBannerListener zzaQ;

        public void onAdClicked()
        {
            zzaQ.onAdClicked(zzaP);
        }

        public void onAdClosed()
        {
            zzaQ.onAdClosed(zzaP);
        }

        public void onAdFailedToLoad(int i)
        {
            zzaQ.onAdFailedToLoad(zzaP, i);
        }

        public void onAdLeftApplication()
        {
            zzaQ.onAdLeftApplication(zzaP);
        }

        public void onAdLoaded()
        {
            zzaQ.onAdLoaded(zzaP);
        }

        public void onAdOpened()
        {
            zzaQ.onAdOpened(zzaP);
        }

        public zzc(AbstractAdViewAdapter abstractadviewadapter, MediationBannerListener mediationbannerlistener)
        {
            zzaP = abstractadviewadapter;
            zzaQ = mediationbannerlistener;
        }
    }

    static final class zzd extends AdListener
        implements com.google.android.gms.ads.internal.client.zza
    {

        final AbstractAdViewAdapter zzaP;
        final MediationInterstitialListener zzaR;

        public void onAdClicked()
        {
            zzaR.onAdClicked(zzaP);
        }

        public void onAdClosed()
        {
            zzaR.onAdClosed(zzaP);
        }

        public void onAdFailedToLoad(int i)
        {
            zzaR.onAdFailedToLoad(zzaP, i);
        }

        public void onAdLeftApplication()
        {
            zzaR.onAdLeftApplication(zzaP);
        }

        public void onAdLoaded()
        {
            zzaR.onAdLoaded(zzaP);
        }

        public void onAdOpened()
        {
            zzaR.onAdOpened(zzaP);
        }

        public zzd(AbstractAdViewAdapter abstractadviewadapter, MediationInterstitialListener mediationinterstitiallistener)
        {
            zzaP = abstractadviewadapter;
            zzaR = mediationinterstitiallistener;
        }
    }

    static final class zze extends AdListener
        implements com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener, com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener, com.google.android.gms.ads.internal.client.zza
    {

        final AbstractAdViewAdapter zzaP;
        final com.google.android.gms.ads.mediation.zzb zzaS;

        public void onAdClicked()
        {
            zzaS.zzd(zzaP);
        }

        public void onAdClosed()
        {
            zzaS.zzb(zzaP);
        }

        public void onAdFailedToLoad(int i)
        {
            zzaS.zza(zzaP, i);
        }

        public void onAdLeftApplication()
        {
            zzaS.zzc(zzaP);
        }

        public void onAdLoaded()
        {
        }

        public void onAdOpened()
        {
            zzaS.zza(zzaP);
        }

        public void onAppInstallAdLoaded(NativeAppInstallAd nativeappinstallad)
        {
            zzaS.zza(zzaP, new zza(nativeappinstallad));
        }

        public void onContentAdLoaded(NativeContentAd nativecontentad)
        {
            zzaS.zza(zzaP, new zzb(nativecontentad));
        }

        public zze(AbstractAdViewAdapter abstractadviewadapter, com.google.android.gms.ads.mediation.zzb zzb1)
        {
            zzaP = abstractadviewadapter;
            zzaS = zzb1;
        }
    }


    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    protected AdView zzaK;
    protected InterstitialAd zzaL;
    private AdLoader zzaM;

    public AbstractAdViewAdapter()
    {
    }

    public String getAdUnitId(Bundle bundle)
    {
        return bundle.getString("pubid");
    }

    public View getBannerView()
    {
        return zzaK;
    }

    public void onDestroy()
    {
        if (zzaK != null)
        {
            zzaK.destroy();
            zzaK = null;
        }
        if (zzaL != null)
        {
            zzaL = null;
        }
        if (zzaM != null)
        {
            zzaM = null;
        }
    }

    public void onPause()
    {
        if (zzaK != null)
        {
            zzaK.pause();
        }
    }

    public void onResume()
    {
        if (zzaK != null)
        {
            zzaK.resume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzaK = new AdView(context);
        zzaK.setAdSize(new AdSize(adsize.getWidth(), adsize.getHeight()));
        zzaK.setAdUnitId(getAdUnitId(bundle));
        zzaK.setAdListener(new zzc(this, mediationbannerlistener));
        zzaK.loadAd(zza(context, mediationadrequest, bundle1, bundle));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzaL = new InterstitialAd(context);
        zzaL.setAdUnitId(getAdUnitId(bundle));
        zzaL.setAdListener(new zzd(this, mediationinterstitiallistener));
        zzaL.loadAd(zza(context, mediationadrequest, bundle1, bundle));
    }

    public void requestNativeAd(Context context, com.google.android.gms.ads.mediation.zzb zzb1, Bundle bundle, NativeMediationAdRequest nativemediationadrequest, Bundle bundle1)
    {
        zzb1 = new zze(this, zzb1);
        com.google.android.gms.ads.AdLoader.Builder builder = zza(context, bundle.getString("pubid")).withAdListener(zzb1);
        com.google.android.gms.ads.formats.NativeAdOptions nativeadoptions = nativemediationadrequest.getNativeAdOptions();
        if (nativeadoptions != null)
        {
            builder.withNativeAdOptions(nativeadoptions);
        }
        if (nativemediationadrequest.isAppInstallAdRequested())
        {
            builder.forAppInstallAd(zzb1);
        }
        if (nativemediationadrequest.isContentAdRequested())
        {
            builder.forContentAd(zzb1);
        }
        zzaM = builder.build();
        zzaM.loadAd(zza(context, nativemediationadrequest, bundle1, bundle));
    }

    public void showInterstitial()
    {
        zzaL.show();
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle1);

    com.google.android.gms.ads.AdLoader.Builder zza(Context context, String s)
    {
        return new com.google.android.gms.ads.AdLoader.Builder(context, s);
    }

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
            builder.addTestDevice(zzk.zzcE().zzQ(context));
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
