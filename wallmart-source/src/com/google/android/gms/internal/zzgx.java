// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.zzx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzhb, zzgy, zzei, zzhj, 
//            zzdz, zzef, zzea, zzgv, 
//            zzhu, zzhe, zzhq, zzeh, 
//            zzcd

public class zzgx extends zzb
    implements zzhb
{

    private zzd zzGg;
    private String zzGh;
    private boolean zzGi;
    private HashMap zzGj;

    public zzgx(Context context, AdSizeParcel adsizeparcel, zzeh zzeh1, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, null, zzeh1, versioninfoparcel, null);
        zzGj = new HashMap();
    }

    public void destroy()
    {
        Iterator iterator;
        zzx.zzch("destroy must be called on the main UI thread.");
        iterator = zzGj.keySet().iterator();
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        zzgy zzgy1 = (zzgy)zzGj.get(s);
        if (zzgy1 != null)
        {
            try
            {
                if (zzgy1.zzfQ() != null)
                {
                    zzgy1.zzfQ().destroy();
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Fail to destroy adapter: ").append(s).toString());
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean isLoaded()
    {
        zzx.zzch("isLoaded must be called on the main UI thread.");
        return zzos.zzqd == null && zzos.zzqe == null && zzos.zzqg != null && !zzGi;
    }

    public void onRewardedVideoAdClosed()
    {
        if (zzGg == null)
        {
            return;
        }
        try
        {
            zzGg.onRewardedVideoAdClosed();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdClosed().", remoteexception);
        }
    }

    public void onRewardedVideoAdLeftApplication()
    {
        if (zzGg == null)
        {
            return;
        }
        try
        {
            zzGg.onRewardedVideoAdLeftApplication();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdLeftApplication().", remoteexception);
        }
    }

    public void onRewardedVideoAdOpened()
    {
        zza(zzos.zzqg, false);
        if (zzGg == null)
        {
            return;
        }
        try
        {
            zzGg.onRewardedVideoAdOpened();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdOpened().", remoteexception);
        }
    }

    public void onRewardedVideoStarted()
    {
        zzp.zzbJ().zza(zzos.context, zzos.zzqb.zzIz, zzos.zzqg, zzos.zzpZ, false, zzos.zzqg.zzyQ.zzys);
        if (zzGg == null)
        {
            return;
        }
        try
        {
            zzGg.onRewardedVideoStarted();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onVideoStarted().", remoteexception);
        }
    }

    public void pause()
    {
        Iterator iterator;
        zzx.zzch("pause must be called on the main UI thread.");
        iterator = zzGj.keySet().iterator();
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        zzgy zzgy1 = (zzgy)zzGj.get(s);
        if (zzgy1 != null)
        {
            try
            {
                if (zzgy1.zzfQ() != null)
                {
                    zzgy1.zzfQ().pause();
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Fail to pause adapter: ").append(s).toString());
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void resume()
    {
        Iterator iterator;
        zzx.zzch("resume must be called on the main UI thread.");
        iterator = zzGj.keySet().iterator();
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        zzgy zzgy1 = (zzgy)zzGj.get(s);
        if (zzgy1 != null)
        {
            try
            {
                if (zzgy1.zzfQ() != null)
                {
                    zzgy1.zzfQ().resume();
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Fail to resume adapter: ").append(s).toString());
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void setUserId(String s)
    {
        zzx.zzch("setUserId must be called on the main UI thread.");
        zzGh = s;
    }

    public void zza(RewardedVideoAdRequestParcel rewardedvideoadrequestparcel)
    {
        zzx.zzch("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(rewardedvideoadrequestparcel.zzpZ))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Invalid ad unit id. Aborting.");
            return;
        } else
        {
            zzGi = false;
            zzos.zzpZ = rewardedvideoadrequestparcel.zzpZ;
            super.zza(rewardedvideoadrequestparcel.zzDy);
            return;
        }
    }

    public void zza(zzd zzd1)
    {
        zzx.zzch("setRewardedVideoAdListener must be called on the main UI thread.");
        zzGg = zzd1;
    }

    public void zza(RewardItemParcel rewarditemparcel)
    {
        zzp.zzbJ().zza(zzos.context, zzos.zzqb.zzIz, zzos.zzqg, zzos.zzpZ, false, zzos.zzqg.zzyQ.zzyt);
        if (zzGg == null)
        {
            return;
        }
        try
        {
            if (zzos.zzqg != null && zzos.zzqg.zzGG != null && !TextUtils.isEmpty(zzos.zzqg.zzGG.zzyB))
            {
                zzGg.zza(new zzgv(zzos.zzqg.zzGG.zzyB, zzos.zzqg.zzGG.zzyC));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (RewardItemParcel rewarditemparcel)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onRewarded().", rewarditemparcel);
            return;
        }
        zzGg.zza(new zzgv(rewarditemparcel.type, rewarditemparcel.zzGE));
        return;
    }

    public void zza(zzhj.zza zza1, zzcd zzcd)
    {
        if (zza1.errorCode != -2)
        {
            zzhu.zzHK.post(new Runnable(zza1) {

                final zzgx zzGk;
                final zzhj.zza zzoA;

                public void run()
                {
                    zzGk.zzb(new zzhj(zzoA, null, null, null, null, null, null));
                }

            
            {
                zzGk = zzgx.this;
                zzoA = zza1;
                super();
            }
            });
            return;
        } else
        {
            zzos.zzqz = 0;
            zzos.zzqe = new zzhe(zzos.context, zzGh, zza1, this);
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("AdRenderer: ").append(zzos.zzqe.getClass().getName()).toString());
            zzos.zzqe.zzgn();
            return;
        }
    }

    public boolean zza(zzhj zzhj1, zzhj zzhj2)
    {
        if (zzGg != null)
        {
            try
            {
                zzGg.onRewardedVideoAdLoaded();
            }
            // Misplaced declaration of an exception variable
            catch (zzhj zzhj1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdLoaded().", zzhj1);
            }
        }
        return true;
    }

    public zzgy zzar(String s)
    {
        Object obj;
        Object obj1;
        obj = (zzgy)zzGj.get(s);
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj1 = new zzgy(zzow.zzab(s), this);
        zzGj.put(s, obj1);
        return ((zzgy) (obj1));
        obj1;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Fail to instantiate adapter ").append(s).toString(), ((Throwable) (obj1)));
        return ((zzgy) (obj));
        Exception exception;
        exception;
        obj = obj1;
        obj1 = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected boolean zze(int i)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Failed to load ad: ").append(i).toString());
        if (zzGg == null)
        {
            return false;
        }
        try
        {
            zzGg.onRewardedVideoAdFailedToLoad(i);
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdFailedToLoad().", remoteexception);
            return false;
        }
        return true;
    }

    public void zzfO()
    {
        zzx.zzch("showAd must be called on the main UI thread.");
        if (!isLoaded())
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("The reward video has not loaded.");
        } else
        {
            zzGi = true;
            zzgy zzgy1 = zzar(zzos.zzqg.zzyS);
            if (zzgy1 != null && zzgy1.zzfQ() != null)
            {
                try
                {
                    zzgy1.zzfQ().showVideo();
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call showVideo.", remoteexception);
                }
                return;
            }
        }
    }

    public void zzfP()
    {
        onAdClicked();
    }
}
