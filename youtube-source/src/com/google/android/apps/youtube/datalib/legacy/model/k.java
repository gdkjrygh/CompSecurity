// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import android.os.Parcel;

final class k
    implements android.os.Parcelable.Creator
{

    k()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = true;
        String s = parcel.readString();
        Uri uri = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        String s1 = parcel.readString();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        return new InfoCard.InfoCardApp(s, uri, s1, flag, parcel.readFloat(), (Uri)parcel.readParcelable(android/net/Uri.getClassLoader()), parcel.readInt());
    }

    public final volatile Object[] newArray(int i)
    {
        return new InfoCard.InfoCardApp[i];
    }
}
