// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.whatsapp:
//            al3, ak7

class abz extends android.view.View.BaseSavedState
{

    public static final android.os.Parcelable.Creator CREATOR = new al3();
    int a;

    private abz(Parcel parcel)
    {
        super(parcel);
        a = parcel.readInt();
    }

    abz(Parcel parcel, ak7 ak7)
    {
        this(parcel);
    }

    public abz(Parcelable parcelable)
    {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeInt(a);
    }

}
