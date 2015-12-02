// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import bje;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            ProxyCard, Address, InstrumentInfo, PaymentMethodToken

public final class FullWallet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bje();
    public String a;
    public String b;
    public ProxyCard c;
    public String d;
    public Address e;
    public Address f;
    public String g[];
    public UserAddress h;
    public UserAddress i;
    public InstrumentInfo j[];
    public PaymentMethodToken k;
    private final int l;

    private FullWallet()
    {
        l = 1;
    }

    public FullWallet(int i1, String s, String s1, ProxyCard proxycard, String s2, Address address, Address address1, 
            String as[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[], PaymentMethodToken paymentmethodtoken)
    {
        l = i1;
        a = s;
        b = s1;
        c = proxycard;
        d = s2;
        e = address;
        f = address1;
        g = as;
        h = useraddress;
        i = useraddress1;
        j = ainstrumentinfo;
        k = paymentmethodtoken;
    }

    public final int a()
    {
        return l;
    }

    public final ProxyCard b()
    {
        return c;
    }

    public final Address c()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        bje.a(this, parcel, i1);
    }

}
