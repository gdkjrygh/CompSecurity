// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzee;
import com.google.android.gms.internal.zzfk;
import com.google.android.gms.internal.zzfo;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzg, zzk, AdSizeParcel, zze, 
//            zzc, zzr, zzb, zzi, 
//            zzx, zza

public class zzz
{

    private final Context mContext;
    private final zzg zznH;
    private String zzoL;
    private zza zzrU;
    private AdListener zzrV;
    private final zzee zzsR;
    private zzr zzsT;
    private String zzsU;
    private InAppPurchaseListener zzsW;
    private PlayStorePurchaseListener zzsX;
    private OnCustomRenderedAdLoadedListener zzsY;
    private PublisherInterstitialAd zzsZ;
    private AppEventListener zzsq;

    public zzz(Context context)
    {
        this(context, zzg.zzcw(), null);
    }

    public zzz(Context context, PublisherInterstitialAd publisherinterstitialad)
    {
        this(context, zzg.zzcw(), publisherinterstitialad);
    }

    public zzz(Context context, zzg zzg1, PublisherInterstitialAd publisherinterstitialad)
    {
        zzsR = new zzee();
        mContext = context;
        zznH = zzg1;
        zzsZ = publisherinterstitialad;
    }

    private void zzL(String s)
        throws RemoteException
    {
        if (zzoL == null)
        {
            zzM(s);
        }
        zzsT = zzk.zzcB().zzb(mContext, new AdSizeParcel(), zzoL, zzsR);
        if (zzrV != null)
        {
            zzsT.zza(new zzc(zzrV));
        }
        if (zzrU != null)
        {
            zzsT.zza(new com.google.android.gms.ads.internal.client.zzb(zzrU));
        }
        if (zzsq != null)
        {
            zzsT.zza(new zzi(zzsq));
        }
        if (zzsW != null)
        {
            zzsT.zza(new zzfk(zzsW));
        }
        if (zzsX != null)
        {
            zzsT.zza(new zzfo(zzsX), zzsU);
        }
        if (zzsY != null)
        {
            zzsT.zza(new zzcj(zzsY));
        }
    }

    private void zzM(String s)
    {
        if (zzsT == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("The ad unit ID must be set on InterstitialAd before ").append(s).append(" is called.").toString());
        } else
        {
            return;
        }
    }

    public AdListener getAdListener()
    {
        return zzrV;
    }

    public String getAdUnitId()
    {
        return zzoL;
    }

    public AppEventListener getAppEventListener()
    {
        return zzsq;
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return zzsW;
    }

    public String getMediationAdapterClassName()
    {
        String s;
        if (zzsT == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        s = zzsT.getMediationAdapterClassName();
        return s;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Failed to get the mediation adapter class name.", remoteexception);
        return null;
    }

    public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
    {
        return zzsY;
    }

    public boolean isLoaded()
    {
        if (zzsT == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = zzsT.isReady();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to check if ad is ready.", remoteexception);
            return false;
        }
        return flag;
    }

    public void setAdListener(AdListener adlistener)
    {
        zzrV = adlistener;
        if (zzsT == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zzsT;
        if (adlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        adlistener = new zzc(adlistener);
_L3:
        zzr1.zza(adlistener);
_L2:
        return;
        adlistener = null;
          goto _L3
        adlistener;
        zzb.zzd("Failed to set the AdListener.", adlistener);
        return;
    }

    public void setAdUnitId(String s)
    {
        if (zzoL != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        } else
        {
            zzoL = s;
            return;
        }
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        zzsq = appeventlistener;
        if (zzsT == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zzsT;
        if (appeventlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        appeventlistener = new zzi(appeventlistener);
_L3:
        zzr1.zza(appeventlistener);
_L2:
        return;
        appeventlistener = null;
          goto _L3
        appeventlistener;
        zzb.zzd("Failed to set the AppEventListener.", appeventlistener);
        return;
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        if (zzsX != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        zzsW = inapppurchaselistener;
        if (zzsT == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zzsT;
        if (inapppurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        inapppurchaselistener = new zzfk(inapppurchaselistener);
_L3:
        zzr1.zza(inapppurchaselistener);
_L2:
        return;
        inapppurchaselistener = null;
          goto _L3
        inapppurchaselistener;
        zzb.zzd("Failed to set the InAppPurchaseListener.", inapppurchaselistener);
        return;
    }

    public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        zzsY = oncustomrenderedadloadedlistener;
        if (zzsT == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zzsT;
        if (oncustomrenderedadloadedlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        oncustomrenderedadloadedlistener = new zzcj(oncustomrenderedadloadedlistener);
_L3:
        zzr1.zza(oncustomrenderedadloadedlistener);
_L2:
        return;
        oncustomrenderedadloadedlistener = null;
          goto _L3
        oncustomrenderedadloadedlistener;
        zzb.zzd("Failed to set the OnCustomRenderedAdLoadedListener.", oncustomrenderedadloadedlistener);
        return;
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        if (zzsW != null)
        {
            throw new IllegalStateException("In app purchase parameter has already been set.");
        }
        zzsX = playstorepurchaselistener;
        zzsU = s;
        if (zzsT == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zzsT;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        playstorepurchaselistener = new zzfo(playstorepurchaselistener);
_L3:
        zzr1.zza(playstorepurchaselistener, s);
_L2:
        return;
        playstorepurchaselistener = null;
          goto _L3
        playstorepurchaselistener;
        zzb.zzd("Failed to set the play store purchase parameter.", playstorepurchaselistener);
        return;
    }

    public void show()
    {
        try
        {
            zzM("show");
            zzsT.showInterstitial();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to show interstitial.", remoteexception);
        }
    }

    public void zza(zza zza1)
    {
        zzrU = zza1;
        if (zzsT == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zzsT;
        if (zza1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        zza1 = new com.google.android.gms.ads.internal.client.zzb(zza1);
_L3:
        zzr1.zza(zza1);
_L2:
        return;
        zza1 = null;
          goto _L3
        zza1;
        zzb.zzd("Failed to set the AdClickListener.", zza1);
        return;
    }

    public void zza(zzx zzx1)
    {
        try
        {
            if (zzsT == null)
            {
                zzL("loadAd");
            }
            if (zzsT.zza(zznH.zza(mContext, zzx1)))
            {
                zzsR.zzf(zzx1.zzcJ());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzx zzx1)
        {
            zzb.zzd("Failed to load ad.", zzx1);
        }
    }
}
