// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.os.Parcel;

final class ay
    implements android.os.Parcelable.Creator
{

    ay()
    {
    }

    public SpinnerCompat.SavedState a(Parcel parcel)
    {
        return new SpinnerCompat.SavedState(parcel, null);
    }

    public SpinnerCompat.SavedState[] a(int i)
    {
        return new SpinnerCompat.SavedState[i];
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
