// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            m

public class MsgCenterBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new m();
    private int a;
    private String b;
    private String c;
    private String d;
    private int e;
    private String f;
    private int g;
    private String h;
    private int i;

    public MsgCenterBean()
    {
        i = 1;
    }

    private MsgCenterBean(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        f = parcel.readString();
        e = parcel.readInt();
        g = parcel.readInt();
        h = parcel.readString();
        i = parcel.readInt();
    }

    MsgCenterBean(Parcel parcel, m m1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(f);
        parcel.writeInt(e);
        parcel.writeInt(g);
        parcel.writeString(h);
        parcel.writeInt(i);
    }

}
