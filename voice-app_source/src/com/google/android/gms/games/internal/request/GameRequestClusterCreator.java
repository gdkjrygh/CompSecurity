// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.request.GameRequestEntity;

// Referenced classes of package com.google.android.gms.games.internal.request:
//            GameRequestCluster

public class GameRequestClusterCreator
    implements android.os.Parcelable.Creator
{

    public GameRequestClusterCreator()
    {
    }

    static void zza(GameRequestCluster gamerequestcluster, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, gamerequestcluster.zztB(), false);
        zzb.zzc(parcel, 1000, gamerequestcluster.getVersionCode());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdH(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfP(i);
    }

    public GameRequestCluster zzdH(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, GameRequestEntity.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GameRequestCluster(i, arraylist);
            }
        } while (true);
    }

    public GameRequestCluster[] zzfP(int i)
    {
        return new GameRequestCluster[i];
    }
}
