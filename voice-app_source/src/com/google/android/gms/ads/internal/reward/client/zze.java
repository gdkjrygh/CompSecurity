// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.reward.RewardItem;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            zza

public class zze
    implements RewardItem
{

    private final zza zzER;

    public zze(zza zza1)
    {
        zzER = zza1;
    }

    public int getAmount()
    {
        if (zzER == null)
        {
            return 0;
        }
        int i;
        try
        {
            i = zzER.getAmount();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward getAmount to RewardItem", remoteexception);
            return 0;
        }
        return i;
    }

    public String getType()
    {
        if (zzER == null)
        {
            return null;
        }
        String s;
        try
        {
            s = zzER.getType();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward getType to RewardItem", remoteexception);
            return null;
        }
        return s;
    }
}
