// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzeh, zzen

public final class zzem
    implements MediationBannerListener, MediationInterstitialListener
{

    private final zzeh zzyg;

    public zzem(zzeh zzeh1)
    {
        zzyg = zzeh1;
    }

    static zzeh zza(zzem zzem1)
    {
        return zzem1.zzyg;
    }

    public void onClick(MediationBannerAdapter mediationbanneradapter)
    {
        zzb.zzay("Adapter called onClick.");
        if (!zzk.zzcA().zzgw())
        {
            zzb.zzaC("onClick must be called on the main UI thread.");
            zza.zzGF.post(new _cls1());
            return;
        }
        try
        {
            zzyg.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdClicked.", mediationbanneradapter);
        }
    }

    public void onDismissScreen(MediationBannerAdapter mediationbanneradapter)
    {
        zzb.zzay("Adapter called onDismissScreen.");
        if (!zzk.zzcA().zzgw())
        {
            zzb.zzaC("onDismissScreen must be called on the main UI thread.");
            zza.zzGF.post(new _cls4());
            return;
        }
        try
        {
            zzyg.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdClosed.", mediationbanneradapter);
        }
    }

    public void onDismissScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzb.zzay("Adapter called onDismissScreen.");
        if (!zzk.zzcA().zzgw())
        {
            zzb.zzaC("onDismissScreen must be called on the main UI thread.");
            zza.zzGF.post(new _cls9());
            return;
        }
        try
        {
            zzyg.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdClosed.", mediationinterstitialadapter);
        }
    }

    public void onFailedToReceiveAd(MediationBannerAdapter mediationbanneradapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        zzb.zzay((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error. ").append(errorcode).toString());
        if (!zzk.zzcA().zzgw())
        {
            zzb.zzaC("onFailedToReceiveAd must be called on the main UI thread.");
            zza.zzGF.post(new _cls5(errorcode));
            return;
        }
        try
        {
            zzyg.onAdFailedToLoad(com.google.android.gms.internal.zzen.zza(errorcode));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter mediationinterstitialadapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        zzb.zzay((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error ").append(errorcode).append(".").toString());
        if (!zzk.zzcA().zzgw())
        {
            zzb.zzaC("onFailedToReceiveAd must be called on the main UI thread.");
            zza.zzGF.post(new _cls10(errorcode));
            return;
        }
        try
        {
            zzyg.onAdFailedToLoad(com.google.android.gms.internal.zzen.zza(errorcode));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public void onLeaveApplication(MediationBannerAdapter mediationbanneradapter)
    {
        zzb.zzay("Adapter called onLeaveApplication.");
        if (!zzk.zzcA().zzgw())
        {
            zzb.zzaC("onLeaveApplication must be called on the main UI thread.");
            zza.zzGF.post(new _cls6());
            return;
        }
        try
        {
            zzyg.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdLeftApplication.", mediationbanneradapter);
        }
    }

    public void onLeaveApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzb.zzay("Adapter called onLeaveApplication.");
        if (!zzk.zzcA().zzgw())
        {
            zzb.zzaC("onLeaveApplication must be called on the main UI thread.");
            zza.zzGF.post(new _cls11());
            return;
        }
        try
        {
            zzyg.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdLeftApplication.", mediationinterstitialadapter);
        }
    }

    public void onPresentScreen(MediationBannerAdapter mediationbanneradapter)
    {
        zzb.zzay("Adapter called onPresentScreen.");
        if (!zzk.zzcA().zzgw())
        {
            zzb.zzaC("onPresentScreen must be called on the main UI thread.");
            zza.zzGF.post(new _cls7());
            return;
        }
        try
        {
            zzyg.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdOpened.", mediationbanneradapter);
        }
    }

    public void onPresentScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzb.zzay("Adapter called onPresentScreen.");
        if (!zzk.zzcA().zzgw())
        {
            zzb.zzaC("onPresentScreen must be called on the main UI thread.");
            zza.zzGF.post(new _cls2());
            return;
        }
        try
        {
            zzyg.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdOpened.", mediationinterstitialadapter);
        }
    }

    public void onReceivedAd(MediationBannerAdapter mediationbanneradapter)
    {
        zzb.zzay("Adapter called onReceivedAd.");
        if (!zzk.zzcA().zzgw())
        {
            zzb.zzaC("onReceivedAd must be called on the main UI thread.");
            zza.zzGF.post(new _cls8());
            return;
        }
        try
        {
            zzyg.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdLoaded.", mediationbanneradapter);
        }
    }

    public void onReceivedAd(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzb.zzay("Adapter called onReceivedAd.");
        if (!zzk.zzcA().zzgw())
        {
            zzb.zzaC("onReceivedAd must be called on the main UI thread.");
            zza.zzGF.post(new _cls3());
            return;
        }
        try
        {
            zzyg.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdLoaded.", mediationinterstitialadapter);
        }
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls9 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls10 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls11 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls3 {}

}
