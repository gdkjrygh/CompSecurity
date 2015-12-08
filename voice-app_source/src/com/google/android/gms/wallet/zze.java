// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            FullWallet, ProxyCard, Address, InstrumentInfo, 
//            PaymentMethodToken

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(FullWallet fullwallet, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, fullwallet.getVersionCode());
        zzb.zza(parcel, 2, fullwallet.zzaQm, false);
        zzb.zza(parcel, 3, fullwallet.zzaQn, false);
        zzb.zza(parcel, 4, fullwallet.zzaQo, i, false);
        zzb.zza(parcel, 5, fullwallet.zzaQp, false);
        zzb.zza(parcel, 6, fullwallet.zzaQq, i, false);
        zzb.zza(parcel, 7, fullwallet.zzaQr, i, false);
        zzb.zza(parcel, 8, fullwallet.zzaQs, false);
        zzb.zza(parcel, 9, fullwallet.zzaQt, i, false);
        zzb.zza(parcel, 10, fullwallet.zzaQu, i, false);
        zzb.zza(parcel, 11, fullwallet.zzaQv, i, false);
        zzb.zza(parcel, 12, fullwallet.zzaQw, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzge(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzjg(i);
    }

    public FullWallet zzge(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        String s2 = null;
        String s1 = null;
        ProxyCard proxycard = null;
        String s = null;
        Address address1 = null;
        Address address = null;
        String as[] = null;
        UserAddress useraddress1 = null;
        UserAddress useraddress = null;
        InstrumentInfo ainstrumentinfo[] = null;
        PaymentMethodToken paymentmethodtoken = null;
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
                    proxycard = (ProxyCard)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ProxyCard.CREATOR);
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
                    as = com.google.android.gms.common.internal.safeparcel.zza.zzA(parcel, k);
                    break;

                case 9: // '\t'
                    useraddress1 = (UserAddress)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, UserAddress.CREATOR);
                    break;

                case 10: // '\n'
                    useraddress = (UserAddress)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, UserAddress.CREATOR);
                    break;

                case 11: // '\013'
                    ainstrumentinfo = (InstrumentInfo[])com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k, InstrumentInfo.CREATOR);
                    break;

                case 12: // '\f'
                    paymentmethodtoken = (PaymentMethodToken)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, PaymentMethodToken.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new FullWallet(i, s2, s1, proxycard, s, address1, address, as, useraddress1, useraddress, ainstrumentinfo, paymentmethodtoken);
            }
        } while (true);
    }

    public FullWallet[] zzjg(int i)
    {
        return new FullWallet[i];
    }
}
