// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.os.Parcel;

final class iz
    implements android.os.Parcelable.Creator
{

    iz()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new WatchWhileLayout.SavedState(parcel, null);
    }

    public final volatile Object[] newArray(int i)
    {
        return new WatchWhileLayout.SavedState[i];
    }
}
