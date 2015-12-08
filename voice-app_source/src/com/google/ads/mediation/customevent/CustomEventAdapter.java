// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;

// Referenced classes of package com.google.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventServerParameters, CustomEventBannerListener, 
//            CustomEventInterstitialListener

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    static final class zza
        implements CustomEventBannerListener
    {

        private final CustomEventAdapter zzaY;
        private final MediationBannerListener zzaZ;

        public void onClick()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
            zzaZ.onClick(zzaY);
        }

        public void onDismissScreen()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
            zzaZ.onDismissScreen(zzaY);
        }

        public void onFailedToReceiveAd()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
            zzaZ.onFailedToReceiveAd(zzaY, com.google.ads.AdRequest.ErrorCode.NO_FILL);
        }

        public void onLeaveApplication()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
            zzaZ.onLeaveApplication(zzaY);
        }

        public void onPresentScreen()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
            zzaZ.onPresentScreen(zzaY);
        }

        public void onReceivedAd(View view)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onReceivedAd.");
            CustomEventAdapter.zza(zzaY, view);
            zzaZ.onReceivedAd(zzaY);
        }

        public zza(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
        {
            zzaY = customeventadapter;
            zzaZ = mediationbannerlistener;
        }
    }

    class zzb
        implements CustomEventInterstitialListener
    {

        private final CustomEventAdapter zzaY;
        private final MediationInterstitialListener zzba;
        final CustomEventAdapter zzbb;

        public void onDismissScreen()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onDismissScreen.");
            zzba.onDismissScreen(zzaY);
        }

        public void onFailedToReceiveAd()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
            zzba.onFailedToReceiveAd(zzaY, com.google.ads.AdRequest.ErrorCode.NO_FILL);
        }

        public void onLeaveApplication()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onLeaveApplication.");
            zzba.onLeaveApplication(zzaY);
        }

        public void onPresentScreen()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onPresentScreen.");
            zzba.onPresentScreen(zzaY);
        }

        public void onReceivedAd()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onReceivedAd.");
            zzba.onReceivedAd(zzbb);
        }

        public zzb(CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
        {
            zzbb = CustomEventAdapter.this;
            super();
            zzaY = customeventadapter1;
            zzba = mediationinterstitiallistener;
        }
    }


    private View zzaV;
    CustomEventBanner zzaW;
    CustomEventInterstitial zzaX;

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

    public void destroy()
    {
        if (zzaW != null)
        {
            zzaW.destroy();
        }
        if (zzaX != null)
        {
            zzaX.destroy();
        }
    }

    public Class getAdditionalParametersType()
    {
        return com/google/android/gms/ads/mediation/customevent/CustomEventExtras;
    }

    public View getBannerView()
    {
        return zzaV;
    }

    public Class getServerParametersType()
    {
        return com/google/ads/mediation/customevent/CustomEventServerParameters;
    }

    public volatile void requestBannerAd(MediationBannerListener mediationbannerlistener, Activity activity, MediationServerParameters mediationserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
        requestBannerAd(mediationbannerlistener, activity, (CustomEventServerParameters)mediationserverparameters, adsize, mediationadrequest, (CustomEventExtras)networkextras);
    }

    public void requestBannerAd(MediationBannerListener mediationbannerlistener, Activity activity, CustomEventServerParameters customeventserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, CustomEventExtras customeventextras)
    {
        zzaW = (CustomEventBanner)zzj(customeventserverparameters.className);
        if (zzaW == null)
        {
            mediationbannerlistener.onFailedToReceiveAd(this, com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (customeventextras == null)
        {
            customeventextras = null;
        } else
        {
            customeventextras = ((CustomEventExtras) (customeventextras.getExtra(customeventserverparameters.label)));
        }
        zzaW.requestBannerAd(new zza(this, mediationbannerlistener), activity, customeventserverparameters.label, customeventserverparameters.parameter, adsize, mediationadrequest, customeventextras);
    }

    public volatile void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, MediationServerParameters mediationserverparameters, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
        requestInterstitialAd(mediationinterstitiallistener, activity, (CustomEventServerParameters)mediationserverparameters, mediationadrequest, (CustomEventExtras)networkextras);
    }

    public void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, CustomEventServerParameters customeventserverparameters, MediationAdRequest mediationadrequest, CustomEventExtras customeventextras)
    {
        zzaX = (CustomEventInterstitial)zzj(customeventserverparameters.className);
        if (zzaX == null)
        {
            mediationinterstitiallistener.onFailedToReceiveAd(this, com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (customeventextras == null)
        {
            customeventextras = null;
        } else
        {
            customeventextras = ((CustomEventExtras) (customeventextras.getExtra(customeventserverparameters.label)));
        }
        zzaX.requestInterstitialAd(zza(mediationinterstitiallistener), activity, customeventserverparameters.label, customeventserverparameters.parameter, mediationadrequest, customeventextras);
    }

    public void showInterstitial()
    {
        zzaX.showInterstitial();
    }

    zzb zza(MediationInterstitialListener mediationinterstitiallistener)
    {
        return new zzb(this, mediationinterstitiallistener);
    }
}
