// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            p, e, CountrySpecification, Cart

public final class MaskedWalletRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new p();
    boolean OB;
    boolean OC;
    boolean OD;
    CountrySpecification OF[];
    String OV;
    String OW;
    boolean OX;
    boolean OY;
    boolean OZ;
    String On;
    String Or;
    Cart Ox;
    boolean Pa;
    private final int jE;

    MaskedWalletRequest()
    {
        jE = 3;
        OZ = true;
        Pa = true;
    }

    MaskedWalletRequest(int i, String s, boolean flag, boolean flag1, boolean flag2, String s1, String s2, 
            String s3, Cart cart, boolean flag3, boolean flag4, CountrySpecification acountryspecification[], boolean flag5, boolean flag6)
    {
        jE = i;
        Or = s;
        OB = flag;
        OC = flag1;
        OD = flag2;
        OV = s1;
        On = s2;
        OW = s3;
        Ox = cart;
        OX = flag3;
        OY = flag4;
        OF = acountryspecification;
        OZ = flag5;
        Pa = flag6;
    }

    public static e newBuilder()
    {
        MaskedWalletRequest maskedwalletrequest = new MaskedWalletRequest();
        maskedwalletrequest.getClass();
        return new e(maskedwalletrequest, (byte)0);
    }

    public final boolean allowDebitCard()
    {
        return Pa;
    }

    public final boolean allowPrepaidCard()
    {
        return OZ;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final CountrySpecification[] getAllowedShippingCountrySpecifications()
    {
        return OF;
    }

    public final Cart getCart()
    {
        return Ox;
    }

    public final String getCurrencyCode()
    {
        return On;
    }

    public final String getEstimatedTotalPrice()
    {
        return OV;
    }

    public final String getMerchantName()
    {
        return OW;
    }

    public final String getMerchantTransactionId()
    {
        return Or;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final boolean isBillingAgreement()
    {
        return OY;
    }

    public final boolean isPhoneNumberRequired()
    {
        return OB;
    }

    public final boolean isShippingAddressRequired()
    {
        return OC;
    }

    public final boolean shouldRetrieveWalletObjects()
    {
        return OX;
    }

    public final boolean useMinimalBillingAddress()
    {
        return OD;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel, i);
    }

}
