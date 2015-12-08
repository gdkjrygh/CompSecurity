// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            k, b, Cart

public final class FullWalletRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    String Oq;
    String Or;
    Cart Ox;
    private final int jE;

    FullWalletRequest()
    {
        jE = 1;
    }

    FullWalletRequest(int i, String s, String s1, Cart cart)
    {
        jE = i;
        Oq = s;
        Or = s1;
        Ox = cart;
    }

    public static b newBuilder()
    {
        FullWalletRequest fullwalletrequest = new FullWalletRequest();
        fullwalletrequest.getClass();
        return new b(fullwalletrequest, (byte)0);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Cart getCart()
    {
        return Ox;
    }

    public final String getGoogleTransactionId()
    {
        return Oq;
    }

    public final String getMerchantTransactionId()
    {
        return Or;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
