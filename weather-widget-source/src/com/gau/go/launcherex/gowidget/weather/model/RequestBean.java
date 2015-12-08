// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            s

public class RequestBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new s();
    public String a;
    public String b;
    public long c;

    public RequestBean()
    {
    }

    private RequestBean(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readLong();
    }

    RequestBean(Parcel parcel, s s1)
    {
        this(parcel);
    }

    public RequestBean(String s1, String s2, long l)
    {
        a = s1;
        b = s2;
        c = l;
    }

    public void a(String s1, String s2, long l)
    {
        a = s1;
        b = s2;
        c = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeLong(c);
    }

}
