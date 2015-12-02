// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import bhy;
import bjf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            Cart

public final class FullWalletRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bjf();
    public String a;
    public String b;
    public Cart c;
    private final int d;

    FullWalletRequest()
    {
        d = 1;
    }

    public FullWalletRequest(int i, String s, String s1, Cart cart)
    {
        d = i;
        a = s;
        b = s1;
        c = cart;
    }

    public static bhy a()
    {
        FullWalletRequest fullwalletrequest = new FullWalletRequest();
        fullwalletrequest.getClass();
        return new bhy(fullwalletrequest, (byte)0);
    }

    public final int b()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        bjf.a(this, parcel, i);
    }

}
