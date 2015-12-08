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

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventBannerListener, CustomEventInterstitialListener

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    static final class zza
        implements CustomEventBannerListener
    {

        private final CustomEventAdapter zzHJ;
        private final MediationBannerListener zzaO;

        public void onAdClicked()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onAdClicked.");
            zzaO.onAdClicked(zzHJ);
        }

        public void onAdClosed()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onAdClosed.");
            zzaO.onAdClosed(zzHJ);
        }

        public void onAdFailedToLoad(int i)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onAdFailedToLoad.");
            zzaO.onAdFailedToLoad(zzHJ, i);
        }

        public void onAdLeftApplication()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onAdLeftApplication.");
            zzaO.onAdLeftApplication(zzHJ);
        }

        public void onAdLoaded(View view)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onAdLoaded.");
            CustomEventAdapter.zza(zzHJ, view);
            zzaO.onAdLoaded(zzHJ);
        }

        public void onAdOpened()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onAdOpened.");
            zzaO.onAdOpened(zzHJ);
        }

        public zza(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
        {
            zzHJ = customeventadapter;
            zzaO = mediationbannerlistener;
        }
    }

    class zzb
        implements CustomEventInterstitialListener
    {

        private final CustomEventAdapter zzHJ;
        final CustomEventAdapter zzHK;
        private final MediationInterstitialListener zzaP;

        public void onAdClicked()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onAdClicked.");
            zzaP.onAdClicked(zzHJ);
        }

        public void onAdClosed()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onAdClosed.");
            zzaP.onAdClosed(zzHJ);
        }

        public void onAdFailedToLoad(int i)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
            zzaP.onAdFailedToLoad(zzHJ, i);
        }

        public void onAdLeftApplication()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onAdLeftApplication.");
            zzaP.onAdLeftApplication(zzHJ);
        }

        public void onAdLoaded()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onReceivedAd.");
            zzaP.onAdLoaded(zzHK);
        }

        public void onAdOpened()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onAdOpened.");
            zzaP.onAdOpened(zzHJ);
        }

        public zzb(CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
        {
            zzHK = CustomEventAdapter.this;
            super();
            zzHJ = customeventadapter1;
            zzaP = mediationinterstitiallistener;
        }
    }


    CustomEventBanner zzHH;
    CustomEventInterstitial zzHI;
    private View zzaV;

    public CustomEventAdapter()
    {
    }

    private void zza(View view)
    {
        zzaV = view;
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
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Could not instantiate custom event adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
            return null;
        }
        return obj;
    }

    public View getBannerView()
    {
        return zzaV;
    }

    public void onDestroy()
    {
        if (zzHH != null)
        {
            zzHH.onDestroy();
        }
        if (zzHI != null)
        {
            zzHI.onDestroy();
        }
    }

    public void onPause()
    {
        if (zzHH != null)
        {
            zzHH.onPause();
        }
        if (zzHI != null)
        {
            zzHI.onPause();
        }
    }

    public void onResume()
    {
        if (zzHH != null)
        {
            zzHH.onResume();
        }
        if (zzHI != null)
        {
            zzHI.onResume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzHH = (CustomEventBanner)zzj(bundle.getString("class_name"));
        if (zzHH == null)
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
        zzHH.requestBannerAd(context, new zza(this, mediationbannerlistener), bundle.getString("parameter"), adsize, mediationadrequest, bundle1);
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzHI = (CustomEventInterstitial)zzj(bundle.getString("class_name"));
        if (zzHI == null)
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
        zzHI.requestInterstitialAd(context, zza(mediationinterstitiallistener), bundle.getString("parameter"), mediationadrequest, bundle1);
    }

    public void showInterstitial()
    {
        zzHI.showInterstitial();
    }

    zzb zza(MediationInterstitialListener mediationinterstitiallistener)
    {
        return new zzb(this, mediationinterstitiallistener);
    }
}
