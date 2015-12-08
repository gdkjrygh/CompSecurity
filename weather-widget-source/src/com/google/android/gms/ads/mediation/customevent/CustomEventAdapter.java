// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.zza;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventNative, CustomEventBannerListener, 
//            CustomEventInterstitialListener, CustomEventNativeListener

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter, com.google.android.gms.ads.mediation.zza
{
    static final class zza
        implements CustomEventBannerListener
    {

        private final CustomEventAdapter zzJJ;
        private final MediationBannerListener zzaQ;

        public void onAdClicked()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdClicked.");
            zzaQ.onAdClicked(zzJJ);
        }

        public void onAdClosed()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdClosed.");
            zzaQ.onAdClosed(zzJJ);
        }

        public void onAdFailedToLoad(int i)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdFailedToLoad.");
            zzaQ.onAdFailedToLoad(zzJJ, i);
        }

        public void onAdLeftApplication()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdLeftApplication.");
            zzaQ.onAdLeftApplication(zzJJ);
        }

        public void onAdLoaded(View view)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdLoaded.");
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.zza(zzJJ, view);
            zzaQ.onAdLoaded(zzJJ);
        }

        public void onAdOpened()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdOpened.");
            zzaQ.onAdOpened(zzJJ);
        }

        public zza(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
        {
            zzJJ = customeventadapter;
            zzaQ = mediationbannerlistener;
        }
    }

    class zzb
        implements CustomEventInterstitialListener
    {

        private final CustomEventAdapter zzJJ;
        final CustomEventAdapter zzJK;
        private final MediationInterstitialListener zzaR;

        public void onAdClicked()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdClicked.");
            zzaR.onAdClicked(zzJJ);
        }

        public void onAdClosed()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdClosed.");
            zzaR.onAdClosed(zzJJ);
        }

        public void onAdFailedToLoad(int i)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onFailedToReceiveAd.");
            zzaR.onAdFailedToLoad(zzJJ, i);
        }

        public void onAdLeftApplication()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdLeftApplication.");
            zzaR.onAdLeftApplication(zzJJ);
        }

        public void onAdLoaded()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onReceivedAd.");
            zzaR.onAdLoaded(zzJK);
        }

        public void onAdOpened()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdOpened.");
            zzaR.onAdOpened(zzJJ);
        }

        public zzb(CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
        {
            zzJK = CustomEventAdapter.this;
            super();
            zzJJ = customeventadapter1;
            zzaR = mediationinterstitiallistener;
        }
    }

    static class zzc
        implements CustomEventNativeListener
    {

        private final CustomEventAdapter zzJJ;
        private final com.google.android.gms.ads.mediation.zzb zzaS;

        public void onAdClicked()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdClicked.");
            zzaS.zzd(zzJJ);
        }

        public void onAdClosed()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdClosed.");
            zzaS.zzb(zzJJ);
        }

        public void onAdFailedToLoad(int i)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdFailedToLoad.");
            zzaS.zza(zzJJ, i);
        }

        public void onAdLeftApplication()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdLeftApplication.");
            zzaS.zzc(zzJJ);
        }

        public void onAdLoaded(NativeAdMapper nativeadmapper)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdLoaded.");
            zzaS.zza(zzJJ, nativeadmapper);
        }

        public void onAdOpened()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdOpened.");
            zzaS.zza(zzJJ);
        }

        public zzc(CustomEventAdapter customeventadapter, com.google.android.gms.ads.mediation.zzb zzb1)
        {
            zzJJ = customeventadapter;
            zzaS = zzb1;
        }
    }


    CustomEventBanner zzJG;
    CustomEventInterstitial zzJH;
    CustomEventNative zzJI;
    private View zzaY;

    public CustomEventAdapter()
    {
    }

    private void zza(View view)
    {
        zzaY = view;
    }

    static void zza(CustomEventAdapter customeventadapter, View view)
    {
        customeventadapter.zza(view);
    }

    private static Object zzj(String s)
    {
        Object obj;
        try
        {
            obj = Class.forName(s).newInstance();
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Could not instantiate custom event adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
            return null;
        }
        return obj;
    }

    public View getBannerView()
    {
        return zzaY;
    }

    public void onDestroy()
    {
        if (zzJG != null)
        {
            zzJG.onDestroy();
        }
        if (zzJH != null)
        {
            zzJH.onDestroy();
        }
        if (zzJI != null)
        {
            zzJI.onDestroy();
        }
    }

    public void onPause()
    {
        if (zzJG != null)
        {
            zzJG.onPause();
        }
        if (zzJH != null)
        {
            zzJH.onPause();
        }
        if (zzJI != null)
        {
            zzJI.onPause();
        }
    }

    public void onResume()
    {
        if (zzJG != null)
        {
            zzJG.onResume();
        }
        if (zzJH != null)
        {
            zzJH.onResume();
        }
        if (zzJI != null)
        {
            zzJI.onResume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzJG = (CustomEventBanner)zzj(bundle.getString("class_name"));
        if (zzJG == null)
        {
            mediationbannerlistener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle1 == null)
        {
            bundle1 = null;
        } else
        {
            bundle1 = bundle1.getBundle(bundle.getString("class_name"));
        }
        zzJG.requestBannerAd(context, new zza(this, mediationbannerlistener), bundle.getString("parameter"), adsize, mediationadrequest, bundle1);
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzJH = (CustomEventInterstitial)zzj(bundle.getString("class_name"));
        if (zzJH == null)
        {
            mediationinterstitiallistener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle1 == null)
        {
            bundle1 = null;
        } else
        {
            bundle1 = bundle1.getBundle(bundle.getString("class_name"));
        }
        zzJH.requestInterstitialAd(context, zza(mediationinterstitiallistener), bundle.getString("parameter"), mediationadrequest, bundle1);
    }

    public void requestNativeAd(Context context, com.google.android.gms.ads.mediation.zzb zzb1, Bundle bundle, NativeMediationAdRequest nativemediationadrequest, Bundle bundle1)
    {
        zzJI = (CustomEventNative)zzj(bundle.getString("class_name"));
        if (zzJI == null)
        {
            zzb1.zza(this, 0);
            return;
        }
        if (bundle1 == null)
        {
            bundle1 = null;
        } else
        {
            bundle1 = bundle1.getBundle(bundle.getString("class_name"));
        }
        zzJI.requestNativeAd(context, new zzc(this, zzb1), bundle.getString("parameter"), nativemediationadrequest, bundle1);
    }

    public void showInterstitial()
    {
        zzJH.showInterstitial();
    }

    zzb zza(MediationInterstitialListener mediationinterstitiallistener)
    {
        return new zzb(this, mediationinterstitiallistener);
    }
}
