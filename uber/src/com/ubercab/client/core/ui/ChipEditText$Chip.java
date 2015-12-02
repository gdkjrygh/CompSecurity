// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class c
    implements Parcelable
{

    public static final android.os. CREATOR = new android.os.Parcelable.Creator() {

        private static ChipEditText.Chip a(Parcel parcel)
        {
            return new ChipEditText.Chip(parcel.readString(), parcel.readBundle(), parcel.readString());
        }

        private static ChipEditText.Chip[] a(int i)
        {
            return new ChipEditText.Chip[i];
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
    private Bundle a;
    private String b;
    private String c;

    public final String a()
    {
        return c;
    }

    public final Bundle b()
    {
        return a;
    }

    public final String c()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return c();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeBundle(a);
        parcel.writeString(c);
    }


    public _cls1(String s, Bundle bundle, String s1)
    {
        a = bundle;
        b = s;
        c = s1;
    }
}
