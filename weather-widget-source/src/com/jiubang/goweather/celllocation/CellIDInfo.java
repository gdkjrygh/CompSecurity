// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.celllocation;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.jiubang.goweather.celllocation:
//            a

public class CellIDInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public int a;
    public int b;
    public int c;
    public int d;
    public String e;
    public int f;

    public CellIDInfo()
    {
        f = -50;
    }

    private CellIDInfo(Parcel parcel)
    {
        f = -50;
        a = parcel.readInt();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readInt();
        e = parcel.readString();
    }

    CellIDInfo(Parcel parcel, a a1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeString(e);
    }

}
