// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.go.weatherex.sidebar:
//            m

public class c extends android.view..SavedState
{

    public static final android.os.ut.SavedState.a CREATOR = new m();
    int a;
    int b;
    int c;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.el(parcel, i);
        parcel.writeInt(a);
    }


    public (Parcel parcel)
    {
        super(parcel);
        a = 0;
        b = 0;
        c = 0;
        a = parcel.readInt();
    }

    public a(Parcelable parcelable)
    {
        super(parcelable);
        a = 0;
        b = 0;
        c = 0;
    }
}
