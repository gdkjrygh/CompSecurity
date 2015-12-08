// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            h, a

public final class Cart
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    String Om;
    String On;
    ArrayList Oo;
    private final int jE;

    Cart()
    {
        jE = 1;
        Oo = new ArrayList();
    }

    Cart(int i, String s, String s1, ArrayList arraylist)
    {
        jE = i;
        Om = s;
        On = s1;
        Oo = arraylist;
    }

    public static a newBuilder()
    {
        Cart cart = new Cart();
        cart.getClass();
        return new a(cart, (byte)0);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getCurrencyCode()
    {
        return On;
    }

    public final ArrayList getLineItems()
    {
        return Oo;
    }

    public final String getTotalPrice()
    {
        return Om;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel);
    }

}
