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
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzct, zzcz

public final class zzcy
    implements MediationBannerListener, MediationInterstitialListener
{

    private final zzct zzvb;

    public zzcy(zzct zzct1)
    {
        zzvb = zzct1;
    }

    static zzct zza(zzcy zzcy1)
    {
        return zzcy1.zzvb;
    }

    public void onClick(MediationBannerAdapter mediationbanneradapter)
    {
        zzb.zzaj("Adapter called onClick.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onClick must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy zzve;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(zzve).onAdClicked();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdClicked.", remoteexception);
                    }
                }

            
            {
                zzve = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdClicked();
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
        zzb.zzaj("Adapter called onDismissScreen.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onDismissScreen must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy zzve;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(zzve).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                zzve = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdClosed();
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
        zzb.zzaj("Adapter called onDismissScreen.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onDismissScreen must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy zzve;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(zzve).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                zzve = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdClosed();
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
        zzb.zzaj((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error. ").append(errorcode).toString());
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onFailedToReceiveAd must be called on the main UI thread.");
            zza.zzCH.post(new Runnable(errorcode) {

                final zzcy zzve;
                final com.google.ads.AdRequest.ErrorCode zzvf;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(zzve).onAdFailedToLoad(com.google.android.gms.internal.zzcz.zza(zzvf));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                zzve = zzcy.this;
                zzvf = errorcode;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdFailedToLoad(com.google.android.gms.internal.zzcz.zza(errorcode));
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
        zzb.zzaj((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error ").append(errorcode).append(".").toString());
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onFailedToReceiveAd must be called on the main UI thread.");
            zza.zzCH.post(new Runnable(errorcode) {

                final zzcy zzve;
                final com.google.ads.AdRequest.ErrorCode zzvf;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(zzve).onAdFailedToLoad(com.google.android.gms.internal.zzcz.zza(zzvf));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                zzve = zzcy.this;
                zzvf = errorcode;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdFailedToLoad(com.google.android.gms.internal.zzcz.zza(errorcode));
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
        zzb.zzaj("Adapter called onLeaveApplication.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onLeaveApplication must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy zzve;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(zzve).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                zzve = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdLeftApplication();
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
        zzb.zzaj("Adapter called onLeaveApplication.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onLeaveApplication must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy zzve;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(zzve).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                zzve = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdLeftApplication();
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
        zzb.zzaj("Adapter called onPresentScreen.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onPresentScreen must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy zzve;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(zzve).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                zzve = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdOpened();
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
        zzb.zzaj("Adapter called onPresentScreen.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onPresentScreen must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy zzve;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(zzve).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                zzve = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdOpened();
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
        zzb.zzaj("Adapter called onReceivedAd.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onReceivedAd must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy zzve;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(zzve).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                zzve = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdLoaded();
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
        zzb.zzaj("Adapter called onReceivedAd.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onReceivedAd must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy zzve;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(zzve).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                zzve = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdLoaded.", mediationinterstitialadapter);
        }
    }
}
