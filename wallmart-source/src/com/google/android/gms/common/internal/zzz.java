// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.internal:
//            ResolveAccountResponse

public class zzz
    implements android.os.Parcelable.Creator
{

    public zzz()
    {
    }

    static void zza(ResolveAccountResponse resolveaccountresponse, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, resolveaccountresponse.mVersionCode);
        zzb.zza(parcel, 2, resolveaccountresponse.zzacC, false);
        zzb.zza(parcel, 3, resolveaccountresponse.zzoP(), i, false);
        zzb.zza(parcel, 4, resolveaccountresponse.zzoQ());
        zzb.zza(parcel, 5, resolveaccountresponse.zzoR());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzag(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzbF(i);
    }

    public ResolveAccountResponse zzag(Parcel parcel)
    {
        ConnectionResult connectionresult = null;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        boolean flag1 = false;
        android.os.IBinder ibinder = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 3: // '\003'
                    connectionresult = (ConnectionResult)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ConnectionResult.CREATOR);
                    break;

                case 4: // '\004'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ResolveAccountResponse(i, ibinder, connectionresult, flag1, flag);
            }
        } while (true);
    }

    public ResolveAccountResponse[] zzbF(int i)
    {
        return new ResolveAccountResponse[i];
    }
}
