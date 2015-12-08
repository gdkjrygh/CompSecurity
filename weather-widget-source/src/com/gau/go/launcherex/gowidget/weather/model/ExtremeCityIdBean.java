// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            d

public class ExtremeCityIdBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    private String a;
    private int b;

    public ExtremeCityIdBean()
    {
    }

    private ExtremeCityIdBean(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readInt();
    }

    ExtremeCityIdBean(Parcel parcel, d d1)
    {
        this(parcel);
    }

    public String a()
    {
        return a;
    }

    public void a(int i)
    {
        b = i;
    }

    public void a(String s)
    {
        a = s;
    }

    public int b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeInt(b);
    }

}
