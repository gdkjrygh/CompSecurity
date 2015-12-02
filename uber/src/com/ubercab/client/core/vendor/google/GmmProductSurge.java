// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.google;

import android.os.Parcel;
import android.os.Parcelable;

public final class GmmProductSurge
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static GmmProductSurge a(Parcel parcel)
        {
            return new GmmProductSurge(parcel, (byte)0);
        }

        private static GmmProductSurge[] a(int i)
        {
            return new GmmProductSurge[i];
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public final Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private String a;
    private Float b;

    private GmmProductSurge(Parcel parcel)
    {
        a = parcel.readString();
        b = (Float)parcel.readValue(java/lang/Float.getClassLoader());
    }

    GmmProductSurge(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public GmmProductSurge(String s, Float float1)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        a = s1;
        b = float1;
    }

    public final String a()
    {
        return a;
    }

    public final Float b()
    {
        return b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeValue(b);
    }

}
