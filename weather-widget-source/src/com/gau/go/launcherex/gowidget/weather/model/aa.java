// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            Widget11CityBean

final class aa
    implements android.os.Parcelable.Creator
{

    aa()
    {
    }

    public Widget11CityBean a(Parcel parcel)
    {
        return new Widget11CityBean(parcel, null);
    }

    public Widget11CityBean[] a(int i)
    {
        return new Widget11CityBean[i];
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
