// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet:
//            CreateWalletObjectsRequest, LoyaltyWalletObject, OfferWalletObject, GiftCardWalletObject

public class zzd
    implements android.os.Parcelable.Creator
{

    public zzd()
    {
    }

    static void zza(CreateWalletObjectsRequest createwalletobjectsrequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, createwalletobjectsrequest.getVersionCode());
        zzb.zza(parcel, 2, createwalletobjectsrequest.zzaQj, i, false);
        zzb.zza(parcel, 3, createwalletobjectsrequest.zzaQk, i, false);
        zzb.zza(parcel, 4, createwalletobjectsrequest.zzaQl, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzgd(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzjf(i);
    }

    public CreateWalletObjectsRequest zzgd(Parcel parcel)
    {
        GiftCardWalletObject giftcardwalletobject;
        Object obj;
        Object obj1;
        int i;
        int j;
        giftcardwalletobject = null;
        j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        i = 0;
        obj1 = null;
        obj = null;
_L7:
        int k;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        k = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
        com.google.android.gms.common.internal.safeparcel.zza.zzbA(k);
        JVM INSTR tableswitch 1 4: default 68
    //                   1 97
    //                   2 118
    //                   3 142
    //                   4 165;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_165;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
        Object obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L8:
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L7; else goto _L6
_L6:
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L8
_L3:
        LoyaltyWalletObject loyaltywalletobject = (LoyaltyWalletObject)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, LoyaltyWalletObject.CREATOR);
        obj = obj1;
        obj1 = loyaltywalletobject;
          goto _L8
_L4:
        OfferWalletObject offerwalletobject = (OfferWalletObject)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, OfferWalletObject.CREATOR);
        obj1 = obj;
        obj = offerwalletobject;
          goto _L8
        giftcardwalletobject = (GiftCardWalletObject)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, GiftCardWalletObject.CREATOR);
        Object obj5 = obj;
        obj = obj1;
        obj1 = obj5;
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new CreateWalletObjectsRequest(i, ((LoyaltyWalletObject) (obj)), ((OfferWalletObject) (obj1)), giftcardwalletobject);
        }
    }

    public CreateWalletObjectsRequest[] zzjf(int i)
    {
        return new CreateWalletObjectsRequest[i];
    }
}
