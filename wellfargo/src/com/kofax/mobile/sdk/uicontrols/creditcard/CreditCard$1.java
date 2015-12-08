// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;

import android.os.Parcel;

// Referenced classes of package com.kofax.mobile.sdk.uicontrols.creditcard:
//            CreditCard

final class 
    implements android.os.eator
{

    public CreditCard a(Parcel parcel)
    {
        return new CreditCard(parcel);
    }

    public CreditCard[] a(int i)
    {
        return new CreditCard[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
