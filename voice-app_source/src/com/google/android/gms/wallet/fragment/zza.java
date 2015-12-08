// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentInitParams

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(WalletFragmentInitParams walletfragmentinitparams, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, walletfragmentinitparams.zzCY);
        zzb.zza(parcel, 2, walletfragmentinitparams.getAccountName(), false);
        zzb.zza(parcel, 3, walletfragmentinitparams.getMaskedWalletRequest(), i, false);
        zzb.zzc(parcel, 4, walletfragmentinitparams.getMaskedWalletRequestCode());
        zzb.zza(parcel, 5, walletfragmentinitparams.getMaskedWallet(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzgv(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzjy(i);
    }

    public WalletFragmentInitParams zzgv(Parcel parcel)
    {
        MaskedWallet maskedwallet = null;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int j = 0;
        int i = -1;
        MaskedWalletRequest maskedwalletrequest = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 3: // '\003'
                    maskedwalletrequest = (MaskedWalletRequest)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, MaskedWalletRequest.CREATOR);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 5: // '\005'
                    maskedwallet = (MaskedWallet)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, MaskedWallet.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new WalletFragmentInitParams(j, s, maskedwalletrequest, i, maskedwallet);
            }
        } while (true);
    }

    public WalletFragmentInitParams[] zzjy(int i)
    {
        return new WalletFragmentInitParams[i];
    }
}
