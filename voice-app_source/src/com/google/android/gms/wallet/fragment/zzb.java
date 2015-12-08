// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentStyle

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void zza(WalletFragmentOptions walletfragmentoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, walletfragmentoptions.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 2, walletfragmentoptions.getEnvironment());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 3, walletfragmentoptions.getTheme());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 4, walletfragmentoptions.getFragmentStyle(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 5, walletfragmentoptions.getMode());
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzgw(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzjz(i);
    }

    public WalletFragmentOptions zzgw(Parcel parcel)
    {
        int i = 1;
        int j = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        WalletFragmentStyle walletfragmentstyle = null;
        int k = 1;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 4: // '\004'
                    walletfragmentstyle = (WalletFragmentStyle)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, j1, WalletFragmentStyle.CREATOR);
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
                return new WalletFragmentOptions(l, k, j, walletfragmentstyle, i);
            }
        } while (true);
    }

    public WalletFragmentOptions[] zzjz(int i)
    {
        return new WalletFragmentOptions[i];
    }
}
