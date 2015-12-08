// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialRequest, CredentialPickerConfig

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(CredentialRequest credentialrequest, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zza(parcel, 1, credentialrequest.getSupportsPasswordLogin());
        zzb.zzc(parcel, 1000, credentialrequest.mVersionCode);
        zzb.zza(parcel, 2, credentialrequest.getAccountTypes(), false);
        zzb.zza(parcel, 3, credentialrequest.getCredentialPickerConfig(), i, false);
        zzb.zza(parcel, 4, credentialrequest.getCredentialHintPickerConfig(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzF(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzav(i);
    }

    public CredentialRequest zzF(Parcel parcel)
    {
        boolean flag = false;
        CredentialPickerConfig credentialpickerconfig = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        CredentialPickerConfig credentialpickerconfig1 = null;
        String as[] = null;
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
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    as = com.google.android.gms.common.internal.safeparcel.zza.zzA(parcel, k);
                    break;

                case 3: // '\003'
                    credentialpickerconfig1 = (CredentialPickerConfig)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, CredentialPickerConfig.CREATOR);
                    break;

                case 4: // '\004'
                    credentialpickerconfig = (CredentialPickerConfig)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, CredentialPickerConfig.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new CredentialRequest(i, flag, as, credentialpickerconfig1, credentialpickerconfig);
            }
        } while (true);
    }

    public CredentialRequest[] zzav(int i)
    {
        return new CredentialRequest[i];
    }
}
