// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.zzu;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzgs, zzgp, zzeg, zzha, 
//            zzdx, zzed, zzdy, zzgm, 
//            zzef, zzgv, zzhh

public class zzgo extends zzb
    implements zzgs
{

    private zzd zzEN;
    private String zzEO;
    private boolean zzEP;
    private HashMap zzEQ;

    public zzgo(Context context, AdSizeParcel adsizeparcel, zzef zzef1, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, null, zzef1, versioninfoparcel);
        zzEQ = new HashMap();
    }

    public void destroy()
    {
        Iterator iterator;
        zzu.zzbY("destroy must be called on the main UI thread.");
        iterator = zzEQ.keySet().iterator();
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        zzgp zzgp1 = (zzgp)zzEQ.get(s);
        if (zzgp1 != null)
        {
            try
            {
                if (zzgp1.zzfM() != null)
                {
                    zzgp1.zzfM().destroy();
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Fail to destroy adapter: ").append(s).toString());
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean isLoaded()
    {
        zzu.zzbY("isLoaded must be called on the main UI thread.");
        return zzon.zzpL == null && zzon.zzpM == null && zzon.zzpO != null;
    }

    public void onRewardedVideoAdClosed()
    {
        if (zzEN == null)
        {
            return;
        }
        try
        {
            zzEN.onRewardedVideoAdClosed();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdClosed().", remoteexception);
        }
    }

    public void onRewardedVideoAdLeftApplication()
    {
        if (zzEN == null)
        {
            return;
        }
        try
        {
            zzEN.onRewardedVideoAdLeftApplication();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdLeftApplication().", remoteexception);
        }
    }

    public void onRewardedVideoAdOpened()
    {
        recordImpression();
        if (zzEN == null)
        {
            return;
        }
        try
        {
            zzEN.onRewardedVideoAdOpened();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdOpened().", remoteexception);
        }
    }

    public void onRewardedVideoStarted()
    {
        zzo.zzbG().zza(zzon.zzpH, zzon.zzpJ.zzGG, zzon.zzpO, zzon.zzpG, false, zzon.zzpO.zzxZ.zzxB);
        if (zzEN == null)
        {
            return;
        }
        try
        {
            zzEN.onRewardedVideoStarted();
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
        zzu.zzbY("pause must be called on the main UI thread.");
        iterator = zzEQ.keySet().iterator();
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        zzgp zzgp1 = (zzgp)zzEQ.get(s);
        if (zzgp1 != null)
        {
            try
            {
                if (zzgp1.zzfM() != null)
                {
                    zzgp1.zzfM().pause();
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Fail to pause adapter: ").append(s).toString());
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void resume()
    {
        Iterator iterator;
        zzu.zzbY("resume must be called on the main UI thread.");
        iterator = zzEQ.keySet().iterator();
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        zzgp zzgp1 = (zzgp)zzEQ.get(s);
        if (zzgp1 != null)
        {
            try
            {
                if (zzgp1.zzfM() != null)
                {
                    zzgp1.zzfM().resume();
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Fail to resume adapter: ").append(s).toString());
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void setUserId(String s)
    {
        zzu.zzbY("setUserId must be called on the main UI thread.");
        zzEO = s;
    }

    public void zza(RewardedVideoAdRequestParcel rewardedvideoadrequestparcel)
    {
        zzu.zzbY("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(rewardedvideoadrequestparcel.zzpG))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Invalid ad unit id. Aborting.");
            return;
        } else
        {
            zzEP = false;
            zzon.zzpG = rewardedvideoadrequestparcel.zzpG;
            super.zza(rewardedvideoadrequestparcel.zzCm);
            return;
        }
    }

    public void zza(zzd zzd1)
    {
        zzu.zzbY("setRewardedVideoAdListener must be called on the main UI thread.");
        zzEN = zzd1;
    }

    public void zza(RewardItemParcel rewarditemparcel)
    {
        zzo.zzbG().zza(zzon.zzpH, zzon.zzpJ.zzGG, zzon.zzpO, zzon.zzpG, false, zzon.zzpO.zzxZ.zzxC);
        if (zzEN == null)
        {
            return;
        }
        try
        {
            if (zzon.zzpO != null && zzon.zzpO.zzFm != null && !TextUtils.isEmpty(zzon.zzpO.zzFm.zzxK))
            {
                zzEN.zza(new zzgm(zzon.zzpO.zzFm.zzxK, zzon.zzpO.zzFm.zzxL));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (RewardItemParcel rewarditemparcel)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onRewarded().", rewarditemparcel);
            return;
        }
        zzEN.zza(new zzgm(rewarditemparcel.type, rewarditemparcel.zzFk));
        return;
    }

    public boolean zza(zzha zzha1, zzha zzha2)
    {
        if (zzEN != null)
        {
            try
            {
                zzEN.onRewardedVideoAdLoaded();
            }
            // Misplaced declaration of an exception variable
            catch (zzha zzha1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdLoaded().", zzha1);
            }
        }
        return true;
    }

    public zzgp zzao(String s)
    {
        Object obj;
        Object obj1;
        obj = (zzgp)zzEQ.get(s);
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj1 = new zzgp(zzoq.zzY(s), this);
        zzEQ.put(s, obj1);
        return ((zzgp) (obj1));
        obj1;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Fail to instantiate adapter ").append(s).toString(), ((Throwable) (obj1)));
        return ((zzgp) (obj));
        Exception exception;
        exception;
        obj = obj1;
        obj1 = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean zzb(zzha.zza zza1)
    {
        if (zza1.errorCode != -2)
        {
            zzb(new zzha(zza1, null, null, null, null, null, null));
            return true;
        } else
        {
            zzon.zzqh = 0;
            zzon.zzpM = new zzgv(zzon.zzpH, zzEO, zza1, this);
            zzon.zzpM.zzgi();
            return true;
        }
    }

    protected boolean zze(int i)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Failed to load ad: ").append(i).toString());
        if (zzEN == null)
        {
            return false;
        }
        try
        {
            zzEN.onRewardedVideoAdFailedToLoad(i);
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdFailedToLoad().", remoteexception);
            return false;
        }
        return true;
    }

    public void zzfK()
    {
        zzu.zzbY("showAd must be called on the main UI thread.");
        if (!isLoaded() || zzEP)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("The reward video has not loaded.");
        } else
        {
            zzEP = true;
            zzgp zzgp1 = zzao(zzon.zzpO.zzyb);
            if (zzgp1 != null && zzgp1.zzfM() != null)
            {
                try
                {
                    zzgp1.zzfM().showVideo();
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

    public void zzfL()
    {
        onAdClicked();
    }
}
