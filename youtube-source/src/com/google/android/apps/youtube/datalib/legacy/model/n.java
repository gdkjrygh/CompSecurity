// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import android.os.Parcel;

final class n
    implements android.os.Parcelable.Creator
{

    n()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new InfoCard.InfoCardTrackingEvent(parcel.readInt(), (Uri)parcel.readParcelable(android/net/Uri.getClassLoader()));
    }

    public final volatile Object[] newArray(int i)
    {
        return new InfoCard.InfoCardTrackingEvent[i];
    }
}
