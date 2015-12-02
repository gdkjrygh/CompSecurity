// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_UnpaidBill, UnpaidBill

final class 
    implements android.os.Shape_UnpaidBill._cls1
{

    public final UnpaidBill createFromParcel(Parcel parcel)
    {
        return new Shape_UnpaidBill(parcel, null);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final UnpaidBill[] newArray(int i)
    {
        return new UnpaidBill[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
