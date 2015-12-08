// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelEventParcelable, ChannelImpl

public class zzm
    implements android.os.Parcelable.Creator
{

    public zzm()
    {
    }

    static void zza(ChannelEventParcelable channeleventparcelable, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, channeleventparcelable.mVersionCode);
        zzb.zza(parcel, 2, channeleventparcelable.zzaZR, i, false);
        zzb.zzc(parcel, 3, channeleventparcelable.type);
        zzb.zzc(parcel, 4, channeleventparcelable.zzaZP);
        zzb.zzc(parcel, 5, channeleventparcelable.zzaZQ);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzht(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzkD(i);
    }

    public ChannelEventParcelable zzht(Parcel parcel)
    {
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        ChannelImpl channelimpl = null;
        int j = 0;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    channelimpl = (ChannelImpl)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, j1, ChannelImpl.CREATOR);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new ChannelEventParcelable(l, channelimpl, k, j, i);
            }
        } while (true);
    }

    public ChannelEventParcelable[] zzkD(int i)
    {
        return new ChannelEventParcelable[i];
    }
}
