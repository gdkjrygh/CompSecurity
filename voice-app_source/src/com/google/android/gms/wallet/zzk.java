// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            MaskedWallet, Address, LoyaltyWalletObject, OfferWalletObject, 
//            InstrumentInfo

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void zza(MaskedWallet maskedwallet, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, maskedwallet.getVersionCode());
        zzb.zza(parcel, 2, maskedwallet.zzaQm, false);
        zzb.zza(parcel, 3, maskedwallet.zzaQn, false);
        zzb.zza(parcel, 4, maskedwallet.zzaQs, false);
        zzb.zza(parcel, 5, maskedwallet.zzaQp, false);
        zzb.zza(parcel, 6, maskedwallet.zzaQq, i, false);
        zzb.zza(parcel, 7, maskedwallet.zzaQr, i, false);
        zzb.zza(parcel, 8, maskedwallet.zzaRf, i, false);
        zzb.zza(parcel, 9, maskedwallet.zzaRg, i, false);
        zzb.zza(parcel, 10, maskedwallet.zzaQt, i, false);
        zzb.zza(parcel, 11, maskedwallet.zzaQu, i, false);
        zzb.zza(parcel, 12, maskedwallet.zzaQv, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzgk(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzjm(i);
    }

    public MaskedWallet zzgk(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        String s2 = null;
        String s1 = null;
        String as[] = null;
        String s = null;
        Address address1 = null;
        Address address = null;
        LoyaltyWalletObject aloyaltywalletobject[] = null;
        OfferWalletObject aofferwalletobject[] = null;
        UserAddress useraddress1 = null;
        UserAddress useraddress = null;
        InstrumentInfo ainstrumentinfo[] = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    as = com.google.android.gms.common.internal.safeparcel.zza.zzA(parcel, k);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 6: // '\006'
                    address1 = (Address)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Address.CREATOR);
                    break;

                case 7: // '\007'
                    address = (Address)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Address.CREATOR);
                    break;

                case 8: // '\b'
                    aloyaltywalletobject = (LoyaltyWalletObject[])com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k, LoyaltyWalletObject.CREATOR);
                    break;

                case 9: // '\t'
                    aofferwalletobject = (OfferWalletObject[])com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k, OfferWalletObject.CREATOR);
                    break;

                case 10: // '\n'
                    useraddress1 = (UserAddress)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, UserAddress.CREATOR);
                    break;

                case 11: // '\013'
                    useraddress = (UserAddress)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, UserAddress.CREATOR);
                    break;

                case 12: // '\f'
                    ainstrumentinfo = (InstrumentInfo[])com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k, InstrumentInfo.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new MaskedWallet(i, s2, s1, as, s, address1, address, aloyaltywalletobject, aofferwalletobject, useraddress1, useraddress, ainstrumentinfo);
            }
        } while (true);
    }

    public MaskedWallet[] zzjm(int i)
    {
        return new MaskedWallet[i];
    }
}
