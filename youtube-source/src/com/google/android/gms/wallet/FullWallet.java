// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            j, ProxyCard, Address

public final class FullWallet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    String Oq;
    String Or;
    ProxyCard Os;
    String Ot;
    Address Ou;
    Address Ov;
    String Ow[];
    private final int jE;

    FullWallet()
    {
        jE = 1;
    }

    FullWallet(int i, String s, String s1, ProxyCard proxycard, String s2, Address address, Address address1, 
            String as[])
    {
        jE = i;
        Oq = s;
        Or = s1;
        Os = proxycard;
        Ot = s2;
        Ou = address;
        Ov = address1;
        Ow = as;
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

    public final String getMerchantTransactionId()
    {
        return Or;
    }

    public final String[] getPaymentDescriptions()
    {
        return Ow;
    }

    public final ProxyCard getProxyCard()
    {
        return Os;
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
        j.a(this, parcel, i);
    }

}
