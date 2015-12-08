// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            o, LoyaltyWalletObject, OfferWalletObject, Address

public final class MaskedWallet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new o();
    LoyaltyWalletObject OT[];
    OfferWalletObject OU[];
    String Oq;
    String Or;
    String Ot;
    Address Ou;
    Address Ov;
    String Ow[];
    private final int jE;

    MaskedWallet()
    {
        jE = 2;
    }

    MaskedWallet(int i, String s, String s1, String as[], String s2, Address address, Address address1, 
            LoyaltyWalletObject aloyaltywalletobject[], OfferWalletObject aofferwalletobject[])
    {
        jE = i;
        Oq = s;
        Or = s1;
        Ow = as;
        Ot = s2;
        Ou = address;
        Ov = address1;
        OT = aloyaltywalletobject;
        OU = aofferwalletobject;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Address getBillingAddress()
    {
        return Ou;
    }

    public final String getEmail()
    {
        return Ot;
    }

    public final String getGoogleTransactionId()
    {
        return Oq;
    }

    public final LoyaltyWalletObject[] getLoyaltyWalletObjects()
    {
        return OT;
    }

    public final String getMerchantTransactionId()
    {
        return Or;
    }

    public final OfferWalletObject[] getOfferWalletObjects()
    {
        return OU;
    }

    public final String[] getPaymentDescriptions()
    {
        return Ow;
    }

    public final Address getShippingAddress()
    {
        return Ov;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel, i);
    }

}
