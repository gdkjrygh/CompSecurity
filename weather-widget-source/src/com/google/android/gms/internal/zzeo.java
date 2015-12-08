// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.internal:
//            zzej

public final class zzeo
    implements MediationBannerListener, MediationInterstitialListener, zzb
{

    private final zzej zzyY;
    private NativeAdMapper zzyZ;

    public zzeo(zzej zzej1)
    {
        zzyY = zzej1;
    }

    public void onAdClicked(MediationBannerAdapter mediationbanneradapter)
    {
        zzx.zzch("onAdClicked must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdClicked.");
        try
        {
            zzyY.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdClicked.", mediationbanneradapter);
        }
    }

    public void onAdClicked(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzx.zzch("onAdClicked must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdClicked.");
        try
        {
            zzyY.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdClicked.", mediationinterstitialadapter);
        }
    }

    public void onAdClosed(MediationBannerAdapter mediationbanneradapter)
    {
        zzx.zzch("onAdClosed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdClosed.");
        try
        {
            zzyY.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdClosed.", mediationbanneradapter);
        }
    }

    public void onAdClosed(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzx.zzch("onAdClosed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdClosed.");
        try
        {
            zzyY.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdClosed.", mediationinterstitialadapter);
        }
    }

    public void onAdFailedToLoad(MediationBannerAdapter mediationbanneradapter, int i)
    {
        zzx.zzch("onAdFailedToLoad must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Adapter called onAdFailedToLoad with error. ").append(i).toString());
        try
        {
            zzyY.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public void onAdFailedToLoad(MediationInterstitialAdapter mediationinterstitialadapter, int i)
    {
        zzx.zzch("onAdFailedToLoad must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try
        {
            zzyY.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public void onAdLeftApplication(MediationBannerAdapter mediationbanneradapter)
    {
        zzx.zzch("onAdLeftApplication must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdLeftApplication.");
        try
        {
            zzyY.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdLeftApplication.", mediationbanneradapter);
        }
    }

    public void onAdLeftApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzx.zzch("onAdLeftApplication must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdLeftApplication.");
        try
        {
            zzyY.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdLeftApplication.", mediationinterstitialadapter);
        }
    }

    public void onAdLoaded(MediationBannerAdapter mediationbanneradapter)
    {
        zzx.zzch("onAdLoaded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdLoaded.");
        try
        {
            zzyY.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdLoaded.", mediationbanneradapter);
        }
    }

    public void onAdLoaded(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzx.zzch("onAdLoaded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdLoaded.");
        try
        {
            zzyY.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdLoaded.", mediationinterstitialadapter);
        }
    }

    public void onAdOpened(MediationBannerAdapter mediationbanneradapter)
    {
        zzx.zzch("onAdOpened must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdOpened.");
        try
        {
            zzyY.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdOpened.", mediationbanneradapter);
        }
    }

    public void onAdOpened(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzx.zzch("onAdOpened must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdOpened.");
        try
        {
            zzyY.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdOpened.", mediationinterstitialadapter);
        }
    }

    public void zza(zza zza1)
    {
        zzx.zzch("onAdOpened must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdOpened.");
        try
        {
            zzyY.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zza zza1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdOpened.", zza1);
        }
    }

    public void zza(zza zza1, int i)
    {
        zzx.zzch("onAdFailedToLoad must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try
        {
            zzyY.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zza zza1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdFailedToLoad.", zza1);
        }
    }

    public void zza(zza zza1, NativeAdMapper nativeadmapper)
    {
        zzx.zzch("onAdLoaded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdLoaded.");
        zzyZ = nativeadmapper;
        try
        {
            zzyY.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zza zza1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdLoaded.", zza1);
        }
    }

    public void zzb(zza zza1)
    {
        zzx.zzch("onAdClosed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdClosed.");
        try
        {
            zzyY.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zza zza1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdClosed.", zza1);
        }
    }

    public void zzc(zza zza1)
    {
        zzx.zzch("onAdLeftApplication must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdLeftApplication.");
        try
        {
            zzyY.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zza zza1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdLeftApplication.", zza1);
        }
    }

    public void zzd(zza zza1)
    {
        zzx.zzch("onAdClicked must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdClicked.");
        try
        {
            zzyY.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zza zza1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdClicked.", zza1);
        }
    }

    public NativeAdMapper zzdU()
    {
        return zzyZ;
    }
}
