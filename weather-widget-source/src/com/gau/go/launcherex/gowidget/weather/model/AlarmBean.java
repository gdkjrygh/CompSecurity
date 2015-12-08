// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            a

public class AlarmBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    String a;

    AlarmBean()
    {
        a = "";
    }

    private AlarmBean(Parcel parcel)
    {
        a = "";
        a = parcel.readString();
    }

    AlarmBean(Parcel parcel, a a1)
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
    }

}
