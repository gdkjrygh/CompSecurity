// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.internal:
//            GetServiceRequest

public class zzi
    implements android.os.Parcelable.Creator
{

    public zzi()
    {
    }

    static void zza(GetServiceRequest getservicerequest, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, getservicerequest.version);
        zzb.zzc(parcel, 2, getservicerequest.zzadn);
        zzb.zzc(parcel, 3, getservicerequest.zzado);
        zzb.zza(parcel, 4, getservicerequest.zzadp, false);
        zzb.zza(parcel, 5, getservicerequest.zzadq, false);
        zzb.zza(parcel, 6, getservicerequest.zzadr, i, false);
        zzb.zza(parcel, 7, getservicerequest.zzads, false);
        zzb.zza(parcel, 8, getservicerequest.zzadt, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzae(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzby(i);
    }

    public GetServiceRequest zzae(Parcel parcel)
    {
        int i = 0;
        Account account = null;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        android.os.Bundle bundle = null;
        Scope ascope[] = null;
        android.os.IBinder ibinder = null;
        String s = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, i1);
                    break;

                case 6: // '\006'
                    ascope = (Scope[])com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1, Scope.CREATOR);
                    break;

                case 7: // '\007'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, i1);
                    break;

                case 8: // '\b'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new GetServiceRequest(k, j, i, s, ibinder, ascope, bundle, account);
            }
        } while (true);
    }

    public GetServiceRequest[] zzby(int i)
    {
        return new GetServiceRequest[i];
    }
}
