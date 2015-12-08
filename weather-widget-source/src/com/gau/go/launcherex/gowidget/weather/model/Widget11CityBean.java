// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            aa

public class Widget11CityBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aa();
    public String a;
    public int b;
    public int c;

    public Widget11CityBean()
    {
    }

    private Widget11CityBean(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readInt();
        c = parcel.readInt();
    }

    Widget11CityBean(Parcel parcel, aa aa1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
    }

}
