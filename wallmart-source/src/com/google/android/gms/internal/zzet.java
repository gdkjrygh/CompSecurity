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
//            zzej, zzeu

public final class zzet
    implements MediationBannerListener, MediationInterstitialListener
{

    private final zzej zzyY;

    public zzet(zzej zzej1)
    {
        zzyY = zzej1;
    }

    static zzej zza(zzet zzet1)
    {
        return zzet1.zzyY;
    }

    public void onClick(MediationBannerAdapter mediationbanneradapter)
    {
        zzb.zzaC("Adapter called onClick.");
        if (!zzk.zzcE().zzgI())
        {
            zzb.zzaE("onClick must be called on the main UI thread.");
            zza.zzIy.post(new Runnable() {

                final zzet zzze;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzet.zza(zzze).onAdClicked();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdClicked.", remoteexception);
                    }
                }

            
            {
                zzze = zzet.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzyY.onAdClicked();
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
        zzb.zzaC("Adapter called onDismissScreen.");
        if (!zzk.zzcE().zzgI())
        {
            zzb.zzaE("onDismissScreen must be called on the main UI thread.");
            zza.zzIy.post(new Runnable() {

                final zzet zzze;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzet.zza(zzze).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                zzze = zzet.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzyY.onAdClosed();
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
        zzb.zzaC("Adapter called onDismissScreen.");
        if (!zzk.zzcE().zzgI())
        {
            zzb.zzaE("onDismissScreen must be called on the main UI thread.");
            zza.zzIy.post(new Runnable() {

                final zzet zzze;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzet.zza(zzze).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                zzze = zzet.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzyY.onAdClosed();
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
        zzb.zzaC((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error. ").append(errorcode).toString());
        if (!zzk.zzcE().zzgI())
        {
            zzb.zzaE("onFailedToReceiveAd must be called on the main UI thread.");
            zza.zzIy.post(new Runnable(errorcode) {

                final zzet zzze;
                final com.google.ads.AdRequest.ErrorCode zzzf;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzet.zza(zzze).onAdFailedToLoad(com.google.android.gms.internal.zzeu.zza(zzzf));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                zzze = zzet.this;
                zzzf = errorcode;
                super();
            }
            });
            return;
        }
        try
        {
            zzyY.onAdFailedToLoad(com.google.android.gms.internal.zzeu.zza(errorcode));
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
        zzb.zzaC((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error ").append(errorcode).append(".").toString());
        if (!zzk.zzcE().zzgI())
        {
            zzb.zzaE("onFailedToReceiveAd must be called on the main UI thread.");
            zza.zzIy.post(new Runnable(errorcode) {

                final zzet zzze;
                final com.google.ads.AdRequest.ErrorCode zzzf;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzet.zza(zzze).onAdFailedToLoad(com.google.android.gms.internal.zzeu.zza(zzzf));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                zzze = zzet.this;
                zzzf = errorcode;
                super();
            }
            });
            return;
        }
        try
        {
            zzyY.onAdFailedToLoad(com.google.android.gms.internal.zzeu.zza(errorcode));
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
        zzb.zzaC("Adapter called onLeaveApplication.");
        if (!zzk.zzcE().zzgI())
        {
            zzb.zzaE("onLeaveApplication must be called on the main UI thread.");
            zza.zzIy.post(new Runnable() {

                final zzet zzze;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzet.zza(zzze).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                zzze = zzet.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzyY.onAdLeftApplication();
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
        zzb.zzaC("Adapter called onLeaveApplication.");
        if (!zzk.zzcE().zzgI())
        {
            zzb.zzaE("onLeaveApplication must be called on the main UI thread.");
            zza.zzIy.post(new Runnable() {

                final zzet zzze;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzet.zza(zzze).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                zzze = zzet.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzyY.onAdLeftApplication();
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
        zzb.zzaC("Adapter called onPresentScreen.");
        if (!zzk.zzcE().zzgI())
        {
            zzb.zzaE("onPresentScreen must be called on the main UI thread.");
            zza.zzIy.post(new Runnable() {

                final zzet zzze;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzet.zza(zzze).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                zzze = zzet.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzyY.onAdOpened();
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
        zzb.zzaC("Adapter called onPresentScreen.");
        if (!zzk.zzcE().zzgI())
        {
            zzb.zzaE("onPresentScreen must be called on the main UI thread.");
            zza.zzIy.post(new Runnable() {

                final zzet zzze;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzet.zza(zzze).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                zzze = zzet.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzyY.onAdOpened();
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
        zzb.zzaC("Adapter called onReceivedAd.");
        if (!zzk.zzcE().zzgI())
        {
            zzb.zzaE("onReceivedAd must be called on the main UI thread.");
            zza.zzIy.post(new Runnable() {

                final zzet zzze;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzet.zza(zzze).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                zzze = zzet.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzyY.onAdLoaded();
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
        zzb.zzaC("Adapter called onReceivedAd.");
        if (!zzk.zzcE().zzgI())
        {
            zzb.zzaE("onReceivedAd must be called on the main UI thread.");
            zza.zzIy.post(new Runnable() {

                final zzet zzze;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzet.zza(zzze).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                zzze = zzet.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzyY.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdLoaded.", mediationinterstitialadapter);
        }
    }
}
