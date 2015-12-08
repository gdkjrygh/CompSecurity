// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            GetBuyFlowInitializationTokenResponse

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(GetBuyFlowInitializationTokenResponse getbuyflowinitializationtokenresponse, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, getbuyflowinitializationtokenresponse.getVersionCode());
        zzb.zza(parcel, 2, getbuyflowinitializationtokenresponse.zzaJB, false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfA(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzif(i);
    }

    public GetBuyFlowInitializationTokenResponse zzfA(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        byte abyte0[] = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaV(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GetBuyFlowInitializationTokenResponse(i, abyte0);
            }
        } while (true);
    }

    public GetBuyFlowInitializationTokenResponse[] zzif(int i)
    {
        return new GetBuyFlowInitializationTokenResponse[i];
    }
}
