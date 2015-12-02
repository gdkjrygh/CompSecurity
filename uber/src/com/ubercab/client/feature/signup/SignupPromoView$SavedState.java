// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Parcel;
import android.os.Parcelable;

public class a extends android.view.PromoView.SavedState
{

    public static final android.os.upPromoView.SavedState.a CREATOR = new android.os.Parcelable.Creator() {

        private static SignupPromoView.SavedState a(Parcel parcel)
        {
            return new SignupPromoView.SavedState(parcel);
        }

        private static SignupPromoView.SavedState[] a(int i)
        {
            return new SignupPromoView.SavedState[i];
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
    private _cls1.a a;

    static a a(a a1)
    {
        return a1.a;
    }

    static a a(a a1, a a2)
    {
        a1.a = a2;
        return a2;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.Parcel(parcel, i);
        parcel.writeParcelable(a, i);
    }


    public _cls1(Parcel parcel)
    {
        super(parcel);
        a = (a)parcel.readParcelable(com/ubercab/client/feature/signup/SignupData$PromoCode.getClassLoader());
    }

    a(Parcelable parcelable)
    {
        super(parcelable);
    }
}
