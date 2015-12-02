// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.country;

import android.os.Parcel;
import android.os.Parcelable;

public class a extends android.view.on.SavedState
{

    public static final android.os.tton.SavedState.a CREATOR = new android.os.Parcelable.Creator() {

        private static CountryButton.SavedState a(Parcel parcel)
        {
            return new CountryButton.SavedState(parcel);
        }

        private static CountryButton.SavedState[] a(int i)
        {
            return new CountryButton.SavedState[i];
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
    private final String a;

    public final String a()
    {
        return a;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.ToParcel(parcel, i);
        parcel.writeString(a);
    }


    public _cls1(Parcel parcel)
    {
        super(parcel);
        a = parcel.readString();
    }

    public a(Parcelable parcelable, String s)
    {
        super(parcelable);
        a = s;
    }
}
