// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import bjk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            Address, LoyaltyWalletObject, OfferWalletObject, InstrumentInfo

public final class MaskedWallet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bjk();
    public String a;
    public String b;
    public String c[];
    public String d;
    public Address e;
    public Address f;
    public LoyaltyWalletObject g[];
    public OfferWalletObject h[];
    public UserAddress i;
    public UserAddress j;
    public InstrumentInfo k[];
    private final int l;

    private MaskedWallet()
    {
        l = 2;
    }

    public MaskedWallet(int i1, String s, String s1, String as[], String s2, Address address, Address address1, 
            LoyaltyWalletObject aloyaltywalletobject[], OfferWalletObject aofferwalletobject[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        l = i1;
        a = s;
        b = s1;
        c = as;
        d = s2;
        e = address;
        f = address1;
        g = aloyaltywalletobject;
        h = aofferwalletobject;
        i = useraddress;
        j = useraddress1;
        k = ainstrumentinfo;
    }

    public final int a()
    {
        return l;
    }

    public final String b()
    {
        return a;
    }

    public final String c()
    {
        return b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        bjk.a(this, parcel, i1);
    }

}
