// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import android.os.Parcel;

final class bc
    implements android.os.Parcelable.Creator
{

    bc()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = parcel.readInt();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new VastAd.ProgressPing(i, flag, (Uri)parcel.readParcelable(android/net/Uri.getClassLoader()));
    }

    public final volatile Object[] newArray(int i)
    {
        return new VastAd.ProgressPing[i];
    }
}
