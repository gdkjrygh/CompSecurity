// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class b extends android.view.xt.SavedState
{

    public static final android.os.Text.SavedState.b CREATOR = new android.os.Parcelable.Creator() {

        private static ChipEditText.SavedState a(Parcel parcel)
        {
            return new ChipEditText.SavedState(parcel);
        }

        private static ChipEditText.SavedState[] a(int i)
        {
            return new ChipEditText.SavedState[i];
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
    private _cls1.a a[];
    private String b;

    static String a(b b1, String s)
    {
        b1.b = s;
        return s;
    }

    static b[] a(b b1)
    {
        return b1.a;
    }

    static a[] a(a a1, a aa[])
    {
        a1.a = aa;
        return aa;
    }

    static String b(a a1)
    {
        return a1.b;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.eToParcel(parcel, i);
        parcel.writeParcelableArray(a, 0);
        parcel.writeString(b);
    }


    public _cls1(Parcel parcel)
    {
        super(parcel);
        Parcelable aparcelable[] = parcel.readParcelableArray(com/ubercab/client/core/ui/ChipEditText$Chip.getClassLoader());
        a = (a[])Arrays.copyOf(aparcelable, aparcelable.length, [Lcom/ubercab/client/core/ui/ChipEditText$Chip;);
        b = parcel.readString();
    }

    b(Parcelable parcelable)
    {
        super(parcelable);
    }
}
