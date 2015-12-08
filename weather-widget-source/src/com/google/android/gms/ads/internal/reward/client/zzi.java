// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            zzb, zzg

public class zzi
    implements RewardedVideoAd
{

    private final Context mContext;
    private String zzGh;
    private RewardedVideoAdListener zzGm;
    private final com.google.android.gms.ads.internal.reward.client.zzb zzGn;
    private final Object zzpc = new Object();

    public zzi(Context context, com.google.android.gms.ads.internal.reward.client.zzb zzb1)
    {
        zzGn = zzb1;
        mContext = context;
    }

    public void destroy()
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzGn != null)
                {
                    break label0;
                }
            }
            return;
        }
        zzGn.destroy();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Could not forward destroy to RewardedVideoAd", remoteexception);
          goto _L1
    }

    public RewardedVideoAdListener getRewardedVideoAdListener()
    {
        RewardedVideoAdListener rewardedvideoadlistener;
        synchronized (zzpc)
        {
            rewardedvideoadlistener = zzGm;
        }
        return rewardedvideoadlistener;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getUserId()
    {
        String s;
        synchronized (zzpc)
        {
            s = zzGh;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isLoaded()
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzGn != null)
                {
                    break label0;
                }
            }
            return false;
        }
        boolean flag = zzGn.isLoaded();
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Could not forward isLoaded to RewardedVideoAd", remoteexception);
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    public void loadAd(String s, AdRequest adrequest)
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzGn != null)
                {
                    break label0;
                }
            }
            return;
        }
        zzGn.zza(zzg.zzcA().zza(mContext, adrequest.zzaF(), s));
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s;
        zzb.zzd("Could not forward loadAd to RewardedVideoAd", s);
          goto _L1
    }

    public void pause()
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzGn != null)
                {
                    break label0;
                }
            }
            return;
        }
        zzGn.pause();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Could not forward pause to RewardedVideoAd", remoteexception);
          goto _L1
    }

    public void resume()
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzGn != null)
                {
                    break label0;
                }
            }
            return;
        }
        zzGn.resume();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Could not forward resume to RewardedVideoAd", remoteexception);
          goto _L1
    }

    public void setRewardedVideoAdListener(RewardedVideoAdListener rewardedvideoadlistener)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        com.google.android.gms.ads.internal.reward.client.zzb zzb1;
        zzGm = rewardedvideoadlistener;
        zzb1 = zzGn;
        if (zzb1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        zzGn.zza(new com.google.android.gms.ads.internal.reward.client.zzg(rewardedvideoadlistener));
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        rewardedvideoadlistener;
        zzb.zzd("Could not forward setRewardedVideoAdListener to RewardedVideoAd", rewardedvideoadlistener);
          goto _L1
        rewardedvideoadlistener;
        obj;
        JVM INSTR monitorexit ;
        throw rewardedvideoadlistener;
    }

    public void setUserId(String s)
    {
label0:
        {
            synchronized (zzpc)
            {
                if (TextUtils.isEmpty(zzGh))
                {
                    break label0;
                }
                zzb.zzaE("A user id has already been set, ignoring.");
            }
            return;
        }
        com.google.android.gms.ads.internal.reward.client.zzb zzb1;
        zzGh = s;
        zzb1 = zzGn;
        if (zzb1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        zzGn.setUserId(s);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s;
        zzb.zzd("Could not forward setUserId to RewardedVideoAd", s);
          goto _L1
    }

    public void show()
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzGn != null)
                {
                    break label0;
                }
            }
            return;
        }
        zzGn.show();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Could not forward show to RewardedVideoAd", remoteexception);
          goto _L1
    }
}
