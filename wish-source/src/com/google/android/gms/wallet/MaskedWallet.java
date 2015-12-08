// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            zzk, LoyaltyWalletObject, OfferWalletObject, Address, 
//            InstrumentInfo

public final class MaskedWallet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    String zzaHZ;
    LoyaltyWalletObject zzaIV[];
    OfferWalletObject zzaIW[];
    String zzaIa;
    String zzaIc;
    Address zzaId;
    Address zzaIe;
    String zzaIf[];
    UserAddress zzaIg;
    UserAddress zzaIh;
    InstrumentInfo zzaIi[];
    private final int zzzH;

    private MaskedWallet()
    {
        zzzH = 2;
    }

    MaskedWallet(int i, String s, String s1, String as[], String s2, Address address, Address address1, 
            LoyaltyWalletObject aloyaltywalletobject[], OfferWalletObject aofferwalletobject[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        zzzH = i;
        zzaHZ = s;
        zzaIa = s1;
        zzaIf = as;
        zzaIc = s2;
        zzaId = address;
        zzaIe = address1;
        zzaIV = aloyaltywalletobject;
        zzaIW = aofferwalletobject;
        zzaIg = useraddress;
        zzaIh = useraddress1;
        zzaIi = ainstrumentinfo;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getEmail()
    {
        return zzaIc;
    }

    public String getGoogleTransactionId()
    {
        return zzaHZ;
    }

    public String getMerchantTransactionId()
    {
        return zzaIa;
    }

    public String[] getPaymentDescriptions()
    {
        return zzaIf;
    }

    public Address getShippingAddress()
    {
        return zzaIe;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

}
