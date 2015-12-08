// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.zzi;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class zzaqd extends AbstractGamesCallbacks
{

    private final zzi zzaqb;
    private final zzi zzaqc;
    private final zzi zzaqd;

    public void onLeftRoom(int i, String s)
    {
        zzaqb.zza(new it>(i, s));
    }

    public void onP2PConnected(String s)
    {
        if (zzaqc != null)
        {
            zzaqc.zza(new (s));
        }
    }

    public void onP2PDisconnected(String s)
    {
        if (zzaqc != null)
        {
            zzaqc.zza(new ier(s));
        }
    }

    public void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
    {
        if (zzaqd != null)
        {
            zzaqd.zza(new ier(realtimemessage));
        }
    }

    public void zzA(DataHolder dataholder)
    {
        if (zzaqc != null)
        {
            zzaqc.zza(new fier(dataholder));
        }
    }

    public void zzB(DataHolder dataholder)
    {
        zzaqb.zza(new r(dataholder));
    }

    public void zzC(DataHolder dataholder)
    {
        if (zzaqc != null)
        {
            zzaqc.zza(new ier(dataholder));
        }
    }

    public void zzD(DataHolder dataholder)
    {
        if (zzaqc != null)
        {
            zzaqc.zza(new Notifier(dataholder));
        }
    }

    public void zza(DataHolder dataholder, String as[])
    {
        if (zzaqc != null)
        {
            zzaqc.zza(new ifier(dataholder, as));
        }
    }

    public void zzb(DataHolder dataholder, String as[])
    {
        if (zzaqc != null)
        {
            zzaqc.zza(new er(dataholder, as));
        }
    }

    public void zzc(DataHolder dataholder, String as[])
    {
        if (zzaqc != null)
        {
            zzaqc.zza(new (dataholder, as));
        }
    }

    public void zzd(DataHolder dataholder, String as[])
    {
        if (zzaqc != null)
        {
            zzaqc.zza(new (dataholder, as));
        }
    }

    public void zze(DataHolder dataholder, String as[])
    {
        if (zzaqc != null)
        {
            zzaqc.zza(new r(dataholder, as));
        }
    }

    public void zzf(DataHolder dataholder, String as[])
    {
        if (zzaqc != null)
        {
            zzaqc.zza(new fier(dataholder, as));
        }
    }

    public void zzx(DataHolder dataholder)
    {
        zzaqb.zza(new <init>(dataholder));
    }

    public void zzy(DataHolder dataholder)
    {
        zzaqb.zza(new init>(dataholder));
    }

    public void zzz(DataHolder dataholder)
    {
        if (zzaqc != null)
        {
            zzaqc.zza(new er(dataholder));
        }
    }

    public er(zzi zzi1)
    {
        zzaqb = (zzi)zzu.zzb(zzi1, "Callbacks must not be null");
        zzaqc = null;
        zzaqd = null;
    }

    public zzaqd(zzi zzi1, zzi zzi2, zzi zzi3)
    {
        zzaqb = (zzi)zzu.zzb(zzi1, "Callbacks must not be null");
        zzaqc = zzi2;
        zzaqd = zzi3;
    }
}
