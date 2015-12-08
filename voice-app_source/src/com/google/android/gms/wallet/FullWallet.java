// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            zze, ProxyCard, Address, InstrumentInfo, 
//            PaymentMethodToken

public final class FullWallet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    private final int zzCY;
    String zzaQm;
    String zzaQn;
    ProxyCard zzaQo;
    String zzaQp;
    Address zzaQq;
    Address zzaQr;
    String zzaQs[];
    UserAddress zzaQt;
    UserAddress zzaQu;
    InstrumentInfo zzaQv[];
    PaymentMethodToken zzaQw;

    private FullWallet()
    {
        zzCY = 1;
    }

    FullWallet(int i, String s, String s1, ProxyCard proxycard, String s2, Address address, Address address1, 
            String as[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[], PaymentMethodToken paymentmethodtoken)
    {
        zzCY = i;
        zzaQm = s;
        zzaQn = s1;
        zzaQo = proxycard;
        zzaQp = s2;
        zzaQq = address;
        zzaQr = address1;
        zzaQs = as;
        zzaQt = useraddress;
        zzaQu = useraddress1;
        zzaQv = ainstrumentinfo;
        zzaQw = paymentmethodtoken;
    }

    public int describeContents()
    {
        return 0;
    }

    public Address getBillingAddress()
    {
        return zzaQq;
    }

    public UserAddress getBuyerBillingAddress()
    {
        return zzaQt;
    }

    public UserAddress getBuyerShippingAddress()
    {
        return zzaQu;
    }

    public String getEmail()
    {
        return zzaQp;
    }

    public String getGoogleTransactionId()
    {
        return zzaQm;
    }

    public InstrumentInfo[] getInstrumentInfos()
    {
        return zzaQv;
    }

    public String getMerchantTransactionId()
    {
        return zzaQn;
    }

    public String[] getPaymentDescriptions()
    {
        return zzaQs;
    }

    public PaymentMethodToken getPaymentMethodToken()
    {
        return zzaQw;
    }

    public ProxyCard getProxyCard()
    {
        return zzaQo;
    }

    public Address getShippingAddress()
    {
        return zzaQr;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

}
