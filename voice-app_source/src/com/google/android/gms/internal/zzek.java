// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.internal:
//            zzeh

public final class zzek
    implements MediationBannerListener, MediationInterstitialListener
{

    private final zzeh zzyg;

    public zzek(zzeh zzeh1)
    {
        zzyg = zzeh1;
    }

    public void onAdClicked(MediationBannerAdapter mediationbanneradapter)
    {
        zzu.zzbY("onAdClicked must be called on the main UI thread.");
        zzb.zzay("Adapter called onAdClicked.");
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

    public void onAdClicked(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzu.zzbY("onAdClicked must be called on the main UI thread.");
        zzb.zzay("Adapter called onAdClicked.");
        try
        {
            zzyg.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdClicked.", mediationinterstitialadapter);
        }
    }

    public void onAdClosed(MediationBannerAdapter mediationbanneradapter)
    {
        zzu.zzbY("onAdClosed must be called on the main UI thread.");
        zzb.zzay("Adapter called onAdClosed.");
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

    public void onAdClosed(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzu.zzbY("onAdClosed must be called on the main UI thread.");
        zzb.zzay("Adapter called onAdClosed.");
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

    public void onAdFailedToLoad(MediationBannerAdapter mediationbanneradapter, int i)
    {
        zzu.zzbY("onAdFailedToLoad must be called on the main UI thread.");
        zzb.zzay((new StringBuilder()).append("Adapter called onAdFailedToLoad with error. ").append(i).toString());
        try
        {
            zzyg.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public void onAdFailedToLoad(MediationInterstitialAdapter mediationinterstitialadapter, int i)
    {
        zzu.zzbY("onAdFailedToLoad must be called on the main UI thread.");
        zzb.zzay((new StringBuilder()).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try
        {
            zzyg.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public void onAdLeftApplication(MediationBannerAdapter mediationbanneradapter)
    {
        zzu.zzbY("onAdLeftApplication must be called on the main UI thread.");
        zzb.zzay("Adapter called onAdLeftApplication.");
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

    public void onAdLeftApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzu.zzbY("onAdLeftApplication must be called on the main UI thread.");
        zzb.zzay("Adapter called onAdLeftApplication.");
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

    public void onAdLoaded(MediationBannerAdapter mediationbanneradapter)
    {
        zzu.zzbY("onAdLoaded must be called on the main UI thread.");
        zzb.zzay("Adapter called onAdLoaded.");
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

    public void onAdLoaded(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzu.zzbY("onAdLoaded must be called on the main UI thread.");
        zzb.zzay("Adapter called onAdLoaded.");
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

    public void onAdOpened(MediationBannerAdapter mediationbanneradapter)
    {
        zzu.zzbY("onAdOpened must be called on the main UI thread.");
        zzb.zzay("Adapter called onAdOpened.");
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

    public void onAdOpened(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzu.zzbY("onAdOpened must be called on the main UI thread.");
        zzb.zzay("Adapter called onAdOpened.");
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
}
