// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.celllocation;

import android.os.Parcel;

// Referenced classes of package com.jiubang.goweather.celllocation:
//            CellIDInfo

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public CellIDInfo a(Parcel parcel)
    {
        return new CellIDInfo(parcel, null);
    }

    public CellIDInfo[] a(int i)
    {
        return new CellIDInfo[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
