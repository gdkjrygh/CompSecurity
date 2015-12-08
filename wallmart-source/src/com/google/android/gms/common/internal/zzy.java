// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.internal:
//            ResolveAccountRequest

public class zzy
    implements android.os.Parcelable.Creator
{

    public zzy()
    {
    }

    static void zza(ResolveAccountRequest resolveaccountrequest, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, resolveaccountrequest.mVersionCode);
        zzb.zza(parcel, 2, resolveaccountrequest.getAccount(), i, false);
        zzb.zzc(parcel, 3, resolveaccountrequest.getSessionId());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzaf(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzbE(i);
    }

    public ResolveAccountRequest zzaf(Parcel parcel)
    {
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        Account account = null;
        int j = 0;
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
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, Account.CREATOR);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ResolveAccountRequest(j, account, i);
            }
        } while (true);
    }

    public ResolveAccountRequest[] zzbE(int i)
    {
        return new ResolveAccountRequest[i];
    }
}
