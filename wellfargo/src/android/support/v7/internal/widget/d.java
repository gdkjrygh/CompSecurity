// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.os.Parcel;

final class d
    implements android.os.Parcelable.Creator
{

    d()
    {
    }

    public AbsSpinnerCompat.SavedState a(Parcel parcel)
    {
        return new AbsSpinnerCompat.SavedState(parcel);
    }

    public AbsSpinnerCompat.SavedState[] a(int i)
    {
        return new AbsSpinnerCompat.SavedState[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
