// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            OpenChannelResponse, ChannelImpl

public class zzbc
    implements android.os.Parcelable.Creator
{

    public zzbc()
    {
    }

    static void zza(OpenChannelResponse openchannelresponse, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, openchannelresponse.versionCode);
        zzb.zzc(parcel, 2, openchannelresponse.statusCode);
        zzb.zza(parcel, 3, openchannelresponse.zzaZR, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzhQ(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzlb(i);
    }

    public OpenChannelResponse zzhQ(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        ChannelImpl channelimpl = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 3: // '\003'
                    channelimpl = (ChannelImpl)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ChannelImpl.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new OpenChannelResponse(i, j, channelimpl);
            }
        } while (true);
    }

    public OpenChannelResponse[] zzlb(int i)
    {
        return new OpenChannelResponse[i];
    }
}
