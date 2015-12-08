// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            MaskedWallet, Address, LoyaltyWalletObject, OfferWalletObject

public final class o
    implements android.os.Parcelable.Creator
{

    public o()
    {
    }

    static void a(MaskedWallet maskedwallet, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, maskedwallet.getVersionCode());
        b.a(parcel, 2, maskedwallet.Oq, false);
        b.a(parcel, 3, maskedwallet.Or, false);
        b.a(parcel, 4, maskedwallet.Ow, false);
        b.a(parcel, 5, maskedwallet.Ot, false);
        b.a(parcel, 6, maskedwallet.Ou, i, false);
        b.a(parcel, 7, maskedwallet.Ov, i, false);
        b.a(parcel, 8, maskedwallet.OT, i, false);
        b.a(parcel, 9, maskedwallet.OU, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        OfferWalletObject aofferwalletobject[] = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        LoyaltyWalletObject aloyaltywalletobject[] = null;
        Address address = null;
        Address address1 = null;
        String s = null;
        String as[] = null;
        String s1 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 4: // '\004'
                    as = com.google.android.gms.common.internal.safeparcel.a.t(parcel, k);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 6: // '\006'
                    address1 = (Address)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Address.CREATOR);
                    break;

                case 7: // '\007'
                    address = (Address)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Address.CREATOR);
                    break;

                case 8: // '\b'
                    aloyaltywalletobject = (LoyaltyWalletObject[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, LoyaltyWalletObject.CREATOR);
                    break;

                case 9: // '\t'
                    aofferwalletobject = (OfferWalletObject[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, OfferWalletObject.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new MaskedWallet(i, s2, s1, as, s, address1, address, aloyaltywalletobject, aofferwalletobject);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new MaskedWallet[i];
    }
}
